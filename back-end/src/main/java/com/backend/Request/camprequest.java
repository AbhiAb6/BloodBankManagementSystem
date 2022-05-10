package com.backend.Request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class camprequest {


    @Pattern(regexp = "^[a-zA-Z.,#&\\s]+$",message = "Address must contain only Alphabets and some special characters(.,#&).")
    @NotNull
    private String address;
    @Pattern(regexp = "^[a-zA-Z\\s]+$",message = "City name must contain only Alphabets.")
    @NotNull
    private String city;
    @Pattern(regexp = "^[a-zA-Z\\s]+$",message = "State name must contain only Alphabets.")
    @NotNull
    private String state;
    @JsonFormat(pattern="yyyy-MM-dd")
    @NotNull
    private String date;

    @Size(min = 1,max = 3,message = "Id cannot exceed 100.")
    @NotNull
    private String id;
    @Pattern(regexp = "^[a-zA-Z\\s]+$",message = "Role must contain only Alphabets.")
    @NotNull
    private String role;
    private String volunteerrole;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getVolunteerrole() {
		return volunteerrole;
	}
	public void setVolunteerrole(String volunteerrole) {
		this.volunteerrole = volunteerrole;
	}
	
}
