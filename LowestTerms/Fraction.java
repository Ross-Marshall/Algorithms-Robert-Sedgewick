//package lowestterms;

public class Fraction {

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

    public void parseFraction( String fraction ) {
        
        int solidusPosition = fraction.indexOf( "/" );

        this.numerator = Integer.parseInt( 
                         fraction.substring(0, solidusPosition ) );
        
        System.out.println( "numerator   = " + this.numerator );
        this.denominator = Integer.parseInt( 
                         fraction.substring( solidusPosition+1 ) );
        System.out.println( "denominator = " + this.denominator );
    }

    public static void main( String [] args ) {

        Fraction f = new Fraction();
        int div = 0;

        String myFraction = args[0];
        f.parseFraction( myFraction );
        
        div = f.gcd( f.numerator, f.denominator );

        System.out.println( "gcd         = " + div );
   
        System.out.println( myFraction + " in lowest terms is: " +
                            ( f.numerator / div ) + "/" +
                            ( f.denominator / div ) );
    }

}
