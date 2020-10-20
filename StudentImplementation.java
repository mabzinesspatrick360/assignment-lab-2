
import java.util.Scanner;
import java.util.Arrays;
public class StudentImplementation{
   public static void main(String[] args) {

     System.out.println(".......WELCOME TO THE STUDENT MANAGEMENT PROGRAMME ..@skylabs[360]..codes" );

     //set the scanner object
     Scanner input=new Scanner(System.in);

     //asking the user to enter the number of grades he or she what to input
        System.out.println("ENTER THE NUMBER OF STUDENT YOU WANT TO INPUT :");
   //getting the number of students the user what to input
         int numberOfStudents=input.nextInt();

     System.out.println("ENTER THE NAME OF THE FIRST STUDENT  :");
     //getting the name from the user
     String name=input.next();

      double m[]=new double[3];
      double grades[]=new double[m.length];
     //entering courses with user input plus the grades
			System.out.println( "ENTER "+ 3 +" GRADES BELOW  FOR :" + name);
			for(int x=0;x<m.length;x++){
				m[x]=input.nextDouble();
        grades[x]=m[x];
      }
      //printing the array
      //System.out.println(Arrays.toString(m));

// getting the courses perfomances

			//System.out.println( "ENTER "+ 3 +" GRADES BELOW  FOR :" + name);
    //  double a=input.nextDouble();
      //double b=input.nextDouble();
      //double c=input.nextDouble();
//puting the grades in an array
    //  double grades[]={a,b,c};
//creating the student object..setting the grades,name,and the totalNoOfStudents
    Student student1=new Student(name,grades,numberOfStudents);
//printing the student detaILS
   System.out.println(student1.printStudentDetails());

  }
}
