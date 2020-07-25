package manejoArchivo;
// Se instancia el metodo static desde la importacion
import static manejoArchivo.Archivo.*;

public class ManejoArchivo {

	public static void main(String[] args) {
		String nombreArchivo = "c:\\pruebaJava\\leer.txt";
		
//		crearArchivo(nombreArchivo);
//		
//		//archivo.escribirArchivo(nombreArchivo);
//		escribirArchivo(nombreArchivo);
//		
		anexarArchivo(nombreArchivo);
		leerArchivo(nombreArchivo);
	}

}
