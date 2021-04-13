package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate (Student student) {
        Random rnd = new Random();
        int randomGrade = rnd.nextInt(4) + 2;

        String result;
        switch (randomGrade) {
            case 2: result = "неудовлетвортельно";
                    break;
            case 3: result = "удовлетворительно";
                    break;
            case 4: result = "хорошо";
                    break;
            default: result = "отлично";


        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
               " по предмету " + subject + " на оценку " + result + ".");

    }
}
