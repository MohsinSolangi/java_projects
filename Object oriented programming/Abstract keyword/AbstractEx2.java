abstract class  Vehicle{
	
	abstract void engine();
	
	void tyre(){
		System.out.println("4 tyre");
	}
	void seats(){
		System.out.println("4 seats");
	}
	void transmission(){
		System.out.println("transmission : manual");
	}
	
}

class Car extends Vehicle{

	@Override
	void engine(){
		System.out.println("800 cc engine");
	}
	
}

class Bike extends Vehicle {

	@Override
	void engine(){
		System.out.println("70 cc engine");
	}
	
	@Override
	void tyre(){
		System.out.println("2 tyre");
	}
	
	@Override
	void seats(){
		System.out.println("2 seats");
	}
}

class Jeep extends Vehicle{
	@Override
	void engine(){
		System.out.println("1500 cc engine");
	}
		
}

class Truck extends Vehicle{
	
	@Override
	void engine(){
		System.out.println("5000 cc engine");
	
	}

	@Override
	void tyre(){
		System.out.println("10 tyre");
	}

	@Override
	void seats(){
		System.out.println("2 seats");
	}
	
}

class Tractor extends Vehicle{
	@Override
	void engine(){
		System.out.println("3500 cc engine ");
	
	}
	@Override
	void seats(){
		System.out.println("1 seat");
	}
}

class Bus extends Vehicle{
	
	@Override
	void engine(){
		System.out.println("4500 cc engine ");
	}
	
	@Override
	void seats(){
		System.out.println("52 seats");
	}

	@Override
	void tyre(){
	System.out.println("10 tyre");
	}
}


class Display{
		
	static void show(Vehicle v){
		v.engine();
		v.seats();
		v.tyre();
		v.transmission();
		
	 }
}

class AbstractEx2{
	
	public static void main(String args[]){
	
	Car c = new Car();
	Bike b = new Bike();
	Jeep j = new Jeep();
	Truck t = new Truck();
	Tractor tractor = new Tractor();
	Bus bus = new Bus();
	
	Display.show(c);
	Display.show(b);
	Display.show(j);
	Display.show(t);
	Display.show(tractor);
	Display.show(bus);
	
	}
	
}