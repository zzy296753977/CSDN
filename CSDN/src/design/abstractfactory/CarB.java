package design.abstractfactory;

public class CarB implements Abstract_CarFactory {        
	public Air_conditioner install_air_conditioner () {        
		return new Air_conditioner_Gree();        
	}        
	public Engine install_engine () {        
		return new Engine_Domestic();  
	}        
	}  