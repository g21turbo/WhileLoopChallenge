public class Main {
    public static void main(String[] args) {

        System.out.println("The number is even: " + isEvenNumber(28543343));

        int number = 4;
        int finalNumber = 20;

        while (number <= finalNumber) {
            number++;
            if (isEvenNumber(number)) {
                System.out.println("Even number " + number);
            }
        }
    }
    
    public static boolean isEvenNumber(int number) {

        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}