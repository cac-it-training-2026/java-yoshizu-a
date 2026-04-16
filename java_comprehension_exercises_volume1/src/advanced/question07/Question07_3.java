package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];
		int[] stocks = { 3, 5, 2, 1, 4 };

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int num = Integer.parseInt(str);

		if (stocks[0] < num && stocks[1] < num && stocks[2] < num && stocks[3] < num && stocks[4] < num)
			;
		{
			System.out.println("在庫を超えています。もう一度入力してください。");
		}

		System.out.println(itemNames[0] + ":" + prices[0] * amounts[0] + "円");
		System.out.println(itemNames[1] + ":" + prices[1] * amounts[1] + "円");
		System.out.println(itemNames[2] + ":" + prices[2] * amounts[2] + "円");
		System.out.println(itemNames[3] + ":" + prices[3] * amounts[3] + "円");
		System.out.println(itemNames[4] + ":" + prices[4] * amounts[4] + "円");
		System.out.println("合計金額:" + ((prices[0] * amounts[0]) + (prices[1] * amounts[1]) + (prices[2] * amounts[2])
				+ (prices[3] * amounts[3]) + (prices[4] * amounts[4])) + "円");
	}
}
