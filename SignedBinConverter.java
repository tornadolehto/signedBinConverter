package signedBinConverter;

public class SignedBinConverter {
    public static String convert(int input, int base){

            input = Math.abs(input);

            String output = "";
            output += (input%base);

            while (input >1){
                input /= base;
                if(output.length()%9==8){
                    output += " ";
                }
                output += (input%base);
     
            }

            while (output.length() <= 35){
                if (output.length()%9 == 8){
                    output += " ";
                }
                else{
                    output += 0;
                }

            }

            output = new StringBuilder(output).reverse().toString();

            return output;

        }
       
    }
    
