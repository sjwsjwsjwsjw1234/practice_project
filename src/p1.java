
import static java.lang.System.*;
public class p1 {
    public static void fun(A a,A b)
    {
//        out.println(a);
//        out.println(b);
//        A c=b;
//        b=a;
//        a=c;
//        out.println(a);
//        out.println(b);
        a.k=100;
    }

    public static void main(String[] args) {
        A a1=new A(3);
        A a2=new A(4);
        A a3=a1;
        fun(a1,a2);
        out.println(a1.k);
        out.println(a2);
        out.println(a3.k);
    }

}

class A{
    public int k;
    public A(int x)
    {
        k=x;
    }
}
