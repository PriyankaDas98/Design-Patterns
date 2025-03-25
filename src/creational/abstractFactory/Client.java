package creational.abstractFactory;

public class Client {
	private FurnitureFactory factory;
	private Sofa sofa;
	private Chair chair;
	Client(FurnitureFactory factory){
		this.factory = factory;
	}

}
