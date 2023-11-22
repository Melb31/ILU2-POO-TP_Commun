package entite;

import control.Formulaire;
import control.FormulaireRestaurant;

public class Restaurant {

	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	private class Table extends EntiteReservable{
		private int nbDeChaise;
		public Table(int numeroIdentification) {
			super(numeroIdentification);
			// TODO Auto-generated constructor stub
		}
		@Override
		public boolean compatible(Formulaire formulaire) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public Reservation reserver(Formulaire formulaire) {
			// TODO Auto-generated method stub
						return null;
		}
		
	}

}
