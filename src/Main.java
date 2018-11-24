import javax.sound.midi.Track;

public class Main {

    public static void main(String[] args) {
        char i = 'a';
        char a = 'A';
        char o = 'b';


        // String b变量类型
        // personName 代表变量名
        // zhangsan 变量的值
       String personName="zhangsan";
        String personName2 = new String("a");
        personName="lisi";

        Person person = new Person();
        Person person111 = new Person("12");
        // 不建议这么直接赋值
        person.name="zhangsan";      Person person2 = new Person();
        Person person3= person2;
        String s =String.valueOf(a);
        System.out.println(i+1);
        System.out.println(Integer.valueOf(o));
        System.out.println("Hello World!");

        Object obj = new Object();
        Person person1 = (Person) obj;

        // 多态
        inter inter = new impl();
        inter.get();

        inter inter2 = new impl2();
        inter2.get();

        // 工厂模式

    }
}
 class  Person{
    // 属性 字段

    // 类里面是对字段有保护的

    // 字段的修饰词

    // 规范，字段修饰符应该是private，这样防止被外访问

    // 类 ==工厂
    // 对象  就是工厂生产出来的产品
    //  Person person = new Person();
    // 方法 ：（谁）让谁干某件事情（）
    // 比如 让别人代购  路费+买东西的钱 -》代购
    // 别人给你需要的产品
    //  get  setter
    // 方法是可以有出参，入参，也可以都没有。
    // 类中的方法确定唯一 方面名+参数（入参）确定
    //
  private   String id;
    protected String name;
    private int age;
    char sex;

    public Person() {

    }
    public Person(String id) {
        this.id = id;
    }

    public String toString(){
       return "";
    }

    public Person toString(String string){
        return new Person();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }



}
abstract class  child extends Person{
    // 是否上户口
    private boolean haveProt;

    // 是否有打疫苗
    private boolean haveReject;

/*   public boolean isDuanNai()
    {
        return false;
    }*/
}

abstract class LvXing{
    abstract  void  LvXing();
}

 class Huoche extends LvXing{
      void  LvXing(){

      }
}

class FeiJi extends LvXing{
    void  LvXing(){

    }
}

 interface inter{

    default String get(){
        return "";
    }

    String get2();
}
interface inter2{

    default String get4(){
        return "";
    }

    String get3();
}

class impl implements inter,inter2{

    @Override
    public String get2() {
        return null;
    }

    @Override
    public String get3() {
        return null;
    }
}


class impl2 implements inter,inter2{

    @Override
    public String get2() {
        return null;
    }

    @Override
    public String get3() {
        return null;
    }
}