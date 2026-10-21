package finalPoject;

public class Infant extends nursery {
    private int months;

    public Infant(String name, int age, char gender, int ID, int contactNumber, specialneeds SpecialNeeds, int months) {
        super(name, age, gender, ID, contactNumber, SpecialNeeds);
        this.months = months;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

   @Override
    public void display() {
        super.display();
        System.out.println("Child's age in months: " + months);
    }
   
   public boolean attend(boolean attended){

       if(attended){ 
       System.out.println(getName()+" attend");}
       else {
       System.out.println(getName()+" not attend");}
      
   return attended ;
   } 
   
   

}