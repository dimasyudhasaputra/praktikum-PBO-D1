
/*
NAMA : DIMAS YUDHA SAPUTRA
NIM : 24060122120025
LAB : PBO D1
PERTEMUAN : 2
*/

package tugas_tambahan.academic;

import tugas_tambahan.person.Person;
import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person {

    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void getDetails() {
        System.out.println(" Name: " + name);
        System.out.println(" Age: " + age);
        System.out.println(" Address: " + address);
        System.out.println(" Employee ID: " + employeeID);
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
        System.out.println(name + " mengampu kelas : " + course.getCourseName());
    }

    public void viewTaughtCourses() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Kelas yang diampu oleh dosen " + name);
        System.out.println("----------------------------------------------------------------");

        if (coursesTaught.isEmpty()) {
            System.out.println("Dosen ini tidak mengampu kelas sama sekali.");
        } else {
            for (Course course : coursesTaught) {
                course.getDetails();
                System.out.println("----------------------------------------------------------------");
            }
        }
    }
}
