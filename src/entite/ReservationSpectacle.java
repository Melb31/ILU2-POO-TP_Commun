package entite;

public class ReservationSpectacle extends Reservation {
	private int numeroChaise;
	private int numeroZone;
	public ReservationSpectacle(int jour,int mois,int numeroChaise,int numeroZone){
		super(jour,mois);
		this.numeroChaise=numeroChaise;
		this.numeroZone=numeroZone;
		
	
		
	}
	
	
	public String toString() {
		return "ccSpe";
	}

}
