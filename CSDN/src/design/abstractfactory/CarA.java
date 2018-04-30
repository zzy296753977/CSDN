package design.abstractfactory;

public class CarA implements Abstract_CarFactory {        
	public Air_conditioner install_air_conditioner () {        
		return new Air_conditioner_Haier();        
	}        
	public Engine install_engine () {        
		return new Engine_Import();  
	}        
	}  