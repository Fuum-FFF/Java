public class Class{
    String name;
    int age;
    Class(String _name,int _age){
        name = _name;
        age = _age;
    }
}
    class Student{
        public static void main(String[] args){
            Class c1 = new Class("山田花子",15);
            System.out.println(c1.name + c1.age);
        }
    }
/*
    実行方法：javac Class.java
             java Student
*/