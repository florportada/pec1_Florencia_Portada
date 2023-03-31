package edu.ucj.programacion.pec1.florenciaPortada;

import java.util.Scanner;
// https://github.com/florportada/pec1_Florencia_Portada.git
public class GestionColegio {
	public static void main(String[] args) {
		// Creo el scanner para poder introducir datos
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el nombre del colegio: "); // Pedimos el nombre del colegio
		String nombre = scan.nextLine();
		System.out.print("Introduce la dirección del colegio: "); // Pedimos la dirección del colegio
		String direccion = scan.nextLine();
		System.out.print("Introduce la cantidad de aulas: "); // Pedimos la cantidad de aulas del colegio
		int aulasTotal = scan.nextInt();
		int alumnosTotal = aulasTotal * 3; // Sabemos que las aulas tiene 3 asientos, por lo que en total de alumnos
											// puede haber la cantidad de aulas por 3
		// Creamos un colegio pidiendo los datos
		Colegio colegio = new Colegio(nombre, direccion, aulasTotal);
		// Creamos un array de alumnos, después de nombrar a cada alumno
		Alumno[] alumnos = UtilsColegio.nombrarAlumnos(alumnosTotal);
		// Creamos un bucle para poder asignar a los alumnos a un asiento dependiendo de
		// la clase
		for (Alumno alumno : alumnos) {
			colegio.asignarAsiento(alumno);
		}
	}
}
