package design.staticfactory;

public class CarFactory {
	 public static Car getCar(String type) throws Exception{
	        if(type.equals("Benz")){
	            return new Benz();
	        }else if(type.equals("Audi")){
	            return new Audi();
	        }else{
	            throw new Exception();
	        }
	    }
}
