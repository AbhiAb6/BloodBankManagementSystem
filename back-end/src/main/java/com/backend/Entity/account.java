package com.backend.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "account")
@Data

public class account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idaccount;
    private String email;
    private String password;
    private String role;

   

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

	public Long getIdaccount() {
		return idaccount;
	}

	public void setIdaccount(Long idaccount) {
		this.idaccount = idaccount;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		// TODO Auto-generated method stub
		return role;
	}

	public account( String email, String password, String role) {
	
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public account() {}

	
}
