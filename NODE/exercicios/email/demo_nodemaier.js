/**
 * Enviar um email
 * 
 * Agora você está pronto para enviar e-mails do seu servidor.
 * Use o nome de usuário e a senha do provedor de e-mail selecionado para enviar um e-mail. 
 * Este tutorial mostrará como usar sua conta do Gmail para enviar um e-mail:
 */

 var nodemailer = require('nodemailer');

 var transporter = nodemailer.createTransport({
   service: 'gmail',
   auth: {
     user: 'teste@gmail.com',
     pass: 'teste123'
   }
 });
 
 var mailOptions = {
   from: 'teste@gmail.com',
   to: 'teste1@gmail.com',
   subject: 'Sending Email using Node.js',
   text: 'That was easy!'
 };
 
 transporter.sendMail(mailOptions, function(error, info){
   if (error) {
     console.log(error);
   } else {
     console.log('Email sent: ' + info.response);
   }
 });
 
 /*
   Vários receptores
 
   Para enviar um email para mais de um destinatário, adicione-os à propriedade "to" do objeto mailOptions, separados por vírgulas:
     to: 'myfriend@yahoo.com, myotherfriend@yahoo.com',
 
   Enviar HTML
   1
   Para enviar texto formatado em HTML em seu e-mail, use a propriedade "html" em vez da propriedade "texto":
     html: '<h1>Welcome</h1><p>That was easy!</p>'
 */