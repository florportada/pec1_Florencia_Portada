package edu.ucj.programacion.pec1.florenciaPortada;

public class Colegio {
	// Creamos las variables necesarias para la clase
	String nombre;
	String direccion;
	Aula[] aulas;

	// Creamos el constructos
	public Colegio(String nombre, String direccion, int aulasTotal) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = new Aula[aulasTotal];
		for (int i = 0; i < aulasTotal; i++) {
			this.aulas[i] = new Aula(2, i + 1);
		}
	}

	public Colegio(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	// Creamos los getters y setters de la clase Colegio
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Aula[] getAulas() {
		return aulas;
	}

	public void setAulas(Aula[] aulas) {
		this.aulas = aulas;
	}

	// Creamos un método para asignar el asiento del alumno
	public void asignarAsiento(Alumno alumno) {
		boolean asientoAsignado = false;
		// Creamos un bucle para poder mostrar por pantalla los alumnos y en qué clase
		// se encuentran y en qué planta
		for (Aula aula : this.aulas) {
			if (aula.asignarAsiento(alumno)) {
				System.out.println("El alumno " + alumno.getNombre() + " " + alumno.getApellidos() + " con DNI "
						+ alumno.getDni() + " esta en la clase " + aula.getNumero() + " de la planta "
						+ aula.getPlanta() + " se sienta en el asiento " + alumno.getAsiento());
				asientoAsignado = true;
				break;
			}
		}
		if (!asientoAsignado) { // Si no hay asientos libres, se mostrara por pantalla si es nesecario
			System.out.println("No quedan asientos libres en ninguna aula");
		}
	}

}
