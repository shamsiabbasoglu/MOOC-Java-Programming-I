
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        Person shortest = persons.get(0);
        for (Person person : persons) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }
        Person take = shortest();
        return persons.remove(persons.indexOf(take));
    }
}
