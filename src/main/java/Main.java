import br.com.mariojp.solid.dip.*;

public class Main {
	public static void main(String[] args) {
		System.setProperty("DRY_RUN", "true");
		var notifier = new EmailNotifier();
		notifier.welcome(new User("Ana", "ana@email.com"));
		System.out.println("Finalizado");
	}
}
