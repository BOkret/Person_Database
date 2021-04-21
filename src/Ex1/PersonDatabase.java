package Ex1;

import java.util.Arrays;

public class PersonDatabase {
    private final int INITIAL_CAPACITY = 1;
    private Person[] people = new Person[INITIAL_CAPACITY];
    private int peopleNumber = 0;

    public void add(Person person) {
        if (person == null) {
            throw new NullPointerException("Nie podano osoby");
        } else {
            if (peopleNumber >= people.length) {
                people = Arrays.copyOf(people, people.length * 2);
            }
//            for (int i = 0; i < people.length; i++) {
//                if (people[i] == null) {
//                    people[i] = person;
//                    peopleNumber++;
//                    break;
//                }
//            }
            people[peopleNumber] = person;
            peopleNumber++;                             //po dodaniu osoby mówię, że mam ich daną ilość w tablicy
        }
    }


    public void remove(Person person) {
        if (person == null) {
            throw new NullPointerException("Nie podano osoby");
        }
        final int notFound = -1;
        int foundIndex = notFound;

        for (int i = 0; i < peopleNumber && foundIndex == notFound; i++) {          //dodać sobie ten zapis do notatek
            if (person.equals(people[i])) {
                foundIndex = i;
            }
        }
        if (foundIndex != notFound){
            System.arraycopy(people, foundIndex + 1, people, foundIndex, people.length - foundIndex - 1);
            peopleNumber--;
            people[peopleNumber] = null;
        }
    }

    public Person getPerson(int index) throws ArrayIndexOutOfBoundsException {
        if (people[index] == null) {
            throw new NullPointerException("Brak osoby o takim indeksie");
        }
        return people[index];
    }

    public int size() {
        return peopleNumber;
    }

//    public String toString() {
//        String information = "";
//        for (Person person : people) {
//            if (person != null) {
//                information += person.toString() + "\n";
//            }
//        }
//        if (information != null)
//            return information;
//        else
//            throw new NullPointerException("Brak informacji do wyświetlenia");
//    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person size: " + peopleNumber);
        sb.append("\n");
        for (int i = 0; i < peopleNumber; i++) {
            sb.append(" > ");
            sb.append(people[i].toString());
            sb.append("\n");

        }
        return sb.toString();
    }
}
