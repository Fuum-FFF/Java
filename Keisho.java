class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
class Student extends Person{
    private String no;
    public Student(String name,String no){
        super(name);
        this.no = no;
    }
    public String getNo(){
        return no;
    }
    public void setNo(String no){
        this.no = no;
    }
}
class Keisho{
    public static void main(String[] args){
        Student s = new Student("山田太郎","A001");
        System.out.println(s.getName() + "," + s.getNo());
    }
}
