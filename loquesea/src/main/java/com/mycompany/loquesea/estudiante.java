package com.mycompany.loquesea;


/**
 * Los estudianates son preguntados por el profesor y consultan el color del
 * semaforo
 * 
 * @author entornos
 * @version 2.0
 * @since 2.0
 */
public class estudiante extends persona {
	// Incluye un metodo de clase que se une a los heredados
	int i_Curso;

	
	/**
	 * Constructor que inicializa los parametros de clase de los alumnos 
	 * @param EdadX Edad del alumno
	 * @param sNombre Nombre del alumno
	 * @param iCurso Curso del alumno
	 */
	public estudiante(int EdadX, String sNombre, int iCurso) {
		i_Edad = EdadX;
		s_Nombre = sNombre;
		i_Curso = iCurso;
	}
	
	/**
	 * El alumno se presenta con este metodo
	 */
	public void presentarse() {
		System.out.println("Soy " + s_Nombre + " Alumno de " + i_Curso + " y tengo una edad de: "
				+ i_Edad);
	}

	/**
	 * Iplementa la respuesta del color del semaforo por parte del alumno
	 * @return color del semaforo que responde el alumno
	 */
	public String preguntacolor() {
		presentarse();
		ordenador mipc = new ordenador();
		return mipc.color();
	}
}
