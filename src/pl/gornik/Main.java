package pl.gornik;

import pl.gornik.person.Employee;
import pl.gornik.person.Familiar;
import pl.gornik.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person>persons = new ArrayList<>();
        persons.add(new Employee("Marek","Mostowiak","576857394","kierownik"));
        persons.add(new Employee("Grzegorz","Brzenczyszczykiewicz","536273849","kierownik"));
        persons.add(new Familiar("Jan","Kowalski","324532678","wędkarstwo"));
        persons.add(new Familiar("Mariusz","Zbrodniarz","827356748","kolarstwo"));
        for (Person person : persons)
        {
            System.out.println("-------------------------------------");
            System.out.println("Podaj nr osoby w książce adresowej (1-4)");
            int nr = scanner.nextInt();
            scanner.nextLine();
            Person person1 = persons.get(nr-1);
            System.out.println("Podaj nowe imie");
            String name = scanner.nextLine();
            System.out.println("Podaj nowe nazwisko");
            String surname = scanner.nextLine();
            System.out.println("Podaj nowy nr telefonu");
            String telephoneNumber = scanner.nextLine();

            person1.changeAdress(name,surname,telephoneNumber);
            person1.displayInfo();

        }


    }


}