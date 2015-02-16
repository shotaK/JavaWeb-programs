package com.javaweb;

public class Main {

    public static void main(String[] args) {
        OverloadingExample1 overloadingExample1 = new OverloadingExample1();
        overloadingExample1.display(1);
        overloadingExample1.display(2, " overloaded");

        OverloadingExample2 overloadingExample2 = new OverloadingExample2();
        overloadingExample2.display(3);
        overloadingExample2.display("overloaded");

        OverloadingExample3 overloadingExample3 = new OverloadingExample3();
        overloadingExample3.display(5, " overloaded");
        overloadingExample3.display("Next overloaded", 15);
    }

}

