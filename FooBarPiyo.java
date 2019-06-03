interface Inter1{
    //抽象メソッド
    void foo();
    void piyo();
}

interface Inter2{
    void bar();
    void piyo();
}

class MyClass implements Inter1,Inter2{
    public void foo(){
        System.out.println("Foo");
    }
    public void bar(){
        System.out.println("Bar");
    }
    public void piyo(){
        System.out.println("Piyo");
    }
}
class FooBarPiyo{
    public static void main(String[]args){
        MyClass mc = new MyClass();
        mc.foo();
        mc.bar();
        mc.piyo();
    }
}