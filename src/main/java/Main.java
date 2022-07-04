import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String input = Integer.toString(in.nextInt());
        int numberOfAttempts = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numberOfAttempts; i++){
            checkTrial(input, Integer.toString(in.nextInt()));
        }
    }

    public static void checkTrial(String input, String trial){
        int goodPosition = 0;
        int badPosition = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == trial.charAt(i)){
                goodPosition++;
            }else {
                for (int j = 0; j < input.length(); j++){
                    if (i == j){
                        continue;
                    }else if (input.charAt(i) == trial.charAt(j)){
                        badPosition++;
                    }
                }
            }
        }
        System.out.println(goodPosition + " - " + badPosition);
    }
}
