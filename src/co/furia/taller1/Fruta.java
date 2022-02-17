package co.furia.taller1;
/**
 * 
 * @author Admin
 *
 */
//Importamos la clase ArrayList
import java.util.ArrayList;

public class Fruta {
	
	//Declaramos Variables
	public String name;
	private float averageWeight;
	public ArrayList<String> colors;
	
	//Creamos un Constructor
	public Fruta(String name, float averageWeight, ArrayList<String> colors) {
		this.name = name;
		this.averageWeight = averageWeight;
		this.colors = colors;
	}


	/**
	 * retorna el nombre de la Fruta
	 * @return
	 */
	public String getName() {
		return name;
	}


	/**
	 * Asigna un Nombre a la Fruta
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Retorna el peso promedio de la fruta
	 * @return
	 */
	public float getAverageWeight() {
		return averageWeight;
	}

	/**
	 * Asigna data y la asigna al peso promedio "averageWeight"
	 * @param averageWeight
	 */
	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}

/**
 * retorna los colores la fruta
 * @return
 */
	public ArrayList<String> getColors() {
		return colors;
	}

		/**
		 * 	Recibe Un ArrayList de String para asignar a los colores de la fruta
		 * @param colors
		 */
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	
	
}
