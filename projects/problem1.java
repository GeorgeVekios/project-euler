public class problem1 {
    public static int multipleTotal(int factor1, int factor2, int limit){
        int sum = 0;
        int num = 0;
        while(num < limit){
            if(num % factor1 == 0 || num % factor2 == 0)
                sum += num;
            num++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(multipleTotal(3,5,1000));
    }
}
