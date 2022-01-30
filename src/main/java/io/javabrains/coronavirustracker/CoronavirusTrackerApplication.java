package io.javabrains.coronavirustracker;


import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.opencsv.CSVReader;

import io.javabrains.coronavirustracker.models.LocationStats;
import io.javabrains.coronavirustracker.repository.LocationStatsRepo;

@SpringBootApplication
@EnableScheduling
public class CoronavirusTrackerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusTrackerApplication.class, args);
	}
	
	@Autowired
	private LocationStatsRepo obj;

	//String line="";
	@Override
	public void run(String... args) throws Exception {
		Reader reader = new FileReader("src/main/resources/covid_vaccine_statewise.csv");
        CSVReader csvReader = new CSVReader(reader);
        String[] line;
        List<String[]> l = csvReader.readAll();
        l.remove(0);
        for(String[] lines : l)
        {
        	LocationStats corona_data = new LocationStats();
        	corona_data.setUpdated_On(lines[0]);
			corona_data.setState(lines[1]);
			corona_data.setTotal_Doses_Administered(lines[2]);
			corona_data.setTotal_Sessions_Conducted(lines[3]);
			corona_data.setTotal_Sites(lines[4]);
			corona_data.setFirst_Dose_Administered(lines[5]);
			corona_data.setSecond_Dose_Administered(lines[6]);
			corona_data.setMale_Vaccinated(lines[7]);
			corona_data.setFemale_Vaccinated(lines[8]);
			corona_data.setTransgender_Vaccinated(lines[9]);
			corona_data.setTotal_Covaxin_Administered(lines[10]);
			corona_data.setTotal_CoviShield_Administered(lines[11]);
			corona_data.setTotal_Sputnik_V_Administered(lines[12]);
			corona_data.setAEFI(lines[13]);
			corona_data.setAge_group1(lines[14]);
			corona_data.setAge_group2(lines[15]);
			corona_data.setAge_group3(lines[16]);
			corona_data.setTotal_Individuals_Vaccinated(lines[17]);
			
			
			obj.save(corona_data);
        }
        reader.close();
        csvReader.close();
   	}

}
