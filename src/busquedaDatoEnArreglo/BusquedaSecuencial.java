package busquedaDatoEnArreglo;

import javax.swing.JOptionPane;

public class BusquedaSecuencial {

	public static void main(String[] args) {
		int arreglo[] = {4, 1, 5, 2, 3};
		int dato;
		
		dato = Integer.parseInt(JOptionPane.showInputDialog("Digita en el numero a buscar"));
		
		//Busqueda secuencial
		int i=0;
		boolean bandera = false;
		
		while(i < arreglo.length && bandera==false ) {
			if(arreglo[i] == dato) {
				bandera = true;
			}
			i++;
			
		}
		if(bandera == true) {
			System.out.println("El numero se encuentra: " + (i-1));
		}else {
			System.out.println("El numero NO se encuentra");
		}
	}

}
