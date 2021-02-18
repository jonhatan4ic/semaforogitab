package com.mycompany.loquesea;


/**
 * Los profesores comprueban si el alumno conoce el color del semaforo
 * 
 * @author entornos
 * @version 2.0
 * @since 2.0
 */
public class profesor extends persona {
	public profesor() {
	} // Constructor

	/**
	 * Inicia la consulta del color del semaforo
	 * @return Color recibido como respuesta del alumno
	 */
	// Hace la pregunta al estudiante sobre el color
	public String preguntacolor() {

		estudiante alumno = new estudiante(20,"Noa",1);
		String colorRec = alumno.preguntacolor();
		return colorRec;
	}
}
