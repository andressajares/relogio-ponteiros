

public class Aplicacao {

	public static void main(String[] args) {
		
		Relogio r1 = new Relogio();
		
		r1.acertarRelogio(3, 30, 50);
		
		System.out.println("Posi��o da hora: " + r1.ponteiroHora.posicao);
		System.out.println("Posi��o do minuto: " + r1.ponteiroMinuto.posicao);
		System.out.println("Posi��o do segundo: " + r1.ponteiroSegundo.posicao);
		
		int hora = r1.lerHora();
		int minuto = r1.lerMinuto();
		int segundo = r1.lerSegundo();
		
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		System.out.println("Segundo: " + segundo);
		
		Relogio r2 = new Relogio();
		
		r2.acertarRelogio(22, 0, 0);
		
		System.out.println("Hora do segundo rel�gio: " + r2.lerHora());
	}
}
