public interface interfaceC extends interfaceA,interfaceB {
    interfaceA ob1 = new interfaceA() {
    };
    interfaceB ob2 = new interfaceB() {
    };
    default void show(){
        ob1.method();
        ob2.method1();
    }

}
