package com.backend.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "user")

public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long iduser;
    private String email;
    private String firstname;
    private String lastname;
    private String dob;
    private String gender;
    private String bloodgroup;
    private String phone;
    private String state;
    private String city;
    private int points;
    private int request;
    private int donated;
    private int volunteered;
    private int gifts;

    public user(String email, String firstname, String lastname, String dob, String gender, String bloodgroup, String phone, int points, int request, int donated, int volunteered, int gifts,String state,String city) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.gender = gender;
        this.bloodgroup = bloodgroup;
        this.phone = phone;
        this.points = points;
        this.request = request;
        this.donated = donated;
        this.volunteered = volunteered;
        this.gifts = gifts;
        this.state = state;
        this.city = city;
    }

	public Long getIduser() {
		return iduser;
	}

	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getRequest() {
		return request;
	}

	public void setRequest(int request) {
		this.request = request;
	}

	public int getDonated() {
		return donated;
	}

	public void setDonated(int donated) {
		this.donated = donated;
	}

	public int getVolunteered() {
		return volunteered;
	}

	public void setVolunteered(int volunteered) {
		this.volunteered = volunteered;
	}

	public int getGifts() {
		return gifts;
	}

	public void setGifts(int gifts) {
		this.gifts = gifts;
	}
	public user() {}

	
}
