public class Nest2{
    public static void main(String[] args){
        int a = 1;
        int b = 1;

        for( ;a <= 10;a++){
            System.out.println("a：" + a);
            if(a % 2 == 1){
                b++;
                System.out.println("b：" + b);
            }
        }
        System.out.println("最終的a：" + a);
        System.out.println("最終的b：" + b);
    }
}