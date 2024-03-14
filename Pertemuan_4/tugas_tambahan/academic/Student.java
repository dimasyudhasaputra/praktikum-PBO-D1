/*
NAMA : DIMAS YUDHA SAPUTRA
NIM : 24060122120025
LAB : PBO D1
PERTEMUAN : 4
*/
package tugas_tambahan.academic;

import java.util.List;

import tugas_tambahan.person.Person;

import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();

    }

    public int getStudentID() {
        return studentID;
    }

    // override
    public void getDetails() {
        super.getDetails();
        System.out.println("Student ID: " + studentID);
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
