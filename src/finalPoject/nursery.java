package finalPoject;

public class nursery {
    private String name;
    private int age;
    private char gender; 
    private int ID;
    private int contactNumber;
    specialneeds SpecialNeeds; 
    

    public nursery(){
        name = " ";
        age = 0;
        gender = ' ';
        ID=0;
        contactNumber=0;
       
    }

    public nursery(String name , int age, char gender,int ID, int contactNumber,specialneeds SpecialNeeds){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.ID=ID;
        this.contactNumber=contactNumber;
        this.SpecialNeeds=SpecialNeeds;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
    public specialneeds getSpecialNeeds() {
        return SpecialNeeds;
    }

    public void setSpecialNeeds(specialneeds SpecialNeeds) {
        this.SpecialNeeds = SpecialNeeds;
    }
   

    public void display(){
        System.out.println("child's name is: "+name+"\nchild's age: "+age+
        "\ngender: "+gender+"\nchild's ID: "+ID+"\nchild's contact number: "+contactNumber+"\nAny special needs? : "+SpecialNeeds);
    }

        public boolean attend(boolean attending){

                if(attending){ 
                System.out.println(name+" attend");}
                else {
                System.out.println(name+" not attend");}
               
            return attending ;
            }  
        
        public void active() {
        	System.out.println(name+" is active");
        }
        
        public void activeOrNot() {
        	System.out.println(name+" is not active");
        }


            

           
}


    
