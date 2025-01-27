package BuilderPattern;

public abstract class StudentBuilder {

    int rollNo;
    int std;
    String name;
    int age;

    String degree;

    StudentBuilder setAge(int age){
        this.age= age;
        return this;
    }

    StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    StudentBuilder setStd(int std){
        this.std = std;
        return this;
    }

    StudentBuilder setRollNo(int r){
        this.rollNo =r;
        return this;
    }

    Student build(){
        return new Student(this);
    }

     abstract StudentBuilder setDegree();
}
