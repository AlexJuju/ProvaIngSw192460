package ingsw20_11_04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyListUtil mylist = new MyListUtil ();

        Scanner in = new Scanner (System.in);
        
        ArrayList<Integer> list = new ArrayList<Integer> ();
        
        System.out.println("Inserire una lista di interi, 0 per terminare");

        int input = in.nextInt();
        while ( input != 0 ) {
        	list.add( input );
        	input = in.nextInt();
        }
        
        System.out.println( "Che ordinamento si desidera? 0-ascendente, 1-discendente");
        input = in.nextInt();
        if (input == 0) {
        	list = mylist.sortUp(list);
        }else if ( input == 1 ) {
        	list = mylist.sortDown(list);
        } else System.out.println("Nessun ordinamento selezionato!");
        
        in.close();
        
        for ( int i = 0; i < list.size(); i++ )
        	System.out.println( list.get(i));
        

    }
}
