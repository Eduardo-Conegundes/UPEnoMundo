

public class Main {

	public static void main(String[] args) {

		Barreira barreira = new Barreira();
		Parque parque = new Parque();

		new Turma("Turma 1", parque, 1000, barreira).start();
		new Turma("Turma 2", parque, 2000, barreira).start();
		new Turma("Turma 3", parque, 3000, barreira).start();



	}

}