
public class Turma extends Thread{
	private String nome;
	private Parque parque;
	private int tempo;
	private Barreira barreira;

	public Turma(String nome, Parque parque, int tempo, Barreira barreira) {
		this.nome = nome;
		this.parque = parque;
		this.tempo = tempo;
		this.barreira = barreira;
	}

	public void run(){

		for(int i = 0; i<5;i++){
			try {
				System.out.println(this.nome.concat(parque.visitar(i)));
				sleep(tempo);
				barreira.Alcancado(this.nome);



			} catch (InterruptedException e) {
				e.printStackTrace();
			}

				
			
		}
		System.out.println("ACABOU O PASSEIO!!!");
		System.exit(0);

	}




}