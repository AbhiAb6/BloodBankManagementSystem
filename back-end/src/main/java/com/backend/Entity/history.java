package com.backend.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@Table(name = "history")
public class history {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idhistory;
    private String email;
    private String record;
    
    public history( String email, String record) {
		
		this.email = email;
		this.record = record;
	}
	public history() {}
	public Long getIdhistory() {
		return idhistory;
	}
	public void setIdhistory(Long idhistory) {
		this.idhistory = idhistory;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
    
}
