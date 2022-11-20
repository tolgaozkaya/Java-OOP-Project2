public class UserManager {
    public void addUser(User user) {
        System.out.println("ID: " + user.getId() + "," + " Save to database");
    }

    public void addMultiple(User[] users) {
        for (User user : users) {
            addUser(user);
        }
    }

    public void deleteUser(User user) {
        System.out.println("ID: " + user.getId() + "," + " Delete to database");
    }
}
