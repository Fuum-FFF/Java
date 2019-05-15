public class Ronri{
    public static void main(String[] args){
        boolean a = true , b = false;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(!a);

        int x = 1 , y = 1;
        System.out.println((x > 0) | (y > 10));
        System.out.println((x > 0) & (y > 10));
        System.out.println((x > 0) || (++y > 10));
        System.out.println(y);
    }
}