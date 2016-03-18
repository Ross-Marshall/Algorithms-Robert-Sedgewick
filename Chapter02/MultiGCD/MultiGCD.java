//package lowestterms;

public class MultiGCD {

    public int numerator;
    public int denominator;
    public String solidus = "/";

    public int gcd( int u, int v ) {
       
        int t;

        while ( u > 0 ) {
            if ( u < v ) {
               t = u;
               u = v;
               v = t;
             }
             u = u % v;
        }
        return v;
    }

    public static void main( String [] args ) {

        MultiGCD m = new MultiGCD();

        if ( args.length > 1 ) {
           int w = m.gcd( Integer.parseInt( args[0] ), Integer.parseInt( args[1] ));

           int i = 2;
           while ( i < args.length ) {
               w = m.gcd( Integer.parseInt( args[i] ), w );
               i++; 
           }
           System.out.print( "The Greatest Common Divisor of " + args[0] );
           for ( i = 1 ; i < args.length-1 ; i++ ) {
               System.out.print( ", " + args[i] );
           }
           System.out.println( " and " + args[ args.length-1 ] + " is " + w );

        } else {
            System.out.println( "Enter at least 2 integers." );
        }
    }

}
