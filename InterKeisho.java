//インターフェイス
interface SpIf{
    void foo();
}
//継承したインターフェイス
interface SubIf extends SpIf{
    void bar();
}
//実装
class MyClass implements SubIf{
    public void foo(){
        System.out.println("foo");
    }
    public void bar(){
        System.out.println("bar");
    }
}
class InterKeisho{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.foo();
    }
}