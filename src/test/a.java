package test;

public class a {

    int count;

    public void m(){
        count++;
    }
    public void m(int n){
        count*=n;
    }

    public static void main(String[] args) {
        a obj = new a();
        obj.m(5);
        obj.m();
        obj.count+=10;
        obj.m(2);
        System.out.println(obj.count);
    }



}
