package finalPoject;

public class Main {
	
	public static void main(String[] args) {
		
		 Infant infant = new Infant("Razan", 2, 'F', 104, 375730, specialneeds.BOTH, 24);
		 
		 infant.display();
		 infant.attend(true);
	        
	        System.out.println("\n--------------------------\n");
	       
	    Toddler toddler = new Toddler("Almas", 3, 'F', 456, 9876543,specialneeds.MENTAL, "Very Active");
	       
	       toddler.display();
	       toddler.active();
	       
	       
	       System.out.println("\n--------------------------\n");
	       
	       nursery a = new PreSchooler ("kady",4,'F',133,54321,specialneeds.NONE,4); 
	       
	       a.attend(false);
	       
	       PreSchooler e =(PreSchooler)a;
	    		 e.Range();
	    		 e.display();
	       
	       


		}

}
