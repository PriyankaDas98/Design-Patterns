package creational.Builder;

public class DellDesktopBuilder extends DesktopBuilder{

	


	@Override
	public void buildMonitor() {
		desktop.setMonitor("Dell monitor");
		
	}

	@Override
	public void buildkeyBoard() {
		desktop.setKeyBoard("Dell keyBoard");
		
	}

	@Override
	public void buildMouse() {
		desktop.setMouse("Dell mouse");
		
	}

	@Override
	public void buildSpeaker() {
		desktop.setSpeaker("Dell speaker");
		
	}
}
