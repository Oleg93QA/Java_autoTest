package IBS_9;

public class Student extends Human {
    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(String group, String name) {
        this.group = group;
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("Этот человек с именем " + super.name + "\n Этот студент с именем" + super.name);
    }


}
