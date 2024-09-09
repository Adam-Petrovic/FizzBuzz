public class Reduce {
    public static void main(String[] args) {
        int number = 100;
        int steps = 0;
        while (number > 0){
            steps++;
            if (number % 2 == 0){
                number /= 2;
            }
            else{
                number--;
            }
        }

        System.out.printf(steps);
    }
}
