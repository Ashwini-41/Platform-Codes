
 import java.util.*; 
//import java.io.*;

public class validation {

  public static boolean CodelandUsernameValidation(String str) {
    // code goes here 
    if (str.length() < 4 || str.length() > 25) {
            return false;
        }

        if (!Character.isLetter(str.charAt(0))) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }

        if (str.charAt(str.length() - 1) == '_') {
            return false;
        }

        return true;

    //return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    // Scanner s = new Scanner(System.in);

    // System.out.print(CodelandUsernameValidation(s.nextLine())); 
     Scanner scanner = new Scanner(System.in);

        // Take input for the username
        System.out.print("Enter the username: ");
        String username = scanner.nextLine();

        // Check if the username is valid using the isValidUsername function
        boolean isValid = CodelandUsernameValidation(username);

        // Output the result
        System.out.println(isValid);
    }
  
    // for(int i=0;i<str.length;i++){
    //     char ch = str.charAt(i);
    //     if(Character.isLetter(ch)){
    //       sol = 
    //     }
    //   }
    //   return sen;

}
    

