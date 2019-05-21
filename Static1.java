class Static1{
    static String name;
    //★
    static void show(){
        System.out.println(name);
    }
}
class Output{
    public static void main(String[] args){
        Static1.name = "山田太郎";
        //★を出力
        Static1.show();
    }
}