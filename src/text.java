public class text
{

    public static  void main(String[] args)
    {
        Student student=new Student();

        student.setId(2019101913);
        student.setstudentname("梁春艳");
        student.setPassword(666666);
        System.out.println(student.getStudentname());
        System.out.println(student.getid());
        System.out.println(student.getpossword());
    }
}
