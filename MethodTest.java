public class MethodTest{
    public static void main(String[] args){
        System.out.println("mainメソッドが呼ばれました。");
        //subメソッドを呼ぶ→処理を出力
        sub();
    }

    public static void sub(){
        System.out.println("subメソッドが呼ばれました。");
    }
}