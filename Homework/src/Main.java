import School.HeadTeacher;
import School.Teacher;
import School.Director;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new HeadTeacher("Lili", "Muradyan", 18, 1.6);
        teacher1.salary();
        System.out.println(teacher1.getSalary());
        Teacher teacher2 = new Teacher("Arayik", "Arzumanyan", 17);
        teacher2.salary();
        System.out.println(teacher2.getSalary());
        Teacher teacher3 = new Director("Sona", "Malxasyan", 11, 150000);
        teacher3.salary();
        System.out.println(teacher3.getSalary());

    }
}