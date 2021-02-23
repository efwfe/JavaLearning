package p1;

class Delivered extends Data {
    Delivered(){
        System.out.println("deliver constructor");
        System.out.println("var from Data | default" + i);
//        System.out.println("var from Data | private"+ a);
        System.out.println("var from Data | protected"+b);
        System.out.println("var from Data | public"+c);
    }
}
