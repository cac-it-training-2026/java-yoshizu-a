package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		int[] prices = { 120, 80, 50, 250, 100 };
		System.out.println("商品1を入力してください。>");
		System.out.println("商品2を入力してください。>");
		System.out.println("商品3を入力してください。>");
		System.out.println("商品4を入力してください。>");
		System.out.println("商品5を入力してください。>");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str1 = reader.readLine();
		String str2 = reader.readLine();
		String str3 = reader.readLine();
		String str4 = reader.readLine();
		String str5 = reader.readLine();

		System.out.println("登録商品一覧");
		System.out.println(itemNames[0] + ":" + prices[0] + "円");
		System.out.println(itemNames[1] + ":" + prices[1] + "円");
		System.out.println(itemNames[2] + ":" + prices[2] + "円");
		System.out.println(itemNames[3] + ":" + prices[3] + "円");
		System.out.println(itemNames[4] + ":" + prices[4] + "円");
	}

}
