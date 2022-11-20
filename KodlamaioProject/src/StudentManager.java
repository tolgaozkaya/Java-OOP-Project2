public class StudentManager extends UserManager {
    public void ListStudent(Student[] students) {
        for (Student student : students) {
            System.out.println("Öğrenci " + student.getFirstName() + " " + student.getLastName() + " başari ile eklendi.");
        }
    }

    public void addStudent(Student student) {
        super.addUser(student);
        System.out.println("Öğrenci " + student.getFirstName() + " başari ile eklendi.");
    }
}
