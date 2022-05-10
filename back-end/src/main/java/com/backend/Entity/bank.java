package com.backend.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "bank")
public class bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idbank;
    private String bankname;
    private String state;
    private String city;
    private int abplus;
    private int bplus;
    private int aplus;
    private int oplus;
    private int abminus;
    private int bminus;
    private int aminus;
    private int ominus;
	public Long getIdbank() {
		return idbank;
	}
	public void setIdbank(Long idbank) {
		this.idbank = idbank;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
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
	public int getAbplus() {
		return abplus;
	}
	public void setAbplus(int abplus) {
		this.abplus = abplus;
	}
	public int getBplus() {
		return bplus;
	}
	public void setBplus(int bplus) {
		this.bplus = bplus;
	}
	public int getAplus() {
		return aplus;
	}
	public void setAplus(int aplus) {
		this.aplus = aplus;
	}
	public int getOplus() {
		return oplus;
	}
	public void setOplus(int oplus) {
		this.oplus = oplus;
	}
	public int getAbminus() {
		return abminus;
	}
	public void setAbminus(int abminus) {
		this.abminus = abminus;
	}
	public int getBminus() {
		return bminus;
	}
	public void setBminus(int bminus) {
		this.bminus = bminus;
	}
	public int getAminus() {
		return aminus;
	}
	public void setAminus(int aminus) {
		this.aminus = aminus;
	}
	public int getOminus() {
		return ominus;
	}
	public void setOminus(int ominus) {
		this.ominus = ominus;
	}
	public bank() {}
	public bank(String bankname, String state, String city, int abplus, int bplus, int aplus, int oplus, int abminus,
			int bminus, int aminus, int ominus) {
		super();
		this.bankname = bankname;
		this.state = state;
		this.city = city;
		this.abplus = abplus;
		this.bplus = bplus;
		this.aplus = aplus;
		this.oplus = oplus;
		this.abminus = abminus;
		this.bminus = bminus;
		this.aminus = aminus;
		this.ominus = ominus;
	}
	
	
	
	
}
