package co.furia.taller1;


	/**
	 * Clase CuentaBancaria
	 * @author Admin
	 *
	 */


public class CuentaBancaria {

	/**
	 * Declaramos Variables
	 */
	private int accountNumber;
	public String bankName;
	public String nameClient; 
	protected boolean activated;
	
	
	/**
	 * Creamos un contructor que recibe los parametros para crear el objeto CuentaBancaria
	 * @param accountNumber
	 * @param bankName
	 * @param nameClient
	 * @param activated
	 */
	public CuentaBancaria(int accountNumber, String bankName, String nameClient, boolean activated) {
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.nameClient = nameClient;
		this.activated = activated;
	}

	/**
	 * Retorna el numero de cuenta "accountNumber"
	 * @return
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Asigna el numero de cuenta al parametro "accountNumber" del objeto
	 * @param accountNumber
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * >Retorna el nombre del Banco "bankName"
	 * @return
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * Asigna el nombre del Banco al parametro "bankName" del objeto
	 * @param bankName
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * Retorna el nombre del cliente "nameClient"
	 * @return
	 */
	public String getNameClient() {
		return nameClient;
	}

	/**
	 * Asigna el nombre del cliente al parametro "nameClient" del objeto
	 * @param nameClient
	 */
	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	/**
	 * Retorna si la cuenta esta activada "isActivated" con un true o false segun sea el caso
	 * @return
	 */
	public boolean isActivated() {
		return activated;
	}

	/**
	 * Asigna un estado boolean al parametro "activated" del objeto
	 * @param activated
	 */
	
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
	
}
