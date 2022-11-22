import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String consWord = scanner.nextLine();
        Days[] days = Days.values();
        for (Days day : days) {
            if (consWord.toLowerCase().equals(day.name().toLowerCase())){
                System.out.println(day.getWord());
            }
        }

    }
}