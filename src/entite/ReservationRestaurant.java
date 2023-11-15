package entite;

public class ReservationRestaurant extends Reservation {
	private String numeroService;
	private int numeroReservation;
	public ReservationRestaurant(int jour,int mois,int numeroReservation,String numeroService){
		super(jour,mois);
		this.numeroService=numeroService;
	
		
	}
	
	
	public String toString() {
		return "Le" + jour+"/"+mois+" : table n°"+numeroReservation+" pour le "+numeroService+" service.";
	}

}
