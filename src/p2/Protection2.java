package p2;
class Protection2 extends p1.Data{
    Protection2(){
        System.out.println("other package constructor");
//        System.out.println("default i", +i); class or package default
//        System.out.println("default i", +a); class only private
        System.out.println("default i"+b);
        System.out.println("default i"+c);
    }
}
