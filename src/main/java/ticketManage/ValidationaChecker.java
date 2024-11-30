import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidationaChecker {

    public static int PositiveNumber(Scanner scan, String message){
        int value = 0;
        while(true){
            System.out.println(message);
            try{
                value = scan.nextInt();
                if(value < 0){
                    throw new IllegalArgumentException("Value must be a positive number");
                }
                break;
            }catch (InputMismatchException e){
                System.err.print("Invalid input. Please enter valid number");
            }catch (IllegalArgumentException e){
                System.err.print(e.getMessage());
            }
        }
        return value;
    }

}
