package test.modificators.package2;

import test.modificators.package1.Class1;

public class Class3 {
    public void ShowClass1(){
        Class1 class1 = new Class1();

        //class1.a = 10;
        //class1.b = 11; недоступен, модификатор package
        //class1.c = 12; недоступен, модификатор protected
        class1.d = 13;

        //class1.showA();
        //class1.showB(); недоступен, модификатор package
        //class1.showC(); недоступен, модификатор protected
        class1.showD();
    };
}
