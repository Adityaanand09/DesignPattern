package BuilderPattern;

public class Student {
    int rollNo;
    int age;
    String name;
    int std;
    String degree;

    public Student(StudentBuilder sb){
        this.age = sb.age;
        this.name = sb.name;
        this.rollNo = sb.rollNo;
        this.std = sb.std;
        this.degree = sb.degree;
//        this.degree = sb.name;
    }

    public void String(){
        System.out.println("rollNo "+this.rollNo+" std "+this.std+" name "+this.name+" degree = "+this.degree);
    }
}
