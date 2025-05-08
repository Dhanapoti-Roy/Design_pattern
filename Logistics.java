package factory_method;

public abstract class Logistics {
	public abstract Transport createTransport();
	public void planDeivery() {
		Transport transport =createTransport();
		transport.deliver();
	}
}
