package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class main {

	public static void main(String[] args) {
		
		
		System.out.println(convolution(new ArrayList<>(Arrays.asList(1,2,3)),new ArrayList<>(Arrays.asList(4,5,6))));
		
		
	
	}
	
	private static List<Integer> convolution(List<Integer> a,List<Integer> b){
		
		//O(n^2)
		
		
		LinkedList<Integer> y = new LinkedList<>();
		
		for(int i = 0;i < b.size();i++){
			y.addFirst(0);
		}
		
		for(int i = 0;i < b.size();i++){
			y.addFirst(b.get(i));
		}
		
		
		//convoluting
		
		List<Integer> conv = new ArrayList<>();
		
				
		int size = a.size();
		int len = y.size();
		
		for(int i = 0;i < len-1;i++){
			
			int el = 0;
			y.addFirst(y.removeLast());//O(1),because its a linked list
			
			for(int j = 0;j < size;j++){
				el += y.get((len/2)+j)*a.get(j);
			}
			conv.add(el);
		}
		
		return 	conv;
	}
	
	
	

}
