package advanced.question07;

import java.io.IOException;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 550, 250, 100 };
		int[] amounts = { 2, 3, 1, 0, 2 };

		System.out.println(itemNames[0] + ":" + prices[0] * amounts[0] + "円");
		System.out.println(itemNames[1] + ":" + prices[1] * amounts[1] + "円");
		System.out.println(itemNames[2] + ":" + prices[2] * amounts[2] + "円");
		System.out.println(itemNames[3] + ":" + prices[3] * amounts[3] + "円");
		System.out.println(itemNames[4] + ":" + prices[4] * amounts[4] + "円");
		System.out.println("合計金額:" + ((prices[0] * amounts[0]) + (prices[1] * amounts[1]) + (prices[2] * amounts[2])
				+ (prices[3] * amounts[3]) + (prices[4] * amounts[4])) + "円");
	}
}
