public class Enzanshi{
    public static void main(String[] args){
        //aとbは同値だ

        int a = 0;
        int b = 0;
        a = a + 1;
        b += 1;

        System.out.print("aとbは");
        
        if(a == b){
            System.out.println("同値だ。");
        }else{
            System.out.println("同値ではない。");
        }

        //+より*が優先される※()したら優先

        int c = 20 + 10 * 10;

        System.out.print("cは");

        if(c == 120){
            System.out.println("120だ。");
        }else{
            System.out.println(c + "だ。");
        }

        int d = (20 + 10) * 10;

        System.out.print("dは");

        if(d == 300){
            System.out.println("300だ。");
        }else{
            System.out.println(d + "だ。");
        }

        //c = d = 80;に関して。d = 80;として代入したのち、c = 80;としても代入。

        System.out.println("c = d = 80; を記述...");

        c = d = 80;

        System.out.println("cの値は" + c + "である。");
        System.out.println("dの値は" + d + "である。");

        //==は同値か比較する。!=は違う値か比較する。

        int e = 30;
        int f = 30;

        System.out.println("eとfはそれぞれ同値を代入。");
        System.out.print("eとfは同値か：");
        System.out.println(e == f);
        System.out.print("eとfは違う値か：");
        System.out.println(e != f);

        int g = 2;

        System.out.println("変数gに" + g++ + "を格納して、g++する。");
        System.out.println(g + "になる。");

    }
}