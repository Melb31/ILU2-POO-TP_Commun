package control;

public class FormulaireRestaurant extends Formulaire{
	private int nombrePersonnes;
	private int numService;
	
	public FormulaireRestaurant(int jour, int mois, int nbConvive,int numeroService) {
		super(jour,mois);

		this.nombrePersonnes=nbConvive;
		this.numService=numeroService;
	}
	public int getNombrePersonnes() {
		return nombrePersonnes;
	}
	public int getNumService() {
		return numService;
	}

	
	

}
