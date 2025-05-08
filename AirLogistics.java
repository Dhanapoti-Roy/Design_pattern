package factory_method;

public class AirLogistics extends Logistics{
	public Transport createTransport() {
		return new Plane();
	}

}
