package cablocator.api.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cablocator.api.responses.LocationResponse;
import canlocator.pojo.Location;

@Controller
@RequestMapping(value= "cabs")
public class CabController {
	
	// to get current location
	@ResponseBody
	@RequestMapping(value = "{cabId}", method = RequestMethod.GET)
	ResponseEntity<LocationResponse> get(@PathVariable("cabId") String cabId){
		ResponseEntity<LocationResponse> response = new ResponseEntity<LocationResponse>(HttpStatus.OK);
		return response;
	}
	
	// this API will give the cab id when user request for cab service
	@ResponseBody
	@RequestMapping(value = "{cabId}/near", method = RequestMethod.GET)
	ResponseEntity<List<String>> getNear(@PathVariable("cabId") String cabId){
		ResponseEntity<List<String>> response = new ResponseEntity<List<String>>(HttpStatus.OK);
		return response;
	}
	
	// to update current location
	@ResponseBody
	@RequestMapping(value = "{cabId}",method = RequestMethod.POST)
	ResponseEntity<String> update(@PathVariable("cabId") String cabId, @RequestBody Location location){
		ResponseEntity<String> response = new ResponseEntity<String>(HttpStatus.OK);
		return response;
	}
}
