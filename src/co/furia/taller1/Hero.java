package co.furia.taller1;

import java.util.ArrayList;

/**
 * Clase Hero
 * @author Admin
 *
 */

public class Hero {
	
	public String name;
	public String powerName;
	private float powerNumber;
	private String realName;
	public ArrayList<String> powers;
	
	
	/**
	 * @param name
	 * @param powerName
	 * @param powerNumber
	 * @param realName
	 */
	public Hero(String name, String powerName, float powerNumber, String realName) {
		this.name = name;
		this.powerName = powerName;
		this.powerNumber = powerNumber;
		this.realName = realName;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the powerName
	 */
	public String getPowerName() {
		return powerName;
	}


	/**
	 * @param powerName the powerName to set
	 */
	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}


	/**
	 * @return the powerNumber
	 */
	public float getPowerNumber() {
		return powerNumber;
	}


	/**
	 * @param powerNumber the powerNumber to set
	 */
	public void setPowerNumber(float powerNumber) {
		this.powerNumber = powerNumber;
	}


	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}


	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	
	
	

}
