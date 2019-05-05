/*4時～10時が「おはようございます」
11時～17時が「こんにちは」
18時が「こんばんは」
19時～3時が「おやすみなさい」
と出力するようにしてください*/

import java.util.Random;

public class Time{
    public static void main(String[] args){
        //ランダムに整数を生成する処理
        Random rand = new Random();
        //int型で0～23の数字をランダムに生成
        int time = rand.nextInt(24);
        //現在の時刻を出力
        System.out.print("現在の時刻は" + time + "時です。");

        //挨拶の処理
        if(4 <= time && time < 11){
            System.out.println("おはようございます。");
        }else if(11 <= time && time < 18){
            System.out.println("こんにちは。");
        }else if(time == 18){
            System.out.println("こんばんは。");
        }else if((0 <= time && time < 4) || 19 <= time){
            System.out.println("おやすみなさい。");
        }
    }
}