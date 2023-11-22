package entite;

import control.Formulaire;

public class CentralReservation <T extends EntiteReservable,U extends Formulaire, A extends Reservation>{
	private T[] entitesReservables;
	private int nombreEntites;
	public CentralReservation(T[] entitesReservables, int nombreEntites) {
		nombreEntites=0;
		this.entitesReservables=entitesReservables;
	}
	
	public void  ajouterEntite(T entite) {
		entitesReservables[nombreEntites]=entite;
		nombreEntites++;
	}
	
	public int[] donnerPossibilites(U formulaire) {
		int[] disponibilite= new int[entitesReservables.length];
		for(int i=0;i < disponibilite.length; i++) {
			if(entitesReservables[i].compatible(formulaire)) {
				disponibilite[i]=entitesReservables[i].getNumeroIdentification();}
			else {
				disponibilite[i]=0;
			}
		}
		return disponibilite;
	}
	
	public A reserver(int numeroEntite, U formulaire) {
		T entite;
		for(int i=0; i <entitesReservables.length && 
				entitesReservables[i].getNumeroIdentification()!=numeroEntite;i++) {
				if(entitesReservables[i].getNumeroIdentification()==numeroEntite) {
					entite=entitesReservables[i];
				}
		}
		
		formulaire.setIdentificationEntite(numeroEntite);
		return entite.reserver(formulaire); // quand jaurazi coder reservet table ça me renverra un objet que je renvoie ici

	}

}
