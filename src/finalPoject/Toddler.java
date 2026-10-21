package finalPoject;

   public class Toddler extends nursery {
	
   private String active;

   public Toddler() {
      super();  
      active = "";
    }

   public Toddler(String name, int age, char gender, int ID, int contactNumber,
          specialneeds SpecialNeeds, String active) {
     
      super(name, age, gender, ID, contactNumber, SpecialNeeds); 
      this.active = active;
     
      if (age < 1 || age > 3) {  
          throw new IllegalArgumentException("Age must be between 1 and 3 years ");
      }
      
  }

  
    public String getActive() {
      return active;
  }

    public void setActive(String active) {
      this.active = active;
  }

    @Override
    public void display() {
      super.display(); 
      System.out.println("Active: " + active);
  }
    public void activeOrNot(String active) {
    	System.out.println( getName()+active);
    }
    
    
    
}