public class Teacher {
    String name;
    String phone;
    String branch;

    Teacher(String name, String phone, String branch) {
        this.name = name;
        this.phone = phone;
        this.branch = branch;
    }

    void print() {
        System.out.println("Name         : \t" + this.name);
        System.out.println("Phone Number : \t" + this.phone);
        System.out.println("Branch       : \t" + this.branch);
    }
}
