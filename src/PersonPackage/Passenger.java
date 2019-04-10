package PersonPackage;

public class Passenger extends Person {

    private static final String USERNAME = "Customer";
    private static final String PASSWORD = "Password";

    public Passenger(String name,int age, String phoneNumber){
        super(name,age,phoneNumber,USERNAME,PASSWORD);
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
}
