/*自定义String 方法：
-boolean IsNum(String)：判断字符串是否全是数字
-boolean IsUpper(String)：判断字符串是否是大写字母
-boolean IsLower(String)：判断字符串是否全是小写字母
-String TraUpper(String)：如果字符串全是字母，将其中所有小写字母转换为大写字母。
-String OrderNum(String)：如果字符串全是数字组成，则按照数字大小升序排序并装入整型数组中。最后按升序打印出该数组
-String OrderChar(String)：如果字符串全是字母组成，则按照字母排序装入字符数组中，并按字母顺序打印出该该数组。
* */

import java.util.Arrays;

public class MyString {

    /*
    通过判断字符串位置上字符的ASCII码是否为数字
    */
    public static boolean IsNum(String str){
        for(int i=0;i<str.length();i++){
            int num=str.charAt(i);
//            if(num>=48&&num<=57){
//                return true;
//            }
            if(num<48||num>57){
                return false;
            }
         }
        return true;
    }

    /*
    通过判断字符串位置上字符的ASCII码是否为大写字母
    */
    public static boolean IsUpper(String str){
        for(int i=0;i<str.length();i++){
            int num=str.charAt(i);
            if(num<65||num>90){
                return false;
            }
        }
        return true;
    }

    /*
   通过判断字符串位置上字符的ASCII码是否为小写字母
   */
    public static boolean IsLower(String str){
        for(int i=0;i<str.length();i++){
            int num=str.charAt(i);
            if(num<97||num>122){
                return false;
            }
        }
        return true;
    }
    /*
    通过大写字母与小写字母之间的ASCII码相差32进行判断，并转换。
    */
    public static String TraUpper(String str){
        char arr[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            //int num=arr[i];
            if (arr[i]>=97&&arr[i]<=122) {
                arr[i] -= 32;
            }
        }
        return new String(arr);
    }

    /*
    * 按照数字大小升序排序并装入整型数组中。最后按升序打印出该数组
     */
    public static int[] OrderNum(String str){
        int[] arr = new int[str.length()];
        for(int i = 0; i < str.length(); i++)
        {
            arr[i] = Integer.parseInt( String.valueOf(str.charAt(i)));
        }
        //运用冒泡排序进行排序操作
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    /*
    按照字母排序装入字符数组中，并按字母顺序打印出该该数组。
     */
    public static String OrderChar(String str){
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return new String(arr);
    }
}
