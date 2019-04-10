package PersonPackage;

public class Person {

    public String name;
    public int age;
    public String phoneNumber;
    private String username;
    private String password;

    public Person(String name, int age, String phoneNumber, String username, String password) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
    }
}
