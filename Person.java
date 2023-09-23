package demo_Com.com_Demo;

public class Person {

    private int id;
    private String name;
    private String email;
    private String city;
    private String state;
    private String country;
    private String phone;

    public Person() {
        super();
        System.out.println("Default Constructor");
    }

    public Person(int id) {
        super();
        this.id = id;
    }

    public Person(String name, String email) {
        super();
        this.name = name;
        this.email = email;
    }

    public Person(String city, String state) {
        super();
        this.city = city;
        this.state = state;
    }

    public Person(String country, String phone) {
        super();
        this.country = country;
        this.phone = phone;
    }

    public Person(int id, String name, String email, String city, String state, String country, String phone) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.city = city;
        this.state = state;
        this.country = country;
        this.phone = phone;
    }

    void person_details() {
        System.out.println(
            this.id + " : " + this.name + " : " + this.email + " : " + this.city + " : " + this.state + " : " +
            this.country + " : " + this.phone
        );
    }
}
