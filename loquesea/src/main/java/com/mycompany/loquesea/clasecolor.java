package com.mycompany.loquesea;


/**
 * Implementa el inicio del programa. El profesor inicia la consulta del estado del semaforo
 * @author entornos
 * @version 2.0
 * @since 2.0
 */
public class clasecolor {
	public static void main(String[] args) {
		profesor teacher = new profesor();
		String color = teacher.preguntacolor();
		System.out.println("La respuesta recibida es:" + color);
	} 
}
