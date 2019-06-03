interface Inter1{
    //値格納
    String f = "Foo";
    //抽象メソッド
    void foo();
}

interface Inter2{
    //値格納
    String b = "Bar";
    String p = "Piyo";
    //抽象メソッド
    void bar();
    void piyo();
}

class MyClass implements Inter1,Inter2{
    public void foo(){
        System.out.println(f);
    }
    public void bar(){
        System.out.println(b);
    }
    public void piyo(){
        System.out.println(p);
    }
}
class FooBarPiyo2{
    public static void main(String[]args){
        /*
        MyClass mc = new MyClass();
        mc.foo();
        mc.bar();
        mc.piyo();
        と同義
        */
        System.out.println(Inter1.f);
        System.out.println(Inter2.b);
        System.out.println(Inter2.p);
    }
}