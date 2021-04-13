
public class Parque {
	private String[] nome = {"Bate-Bate", "Roda gigante", "Carrossel", "Montanha Russa", "Splash"};
	int tempo;

	public String getNome(int i) {
		return nome[i];
	}
	
	public String visitar(int i) {
		return " Visitando parque " + nome[i];
		//System.out.println(" Visitando parque " + nome[i]);
	}


}