
/*
NAMA : DIMAS YUDHA SAPUTRA
NIM : 24060122120025
LAB : PBO D1
PERTEMUAN : 2
*/
import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        this.coursesEnrolled = new ArrayList<>();
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getStudentID() {
        return studentID;
    }

    public void getDetails() {
        System.out.println("  Name: " + name);
        System.out.println("  Age: " + age);
        System.out.println("  Address: " + address);
        System.out.println("  Student ID: " + studentID);
    }

    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
        System.out.println(name + " mengambil kelas " + course.getCourseName());
    }

    public void viewEnrolledCourses() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("kelas yang diambil oleh " + name + ":");
        System.out.println("----------------------------------------------------------------");

        if (coursesEnrolled.isEmpty()) {
            System.out.println(" - ");
            System.out.println("Note : Mahasiswa ini belum mengambil kelas sama sekali.");
        } else {
            for (Course course : coursesEnrolled) {
                course.getDetails();
                System.out.println("----------------------------------------------------------------");
            }
        }
    }

}
