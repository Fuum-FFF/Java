class Sp{
    void foo(){
        System.out.println("A");
    }
}
class Sub extends Sp{
    void bar(){
        System.out.println("B");
    }
}
class Keisho2{
    public static void main(String[] args){
        Sub s1 = new Sub();
        s1.foo();
        s1.bar();

        Sp s2 = new Sub();
        s2.foo();
        //s2.bar();は、Subしかbar()がないので×
    }
}