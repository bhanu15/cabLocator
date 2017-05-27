package cablocator.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cablocator.api.model.UserRating;
import cablocator.api.responses.UserRatingResponse;
import cablocator.api.service.UserRatingService;

@Controller
@RequestMapping(value = "userRatings")
public class UserRatingController {
	@Autowired
	UserRatingService userRatingService;

	// to get user rating .It will work for both users as well as drivers
	@ResponseBody
	@RequestMapping( value = "{userId}" ,method = RequestMethod.GET)
	public ResponseEntity<UserRatingResponse> get(@PathVariable("userId") int userId){
		int userRating = userRatingService.getUserRating(userId);
		UserRatingResponse userRatingRes = new UserRatingResponse();
		userRatingRes.userRating = userRating;
		userRatingRes.userId = Integer.valueOf(userId);
		ResponseEntity<UserRatingResponse> response = new ResponseEntity<UserRatingResponse>(userRatingRes, HttpStatus.OK);
		return response;
	}
	
	// to post rating for a user. Request will have rating and personId of the guy who is posting the review
	@ResponseBody
	@RequestMapping( method = RequestMethod.POST)
	public ResponseEntity<String> post( @RequestBody UserRating userRating ){
		int userId = userRating.getFromUser();
		userRating.setFromUser(userId);
		int status = userRatingService.postRating(userRating);
		ResponseEntity<String> response;
		if(status == 0){
			response = new ResponseEntity<String>(HttpStatus.CREATED);
		} else {
			response = new ResponseEntity<String>(HttpStatus.NO_CONTENT);
		}
		return response;
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserRating>> getRatings(){
		List<UserRating> userRatings = userRatingService.getUserRatings();
		ResponseEntity<List<UserRating>> response = new ResponseEntity<List<UserRating>>(userRatings, HttpStatus.OK);
		return response;
	}
	
	
	// get ratings posted by me
	
	
	
}
