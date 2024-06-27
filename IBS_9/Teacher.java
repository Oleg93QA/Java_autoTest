package IBS_9;

public class Teacher extends Human {
    private String lesson;

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public Teacher(String nameTeacher, String lesson) {
        this.lesson = lesson;
        this.name = nameTeacher;
    }

    @Override
    public void printInfo() {
        System.out.println("Этот человек с именем " + name + "\n  Этот преподаватель с именем" + super.name);

    }
}
