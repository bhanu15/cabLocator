package cablocator.api.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cablocator.api.model.User;
import cablocator.api.service.RoleService;
import cablocator.api.service.UserInfoService;

@Controller
@RequestMapping(value = "users")
public class UserController {

	private static final Logger LOG = LoggerFactory
			.getLogger(UserController.class);
	@Autowired
	RoleService roleService;
	@Autowired
	UserInfoService userInfoservice;

	@ResponseBody
	@RequestMapping(value = "{userId}", method = RequestMethod.GET)
	public ResponseEntity<User> get(@PathVariable("userId") String userId) {
		User user = userInfoservice.getUserInfo(userId);
		ResponseEntity<User> response = new ResponseEntity<User>(user,
				HttpStatus.OK);
		return response;
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> post(@RequestBody User user) {
		userInfoservice.update(user);
		ResponseEntity<String> response = new ResponseEntity<String>(
				HttpStatus.CREATED);
		return response;
	}

	@ResponseBody
	@RequestMapping(value = "{userID}/role", method = RequestMethod.GET)
	public ResponseEntity<String> getRole(@PathVariable("userID") String userId) {
		String description = roleService.getDescription(userId);
		
		ResponseEntity<String> response = new ResponseEntity<String>(
				description, HttpStatus.OK);
		return response;
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> getUsers(){
		List<User> users = userInfoservice.getUserList();
		ResponseEntity<List<User>> response = new ResponseEntity<List<User>>(users , HttpStatus.OK);
		return response;
	}
}