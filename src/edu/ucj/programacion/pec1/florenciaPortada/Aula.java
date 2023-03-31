package edu.ucj.programacion.pec1.florenciaPortada;

public class Aula {
	// Creamos las variables necesarias para la clase
	int numero;
	int planta;
	Alumno[] asientos;

	// Creamos el constructos
	public Aula(int numero, int planta) {
		super();
		this.numero = numero;
		this.planta = planta;
		this.asientos = new Alumno[3]; // Alumno[3] es la cantidad de asientos que la clase va a tener
	}

	// Creamos los getters y setters de la clase Aula
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public Alumno[] getAsientos() {
		return asientos;
	}

	public void setAsientos(Alumno[] asientos) {
		this.asientos = asientos;
	}

	public Alumno getAsientos(int i) {
		return this.asientos[i];
	}

	public void setAsientos(int i, Alumno asientos) {
		this.asientos[i] = asientos;
	}

	// Creamos un método para asignar el asiento al alumno
	public boolean asignarAsiento(Alumno alumno) {
		// Creamos un bucle para asignar los asientos de los alumnos
		for (int i = 0; i <= this.asientos.length; i++) {
			if (this.asientos[i] == null) {
				alumno.setAsiento(i + 1);
				this.asientos[i] = alumno;
				return true;
			}
		}
		return false;
	}

}
