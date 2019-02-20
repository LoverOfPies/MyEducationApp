package test.modificators.package1;

class Class2 {
    public void ShowClass1(){
        Class1 class1 = new Class1();

        //class1.a = 10; недоступен, модификатор private
        class1.b = 11;
        class1.c = 12;
        class1.d = 13;

        //class1.showA();
        class1.showB();
        class1.showC();
        class1.showD();
    };
}
