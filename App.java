package factory_method;

public class App {

	public static void main(String[] args) {
		Logistics roadLogistics =new RoadLogistics();
		roadLogistics.planDeivery();
		
		Logistics seaLogistics =new SeaLogistics();
		seaLogistics.planDeivery();
		
		Logistics airLogistics =new AirLogistics();
		airLogistics.planDeivery();

	}

}
