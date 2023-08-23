final class test{
    private int i;
    test(int i){
        this.i=i;
    }
    public test modify(int i){
        if(this.i==i)
        return this;
        else
        return new test(i);
    }
}

public class my_own_immutable_class {
    public static void main(String[] args) {
        test t1=new test(10);
        test t2=t1.modify(100);
        test t3=t1.modify(10);
        System.out.println(t1==t2);
        System.out.println(t1==t3);
    }
}
