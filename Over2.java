class MyClass{
    void foo(short x){
        System.out.println("foo(short)");
    }
    void foo(float x){
        System.out.println("foo(float)");
    }
}
class Over2{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        //暗黙の型変換:short→byte
        byte b = 10;
        mc.foo(b);
        int i = 20;
        mc.foo(i);
        //double d = 10;
        //mc.foo(d);
    }
}
