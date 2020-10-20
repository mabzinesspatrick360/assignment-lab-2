public class Student{
  //declaring the variables (data field )
private String name;
private double[] grades;
private int totalNoOfStudents;

//thus is the constructor(empty)
Student(){}

  //this is the another constructor with aurguments
Student(String name,double []grades,int totalNoOfStudents){
  this.name=name;
  this.totalNoOfStudents=totalNoOfStudents;
  this.grades=grades;
}

//setting the name
  public void setName(String name){
    this.name=name;
  }
  //get name methid
  public String getName(){
    return name;
  }

  //setting the grades method
  public void setGrades(double[] grades){
      this.grades=grades;
  }
  //getting the grades method
  public double[] getGrades(){
      return grades;

  }
  //set number of student method
  public void setNoOfStudents(int totalNoOfStudents){
    this.totalNoOfStudents=totalNoOfStudents;
  }
  //getting the number of students
  public int getNoOfStudents(){
    return totalNoOfStudents;
  }
  //calculating the average
  public double getAverageGrade(double []grades){
    // summing all the elements in the array
    int sum=0;
      for(int x=0;x<grades.length;x++){
      sum +=grades[x];
      }

    //calculating the average of the grades
     double average=sum/grades.length;
   return average;

  }
  //printing the student details
  public String printStudentDetails(){
  return "STUDENT NAME IS : " + this.name + " AVERAGE GRADE IS  :" + getAverageGrade(grades) + "  AND THE CURRENT NUMBER OF STUDENTS IS : " + this.totalNoOfStudents;
  }
}
