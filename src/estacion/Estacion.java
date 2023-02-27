package estacion;

public class Estacion {

	private int temperatura;
	private int humedad;
	private int dia;
	public Estacion(int temperatura, int humedad, int dia)
	{
	 this.temperatura=(int)(Math.random()*20+(-10));
	 this.humedad=(int)(Math.random()*100+30);
	 this.dia= dia;
	}
	
	@Override
	public String toString() {
		return "["+(dia) +"] [" + temperatura + "°C/" + humedad + "%]";
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public int getHumedad() {
		return humedad;
	}
	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}
	
	
}
