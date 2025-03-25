package creational.abstractFactory;

public class VictorianFurnitureFactory implements FurnitureFactory {

	@Override
	public Sofa createSofa() {
		System.out.println("Victorian Sofa");
		return new VictorianSofa();
		
	}

	@Override
	public Chair createChair() {
		System.out.println("Victorian Chair");
		return new VictorianChair();
		
	}

}
