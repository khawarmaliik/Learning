var express = require('express');

const app = express();
app.use(express.json())

//first route to access API
app.get('/api', function(req, res){
	res.json({
		message: 'Welcome to API'
	});
});

//data of users
var users = [{
		id:1,
		name: 'khawar',
		email: 'khawar.mkm@gmail.com',
		password: "hello",
		address:{ HouseNo: 'House#667A', Area: 'Dhok Paracha', Postal_Code: '46000' , City:'Rawalpindi'},
		contactnum: '0311-5366374'
}]

//route to login
app.post('/api/login' ,(req, res) => { 
	 const user = users.find(user => user.email === req.body.email)
	 const pass = users.find(pass => pass.password === req.body.password)
  if (user == null) {
  	
    return res.status(400).send('Cannot find user')
  }
  if( pass == null){
    return res.status(400).send('Wrong Password')
  }
else{res.send(users)}
	
    });

//server connection
app.listen(3000, function(){
	console.log('Server Started');
});

