package com.bridgelabz.objectorientedprograms;

import java.io.Serializable;

public class InventoryPojoClass implements Serializable{
	private String rice;
	private String pulses;
	private String wheats;
	
	public String getRice() {
		return rice;
	}
	public void setRice(String rice) {
		this.rice = rice;
	}
	public String getPulses() {
		return pulses;
	}
	public void setPulses(String pulses) {
		this.pulses = pulses;
	}
	public String getWheats() {
		return wheats;
	}
	public void setWheats(String wheats) {
		this.wheats = wheats;
	}
}
