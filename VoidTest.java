/*引数で渡された数字が3で割り切れるか判断するプログラムです。*/

public class VoidTest{
    //メインメソッド
    public static void main(String[] args){
        //baisu3メソッドに引数を渡す。
        baisu3(3);
        baisu3(14);
        baisu3(27);
    }
    //baisu3メソッド
    public static void baisu3(int a){
        boolean result;
        if(a % 3 ==0){
            System.out.println(a + "は3で割り切れます。");
        }else{
            System.out.println(a + "は3で割り切れません。");
        }
    }
}