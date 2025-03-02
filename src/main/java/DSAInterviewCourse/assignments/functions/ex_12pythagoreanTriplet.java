package DSAInterviewCourse.assignments.functions;

public class ex_12pythagoreanTriplet {
    public static void main(String[] args) {

        System.out.println(pythagoreanTriplet(new int []{3, 1, 4, 6, 5}));
    }

    public static boolean pythagoreanTriplet(int [] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                for (int k = 0 ; k < arr.length; k++){
                    // square
                    int x = arr[i] * arr[i];
                    int y = arr[j] * arr[j];
                    int z = arr[k] * arr[k];

                    if ( y + z == x || x + z == y || x + y == z){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
