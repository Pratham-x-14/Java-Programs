public class StudentGradeCalculator
{
    void main()
    {
        String name = IO.readln();
        int marks = Integer.parseInt(IO.readln());

        Student s = new Student(name , marks);
        StudentGrade sg = CalculateStudentGrade.calculateGrade(s);
        IO.println(sg);
    }
}

class Student
{
    private String name;
    private int marks;

    public Student(String name , int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String getStudentName()
    {
        return this.name;
    }
    public void setStudentName()
    {
        this.name = name;
    }

    public int getStudentMarks()
    {
        return this.marks;
    }
    public void setStudentMarks()
    {
        this.marks = marks;
    }

    public String toString()
    {
        return this.name;
    }

}
    
class StudentGrade
{
    private Student student;
    private char studentGrade;

    public StudentGrade(Student student , char studentGrade)
    {
        this.student = student;
        this.studentGrade = studentGrade;
    }

    public Student getStudent()
    {
        return this.student;
    }
    public void setStudent()
    {
        this.student = student;
    }

    public char getStudentGrade()
    {
        return this.studentGrade;
    }
    public void setStudentGrade()
    {
        this.studentGrade = studentGrade;
    }

    public String toString()
    {
        return "[The Student " + student + " has '" + studentGrade + "' Grade]" ; 
    }
}

class CalculateStudentGrade
{
    public static StudentGrade calculateGrade(Student student)
    {
        int marks = student.getStudentMarks();
        
        if(marks>90)
        {
          return new StudentGrade(student, 'A');
        }
        else if(marks>=75)
        {
           return new StudentGrade(student , 'B');
        }
        else if(marks>=60)
        {
           return new StudentGrade(student , 'C');
        }
        else
        {
           return new StudentGrade(student , 'D');
        }
        
    }
	
}
























































































































































