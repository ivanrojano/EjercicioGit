public class Hora {
	
	//Propiedades de instancia
	private int hora; 
	private int minuto;
	
	/**
	 * Constructor de la clase Hora
	 * @param hora
	 * @param minuto
	 */
	public Hora(int hora, int minuto) {
		super();
		this.hora = hora;
		this.minuto = minuto;
	}

	//Getter de hora
	public int getHora() {
		return hora;
	}

	//Setter de hora
	public void setHora(int hora) {
		this.hora = hora;
	}

	//Getter de minuto
	public int getMinuto() {
		return minuto;
	}

	//Setter de minuto
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	@Override
	//toString
	public String toString() {
		return "Hora [hora=" + hora + ", minuto=" + minuto + "]";
	}
	
	
}
