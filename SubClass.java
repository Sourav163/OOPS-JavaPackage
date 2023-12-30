// 4. Proof :  default can't be accessed but protected can be.

package p2;

import p1.SuperClass;

public class SubClass extends SuperClass {
    public static void main(String[] args) {
        System.out.println("Access Level :  Sub-Class");
        System.out.println("public int x = " + x);
        System.out.println("protected int y = " + y);
        // System.out.println("default int z = " + z); --> Not Accessible
        // System.out.println("private int a = " + a); --> Not Accessible
    }
}