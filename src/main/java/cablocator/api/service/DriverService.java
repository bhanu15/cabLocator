package cablocator.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cablocator.api.repository.IDriverDao;

@Service
public class DriverService {
	@Autowired
	IDriverDao driverDao;
	

}
