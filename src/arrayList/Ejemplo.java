package arrayList;

import java.util.ArrayList;

public class Ejemplo {

	public static void main(String[] args) {
		ArrayList <DatosPrueba> listaDatosPrueba = new ArrayList <DatosPrueba>();
		listaDatosPrueba.add(new DatosPrueba("Santiago", 34567, 342));
		listaDatosPrueba.add(new DatosPrueba("Santiago", 00044, 323));
		listaDatosPrueba.add(new DatosPrueba("Santiago", 23430, 342));
		listaDatosPrueba.add(new DatosPrueba("Santiago", 34567, 112));
		listaDatosPrueba.add(new DatosPrueba("Santiago", 43467, 222));
		
		DatosPrueba arrayDatosPrueba [] = new DatosPrueba[listaDatosPrueba.size()];
		listaDatosPrueba.toArray(arrayDatosPrueba);
		for(int i=0; i<arrayDatosPrueba.length;i++) {
			System.out.println(arrayDatosPrueba[i].dameComuna());
			System.out.println(arrayDatosPrueba[i].dameRol());
			System.out.println(arrayDatosPrueba[i].dameSubRol());
			
		}
		
//		for(DatosPrueba e:listaDatosPrueba) {
//			System.out.println(e.dameComuna());
//			System.out.println(e.dameRol());
//			System.out.println(e.dameSubRol());
//		}
	}

}
class DatosPrueba{
	private String comuna;
	private int rol;
	private int subRol;
	
	public DatosPrueba(String comuna, int rol, int subRol ) {
		this.comuna = comuna;
		this.rol = rol;
		this.subRol = subRol;
	}

	public String dameComuna() {
		return comuna;
	}
	
	public int dameRol() {
		return rol;
	}
	
	public int dameSubRol() {
		return subRol;
	}
		
	
}
