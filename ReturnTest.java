/*引数で渡された数字が3で割り切れるか判断するプログラムです。*/

public class ReturnTest{
    //メインメソッド
    public static void main(String[] args){
	int hikisu = 14;
        if(baisu3(hikisu)){
            System.out.println(hikisu + "は3で割り切れます。");
        }else{
            System.out.println(hikisu + "は3で割り切れません。");
        }
    }
    
    //baisu3メソッド
    public static boolean baisu3(int a){
        boolean result;
	    result = (a % 3 == 0);
	    return result;
    }
}