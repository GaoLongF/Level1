import java.util.Arrays;

public class Test {
    public static void main(String args[]) {
        String str = "acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi";
        String arr[] = str.split(",");
        for (String string : arr) {
            System.out.print(string + "  ");
        }
        System.out.println("\n"+"按要求操作后：");
        for (int i = 0; i < arr.length; i++) {
            if (MyString.IsNum(arr[i])) {
                int temp[] = MyString.OrderNum(arr[i]);
                System.out.println("数字字符串排序操作："+arr[i].toString());
            }
            if (MyString.IsLower(arr[i])) {
                System.out.println("小写字符串排序操作："+MyString.OrderChar(arr[i]));
                System.out.println("小写字符串变大写操作："+MyString.TraUpper(arr[i]));
            }
            if (MyString.IsUpper(arr[i])) {
                System.out.println("大写的字符串为："+arr[i]);
            }
        }
    }
}
