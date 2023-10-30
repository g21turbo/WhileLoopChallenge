public class Main {
    public static void main(String[] args) {

        System.out.println("The number is even: " + isEvenNumber(28543343));

        int number = 4;
        int finalNumber = 20;
        int evenNumberCount = 0;
        int oddNumberCount = 0;

        while (number <= finalNumber) {
            number++;
            if (isEvenNumber(number)) {
                oddNumberCount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenNumberCount++;
        }
        System.out.println("There are " + evenNumberCount + " even numbers");
        System.out.println("There are " + oddNumberCount + " odd numbers");
    }

    public static boolean isEvenNumber(int number) {

        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}