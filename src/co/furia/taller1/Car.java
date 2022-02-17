package co.furia.taller1;


	/**
	 * Clase CuentaBancaria
	 * @author Admin
	 *
	 */


public class Car {

	/**
	 * Declaramos Variables
	 */
	private int plate;
	public String motorNumber;
	public String chasisNumber; 
	protected Persona propietario;
	

	/**
	 * @param plate
	 * @param motorNumber
	 * @param chasisNumber
	 * @param propietario
	 */
	public Car(int plate, String motorNumber, String chasisNumber, Persona propietario) {
		this.plate = plate;
		this.motorNumber = motorNumber;
		this.chasisNumber = chasisNumber;
		this.propietario = propietario;
	}


	/**
	 * @return the plate
	 */
	public int getPlate() {
		return plate;
	}


	/**
	 * @param plate the plate to set
	 */
	public void setPlate(int plate) {
		this.plate = plate;
	}


	/**
	 * @return the motorNumber
	 */
	public String getMotorNumber() {
		return motorNumber;
	}


	/**
	 * @param motorNumber the motorNumber to set
	 */
	public void setMotorNumber(String motorNumber) {
		this.motorNumber = motorNumber;
	}


	/**
	 * @return the chasisNumber
	 */
	public String getChasisNumber() {
		return chasisNumber;
	}


	/**
	 * @param chasisNumber the chasisNumber to set
	 */
	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}


	/**
	 * @return the propietario
	 */
	public Persona getPropietario() {
		return propietario;
	}


	/**
	 * @param propietario the propietario to set
	 */
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	
	
	
}
