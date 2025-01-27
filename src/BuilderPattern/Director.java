package BuilderPattern;

public class Director {
    StudentBuilder sb;

    Director(StudentBuilder sb){
        this.sb = sb;
        if(sb instanceof EngineeringStudentBuilder){
            createEngineeringStudent();
        }else if(sb instanceof MBAStudentBuilder){
            createMBAStudentBuilder();
        }
    }

    private void createMBAStudentBuilder() {
       Student s = sb.setName("Aditya").setAge(25).setRollNo(1).setStd(8).setDegree().build();
       s.String();
    }

    private void createEngineeringStudent() {
        Student s = sb.setName("Aditya2").setAge(25).setRollNo(1).setStd(8)
                .setDegree()
                .build();
        s.String();
    }
}
