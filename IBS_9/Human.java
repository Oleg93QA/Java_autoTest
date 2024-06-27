package IBS_9;

public class Human {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + getName());
    }
}
