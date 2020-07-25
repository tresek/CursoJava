package manejoArchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {

	// se crea un metodo de tipo publico
	public static void crearArchivo(String nombreArchivo) {
		// crear un archico
		File archivo = new File(nombreArchivo);
		// mostar un archivo
		try {
			PrintWriter salida = new PrintWriter(archivo);
			System.out.println("El archivo se ha creado");
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		}

	}

	public static void escribirArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			String contenido = "Estoy escribiendo dentro del archivo";
			salida.println(contenido);
			salida.println();
			salida.println("fin de la escritura, con la clase PrintWrite");
			System.out.println("La escritura se realizo con exito!!");
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
	}

	public static void leerArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		// para leer contenido se usa la clase
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String lectura = entrada.readLine();
			while (lectura != null) {
				System.out.println(lectura);
				lectura = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	public static void anexarArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			String contenido = "Anexando contenido, al archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Finalizando");
			salida.close();
			System.out.println("Se ha anexado de forma exitosa!!");
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}

	}

}
