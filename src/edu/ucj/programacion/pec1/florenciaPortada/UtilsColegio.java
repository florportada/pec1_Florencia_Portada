package edu.ucj.programacion.pec1.florenciaPortada;

import java.util.Scanner;

public class UtilsColegio {
	// Creo un método para crear a los alumnos
	public static Alumno[] nombrarAlumnos(int alumnosTotal) {
		//Creamos un Array de alumnos con la cantidad total de alumnos
		Alumno[] alumnos = new Alumno[alumnosTotal];
		// Creo el scanner para poder introducir datos
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < alumnosTotal; i++) {
			System.out.println("Introduce el nombre del alumno: "); // Pedimos el nombre del alumno
			String nombre = scan.nextLine();
			System.out.println("Introduce el/los apellido/s del alumno: "); // Pedimos el/los apellido/s del alumno
			String apellido = scan.nextLine();
			System.out.println("Introduce el dni del alumno: "); // Pedimos el dni del alumno
			String dni = scan.nextLine();
			alumnos[i] = new Alumno(nombre, apellido, dni); //Introducimos a los alumnos creados en el Array
		}
		return alumnos;
	}
}
