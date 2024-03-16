/*
NAMA : DIMAS YUDHA SAPUTRA
NIM : 24060122120025
LAB : PBO D1
PERTEMUAN : 4
*/

package tugas_tambahan.academic;

import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        this.studentsEnrolled = new ArrayList<>();
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void addStudent(Student student) {
        studentsEnrolled.add(student);
        System.out.println(student.getName() + " didaftarkan ke kelas " + courseName);
    }

    public void removeStudent(Student student) {
        studentsEnrolled.remove(student);
        System.out.println(student.getName() + " dihapus dari kelas " + courseName);
    }

    public void viewEnrolledStudents() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Students yang terdaftar di course " + courseName + " :");
        System.out.println("----------------------------------------------------------------");

        if (studentsEnrolled.isEmpty()) {
            System.out.println("Tidak ada students yang terdaftar di kelas ini.");
        } else {
            for (Student student : studentsEnrolled) {
                student.getDetails();
                System.out.println("----------------------------------------------------------------");
            }
        }
    }

    public void getDetails() {
        System.out.println("  Course Code: " + courseCode);
        System.out.println("  Course Name: " + courseName);
        System.out.println("  Lecture: " + lecture.getName());
    }
}
