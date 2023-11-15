package entite;

public class CalendrierAnnuel {
	private Mois calendrier[];
	
	public CalendrierAnnuel() {
		 int[] nbJoursParM= {31,28,31,30,31,30,31,31,30,31,30,31};
		 String[] nomParM= {"Janvier","Février","Mars",
		 "Avril","Mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre"};
		calendrier=new Mois[12];
		
		for(int i=0;i<12;i++) {
			calendrier[i]=new Mois(nomParM[i],nbJoursParM[i]);
		}
		
	}


	private static class Mois {
		private String nom;
		private boolean jours[];
		
		private Mois(String nom,int nbJours) {
			this.jours= new boolean[nbJours];
			for(int i=0;i < nbJours; i++) {
				jours[i]=false;
			}
			this.nom=nom;
			
		}
		
		
		private boolean estLibre(int jour) {
			return ! jours[jour-1];
		}
		
		private void reserver(int jour) throws IllegalStateException{
			if ( !estLibre(jour)) {
				throw new IllegalStateException("Le jour n'est pas libre");
			}
			jours[jour-1]=true;
		}
	}
	
	
	public boolean estLibre(int jour, int mois) {
			return calendrier[mois-1].estLibre(jour);
		}
	public boolean reserver(int jour, int mois) {
		if(estLibre(jour,mois)){
			calendrier[mois-1].reserver(jour);
			return true;
		}
		return false;
	}
	
	
	
}	
