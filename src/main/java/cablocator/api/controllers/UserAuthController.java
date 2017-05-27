package cablocator.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cablocator.api.request.AuthRequest;
import cablocator.api.responses.AuthResponse;

@Controller
@RequestMapping(value="auth")
public class UserAuthController {

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<AuthResponse> authenticate(@RequestBody AuthRequest authRequest){
	
		ResponseEntity<AuthResponse> response = new ResponseEntity<AuthResponse>(HttpStatus.OK);
		return response;
	}
}
