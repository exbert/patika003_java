public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int grade;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int grade = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            // printTeacher();
        } else {
            System.out.println("Teacher prefix and Class not match!");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }
}
