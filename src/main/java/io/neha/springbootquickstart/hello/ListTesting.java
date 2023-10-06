package io.neha.springbootquickstart.hello;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListTesting {
	public static void main(String[] args) {
		try {
			List<List<Integer>> list = new ArrayList<>();
			for(int i=0;i<=100000;i++){
	            list.add(new ArrayList<>());
	        }
			for (int i = 0; i < 3; i++) {
//				if (list.size() == 0) {
//					List<Integer> sub = new ArrayList<>();
//					sub.add(5);
//					list.add(sub);
//				} else {
					list.get(i).add(10);
				//}
			}
			//System.out.println(list);
			List<DemoInteger> ll = new ArrayList<>();
			ll.add(new DemoInteger(1));
			ll.add(new DemoInteger(2));
	        Iterator<DemoInteger> releaseIterator =
	                ll.stream()
	                        .filter(r -> (r.x==3))
	                        .iterator();
	        System.out.println(releaseIterator.next().x);
		} catch (Exception e) {
			System.out.println("Exception during file i/o operation" + e);
		}
	}
}
