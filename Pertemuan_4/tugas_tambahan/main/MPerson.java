/*
NAMA : DIMAS YUDHA SAPUTRA
NIM : 24060122120025
LAB : PBO D1
PERTEMUAN : 4
*/

package tugas_tambahan.main;

import tugas_tambahan.academic.*;

public class MPerson {
    public static void main(String[] args) {
        // input lecturer
        Lecture EdySuharto = new Lecture("Edy Suharto, S.T., M.Kom", 50, "Pedurungan", 12345);
        Lecture Khadijah = new Lecture("Khadijah, S.Kom., M.Cs.", 45, "Tembalang", 12346);
        Lecture MalikHakim = new Lecture("Muhammad Malik Hakim, S.T., M.T.I.", 46, "Banyumanik", 12347);

        // input students
        Student Ardy = new Student("Ardy Hasan", 20, "Palangkaraya", 20001);
        Student Yahya = new Student("Yahya Ilham", 21, "Jakarta", 20002);
        Student Zikry = new Student("Zikry Alfahri", 20, "Kendari", 20003);
        Student Yusuf = new Student("Yusuf Zaenul", 19, "Magelang", 20004);

        // input courses
        Course pbo = new Course("PAIK23", "Pemrograman Berbasis Objek", EdySuharto);
        Course siscer = new Course("PAIK26", "Sistem Cerdas", Khadijah);
        Course jarkom = new Course("PAIK30", "Jaringan Komputer", MalikHakim);
        Course dasis = new Course("PAIK14", "Dasar Sistem", MalikHakim);

        System.out.println("================================================================");
        MalikHakim.teachCourse(jarkom);
        EdySuharto.teachCourse(pbo);
        Khadijah.teachCourse(siscer);
        MalikHakim.teachCourse(dasis);

        System.out.println("================================================================");
        pbo.addStudent(Ardy);
        pbo.addStudent(Yahya);
        pbo.addStudent(Zikry);
        siscer.addStudent(Zikry);
        siscer.addStudent(Yahya);
        jarkom.addStudent(Ardy);
        dasis.addStudent(Zikry);
        dasis.addStudent(Yahya);
        System.out.println("================================================================");

        Ardy.enrollInCourse(pbo);
        Ardy.enrollInCourse(jarkom);
        Yahya.enrollInCourse(pbo);
        Yahya.enrollInCourse(siscer);
        Yahya.enrollInCourse(dasis);
        Zikry.enrollInCourse(pbo);
        Zikry.enrollInCourse(siscer);
        Zikry.enrollInCourse(dasis);

        System.out.println("================================================================");
        Ardy.viewEnrolledCourses();
        System.out.println("================================================================");
        Yusuf.viewEnrolledCourses();
        System.out.println("================================================================");
        Yahya.viewEnrolledCourses();
        System.out.println("================================================================");
        Zikry.viewEnrolledCourses();

        System.out.println("================================================================");
        MalikHakim.viewTaughtCourses();

        System.out.println("================================================================");
        EdySuharto.viewTaughtCourses();

        System.out.println("================================================================");
        Khadijah.viewTaughtCourses();

        System.out.println("================================================================");
        pbo.viewEnrolledStudents();

        System.out.println("================================================================");
        siscer.viewEnrolledStudents();

        System.out.println("================================================================");
        jarkom.viewEnrolledStudents();

        System.out.println("================================================================");
        dasis.viewEnrolledStudents();

    }
}
