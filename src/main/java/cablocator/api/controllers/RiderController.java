package cablocator.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cablocator.api.responses.BookingResponse;

@Controller
@RequestMapping(value= "riders/{riderId}")
public class RiderController {

	@ResponseBody
	@RequestMapping(value="book", method = RequestMethod.POST)
	ResponseEntity<BookingResponse> post(@PathVariable("riderId") String userId ){
		return null;
	}
}
