package creational.Builder;

public class Client {
	public static void main(String[] args) {
		HPDesktopBuilder hpDesktopBuilder = new HPDesktopBuilder();
		DesktopBuilder dellDesktopBuilder = new DellDesktopBuilder();
		
		Director director1 = new Director(dellDesktopBuilder);
		Director director2 = new Director(hpDesktopBuilder);
		
		Desktop product1 = director1.buildDesktop();
		Desktop product2 = director2.buildDesktop();
		
		System.out.println(product1);
		System.out.println(product2);
	}
}
