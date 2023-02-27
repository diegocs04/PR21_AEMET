package estacion;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Este mes tiene 30 dias");
		System.out.println("Temperaturas y humedades:");
		for(int i = 0;i<30;i++) {
			
			Estacion aemet = new Estacion(0,0,0);
			System.out.println(aemet);
		}
		}
	}
