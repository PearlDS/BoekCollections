import java.util.*;
import java.util.stream.Collectors;

public class DeelTweePerson {
    public static void main(String[] args) {

        Set<Person> people = new TreeSet<>(Comparator.comparing(Person::getLastName).thenComparing(Person::getAge).thenComparing(Person::getWeight));


        people.add(new Person("Jens", "Mievis",'M',26, 50, 216.1));
        people.add(new Person("Mario", "Mario",'M',40, 150, 125));
        people.add(new Person("Lara", "Croft",'F',21, 65, 170.5));
        people.add(new Person("Diana", "WonderWoman",'F',1000, 80, 190));
        people.add(new Person("Lara", "Croft",'F',18, 65, 170.5));


        System.out.println("------");
        for(Person person: people){
            System.out.println(person);
        }

        List<Person> personList = new ArrayList<>(people);

       personList.sort(Comparator.naturalOrder());
       personList.sort(Comparator.comparing(Person::getWeight).thenComparing(Person::getHeight));


       Comparator ageComp = new PersonAgeComparator();
       List<Person> womenOver20 = (List<Person>) personList.stream()
               .filter(person -> person.getGender()=='F' && person.getAge()>20)
               .sorted(ageComp)
               .collect(Collectors.toList());

        System.out.println("----");
       womenOver20.forEach(person -> System.out.println(person));


       NavigableMap <String, Person> personNavigableMap = new TreeMap<>();

       personList.forEach(person -> personNavigableMap.put(person.getLastName()+ " "+person.getFirstName(), person));
        System.out.println("/////////");
       for (String fullName: personNavigableMap.keySet()){
           System.out.println("Key: "+ fullName);
           System.out.println(personNavigableMap.get(fullName));
       }
        System.out.println("----");

        System.out.println(personNavigableMap.get("Croft Lara"));
        System.out.println(personNavigableMap.firstEntry());
        System.out.println(personNavigableMap.lastEntry());

    }
}
