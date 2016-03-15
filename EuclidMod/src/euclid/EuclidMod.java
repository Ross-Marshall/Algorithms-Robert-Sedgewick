package euclid;

public class EuclidMod {

    int counter = 0;
    
    int gcd( int u, int v ) {
        int t;
        while ( u > 0 ) {
            System.out.println( "gcd [" + (counter++) + "]: u = " + u + " v = " + v );            
            if ( u < v ) {
                t = u;
                u = v;
                v = t;
            }
            u = u - v;
        }
        return u;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 461952; //Integer.parseInt( args[0] );
        int y = 116298;  //Integer.parseInt( args[1] );
        
        EuclidMod e = new EuclidMod();
        while ( x > 0 ) {
            System.out.println ( "main: x = " + x + " y = " + y );
            x = e.gcd( x,y );
        }
    }
    
}
   