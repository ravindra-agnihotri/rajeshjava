package oopsConcept.polyMorphism.mthdovrrdng;

public class Caller {


    public static void main(String[] args) {
       /* ParentClass parentClass= new ParentClass();
        parentClass.job();
        ChildClass childClass= new ChildClass();
        childClass.job();*/
        ParentClass parentClass1= new ChildClass();
        //ChildClass childClass= new ParentClass();
        parentClass1.ekAur();


        ParentClass.ekAur();
        ParentClass parentClass= new ChildClass();
        parentClass.job();


    }
}
