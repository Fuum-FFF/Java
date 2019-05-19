public class ContinueLabel{
    public static void main(String[] args){
        int i = 0;
        
        label:
        while(i < 10){
            i++;
            
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
            break label;
        }
    }
}