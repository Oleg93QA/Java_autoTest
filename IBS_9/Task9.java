package IBS_9;

public class Task9 {
    public static void main(String[] args) {
        Student student1 = new Student("one", "Oleg");
        Teacher teacher = new Teacher("Oksana", "chemical");


        System.out.println( student1.getGroup());
        System.out.println(teacher.getLesson());

        student1.printInfo();
        teacher.printInfo();
    }
}
