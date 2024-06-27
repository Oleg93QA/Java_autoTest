package IBS_7_8;

public class BuilderString {
    public static void main(String[] args) {


        String str = new String();
        str = "";
        for (int i = 0; i < 2000; i++) {
            str += i + " ";
        }
        System.out.println(str);


        StringBuilder str2 = new StringBuilder("");
        for (int i = 0; i < 2000; i++) {
            str2.append(i).append(" ");
        }
        System.out.println(str2);
    }
}