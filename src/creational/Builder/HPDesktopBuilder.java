package creational.Builder;

public class HPDesktopBuilder extends DesktopBuilder {

	

	@Override
	public void buildMonitor() {
		desktop.setMonitor("HP monitor");
		
	}

	@Override
	public void buildkeyBoard() {
		desktop.setKeyBoard("HP keyBoard");
		
	}

	@Override
	public void buildMouse() {
		desktop.setMouse("HP mouse");
		
	}

	@Override
	public void buildSpeaker() {
		desktop.setSpeaker("HP speaker");
		
	}
	

}
