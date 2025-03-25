package creational.abstractFactory;

public class ModernFurnitureFactory implements FurnitureFactory {

	@Override
	public Sofa createSofa() {
		System.out.println("Modern Sofa");
		return new ModernSofa();
		
	}

	@Override
	public Chair createChair() {
		System.out.println("Modern Chair");
		return new ModernChair();
		
	}

}
