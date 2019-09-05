
public class Secretary {
	// Attributes
	   String name;
	   String company;	//name of company secretary works at
	   String gender;
	   String education;	//type of education
	   int age;	
	   
	   
	   
	   //the constructor does not have a return type. only declared as public and then the name of the constructor
	   public Secretary(String name, String gender, String company, String education, int age) {
		   this.name = name;
		   this.gender = gender;
		   this.company = company;
		   this.education = education;
		   this.age = age;
	   }	// end of constructor
	   
	   
	   
	   public String toString() {
		   String output = "Name: " + name;
		   output += "\nGender: " + gender;
		   output += "\nCompany: " + company;
		   output += "\nHighest Education: " + education;  
		   output += "\nAge: " + age;
		   
		   return output;
	   }	//end of toString method

	   
	   public static void main (String [] args)
	   	{
	   	  Secretary Sameer = new Secretary("Sameer","Male", "Hyperion", "UCT", 27 );
	      Secretary Aisha = new Secretary("Aisha","Female","Hyperion" , "UCT", 48);
	      Secretary Mohamed = new Secretary("Mohamed", "Male", "Hyperion", "UCT", 63);
	      
	      System.out.println("Secretary:\n");
	      System.out.println(Sameer + "\n");
	      System.out.println(Aisha + "\n");
	      System.out.println(Mohamed);
	   	}//end of method main
	   
}	//end of class secretary
