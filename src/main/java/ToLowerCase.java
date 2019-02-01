/* 
    Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
    
     
    
    Example 1:
    
    Input: "Hello"
    Output: "hello"
    Example 2:
    
    Input: "here"
    Output: "here"
    Example 3:
    
    Input: "LOVELY"
    Output: "lovely"
*/

package main.java;

public class ToLowerCase {

    public static void main(String []args){
        System.out.println("Lowercase of \"BLUE\": " +  toLowerCase("BLUE"));
        System.out.println("Lowercase of \"Cyan\": " +  toLowerCase1("Cyan"));
        System.out.println("Lowercase of \"erin\": " +  toLowerCase("erin"));
    }

    public static String toLowerCase(String str) { // O(str.length()) O(str.length())
        char[] arr = str.toCharArray();
        int len = arr.length;

        for(int i = 0; i < len; ++i){
            if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] = (char)(arr[i] + 32);
            }
        }

        return new String(arr);
    }

    public static String toLowerCase1(String str) { // O(str.length()) O(str.length())
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
        if(c >= 65 && c <= 90)
            sb.append((char)(c + 32));
        else
            sb.append(c);
        }

        return sb.toString();
    }
}