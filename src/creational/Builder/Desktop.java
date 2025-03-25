package creational.Builder;

public class Desktop {
	private String monitor;
	private String keyBoard;
	private String mouse;
	private String speaker;
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getKeyBoard() {
		return keyBoard;
	}
	public void setKeyBoard(String keyBoard) {
		this.keyBoard = keyBoard;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	@Override
	public String toString() {
		return "Desktop [monitor=" + monitor + ", keyBoard=" + keyBoard + ", mouse=" + mouse + ", speaker=" + speaker
				+ "]";
	}
	

}
