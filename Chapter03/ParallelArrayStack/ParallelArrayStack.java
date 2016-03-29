public class ParallelArrayStack {

   public int sp = 0;
   String [] a;
   int    [] links;
   public int NULL = -1;

   public ParallelArrayStack( int max ) {
      a     = new String[ max ];
      links = new int[ max ];
      sp    = 0;
      links[ sp ] = NULL;
   }

   public void push( String ch ) {
      a[ sp ] = ch;
      if ( sp > 0 ) {
          links[ sp ] = sp - 1;
      } 
      sp++;
   }

   public void pop() {
       sp--;
   }

   public void printStack() {
       System.out.println( "--------------" );
       for ( int i = sp-1 ; i >= 0 ; i-- ) {
           System.out.println( "     [ " + a[ i ] + " ]" );
       }
   }

   public static void main( String [] args ) {
        
       if ( args.length < 2 ) {
           System.out.println( "Usage: java ParallelArrayStack <MAX> <DATA STRING>" );
           System.exit(-1);
       }

       int max = Integer.parseInt( args[0] );
       String [] tokens = args[1].split(" ");
       String ch = null;
       String SPLAT = "*";
       
       ParallelArrayStack s = new ParallelArrayStack( max );

       for ( int i = 0 ; i < tokens.length ; i++ ) {
            ch = tokens[i];
            if ( ch.equals( SPLAT ) ) {
                 s.pop();
            } else {
                 s.push( ch );
            }
            s.printStack();
       }

       
   }
   

}
