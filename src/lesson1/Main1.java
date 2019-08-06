package lesson1;

public class Main1 {

    private static int b;

    public static void main(String[] args) {
        int a = 5;
        System.out.println(b);


        b = 5;
        System.out.println("a == b: " + (a == b));

        Person p1 = new Person(33, "Petr");//001
        Person p2 = new Person(33, "Petr");//002

        System.out.println("p1 == p2:" + (p1 == p2));//001 == 002
        System.out.println("p1.equals(p2):" + (p1.equals(p2)));
        System.out.println("-------");

        String str1 = "abc";//001
        String str2 = new String("abc");//002
        String str3 = "abc";//001


        System.out.println("str1 == str2:" + (str1 == str2));//001 == 002
        System.out.println("str1 == str3:" + (str1 == str3));//001 == 001

        System.out.println("-------");
        System.out.println("Test Primitive");
        System.out.println(a);//001
        testPrimitive(a);//<-- 5
        System.out.println(a);


        System.out.println("-------");
        System.out.println("Test Object");
        System.out.println(p1);//001
        testObject(p1);//<-- 001
        System.out.println(p1);

    }

    private static void testObject(Person p) {//002 = 001
        System.out.println(p);
        p.setName("Sergey");
        p = new Person(25, "Alex");//002 = 003
        System.out.println(p);
    }

    private static int testPrimitive(int a) {//002 = 5
        System.out.println(a);
        a += 2;//002 = 7
        System.out.println(a);
        return a;
    }
}