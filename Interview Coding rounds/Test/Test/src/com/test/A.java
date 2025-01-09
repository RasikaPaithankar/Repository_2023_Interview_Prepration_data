//package com.test;
//
//public class A {
//
//	private static int t1 = 1;
//	private static int t2 = 2;
//	private int t3 = 4;
//	private int t4 = 5;
//
//	public static class inner {
//		private static int t5 = 3;
//
//		private static int sum() {
//			return (t1 + t2);
//		}
//		private static int sum1() {
//			return (t1 + t3);
//		}
//		private static int sum3() {
//			return (t1 + t4);
//		}
//		private static int sum4() {
//			return (t1 + t5);
//		}
//	}
//	
//	
//
//	public static void main(String[] args) {
//		
//		A.inner a = new A.inner();
//		System.out.println(a.sum());
//		
//		/*
//		 * A.inner a = new A.inner();
//		 */
//
//		String s1 = "Java";
//		String s2 = s1.intern();
//		String s3 = "Java";
//		String s4 = new String("Java");
//		StringBuffer sb = new StringBuffer("Java");
//
//		System.out.println((s1 == s2) + " " + (s2 == s3) + " " + (s3 == s4) + " " + sb.equals(1) + " " + s1.equals(sb));
//
//		byte z = 4;
//		System.out.println(z << 4);
//		System.out.println(z ^ 4);
//	}
//}
