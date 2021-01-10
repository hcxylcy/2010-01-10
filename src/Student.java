public class Student extends User
{
   static String studentname;
  static int age;
  public void Student()
  {

  }
   public void setAge(int age)
   {
       this.age=age;
   }
   public void setstudentname(String studentname)
   {
       this.studentname=studentname;
   }
   public int getAge()
   {
       return age;
   }
   public String getStudentname()
   {
       return studentname;
   }
}
