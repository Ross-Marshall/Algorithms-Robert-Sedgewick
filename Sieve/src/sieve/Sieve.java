
package sieve;

/**
 *
 * @author rmarshall
 */


public class Sieve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 1000;
      
        
        int i;
        int j;
        int[] a;
        
        a = new int [N+1];
        
        for ( a[1] = 0, i = 2; i <= N ; i++ ) a[i] = 1;
        for ( i = 2 ; i <= N/2 ; i++ )
            for ( j = 2 ; j <= N/i ; j ++ ) 
                a[ i * j ] = 0;
        for ( i = 1 ; i < N ; i++ )
            if ( a[i] > 0)
                System.out.print( i + "\n");
        System.out.println( "\n");
        
    }
    
}
