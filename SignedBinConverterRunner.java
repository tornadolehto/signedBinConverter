package signedBinConverter;

import java.util.InputMismatchException;
import java.util.Scanner;


public class SignedBinConverterRunner {
    public static void main(String[] args){
        while (true){
            int input;
            int base = 3;
            Scanner scanner = new Scanner(System.in);

            try{input = scanner.nextInt();
            } 
            catch(InputMismatchException goy){
                System.out.println("Invalid input, valid range -2,147.483,648 - 2,147,483,647");
                continue;
            }
            System.out.println((SignedBinConverter.convert(input, base)));
        }
    }
}
