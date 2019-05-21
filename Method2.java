/*
    実行方法
    javac Method2.java
    java Hondai2
*/

class Method2{
    String name;
    int age;
    Method2(String name,int age){
        this.name = name;
        this.age = age;
    }String getData(){
        return name + "," + age;
    }
    void showData(){
        System.out.println(getData());
    }
}

class Hondai2{
    public static void main(String[] args){
        Method2 s = new Method2("山田太郎",28);
        //1つめ出力
        s.showData();
        s.name = "山田花子";
        //2つめ出力
        s.showData();
    }
}