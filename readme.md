#Authentication Rest API
Created a Rest API, for authentication purpose, it uses tokens to allow to get access. It is created on Node.js so it has own server. 
#Built With
*Express(Framework)
*Jsonwebtoken(Used for excahnge of information and Tokens creater)
*Nodemon(Automatically restarts server after change in code)
#Explanation
In the start we require to initiate npm and give all the information about our application, and it stores in "packages.json". 
After that included express and jsonwebtoken and stores them in different variables.
var express = require('express');
var jwt = require('jsonwebtoken');

Then initiated express framework to start working on it, then started the server on 3000 port.
Created routes on get method. First route was simple goto "api" and it will show "Welcome to API".
app.get('/api', function(req, res){
	res.json({
		message: 'Welcome to API'
	});

});

After that created "api/login" in which we store all information which we need to diplay after get authenticatin. Also used a jsonwebtoken function called "jwt.sign" in which we have to pass payload and key (secret key) which creates a token.
jwt.sign({ user }, 'key', (err, token) => {
	res.json({
		token
	});
});


After that created another route which will can only be access when you're authorized by the application , "api/protected".
In the above mentioned route added a new function called "ensureToken" 
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

What does this do is, it uses bearer authorizaiton technique to check token if it is correct or not, getting back to "api/protected" we use a jsonwebtoken function called "verify" in which it checks token, secret key and then if there is error it displays, it there is no error it will give access and show the required data.


#Author : Khawar

#License : ISC

#Acknowledgements
* A little help from Youtube and Google
* For Learning
* First ever API App
