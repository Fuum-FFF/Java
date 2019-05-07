public class StringTest{
    public static void main(String[] args){
        System.out.println(isMultiple3(123456789));
    }

    public static String isMultiple3(int i){
        String result;
        if(i % 3 == 0){
            result = i + "は3で割り切れる";
        }else{
            result = i + "は3で割り切れない";
        }
        return result;
    }
}