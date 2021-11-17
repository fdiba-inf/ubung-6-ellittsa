package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean passwordValid = false;
        do{
          System.out.println("Enter password: ");
          String password = input.nextLine();
          if(password.length() < 8){
            continue;
          }
          int digitCount = 0;
          for(int i = 0; i < password.length();i++ ){
            char symbol = password.charAt(i);
            if(!Character.isLetterOrDigit(symbol)){
              break;
            }
            if(Character.isDigit(symbol)){
              digitCount++;
            }

            if(Character.isLetterOrDigit(symbol) && digitCount >= 2 ){
              passwordValid = true;
            }
          }

        } while(!passwordValid);

        System.out.println("Password valid!");

      
    }
}
