package Ex1;

public class App {
    public static void main(String[] args) {
        PersonDatabase personDatabase = new PersonDatabase();

        personDatabase.add(new Person("Bartek", "O", "952323232"));
        personDatabase.add(new Person("Kasia", "M", "954444444"));
        personDatabase.add(new Person("Ania", "SDsd", "95"));
        personDatabase.add(new Person("Karol", "T", "95444"));

        Person person = personDatabase.getPerson(1);
        System.out.println(person);
        System.out.println(personDatabase.size());

        personDatabase.remove(new Person("Karol", "T", "95444"));


        System.out.println(personDatabase);
    }
}
