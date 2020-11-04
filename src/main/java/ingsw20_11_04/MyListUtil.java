package ingsw20_11_04;

import java.util.ArrayList;

/*data una lista di numeri interi,
 * organizzi gli elementi sia in ordine crescente sia in ordine decrescente,
 * a seconda della scelta dell'utente*/
public class MyListUtil {
	
	
	public ArrayList<Integer> sortUp ( ArrayList<Integer> in ) {
		ArrayList<Integer> list = new ArrayList<Integer> ();

		for ( int i = in.size(); i > 0; i-- ) {
			int temp = in.get(0);
			int idx = 0;
			for ( int j = 0; j < in.size(); j++ ) {
				if ( in.get(j) < temp ) {
					temp = in.get(j);
					idx = j;
				}
			}
			list.add(temp);
			in.remove(idx);
		}		
		
		return list;
	}
	
	public ArrayList<Integer> sortDown ( ArrayList<Integer> in ) {
		ArrayList<Integer> list = new ArrayList<Integer> ();
		
		for ( int i = in.size(); i > 0; i-- ) {
			int temp = in.get(0);
			int idx = 0;
			for ( int j = 0; j < in.size(); j++ ) {
				if ( in.get(j) > temp ) {
					temp = in.get(j);
					idx = j;
				}
			}
			list.add(temp);
			in.remove(idx);
		}
		
		return list;
	}

}
