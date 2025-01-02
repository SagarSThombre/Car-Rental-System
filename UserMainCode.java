import java.util.Scanner;

class UserMainCode {

    public String[] stringEncoder(String[] input1, int input2) {
        // Step 3: Prepare an array to store the answers
        String[] result = new String[input1.length];
        
        for (int i = 0; i < input1.length; i++) {
            // Step 1: Extract the first, middle, and last characters
            String word = input1[i];
            int length = word.length();
            char first = word.charAt(0);
            char middle = word.charAt(length / 2); // Since length is odd, this will be the middle character
            char last = word.charAt(length - 1);
            
            // Concatenate first, middle, and last to form "temp"
            String temp = "" + first + middle + last;
            
            // Step 2: Concatenate "temp" with itself input2 times
            StringBuilder answer = new StringBuilder();
            for (int j = 0; j < input2; j++) {
                answer.append(temp);
            }
            
            // Store the result in the result array
            result[i] = answer.toString();
        }
        
        // Return the final encoded strings
        return result;
    }

    public static void main(String[] args) {
        // Input Handling
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of words in input1:");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline
        
        String[] input1 = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            input1[i] = sc.nextLine();
        }
        
        System.out.println("Enter the value of input2:");
        int input2 = sc.nextInt();
        
        // Create an instance of the UserMainCode class
        UserMainCode userMainCode = new UserMainCode();
        
        // Call the stringEncoder method
        String[] encodedStrings = userMainCode.stringEncoder(input1, input2);
        
        // Output the encoded strings
        System.out.println("Encoded Strings:");
        for (String str : encodedStrings) {
            System.out.println(str);
        }
        
        sc.close();
    }
}
