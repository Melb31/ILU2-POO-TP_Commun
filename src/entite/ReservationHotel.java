package entite;

public class ReservationHotel extends Reservation {
	private int nombreDeLitSim;
	private int nombreDeLitsDoub;
	private int numeroChambre;
	public ReservationHotel(int jour,int mois,int nombreDeLitSim,
			int nombreDeLitsDoub,int numeroChambre){
		super(jour,mois);
		this.numeroChambre=numeroChambre;
		this.nombreDeLitSim=nombreDeLitSim;
		this.nombreDeLitsDoub=nombreDeLitsDoub;
		
	
		
	}
	
	
	public String toString() {
		return "reservationHotel flemme";
	}
}
