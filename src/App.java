
public class App {
	private Engine engine;
	final private View view;
	
	public App(Engine engine, View view) {
		this.engine = engine;
		this.view = view;
	}
	
public void StartApp() {
		view.showWord("Trotamundos", null);
		
	}
	
}
