class device{//parent class
    void poweron(){
        System.out.println("device is powered on!");
    }
}

// class child 1
class mobile extends device{
    void call(){
        System.out.println("mobile can make calls!");
    }
}

// class child 2
class laptop extends device{
    void browsing(){
        System.out.println("laptop can be used for coding!");
    }
}

public class multilevel_inheri {
    public static void main(String[] args) {
        mobile m = new mobile();
        m.poweron();
        m.call();

        laptop l = new laptop();
        l.poweron();
        l.browsing();

    }
}