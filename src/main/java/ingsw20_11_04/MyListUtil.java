package ingsw20_11_04;

import java.util.ArrayList;

/*data una lista di numeri interi,
 * organizzi gli elementi sia in ordine crescente sia in ordine decrescente,
 * a seconda della scelta dell'utente*/
public class MyListUtil {
	
	
	public ArrayList<Integer> sortUp ( ArrayList<Integer> in ) {
		ArrayList<Integer> tempList = new ArrayList<Integer> (in);
		ArrayList<Integer> list = new ArrayList<Integer> ();

		for ( int i = tempList.size(); i > 0; i-- ) {
			int temp = tempList.get(0);
			int idx = 0;
			for ( int j = 0; j < tempList.size(); j++ ) {
				if ( tempList.get(j) < temp ) {
					temp = tempList.get(j);
					idx = j;
				}
			}
			list.add(temp);
			tempList.remove(idx);
		}		
		
		return list;
	}
	
	public ArrayList<Integer> sortDown ( ArrayList<Integer> in ) {
		ArrayList<Integer> tempList = new ArrayList<Integer> (in);
		ArrayList<Integer> list = new ArrayList<Integer> ();
		
		for ( int i = tempList.size(); i > 0; i-- ) {
			int temp = tempList.get(0);
			int idx = 0;
			for ( int j = 0; j < tempList.size(); j++ ) {
				if ( tempList.get(j) > temp ) {
					temp = tempList.get(j);
					idx = j;
				}
			}
			list.add(temp);
			tempList.remove(idx);
		}
		
		return list;
	}

}
