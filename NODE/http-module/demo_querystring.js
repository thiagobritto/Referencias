/**
 * Dividir a string de consulta
 */

var http = require('http')
var urt = require('url')

var app = http.createServer((req, res) => {
  res.writeHead(200, {'Content-Type': 'text/html'})
  var q = urt.parse(req.url, true).query
  var txt = q.year + ' ' + q.month
  res.end(txt)
})

app.listen(8080, ()=>{
  console.log('running...');
})

// http://localhost:8080/?year=2017&month=julho