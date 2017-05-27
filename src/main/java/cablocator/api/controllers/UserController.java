package cablocator.api.controllers;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cablocator.api.repository.UserResponse;
import cablocator.api.request.UserRequest;

@Controller
@RequestMapping(value = "users")
public class UserController {

	@ResponseBody
	@RequestMapping(value="{userId}" , method = RequestMethod.GET)
	public ResponseEntity<UserResponse>  get(@PathParam("userId") String userId){
		ResponseEntity<UserResponse> response = new ResponseEntity<UserResponse>(HttpStatus.OK);
		return response;
	}
	
	@ResponseBody
	@RequestMapping(method= RequestMethod.POST)
	public ResponseEntity<String> post(@RequestBody UserRequest userRequest){
		
		ResponseEntity<String> response = new ResponseEntity<String>(HttpStatus.CREATED);
		return response;
	}
	
}
