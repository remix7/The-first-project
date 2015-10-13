package com.lianxi;

import java.util.*;

public class Rendom1 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int[] a = new int[11];
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(10);
		}
		for (int j = 0; j < a.length; j++) {
			for (int i = 1; i < a.length; i++) {
				if (a[j]==a[i]) {
					a[j] = r.nextInt(10);
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
