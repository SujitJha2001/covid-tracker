package io.javabrains.coronavirustracker.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.coronavirustracker.models.LocationStats;
import io.javabrains.coronavirustracker.repository.LocationStatsRepo;
//import io.javabrains.coronavirustracker.services.CoronaVirusDataService;



@RestController
public class HomeController {
	
	//@Autowired
	//private CoronaVirusDataService cvds;
	
	@Autowired
	private LocationStatsRepo locationStatsRepo; 
	@GetMapping
	public List<LocationStats> getAllStats()
	{
		return locationStatsRepo.findAll();
	}
	
	// build create employee REST API
    @PostMapping
    public LocationStats createEmployee(@RequestBody LocationStats locationStats) {
        return locationStatsRepo.save(locationStats);
    }
	
	/*@RequestMapping(path="save")
	public void setDatainDB()
	{
		cvds.saveCoronavirusData();
	}*/
	
	//build get status by state REST API
    @GetMapping("{id}")
    public List<LocationStats> getEmployeeById(@PathVariable("id") String state){
    	return locationStatsRepo.findByState(state);
    }
	
}
