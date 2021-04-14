package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "";
//        for (int i = 1; i < 20001; i++) {
//            str = str + i + " ";
//        }
//        System.out.println(str);

        for (int i = 1; i < 20001; i++) {
            sb.append(" " + i);
        }
        System.out.println(sb.toString());
    }
}
