public class problem3 {
    public static long prime(long n){
        long num;
        for(num = 2; num < n; num++){
            if(n % num == 0){
                n = n/num;
                num--;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(prime(600851475143L));
    }
}
