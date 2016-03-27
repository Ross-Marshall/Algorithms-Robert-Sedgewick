public class GCDArray {

   int gcd( int u, int v ) {
        int t;

        if ( v == 0 ) return 0;

        while ( u > 1 ) {
    
            if ( u < v ) {
                t = u;
                u = v;
                v = t;
            }       

            u = u - v;
            
        }
        return u;
    }

    public static void main ( String [] args ) {
 
        if ( args.length < 2 ) {
           System.out.println( "Usage: java GCDArray <min int> <max int>" ); 
           System.exit(1);
        }
        
        int max_x = Integer.parseInt( args[0] );
        int max_y = Integer.parseInt( args[1] );

        int [][] a = new int[ max_x+1 ][ max_y+1 ];

        GCDArray g = new GCDArray();

        for ( int i = 0 ; i < max_x ; i++ ) {
            for ( int j = 0 ; j < max_y ; j++ ) {

                 if ( g.gcd( i, j ) == 1 ) {
                     a[i][j] = 1;
                 }  else {
                     a[i][j] = 0;
                 }
            }
        } 

        for ( int i = 0 ; i < max_x ; i++ ) {
            for ( int j = 0 ; j < max_y ; j++ ) {
                 System.out.print( a[i][j] + " " );
            }
            System.out.println("");
        }    
         
    }
}
