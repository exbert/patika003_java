public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "+9012312345", "HST");
        Teacher t2 = new Teacher("Graham Bell", "+4912312345", "PHY");
        Teacher t3 = new Teacher("Pisagor", "+1012323423", "MAT");

        Course history = new Course("History", "101", "HST");
        history.addTeacher(t1);

        Course physic = new Course("Physics", "101", "PHY");
        physic.addTeacher(t2);

        Course mathematics = new Course("Mathematics", "101", "MAT");
        mathematics.addTeacher(t3);

        Student s1 = new Student("Kemal Sunal", "1111", "4", history, physic, mathematics);
        s1.addBulkExamNotes(20, 75, 65);

        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "2222", "4", history,physic,mathematics);
        s2.addBulkExamNotes(60,55,65);

        s2.isPass();
    }
}
