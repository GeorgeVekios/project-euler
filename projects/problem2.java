public class problem2 {
    public static int fibonacci(int fibo1, int fibo2){
        int fiboSum = 0;
        int evenSum = 0;
        while(fibo2 <= 4000000) {
            if (fibo2 % 2 == 0)
                evenSum += fibo2;
            System.out.println("fibo1: " + fibo1 + "\n fibo2:" + fibo2);
            fiboSum = fibo1 + fibo2;
            System.out.println("fiboSum:" + fiboSum);
            fibo1 = fibo2;
            fibo2 = fiboSum;
            System.out.println("evenSum:" + evenSum);
        }
        return evenSum;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(1,2));
    }
}
