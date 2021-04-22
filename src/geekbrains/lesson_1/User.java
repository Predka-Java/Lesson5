package geekbrains.lesson_1;

public class User {
    String name;
    String post;
    String email;
    int num;
    int salary;
    int age;

    public User(String name, String post, String email, int num, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.num = num;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + post + " " + email + " " + num + " " + salary + " " + age);
    }

}
