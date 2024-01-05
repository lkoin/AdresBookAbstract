package pl.gornik.person;

public abstract class Person  {

    private String name;
    private String surname;

    private String telephoneNumber;

    public Person(String name, String surname, String telephoneNumber) {
        this.name = name;
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public abstract void displayInfo();

    public void changeAdress(String name,String surname,String telephoneNumber) {
        this.name = name;
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
    }
}
