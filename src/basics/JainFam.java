package basics;

public class JainFam {
    //class reference name = new className();
    JainFam jainFam= new JainFam();

    //data member- methods,variables
    //static - ghar ka bada jo ki bahar(other ) main ja sakta hai
    //non-static - ghar ka chota sadasya(jo ki bahar sirf apni family ke bade(object)
    //ke sath jata hai

    String tv= "samsung";

    public static void main(String[] args) {
        rajeshJain();
    }
    public static void rajeshJain(){}

    public static void rWife(){}
    public void namasya(){
        tv="lg";
    }
    public String beti= "namasya";
    public static String bhabhiji= "xyz";
    public static void hall(){
        System.out.println(bhabhiji);
        JainFam jainFam1= new JainFam();
        System.out.println(jainFam1.beti);
    }

    public void kidsRoom(){
        System.out.println(beti);
        System.out.println(bhabhiji);
    }







}
