package creational.Builder;

public abstract class DesktopBuilder {
	protected Desktop desktop;

	public DesktopBuilder() {
		this.desktop = new Desktop();
	}
	
	public abstract void buildMonitor();
	public abstract void buildkeyBoard();
	public abstract void buildMouse();
	public abstract void buildSpeaker();
	
	public Desktop getDesktop() {
		return desktop;
	}
	

}
