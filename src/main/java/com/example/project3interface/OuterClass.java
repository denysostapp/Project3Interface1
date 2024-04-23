package com.example.project3interface;

//public class OuterClass {
//    private String outerField = "Outer field";
//
//    class InnerClass {
//        void printOuterField() {
//            System.out.println(outerField);
//        }
//    }
//
//    public void createAndUseInnerClass() {
//        InnerClass inner = new InnerClass();
//        inner.printOuterField();
//    }
//}

//public class OuterClass {
//    public void demonstrateLocalClass() {
//        class LocalClass {
//            void printMessage() {
//                System.out.println("Hello from the local class");
//            }
//        }
//
//        LocalClass local = new LocalClass();
//        local.printMessage();
//    }
//}
public class OuterClass {
    interface Printable {
        void printMessage();
    }

    public void demonstrateAnonymousClass() {
        Printable printable = new Printable() {
            @Override
            public void printMessage() {
                System.out.println("Hello from the anonymous class");
            }
        };

        printable.printMessage();
    }
}