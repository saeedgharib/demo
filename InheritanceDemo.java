public class InheritanceDemo {

    public static void main(String[] args) {

        //single or simple inheritance
        System.out.println("SINGLE OR SIMPLE INHERITANCE");
        classB ob1 =new classB();
            ob1.printInfo();
        System.out.println("Category:"+ob1.category);

        //Multilevel inheritance
        classC ob2 =new classC();
        System.out.println("\n\nMULTILEVEL INHERITANCE\n"+"Car1:"+ob2.car1Name+"\nCategory:"+ob2.category);
        ob2.printInfo();

        //Hierarchical inheritance
        classD ob3 =new classD();
        System.out.println("\n\nHIERARCHICAL INHERITANCE\n"+"Car2:"+ob3.car2Name);
        ob3.printInfo();

//        Multilevel Inheritance when class inherits an interface
        MultipleInheritance ob4 =new MultipleInheritance();
        System.out.println("\n\nMULTIPLE INHERITANCE\nClassName:"+ob4.className);
        ob4.method();
        ob4.method1();


//        Multilevel Inheritance when interface inherits an interface
        System.out.println("\n\nMULTIPLE INHERITANCE WITH INTERFACES\n");
        interfaceC ob5 = new interfaceC() {
        };
        ob5.show();


//        HYBRID INHERITANCE
        System.out.println("\n\nHYBRID INHERITANCE");
        hybrid ob6 =new hybrid();
        ob6.printInfo();
        ob6.method();
        ob6.method1();

    }
}
