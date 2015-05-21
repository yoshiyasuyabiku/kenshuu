﻿package src.main.java;

public class Question1 {

	public static void main(String[] args) {
		multiply();
	}

	/**
	 * 掛け算を実行するメソッドです。
	 * 
	 * @param num1 掛ける値1。
	 * @param num2 掛ける値2。
	 * @return 計算結果を返します。
	 */
	public int multiply(int num1, int num2) {
		int r = 0;

		r = num1 * num2;

		return r;
	}

	/**
	 * 引数に与えられた値の九九の段を計算するメソッドです。
	 * 
	 * @param timesNum 掛ける段の値。
	 * @return 計算結果を配列で返します。
	 */
	public String[] multiplication(int timesNum) {
		String[] calcString = new String[9];

		for (int a = 0; a < 9; a++) {
			calcString[a] = String.valueOf(((a + 1) * timesNum));

		}

		return calcString;
	}

	public static void multiply()
	{
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "×" + j + "=" + i * j + "\t");
			}

			System.out.println();
		}

	}
}