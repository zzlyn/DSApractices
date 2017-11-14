package ds;

public class MySingleton {
	
	private MySingleton(){
		
	}
	
	static private MySingleton instance = null;
	
	static public MySingleton getInstance(){
		if(instance == null){
			instance = new MySingleton();
		}
		return instance;
	}
	
	
	
}
