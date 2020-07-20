package com.Stream.Javastreams;
import java.util.*;
public class List {
	public static double average(ArrayList<Integer> al) {
		return al.stream().mapToInt(i->i).average().getAsDouble();
	}
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			int n=in.nextInt();
			ArrayList<Integer> al=new ArrayList<>();
			for(int i=0;i<n;i++) {
				al.add(in.nextInt());
			}
			double res=average(al);
			System.out.println(res);
		}
	}
}
