import java.util.*;

public class DeelEen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new LinkedList<>();

        int sum = 0;
        while (numbers.size()<5) {
            int i = scanner.nextInt();
            numbers.add(i);
            sum+=i;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+(sum/numbers.size()));

        numbers.forEach(System.out::println);

        List<String> sentence = new ArrayList<>();

        String word ="";
        do {
            word = scanner.next();
            sentence.add(word+ " ");
        }while (!word.endsWith("."));


        sentence.forEach(System.out::print);
        System.out.println();

        System.out.println(sentence.size());
        for (int position = sentence.size()-1; position>=0; position--){
            System.out.print(sentence.get(position));
        }

        Collections.reverse(sentence);
        sentence.forEach(System.out::print);

    }
}
