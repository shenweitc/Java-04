package Demo01;
//比较两个数据是否相等，参数类型是byte,short,int,long
public class DemoMethodOverloadSame {
    public static void main(String[] args) {
        byte a=3;
        byte b=4;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)10,(short)10));
        System.out.println(isSame(10,10));
        System.out.println(isSame((long)10,(long) 10));
    }

    public static boolean isSame(byte a,byte b) {
        System.out.println("byte运行成功！");
       return a==b;
    }
    public static boolean isSame(short a,short b) {
        System.out.println("short运行成功！");
       return a==b;
    }
    public static boolean isSame(int a,int b) {
        System.out.println("int运行成功！");
        return a==b;
    }
    public static boolean isSame(long a,long b) {
        System.out.println("long运行成功！");
        return a==b;
    }
}
