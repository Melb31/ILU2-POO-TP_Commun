package entite;

public class ReservationRestaurant extends Reservation {
	private int numeroService;
	private int numeroReservation;
	public ReservationRestaurant(int jour,int mois,int numeroService,int numeroReservation){
		super(jour,mois);
		this.numeroService=numeroService;
		this.numeroReservation=numeroReservation;
	
		
	}
	
	
	private String serviceTostring(int numeroService) {
		if(numeroService==1) {
			return "premier";
		}
		else {
			return "deuxième";
		}
	}
	
	
	public String toString() {
		return "Le " + jour+"/"+mois+"\nTable "+numeroReservation+" pour le "+serviceTostring(numeroService)+" service.";
	}

}
