package cablocator.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cablocator.api.request.DriverRegistrationRequest;
import cablocator.api.responses.DriverRegistrationResponse;
import cablocator.api.responses.DriverResponse;

@Controller
@RequestMapping(value="drivers")
public class DriverController {

	@ResponseBody
	@RequestMapping(value = "{driverId}" , method = RequestMethod.GET)
	public ResponseEntity<DriverResponse> getDetails(@PathVariable(value = "driverId")String driverId) {

		DriverResponse driverResponse = new DriverResponse();
		driverResponse.name = "Bhanu";
		driverResponse.driverId = driverId;
		ResponseEntity<DriverResponse> response = new ResponseEntity<DriverResponse>(
				driverResponse, HttpStatus.OK);

		return response;
	}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.POST)
	public ResponseEntity<DriverRegistrationResponse> register(@RequestBody DriverRegistrationRequest registration){
		DriverRegistrationResponse driverRegistrationResponse = new DriverRegistrationResponse();
		driverRegistrationResponse.name = registration.name;
		driverRegistrationResponse.id = registration.id;
		ResponseEntity<DriverRegistrationResponse> response = new ResponseEntity<DriverRegistrationResponse>(driverRegistrationResponse , HttpStatus.OK);
		return response;
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<DriverRegistrationResponse> update(@RequestBody DriverRegistrationRequest request){
		DriverRegistrationResponse registrationResponse = new DriverRegistrationResponse();
		
		registrationResponse.id = request.id;
		registrationResponse.name = request.name;
		ResponseEntity<DriverRegistrationResponse> response = new ResponseEntity<DriverRegistrationResponse>(registrationResponse , HttpStatus.OK);
		return response;
	}
}
