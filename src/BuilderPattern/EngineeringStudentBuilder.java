package BuilderPattern;

public class EngineeringStudentBuilder extends StudentBuilder{
    String degree;
    @Override
    public StudentBuilder setDegree(){
        this.degree = "B.Tech";
        return this;
    }
}
