package DSAInterviewCourse.assignments.arrays;

public class JavaAs12 {
    public static void main(String[] args) {

    }


    static int largestAltitude(int[] gain) {


        // Woke is working on leet-Code try it
        int altitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < gain.length; i++){
            altitude += gain[i];
            //maxAltitude = Math.max(maxAltitude, altitude);

            if ( maxAltitude < altitude){
                maxAltitude = altitude;
            }
        }
        return maxAltitude;
    }
}
