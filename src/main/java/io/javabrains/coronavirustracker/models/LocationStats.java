package io.javabrains.coronavirustracker.models;

import javax.persistence.*;

@Entity
public class LocationStats {

	@Id
	@GeneratedValue
	private int id;
    
	private String Updated_On;
	private String state;
    private String Total_Doses_Administered;
    private String Total_Sessions_Conducted;
    private String Total_Sites;
    private String First_Dose_Administered;
    private String Second_Dose_Administered;
    private String Male_Vaccinated;
    private String Female_Vaccinated;
    private String Transgender_Vaccinated;
    private String Total_Covaxin_Administered;
    private String Total_CoviShield_Administered;
    private String Total_Sputnik_V_Administered;
    private String AEFI;
    private String age_group1;
    private String age_group2;
    private String age_group3;
    private String Total_Individuals_Vaccinated;
    
	public LocationStats() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocationStats(int id, String updated_On, String state, String total_Doses_Administered,
			String total_Sessions_Conducted, String total_Sites, String first_Dose_Administered,
			String second_Dose_Administered, String male_Vaccinated, String female_Vaccinated,
			String transgender_Vaccinated, String total_Covaxin_Administered, String total_CoviShield_Administered,
			String total_Sputnik_V_Administered, String aEFI, String age_group1, String age_group2, String age_group3,
			String total_Individuals_Vaccinated) {
		super();
		this.id = id;
		Updated_On = updated_On;
		this.state = state;
		Total_Doses_Administered = total_Doses_Administered;
		Total_Sessions_Conducted = total_Sessions_Conducted;
		Total_Sites = total_Sites;
		First_Dose_Administered = first_Dose_Administered;
		Second_Dose_Administered = second_Dose_Administered;
		Male_Vaccinated = male_Vaccinated;
		Female_Vaccinated = female_Vaccinated;
		Transgender_Vaccinated = transgender_Vaccinated;
		Total_Covaxin_Administered = total_Covaxin_Administered;
		Total_CoviShield_Administered = total_CoviShield_Administered;
		Total_Sputnik_V_Administered = total_Sputnik_V_Administered;
		AEFI = aEFI;
		this.age_group1 = age_group1;
		this.age_group2 = age_group2;
		this.age_group3 = age_group3;
		Total_Individuals_Vaccinated = total_Individuals_Vaccinated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUpdated_On() {
		return Updated_On;
	}

	public void setUpdated_On(String updated_On) {
		Updated_On = updated_On;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTotal_Doses_Administered() {
		return Total_Doses_Administered;
	}

	public void setTotal_Doses_Administered(String total_Doses_Administered) {
		Total_Doses_Administered = total_Doses_Administered;
	}

	public String getTotal_Sessions_Conducted() {
		return Total_Sessions_Conducted;
	}

	public void setTotal_Sessions_Conducted(String total_Sessions_Conducted) {
		Total_Sessions_Conducted = total_Sessions_Conducted;
	}

	public String getTotal_Sites() {
		return Total_Sites;
	}

	public void setTotal_Sites(String total_Sites) {
		Total_Sites = total_Sites;
	}

	public String getFirst_Dose_Administered() {
		return First_Dose_Administered;
	}

	public void setFirst_Dose_Administered(String first_Dose_Administered) {
		First_Dose_Administered = first_Dose_Administered;
	}

	public String getSecond_Dose_Administered() {
		return Second_Dose_Administered;
	}

	public void setSecond_Dose_Administered(String second_Dose_Administered) {
		Second_Dose_Administered = second_Dose_Administered;
	}

	public String getMale_Vaccinated() {
		return Male_Vaccinated;
	}

	public void setMale_Vaccinated(String male_Vaccinated) {
		Male_Vaccinated = male_Vaccinated;
	}

	public String getFemale_Vaccinated() {
		return Female_Vaccinated;
	}

	public void setFemale_Vaccinated(String female_Vaccinated) {
		Female_Vaccinated = female_Vaccinated;
	}

	public String getTransgender_Vaccinated() {
		return Transgender_Vaccinated;
	}

	public void setTransgender_Vaccinated(String transgender_Vaccinated) {
		Transgender_Vaccinated = transgender_Vaccinated;
	}

	public String getTotal_Covaxin_Administered() {
		return Total_Covaxin_Administered;
	}

	public void setTotal_Covaxin_Administered(String total_Covaxin_Administered) {
		Total_Covaxin_Administered = total_Covaxin_Administered;
	}

	public String getTotal_CoviShield_Administered() {
		return Total_CoviShield_Administered;
	}

	public void setTotal_CoviShield_Administered(String total_CoviShield_Administered) {
		Total_CoviShield_Administered = total_CoviShield_Administered;
	}

	public String getTotal_Sputnik_V_Administered() {
		return Total_Sputnik_V_Administered;
	}

	public void setTotal_Sputnik_V_Administered(String total_Sputnik_V_Administered) {
		Total_Sputnik_V_Administered = total_Sputnik_V_Administered;
	}

	public String getAEFI() {
		return AEFI;
	}

	public void setAEFI(String aEFI) {
		AEFI = aEFI;
	}

	public String getAge_group1() {
		return age_group1;
	}

	public void setAge_group1(String age_group1) {
		this.age_group1 = age_group1;
	}

	public String getAge_group2() {
		return age_group2;
	}

	public void setAge_group2(String age_group2) {
		this.age_group2 = age_group2;
	}

	public String getAge_group3() {
		return age_group3;
	}

	public void setAge_group3(String age_group3) {
		this.age_group3 = age_group3;
	}

	public String getTotal_Individuals_Vaccinated() {
		return Total_Individuals_Vaccinated;
	}

	public void setTotal_Individuals_Vaccinated(String total_Individuals_Vaccinated) {
		Total_Individuals_Vaccinated = total_Individuals_Vaccinated;
	}

	
}
