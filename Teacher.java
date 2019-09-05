
public class Teacher {

	// Attributes
	   String name;
	   String subj;	//name of subject the teacher teaches
	   String school;
	   int grade;	//grade the teacher teachers
	   int age;	//age of teacher
	   
	   //the constructor does not have a return type. only declared as public and then the name of the constructor.
	   //The name of the constructor must be the same as the name of the class!
	   public Teacher(String name, String subj, String school, int grade, int age) {
		   this.name = name;
		   this.subj = subj;
		   this.school = school;
		   this.grade = grade;
		   this.age = age;
	   }	// end of constructor
	   

	   public String toString() {
		   String output = "Name: " + name;
		   output += "\nSubject Teaching: " + subj;
		   output += "\nSchool: " + school;
		   output += "\nGrade: " + grade;  
		   output += "\nAge: " + age;
		   
		   return output;
	   }	//end of toString method
  
	   public static void main (String [] args)
	   {
	      Teacher Grant = new Teacher("Grant", "Maths", "Crawford", 10, 35 );
	      Teacher Amy = new Teacher("Amy","Physics" , "Crawford", 11, 33);
	      Teacher Raj = new Teacher("Raj", "Chemistry", "Crawford", 12, 28);
	      
	      //the ffg lines prints each of the teachers information given above by calling each teacher name variable which uses the constructor to compile the output string. 
	      System.out.println("Teachers\n");
	      System.out.println(Grant + "\n");
	      System.out.println(Amy + "\n");
	      System.out.println(Raj);
	   }	//end of method main
	   	   
}	//end of class teacher

