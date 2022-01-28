package io.javabrains.coronavirustracker;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

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
	
	/*-----------------------*/
	public boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }
	/*-----------------------*/

	String line="";
	@Override
	public void run(String... args) throws Exception {
		BufferedReader br =new BufferedReader(new FileReader("src/main/resources/covid_vaccine_statewise.csv"));
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
			String [] data = line.split(",");
			
			LocationStats corona_data = new LocationStats();
			if (!isBlank(data[0]))
			corona_data.setUpdated_On(data[0]);
			else
				corona_data.setUpdated_On("");
			
			if (!isBlank(data[1]))
			corona_data.setState(data[1]);
			else
				corona_data.setState("");
			
			if (!isBlank(data[2]))
			corona_data.setTotal_Doses_Administered(data[2]);
			else
				corona_data.setTotal_Doses_Administered("");
			
			if (!isBlank(data[3]))
			corona_data.setTotal_Sessions_Conducted(data[3]);
			else
				corona_data.setTotal_Sessions_Conducted("");
			
			if (!isBlank(data[4]))
			corona_data.setTotal_Sites(data[4]);
			else
				corona_data.setTotal_Sites("");
			
			if (!isBlank(data[5]))
			corona_data.setFirst_Dose_Administered(data[5]);
			else
				corona_data.setFirst_Dose_Administered("");
			
			if (!isBlank(data[6]))
			corona_data.setSecond_Dose_Administered(data[6]);
			else
				corona_data.setSecond_Dose_Administered("");
			
			if (!isBlank(data[7]))
			corona_data.setMale_Vaccinated(data[7]);
			else
				corona_data.setMale_Vaccinated("");
			
			if (!isBlank(data[8]))
			corona_data.setFemale_Vaccinated(data[8]);
			else
				corona_data.setFemale_Vaccinated("");
			
			if (!isBlank(data[9]))
			corona_data.setTransgender_Vaccinated(data[9]);
			else
				corona_data.setTransgender_Vaccinated("");
			
			if (!isBlank(data[10]))
			corona_data.setTotal_Covaxin_Administered(data[10]);
			else
				corona_data.setTotal_Covaxin_Administered("");
			
			if (!isBlank(data[11]))
			corona_data.setTotal_CoviShield_Administered(data[11]);
			else
				corona_data.setTotal_CoviShield_Administered("");
			
			if (!isBlank(data[12]))
			corona_data.setTotal_Sputnik_V_Administered(data[12]);
			else
				corona_data.setTotal_Sputnik_V_Administered("");
			
			if (!isBlank(data[13]))
			corona_data.setAEFI(data[13]);
			else
				corona_data.setAEFI("");
			
			if (!isBlank(data[14]))
			corona_data.setAge_group1(data[14]);
			else
				corona_data.setAge_group1("");
			
			if (!isBlank(data[15]))
			corona_data.setAge_group2(data[15]);
			else
				corona_data.setAge_group2("");
			
			if (!isBlank(data[16]))
			corona_data.setAge_group3(data[16]);
			else
				corona_data.setAge_group3("");
			
			if (!isBlank(data[17]))
			corona_data.setTotal_Individuals_Vaccinated(data[17]);
			else
				corona_data.setTotal_Individuals_Vaccinated("");
			
			obj.save(corona_data);
		}
	}

}
