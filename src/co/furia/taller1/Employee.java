package co.furia.taller1;


	/**
	 * Clase Employee
	 * @author Admin
	 *
	 */


public class Employee {

	/**
	 * Declaramos Variables
	 */
	private int idEmployee;
	public String name;
	public int salary; 
	public String phone;
	
	
	/**
	 * Creamos un contructor que recibe los parametros para crear el objeto Employee
	 * @param idEmployee
	 * @param name
	 * @param salary
	 * @param phone
	 */
	public Employee(int idEmployee, String name, int salary, String phone) {
		this.idEmployee = idEmployee;
		this.name = name;
		this.salary = salary;
		this.phone = phone;
	}

	/**
	 * Retorna el id del empleado "idEmployee"
	 * @return
	 */
	public int getIdEmployee() {
		return idEmployee;
	}

	/**
	 * Asigna el id al parametro "idEmployee" del objeto
	 * @param idEmployee
	 */
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	/**
	 * Retorna el nombre del empleado "name"
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Asigna el nombre al parametro "name" del objeto
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Retorna el Salario del empleado "salary"
	 * @return
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * Asigna el salario al parametro "salary" del objeto
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * Retorna el Telefono "phone"
	 * @return
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Asigna el Telefono al parametro "phone" del objeto
	 * @param idEmployee
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}
