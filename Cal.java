public class Cal{
    //mainメソッド
    public static void main(String[] args){
        //引数を入れる。
        twice(5);
        twice(65);
        twice(3247);
        powerOfTwo(3);
        powerOfTwo(10);
    }
        /*twiceメソッド
        引数に渡された値を2倍して出力
        →int aで引数を受け取らなければいけないメソッドに
        int aを定義し、aとしてメソッドの中身を定義していく。
        */
        public static void twice(int a){
            System.out.print(a + "の2倍は");
            System.out.println(a * 2);
        }

        /*powerOfTwoメソッド
        2のa乗を計算するメソッド
        ※twiceメソッドのaとはスコープが異なるため、利用可能。*/
        public static void powerOfTwo(int a){
            int ans = 1;
            for(int i =0;i < a;i++){
                ans = ans * 2;
            }
            System.out.print("2の" + a + "乗は");
            System.out.println(ans);
        }
}