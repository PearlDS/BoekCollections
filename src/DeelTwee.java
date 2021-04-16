import java.util.*;

public class DeelTwee {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       Set<Integer> numbers = new LinkedHashSet<>();
        Set<Integer> randomNumbers = new HashSet<>();
        Random random = new Random();

        while (numbers.size()<6) {
            int i = scanner.nextInt();
            if(i<46&&i>0)
            numbers.add(i);
            else System.out.println("Please write in a number between 1 and 45");


        }

        while (randomNumbers.size()<6) {
            int i = random.nextInt(45)+1;
            randomNumbers.add(i);

        }
        numbers.forEach(System.out::println);
        System.out.println();
        randomNumbers.forEach(System.out::println);

        numbers.retainAll(randomNumbers);
        System.out.println("What is retained");
        numbers.forEach(System.out::println);


    }
}
