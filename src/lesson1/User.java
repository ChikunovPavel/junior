package lesson1;

public class User {
    String name;
    int page;

    public User(String name, int page) {
        this.name = name;
        this.page = page;
    }

    @Override
    public String toString() {
        return "lesson1.User{" +
                "name='" + name + '\'' +
                ", page=" + page +
                '}';
    }
}
