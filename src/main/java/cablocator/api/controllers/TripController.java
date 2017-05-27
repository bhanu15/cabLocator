package cablocator.api.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value= "trips")
public class TripController {

	@ResponseBody
	@RequestMapping(value="{tripeId}" , method = RequestMethod.GET)
	ResponseEntity<List<String>> getAll(@PathVariable("tripeId") String tripeId){
		return null;
	}
}
