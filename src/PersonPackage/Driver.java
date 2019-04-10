package PersonPackage;

public class Driver extends Employee{

    private static final String USERNAME = "Driver";
    private static final String PASSWORD = "Password";

    public Driver(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber, USERNAME, PASSWORD);
    }
    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
}
