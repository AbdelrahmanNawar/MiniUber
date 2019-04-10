package PersonPackage;

public class Manager extends Employee {

    private static final String USERNAME = "Manager";
    private static final String PASSWORD = "Password";

    public Manager(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber, USERNAME, PASSWORD);
    }
    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

}
