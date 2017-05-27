package cablocator.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cablocator.api.request.UserRatingRequest;

@Controller
@RequestMapping(value = "userRatings/{userId}")
public class UserRating {

	// to get user rating .It will work for both users as well as drivers
	@ResponseBody
	@RequestMapping( method = RequestMethod.GET)
	public ResponseEntity<String> get(@PathVariable("userId") String userId){
		return null;
	}
	
	// to post rating for a user. Request will have rating and personId of the guy who is posting the review
	@ResponseBody
	@RequestMapping( method = RequestMethod.POST)
	public ResponseEntity<String> post(@PathVariable("userId") String userId , @RequestBody UserRatingRequest userRatingReq ){
		
		ResponseEntity<String> response  = new ResponseEntity<String>(HttpStatus.OK);
		return response;
	}
	
	
	// get ratings posted by me
	
	
	
}
