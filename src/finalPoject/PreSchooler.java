package finalPoject;

public class PreSchooler extends nursery {
    private int ageRange;
    
    
    public PreSchooler(){
        super();
        ageRange =0;
    }
    
    public PreSchooler(String name, int age, char gender, int ID, int contactNumber, specialneeds SpecialNeeds, int ageRange){
        super(name, age, gender, ID, contactNumber,SpecialNeeds );
        this.ageRange = ageRange;
    }
    
    public int getAgeRange(){
        return ageRange;
    }
    
    public void setAgeRange(int ageRange){
        this.ageRange = ageRange; }
    
    public void Range() {
    	 if (ageRange < 3 || ageRange > 6) {  
             throw new IllegalArgumentException("Age must be between 3 and 6 years "); }
    }
    
    @Override
    public void display() { 
        super.display(); 
    	System.out.println("Age Range: " + ageRange); 
    }
    
     
    
    
} 