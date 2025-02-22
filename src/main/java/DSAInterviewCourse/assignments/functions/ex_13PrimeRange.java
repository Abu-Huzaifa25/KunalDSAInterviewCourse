package DSAInterviewCourse.assignments.functions;

public class ex_13PrimeRange {


    public static void main(String[] args) {

        int start = 8, end = 12;
        int [] result = primeRange(start, end);

        for (int e : result){
            System.out.println(e + " ");
        }


    }



    static boolean isPrime(int n){
        if ( n < 2) return false;
        if ( n == 2 )return true;
        if ( n % 2 == 0) return false;

        for (int i = 3; i < n; i += 2){
            if (n % i == 0 ) return false;
        }
        return true;

    }

    static int[] primeRange(int start, int end){
        int [] temp = new int[end - start + 1]; //  store value depends on between range a and b ( start to end )
        int index = 0;

        for (int i = start; i < end; i++){ // run loop between range start to end
            if (isPrime(i)) temp[index++] = i;  // one by one add prime numbers => at a range start to end
        }

        int [] result = new int[index]; // empty arr to store prime numbers
        System.arraycopy(temp, 0, result ,0, index); //
        return result;


    }



}
