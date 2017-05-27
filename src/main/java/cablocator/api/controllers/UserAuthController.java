package cablocator.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cablocator.api.model.User;
import cablocator.api.responses.AuthResponse;
import cablocator.api.service.AuthService;

@Controller
@RequestMapping(value="auth")
public class UserAuthController {
	@Autowired
	AuthService authService;

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<AuthResponse> authenticate(@RequestBody User user){
	
		boolean auth = authService.authenticate(user);
		AuthResponse authResponse = new AuthResponse();
		authResponse.isAuthenticated = auth;
		ResponseEntity<AuthResponse> response = new ResponseEntity<AuthResponse>(authResponse, HttpStatus.OK);
		return response;
	}
}
