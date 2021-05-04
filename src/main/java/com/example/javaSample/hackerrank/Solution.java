//package com.example.javaSample.hackerrank;
//
//import java.util.*;
//import java.util.Scanner;
//// Write your code here. DO NOT use an access modifier in your class declaration.
//
//class Solution {
//
//	public static void main(String[] args) {
//		Parser parser = new Parser();
//
//		Scanner in = new Scanner(System.in);
//
//		while (in.hasNext()) {
//			System.out.println(parser.isBalanced(in.next()));
//		}
//
//		in.close();
//	}
//}
//
//public class Parser {
//	public boolean isBalanced(String in) {
//		Stack<Character> st = new Stack<Character>();
//		for (char ch : in.toCharArray()) {
//			switch (ch) {
//			case '{':
//			case '(':
//			case '[':
//				st.push(ch);
//				break;
//			case ']':
//				if (st.isEmpty() || st.pop() != '[')
//					return false;
//				break;
//			case ')':
//				if (st.isEmpty() || st.pop() != '(')
//					return false;
//				break;
//			case '}':
//				if (st.isEmpty() || st.pop() != '{')
//					return false;
//				break;
//			}
//		}
//		return true;
//	}
//}
