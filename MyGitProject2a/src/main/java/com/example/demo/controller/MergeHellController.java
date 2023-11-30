package com.example.demo.controller;


import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
	}

		static void kadaiB() {
	 Random r = new Random();
			 int x = r.nextInt(100);
			 System.out.println(x +"が出ました");
		}


	static void kadaiA() {
		//ここに課題を書く。メソッド名変えてね。
		int i;
		for (i = 0; i < 10; i++) {
			System.out.println("現在" + i + "回目です");
		}
	}
}


