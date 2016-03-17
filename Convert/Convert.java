public class Convert {

    public int convert( String inNum ) {
        char zero = '0';
        char nine = '9';
        int tens = 1;
        int outNum = 0;
        for ( int i =  inNum.length() ; i > 0 ; i-- ) {
             outNum = outNum + ( tens * ( inNum.charAt( i-1 ) - zero ) );
             tens = tens*10;
        }
        return outNum;
    }

    public static void main( String [] args ) {

        String inNum = args[0];

        System.out.println( "Convert: Input [" + inNum + "]" );

        Convert c = new Convert();
        int intValue = c.convert( inNum );
        System.out.println( "intValue = " + intValue );
        System.out.println( "intValue + 1111 = " + (intValue + 1111));
    }

}
