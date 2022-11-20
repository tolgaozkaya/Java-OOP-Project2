public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, 234, "ahmet@gmail.com", "Ahmet", "Tatar");
        Student student2 = new Student(2, 235, "araz@gamail.com", "Araz", "Ateş");
        Student student3 = new Student(3, 236, "ali@gamail.com", "Ali", "Akcay");
        Student student4 = new Student(4, 237, "bora@gamail.com", "Bora", "Kazan");
        Student student5 = new Student(5, 238, "tolga@gamail.com", "Tolga", "Ozkaya");

        Instructor instructor = new Instructor(2, 156, "ebru@gmail.com", "Ebru", "Saygili");

        UserManager userManager = new UserManager();
        User[] users = {student1, student2, student3, student4, student5, instructor};
        userManager.addUser(student1);
        userManager.deleteUser(instructor);
        userManager.addMultiple(users);

        Student[] students = {student1, student2, student3, student4, student5};
        StudentManager studentManager = new StudentManager();
        studentManager.ListStudent(students);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addInstructor(instructor);

    }
}
