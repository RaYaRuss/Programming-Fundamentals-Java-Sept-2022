package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentsList = new ArrayList<>();

        for (int studentCount = 1; studentCount <= countStudents; studentCount++) {
            String data = scanner.nextLine();
            String [] dataParts = data.split(" ");
            String firstName = dataParts[0];
            String lastName = dataParts[1];
            double grade = Double.parseDouble(dataParts[2]);

            Student student = new Student(firstName, lastName, grade);
            studentsList.add(student);
        }
        // имаме сисък със студенти
        //1. да ги сортираме по оцентки
        //2. да отпечатаме всеки един студент
        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentsList) {
            System.out.println(student);
        }
    }
}
