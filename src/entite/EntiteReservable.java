package entite;

import control.Formulaire;

public abstract class EntiteReservable<T extends Formulaire,A extends Reservation> {
	private CalendrierAnnuel calendrier;
	private int numeroIdentification;
	public EntiteReservable(int numeroIdentification) {
		calendrier= new CalendrierAnnuel();
		this.numeroIdentification=numeroIdentification;
		
	}
	public int getNumeroIdentification() {
		return numeroIdentification;
	}
	public void setNumeroIdentification(int numeroIdentification) {
		this.numeroIdentification = numeroIdentification;
	}
	
	public boolean estLibre(T formulaire) {
	return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public abstract boolean compatible(T formmulaire);
	
	public abstract A reserver(T formulaire);


}
