public class Admin {
    private String name, email, status;
    private int age;

    public Admin(String name, String email, int age, String status) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.status = status;
    }

    public String getValues() {
        return "Name: " + this.name + "\nEmail: " + this.email + "\nAge: " + this.age + "\nStatus: " + this.status;
    }
}