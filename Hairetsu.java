public class Hairetsu{
    public static void main(String[] args){
        int[] num = new int[]{10,20,30,40,50,60};
        System.out.println(num[4]);

        //練習問題
        int[] a = new int[]{1,2,3};
        int[] b = new int[2];
        b = a;
        b[0] = 5;
        System.out.println(a[0]);

        int c = 1;
        int d = 5;
        d = c;
        d = 3;
        System.out.println(c);

        //配列がないので変なの出てくる
        System.out.println(a);

    }
}