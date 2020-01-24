var express = require('express');
var jwt = require('jsonwebtoken');

const app = express();

app.get('/api', function(req, res){
	res.json({
		message: 'Welcome to API'
	});

});

app.get('/api/login', function(req, res){
	const user = { id: 1, 
		username: 'khawar',
		email: 'khawar.mkm@gmail.com',
		address: 'House#667A, Dhok Paracha, Satellite Town ,Rawalpindi',
		contactnum: '0311-5366374'

	}

	jwt.sign({ user }, 'key', (err, token) => {
	res.json({
		token
	});
});
});

app.get('/api/protected', ensureToken, function(req, res) {
	jwt.verify(req.token, 'key', function(err, authData){
		if(err){
			res.sendStatus(403);
		}

	else{
		res.json({
		message: 'Welcome, Member',
		authData: authData
	});
	}	
	})
	
});

function ensureToken(req, res, next){
	const bearerHeader = req.headers["authorization"];
	if(typeof bearerHeader !== 'undefined'){
		const bearer = bearerHeader.split(" ");
		const bearerToken = bearer[1];
		req.token = bearerToken;
		next();
	}else 
	{
		res.sendStatus(403);
	}
}



app.listen(3000, function(){
	console.log('Server Started');
});
