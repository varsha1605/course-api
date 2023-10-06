package io.neha.springbootquickstart.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindLevelString {

	public static void main(String args[]) {
		int level=2;
		String s = "{level 1 string {level 2 string {level 3 string}} {level 2 second string}}";
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		
		int l=0;
		List<String> list = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='{') {
				stack1.add(s.charAt(i));
				l++;
			}else if(s.charAt(i)=='}' && stack1.peek()=='{') {
				stack1.pop();
			}else if(s.charAt(i)=='}' && stack1.peek()!='{') {
				list.add(get(stack1, stack2));
			}else if(l!=level){
				stack1.add(s.charAt(i));
			}
		}
	}

	private static String get(Stack<Character> stack1, Stack<Character> stack2) {
		String res= "";
		while(!stack1.empty()) {
			stack2.add(stack1.pop());
		}
		while(!stack2.empty()) {
			res+=stack2.pop();
		}
		System.out.println(res);
		return res;
	}
}
