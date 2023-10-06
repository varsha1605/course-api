package io.neha.springbootquickstart.hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

public class MaximumIntervalsOverlap {
	public static void main(String[] args){
		int[] start = {13, 28, 29, 14, 40, 17, 3};
        int[] end = {107, 95, 111, 105, 70, 127, 74};
        int n = end.length;
        findMaxGuests(start, end, n);
	}
	



	public static int[] findMaxGuests(int[] Entry,int Exit[], int N){
        // add code here.
        List<Pair<String, Pair<Integer, Integer>>> list= new ArrayList<>();
        for(int i=0;i<N;i++){
//            Pair.of();
//            Pair<String, Pair<Integer, Integer>> outer = new Pair("a", inner);
//            outer.setValue(inner);
            
            list.add(Pair.of("a", Pair.of(Entry[i], 1)));
            
            list.add(Pair.of("d", Pair.of(Exit[i], -1)));
        }
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getKey()+" "+list.get(i).getValue().getKey()+"  "+list.get(i).getValue().getValue());
        }
        System.out.println();
        System.out.println();
        Collections.sort(list, new Comparator<Pair<String, Pair<Integer, Integer>>>(){

			@Override
			public int compare(Pair<String, Pair<Integer, Integer>> a, Pair<String, Pair<Integer, Integer>> b) {
				if(!a.getKey().equals(b.getKey()) && a.getValue().getKey()==b.getValue().getKey()) {
					return b.getValue().getValue()-a.getValue().getValue();
				}
				return a.getValue().getKey()-b.getValue().getKey();
			}
        	
        });
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getKey()+" "+list.get(i).getValue().getKey()+"  "+list.get(i).getValue().getValue());
        }
        
        int count =0;
        int max = Integer.MIN_VALUE;
        int val=0;
        for(int i=0;i<list.size();i++) {
        	Pair<Integer, Integer> p = list.get(i).getValue();
        	count+= p.getValue();
        	if(count>max) {
        	 val= p.getKey();	
        	}
        	max = Math.max(count, max);
        }
        System.out.println(max+"  "+val);
        int res[] = new int[5];
        return res;
	}
}
