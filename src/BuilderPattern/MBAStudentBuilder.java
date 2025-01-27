package BuilderPattern;

public class MBAStudentBuilder extends StudentBuilder{
    String degree;

    /**
     * @return
     */
    @Override
    StudentBuilder setDegree() {
        this.degree = "MBA";
        return this;
    }
}
