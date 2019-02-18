package test.Modificators.package2;

import test.Modificators.package1.Class1;

public class Class4 extends Class1 {

    public void ShowClass1(){
        Class1 class1 = new Class1();

        //class1.a = 10; недоступен, модификатор private
        //class1.b = 11;
        //class1.c = 12;
        class1.d = 13;

        //class1.showA();
        //class1.showB();
        //class1.showC();
        class1.showD();

        //System.out.println(a);
        //System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //showA();
        //showB();
        showC();
        showD();
    };


}
