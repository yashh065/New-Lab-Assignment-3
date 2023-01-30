package com.greatlearning.Q1.service;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancingBrackets {
	public boolean BalancingBrackets(String str) {
		Deque<Character> stack= new ArrayDeque<Character>();
		// TODO Auto-generated method stub
		for( int i=0;i<str.length();i++) {
			char x=str.charAt(i);
			
			if(x=='('||x=='['||x=='{') {
				
				//push the element into stack
				stack.push(x);
				continue;
			}
			//check whether stack is empty or not
			if(stack.isEmpty()) {
				return false;
			}
			char check;
			switch(x) {
			case')':
				check =stack.pop();
				if(check=='{'||check=='[')
					return false;
				break;
			
		case'}':
			check =stack.pop();
			if(check=='['||check=='(')
				return false;
			break;
			
		case']':
			check =stack.pop();
			if(check=='{'||check=='(')
				return false;
			break;
		
			}
		  }
		// check  whether stack is empty
		return (stack.isEmpty());
	}
}
