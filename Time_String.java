/*4時～10時が「おはようございます」
11時～17時が「こんにちは」
18時が「こんばんは」
19時～3時が「おやすみなさい」
と出力するようにしてください

また、Stringを使用し、少しコードをスリムにしました。*/

import java.util.Random;

public class Time_String{
    public static void main(String[] args){
        //ランダムに整数を生成する処理
        Random rand = new Random();
        //int型で0～23の数字をランダムに生成
        int time = rand.nextInt(24);
        //現在の時刻を出力
        System.out.print("現在の時刻は" + time + "時です。");

        //挨拶の文章をスリム化するために、Stringを記述。
        String aisatsu = "";

        //挨拶の処理
        if(4 <= time && time < 11){
            aisatsu = "おはようございます。";
        }else if(11 <= time && time < 18){
            aisatsu = "こんにちは。";
        }else if(time == 18){
            aisatsu = "こんばんは。";
        }else if((0 <= time && time < 4) || 19 <= time){
            aisatsu = "おやすみなさい。";
        }
        System.out.println(aisatsu);
    }
}