public class Student extends User {
    private int id;
    private int userId;
    private String firstName;
    private String lastName;

    public Student(int id, int userId, String email, String firstName, String lastName) {
        super(userId, email);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return this.id;
    }

    public void setStudentId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
