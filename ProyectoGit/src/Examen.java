import java.time.LocalDate;
import java.time.LocalTime;

public class Examen {
	private String nombreAsignatura;
	private String aula;
	private LocalDate fecha;
	private LocalTime hora;
	
	public Examen(String nombreAsignatura, String aula, LocalDate fecha, LocalTime hora) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		this.aula = aula;
		this.fecha = fecha;
		this.hora = hora;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Examen [nombreAsignatura=" + nombreAsignatura + ", aula=" + aula + ", fecha=" + fecha + ", hora=" + hora
				+ "]";
	}
	
	
	
}
