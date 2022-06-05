<?php

namespace App\Rules;

use finfo;

class Files
{
    public function getCookie()
    {
        if(isset($_COOKIE['NOME_DO_COOKIE'])){
            var_dump(json_decode($_COOKIE['NOME_DO_COOKIE'], true));
        }
    }

    public function setCookie()
    {
        $data = [
            "empresa" => "lenne"
        ];

        setcookie("NOME_DO_COOKIE", json_encode($data), time() + 3600);

        echo "OK";
    }

    public function apiCURL()
    {
        $cep = '01310100';
        $link = "https://viacep.com.br/ws/$cep/json/unicode/";

        $ch = curl_init($link);

        curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
        curl_setopt($ch, CURLOPT_SSL_VERIFYPEER, 0);

        $response = curl_exec($ch);

        curl_close($ch);

        $data = json_decode($response, true);

        print_r($data);
    }

    public function moveFILE()
    {
        $dir1 = "public/uploads"; 
        $dir2 = "public/uploads/images";

        if(!$dir1) mkdir($dir1);
        if(!$dir2) mkdir($dir2);

        $filename = "README.txt";

        if(!file_exists($dir1. DIRECTORY_SEPARATOR .$filename)){
            $file = fopen($dir1. DIRECTORY_SEPARATOR .$filename, "w+");

            fwrite($file, date("Y-m-d H:i:s"));

            fclose($file);
        }

        rename($dir1. DIRECTORY_SEPARATOR .$filename, $dir2. DIRECTORY_SEPARATOR .$filename);

    }

    public function douwloadSERVER()
    {
        $link = "http://cdn5.colorir.com/desenhos/color/201620/carro-novo-veiculos-carros-1249665.jpg";
        $content = file_get_contents($link);
        $parse = parse_url($link);
        $baseName = basename($parse['path']);
        echo($baseName);

        $dirname = "public/uploads";
        $file = fopen($dirname. DIRECTORY_SEPARATOR .$baseName, "w+");
        
        fwrite($file, $content);
        
        fclose($file);

    }

    public function uploadFILE()
    {
        if($_SERVER["REQUEST_METHOD"] === "POST"){
            $file = $_FILES["upload"];
            
            if($file['error']){
                throw new \Exception('Error: '. $file['error']);
            }
            $dirname = "public/uploads";
            if(!is_dir($dirname)){
                mkdir($dirname);
            }
            if(move_uploaded_file($file['tmp_name'], $dirname . DIRECTORY_SEPARATOR . $file['name'])){
                echo 'upload realizado com sucesso!';
            } else {
                echo 'não foi pocivel realizar o upload';
            }
        }
    }

    public function base64IMG()
    {
        $filename = "public/uploads/images/logo_lenne.png";
        $base64 = base64_encode(file_get_contents($filename));
        
        $fielinfo = new finfo(FILEINFO_MIME_TYPE);
        
        // $mimetype: image/png
        $mimetype = $fielinfo->file($filename);

        $base64encode = "data:$mimetype;base64,$base64";

        echo "<img src='$base64encode'>";
        
    }

    public function readSVG()
    {
        $filename = "log/logs.log";

        if(file_exists($filename)){

            $file = fopen($filename, "r");

            $headers = explode(",", fgets($file)) ; // fgets($file) pega so a primeira linha
            
            $data = array();
            
            while($rowsCSV = fgets($file)){
                $rows = explode(",", $rowsCSV);
                $row = array(); 
                for($i = 0; $i < count($headers); $i++){
                    $row[str_replace("\r\n", "", trim($headers[$i]))] = str_replace("\r\n", "", trim($rows[$i]));
                    //echo $headers[$i] . '| ';
                }
                array_push($data, $row);
            }

            echo (json_encode($data));

            fclose($file);
        }
    }

    public function cleanFILES()
    {
        if (!is_dir("log")) mkdir("log");

        foreach(scandir("log") as $logs){
            if(!in_array($logs, array(".", ".."))){
                unlink("log/". $logs);
            }
        }

        echo 'ok';
    }

    public function fileUNLINK()
    {
        $file = fopen('teste.txt', 'w+');

        fclose($file);

        unlink('teste.txt');

        echo 'removido com sucesso!';
    }

    public function openFILE()
    {
        $file = fopen('log.txt', 'a+');
        fwrite($file, date('Y-m-d H:i:s') . "\r\n");
        fclose($file);

        echo 'criado com sucesso';
    }

    public function manageDIR()
    {
        $dir = 'log';

        $data = array();
        
        if(!is_dir($dir)){
            mkdir($dir);
        } 

        $scdir = scandir($dir);

        foreach($scdir as $file){
            if (!in_array($file, ['.', '..'])){
                $filename = $dir. DIRECTORY_SEPARATOR. $file;

                $info = pathinfo($filename);

                $info['size'] = filesize($filename);
                $info['modified'] = date('d/m/Y H:i:s', filemtime($filename));
                $info['url'] = 'http://localhost/' . str_replace('\\', '/', $filename);
                
                array_push($data, $info);
            }
        }

        echo json_encode($data);
        

    }

}