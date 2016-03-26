public class JosephusArray {

    public int N;  // Total number of people
    public int M;  // The person killed.
    public int [] theCircle;

    public JosephusArray( int N, int M ) {
         this.N = N;
         this.M = M;

         theCircle = new int[ N ];
         populateCircle();
    }

    public void printCircle() {
        System.out.print( "The Circle : " );
        for ( int i = 0 ; i < N ; i++ )
            if ( theCircle[ i ] > 0 ) {
                System.out.print( theCircle[ i ] + " " );
            }
        System.out.println( "\n" );
    }

    public void populateCircle() {      
       for ( int i = 0 ; i < N ; i++ )
            theCircle[ i ] = i+1;
    }

    public void josephus() {
        int j = 0;
        int counter = 1;
        int loopCounter = 0;
        int totalKilled = 0;
        do {
               if ( j == N ) { j = 0; }

               if ( ( theCircle[ j ] != 0 ) && ( counter == M )) { 
                  counter = 1; 
                  theCircle[ j ] = 0;
                  totalKilled++;
               }

               printCircle();

               if ( theCircle[ j ] != 0 ) { counter++; }
               j++;
               loopCounter++;

        } while ( totalKilled < N-1 ); 
    }

    public static void main ( String [] args ) {

        JosephusArray c = new JosephusArray( Integer.parseInt( args[0] ), 
                                             Integer.parseInt( args[1] ) );

        c.printCircle();
        c.josephus();
         
    }

}
