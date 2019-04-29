package study.java.ocjp.chapter.one;

class SuperClass {
    static String staticStr = "staticStr";

    {
        System.out.println("SuperClass static block");
        System.out.println("SuperClass static property: [" + staticStr + "]");
    }

    public SuperClass() {
        System.out.println("SuperClass constructor");
    }
}

class ChildClass extends SuperClass {

    static String staticStr = "childStaticStr";

    {
        System.out.println("ChildClass static block");
        System.out.println("ChildClass static property: [" + staticStr + "]");
    }

    public ChildClass() {
        System.out.println("ChildClass constructor");
    }

    {
        System.out.println("ChildClass static block2");
    }
}

class Main {
    public static void main(String[] args) {
        new ChildClass();
    }
}