
public class Barreira {
	private int EsperandoNaBarreira;
	private int ThreadsParticipante;

	public Barreira() {
		this.ThreadsParticipante= 3;
		this.EsperandoNaBarreira=0;
	}

	public synchronized void Alcancado(String turma){
		EsperandoNaBarreira++;
		if(ThreadsParticipante != EsperandoNaBarreira){
			try {
				System.err.println(turma + " está esperando!!!");
				wait();
			} catch (Exception e) {
			}                    
		}else{
			System.err.println("Todas as turmas estão indo para o próximo parque");
			notifyAll();
			EsperandoNaBarreira=0;
		}
	}
}
