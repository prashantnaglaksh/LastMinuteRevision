package com.bsqs;

public class bsminnoofpf {
	public static void main(String[] args) {
		int[] ari = {900, 940, 950, 1100, 1500, 1800};
		int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
		int res = bsminnoofpfbf(ari, dep);		
		System.out.println("i ama res :: " +  res);
	}
	
	static int bsminnoofpfhelper(int[] ari, int[] dep) {
		int ans = 1;
		return ans;
	}
	
	static int bsminnoofpfbf(int[] ari, int[] dep) {
		int ans = 1;
		for(int i = 1; i < ari.length; i++) {
			int temp = 1;
			for(int j = 0; j < i; j++) {
				if(ari[i] < dep[j])
					temp++;
			}
			ans  = Math.max(ans, temp);
		}
		return ans;
	}
}
