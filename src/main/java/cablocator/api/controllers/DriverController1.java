package cablocator.api.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cablocator.api.responses.DriverResponse;

@Controller
public class DriverController1 {
	
    private static final Logger LOG = LoggerFactory.getLogger(DriverController1.class);

	
	 @ResponseBody
	    @RequestMapping(value =" driver" + "/{driverid}", method = RequestMethod.GET)
	    public ResponseEntity<DriverResponse> getDriverDetails(HttpServletRequest request,@PathVariable(value = "driverid") String driverId){
	        LOG.info("getDriverDetails entry");
	        Long startTime = System.currentTimeMillis();
	        
	        
	        Long endTime = System.currentTimeMillis();

	        LOG.info("Execution Time : " + (endTime - startTime) + " ms");
	        return new ResponseEntity<DriverResponse>(new DriverResponse(), HttpStatus.OK);
	    }


}
