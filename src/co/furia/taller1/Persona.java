package co.furia.taller1;

import java.sql.Date;

/**
 * 
 * @author Admin
 *
 */

public class Persona {
	
	
	//Declaramos Variables

	public String name;
	public String lastName1;
	public String lastName2;
	public Date dateBirth;
	public float height;
	
	
	//Constructor 
	public Persona(String name, String lastName1, String lastName2, Date dateBirth, float height) {
		this.name = name;
		this.lastName1 = lastName1;
		this.lastName2 = lastName2;
		this.dateBirth = dateBirth;
		this.height = height;
	}
	
	/**
	 * Retorna la Variable String name
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * Asigna la informacion de la variable  name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Retorna la Variable String lastName1
	 * @return
	 */
	public String getLastName1() {
		return lastName1;
	}
	
	/**
	 * Asigna la informacion de la variable  lastName1
	 * @param lastName1
	 */
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}
	/**
	 * Retorna la Variable String lastName2
	 * @return
	 */
	public String getLastName2() {
		return lastName2;
	}
	/**
	 * Asigna la información de la variable  lastName2
	 * @param lastName2
	 */
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}
	/**
	 * Retorna la Variable Date dateBirth
	 * @return
	 */
	public Date getDateBirth() {
		return dateBirth;
	}
	/**
	 * Asigna la informacion de la variable  dateBirth
	 * @param dateBirth
	 */
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
	/**
	 * Retorna la Variable float height
	 * @return
	 */
	public float getHeight() {
		return height;
	}
	/**
	 * Asigna la informacion de la variable  height
	 * @param height
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	

}
