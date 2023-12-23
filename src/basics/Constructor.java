package basics;

public class Constructor {
    //constructor - every class has a by default constructor
    //constructor nbame should be same as class name
    //it does not have a return type

    public Constructor(String s){

    }
    public Constructor(int i){

    }

    public String ns="sdsd";
    public static void main(String[] args) {
        System.out.println("nai class");
        Constructor constructor= new Constructor("sdfdsf");
        Constructor constructor1=  new Constructor(3);
        aGlobal aglobal= new aGlobal();
    }



}
