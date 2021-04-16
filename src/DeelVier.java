import java.util.*;

public class DeelVier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NavigableSet<String> sentence = new TreeSet<>();

        String word ="";
        do {
            word = scanner.next();
            sentence.add(word);
        }while (sentence.size()<5);


        sentence.forEach(System.out::println);
        System.out.println();
        System.out.println(sentence.first());
        System.out.println(sentence.last());
    }
}
