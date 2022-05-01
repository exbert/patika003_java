public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String studentNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNotes(int grade1, int grade2, int grade3) {
        if (grade1 >= 0 && grade1 <= 100) {
            this.c1.grade = grade1;
        }
        if (grade2 >= 0 && grade2 <= 100) {
            this.c2.grade = grade2;
        }
        if (grade3 >= 0 && grade3 <= 100) {
            this.c3.grade = grade3;
        }
    }

    void isPass() {
        this.average = (this.c1.grade + this.c2.grade + this.c3.grade) / 3.0;

        if (this.average >= 55) {
            this.isPass = true;
            System.out.println(this.name + " passed!");
        } else {
            this.isPass = false;
            System.out.println(this.name + " failed!");
        }

        printGrades();
    }

    void printGrades() {
        System.out.println(this.c1.name + "     Grade: " + this.c1.grade);
        System.out.println(this.c2.name + "     Grade: " + this.c2.grade);
        System.out.println(this.c3.name + " Grade: " + this.c3.grade);
        System.out.println("Average Grade: " + this.average + "\n");
    }
}
