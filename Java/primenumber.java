public class primenumber {

    public static void main(String[] args) {
        for(int i =1;i<=100;i++){
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isprime(int num){
        if (num<=1) {
            return false;
        
        }
        for (int i =2;i<=num/2;i++){
            if (num % i ==0){
                return false;
            }
        }
        return true;
    
    }
}
