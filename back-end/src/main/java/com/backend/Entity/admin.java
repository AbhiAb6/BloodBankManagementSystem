package com.backend.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "admin")
@Data

public class admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idadmin;
    private String firstname;
    private String lastname;
    private String state;
    private String city;
    private String dob;
    private String gender;
    private String bloodgroup;
    private String email;
    private String phone;

    public admin(String firstname, String lastname, String state, String city, String dob, String bloodgroup, String email, String phone, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.state = state;
        this.city = city;
        this.dob = dob;
        this.bloodgroup = bloodgroup;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
    }

	public Long getIdadmin() {
		return idadmin;
	}

	public void setIdadmin(Long idadmin) {
		this.idadmin = idadmin;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public admin() {}
    

}
