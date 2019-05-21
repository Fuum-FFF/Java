class Over{
    //引数なし
    static void foo(){
        System.out.println("foo():");
    }
    //引数：int型1つ
    static void foo(int x){
        System.out.println("foo(int):" + x);
    }
    //引数：int型2つ
    static void foo(int x,int y){
        System.out.println("foo(int,int):" + x + "," + y);
    }
    public static void main(String[] args){
        foo();
        foo(10);
        foo(10,20);
        //foo(10,20,30);
    }
}