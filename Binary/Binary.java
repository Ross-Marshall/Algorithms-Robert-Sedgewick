
public class Binary {

   public String binary( String num ) {

       long lNum = Long.parseLong( num );
       String binaryNumber = "";
       String zero = "0";
       String one  = "1";

       while ( lNum > 0 ) {
            binaryNumber = ( lNum % 2  ) + binaryNumber;
            lNum = lNum / 2;
       }

       return binaryNumber;
   }

   public static void main( String [] args ) {

       String decimalNumber = args[0];

       Binary b = new Binary();
       System.out.println( decimalNumber + " in binary is " + b.binary( decimalNumber ) );
   }
}
