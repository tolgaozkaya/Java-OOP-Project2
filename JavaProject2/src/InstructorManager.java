public class InstructorManager extends UserManager {

    public void addInstructor(Instructor instructor) {
        super.addUser(instructor);
        System.out.println("Eğitmen " + instructor.getFirstName() + " başarı ile eklendi.");
    }

    public void deleteInstructor(Instructor instructor) {
        super.deleteUser(instructor);
        System.out.println(instructor.getFirstName() + " kullanıcısı başarı ile silindi.");
    }
}
