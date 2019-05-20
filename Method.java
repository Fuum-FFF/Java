public class Method{
    Method(int x,int y){
        System.out.println(x + y);
    }
    
    void Method(int x,int y){
        System.out.println(x * y);
    }
}

class Hontai{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        new Method(a,b);
    }
}