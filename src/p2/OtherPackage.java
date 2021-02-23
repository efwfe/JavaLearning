package p2;

public class OtherPackage {
    OtherPackage(){
        p1.Data p = new p1.Data();
        System.out.println("other package constructor");

//        System.out.println(p.i);
//        System.out.println(p.a);
//        System.out.println(p.b);
        System.out.println(p.c); // only public is access
    }
}
