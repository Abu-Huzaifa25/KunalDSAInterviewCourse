package DSAInterviewCourse.video.string;

public class StringBuilderEx {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++){
            char ch = (char) ('a' + i);
//            System.out.print(ch);
//            builder.append(ch);
        }

//        System.out.println("\n" +builder.toString());

        builder.append("Huzaifa ");
        System.out.println("Append >>> " + builder);

        // insert at specific indexes
        builder.insert(8, "Malik ");
        builder.insert(14, 1223);
        System.out.println("insert at specific indexes >>>> " + builder);

        // Replace a portion
        builder.replace(14, 18, "Java");
        System.out.println("Replace >>> "+ builder);

        // Delete a portion
        builder.delete(8, 14);
        System.out.println("Delete Portion with range >>> "+ builder);

        // Reverse the string
        builder.reverse();
        System.out.println("Reverse String >>>> " + builder );

        // Again Calling Reverse method to find original String
        builder.reverse();
        System.out.println("Reverse to original String >>>> " + builder );


        // Length of StringBuilder
        System.out.println("Length of String builder >>>> " + builder.length());

        // Convert to String
        String string = builder.toString();
        System.out.println("Convert to StringBuilder to String >>>>> "+ string);

        // // Capacity
        System.out.println("Capacity >>>> " + builder.capacity());



    }


}
