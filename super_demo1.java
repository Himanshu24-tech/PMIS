class animal{
    void eat1(){
        System.out.println("eating...");
    }
}

class dogy extends animal{
    @Override 
    void eat1(){
        System.out.println("eating bread...");
        super.eat1();
    }
}