package creational.Builder;

public class Director {
	private DesktopBuilder desktopBuilder;

	public Director(DesktopBuilder desktopBuilder) {
		super();
		this.desktopBuilder = desktopBuilder;
	}
	public Desktop buildDesktop() {
		desktopBuilder.buildMonitor();
		desktopBuilder.buildkeyBoard();
		desktopBuilder.buildMouse();
		desktopBuilder.buildSpeaker();
		return desktopBuilder.getDesktop();
		
	}


}
