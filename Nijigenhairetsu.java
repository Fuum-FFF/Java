public class Nijigenhairetsu{
    public static void main(String[] args){
        int a[][];
        a = new int[2][3];

        a[0][0] = 0;
        a[0][1] = 1;
        a[0][2] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 5;

        for(int x = 0; x < 2;x++){
            for(int b = 0; b < 3;b++){
                System.out.println(a[x][b]);
            }
        }
     }
}