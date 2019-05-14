public class KankeiEnzanshi_Boolean{
    public static void main(String[] args){
        int x = 15;
        /*
        boolean b = 0 < x < 20;
        1つずつコンパイルしていく。
        */
        boolean b = (0 < x) && (x < 20);
        System.out.println(b);
    }
}