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
	@GetMapping("fetch")
	public List<LocationStats> getAllStats()
	{
		return locationStatsRepo.findAll();
	}
	
	// build create employee REST API
    @PostMapping("state")
    public LocationStats createEmployee(@RequestBody LocationStats locationStats) {
        return locationStatsRepo.save(locationStats);
    }

	
	//build get status by state REST API
    @GetMapping("{id}")
    public String getEmployeeById(@PathVariable("id") String state){
    	List<LocationStats> l = locationStatsRepo.findByState(state);
    	return l.get(0).getTotal_Individuals_Vaccinated();
    }
    
    @GetMapping("{id1}/wastage/{id2}")
    public Integer getEmployeeById(@PathVariable("id1") String state,@PathVariable("id2") String date)
    {
    	List<LocationStats> l = locationStatsRepo.findByState(state);
    	String newdate = date.replace('-', '/');
    	for(LocationStats locationStats : l)
    	{
    		if(locationStats.getUpdated_On().equals(newdate))
    		{
    			Integer total_dose_admin=Integer.parseInt(locationStats.getTotal_Doses_Administered());
    			Integer first_dose_admin=Integer.parseInt(locationStats.getFirst_Dose_Administered());
    			Integer second_dose_admin=Integer.parseInt(locationStats.getSecond_Dose_Administered());
    			System.out.println(first_dose_admin+" "+second_dose_admin+" "+total_dose_admin);
    			return first_dose_admin+second_dose_admin-total_dose_admin;
    		}
    	}
    	return 0;
    }
	
}
