public class ab {
    public static void main(String[] args) {
    int a=5;
    int b=4;
    b=(a^b)^a;
    a=(a^b)^b;
    System.out.println(a);
    System.out.println(b);    
    }
    
}
