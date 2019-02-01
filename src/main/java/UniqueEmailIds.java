/* 
    Every email consists of a local name and a domain name, separated by the @ sign.
    
    For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
    
    Besides lowercase letters, these emails may contain '.'s or '+'s.
    
    If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)
    
    If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)
    
    It is possible to use both of these rules at the same time.
    
    Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails? 
    
     
    
    Example 1:
    
    Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
    Output: 2
    Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails

*/

package main.java;

import java.util.*;

public class UniqueEmailIds {

    public static void main(String []args){
        String[] arr = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println("No. of unique e-mail IDs with input: " + Arrays.toString(arr) + " is: \n" + numUniqueEmails(arr));

        String[] arr1 = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com"};
        System.out.println("No. of unique e-mail IDs with input: " + Arrays.toString(arr1) + " is: \n" + numUniqueEmails(arr1));
    }

    public static int numUniqueEmails(String[] emails) { // O(emails.length * email[i].length) O(2 * emails[i].length)

        Set<String> set = new HashSet<>();

        for (String email : emails){
            char [] arr = email.toCharArray();
            int len = arr.length;
            StringBuilder sb = new StringBuilder();

            for(int i = 0 ; i < len; ++i){
                switch(arr[i]){
                    case '.' : continue;
                    case '+' :  while(arr[i++] != '@');
                        while(i < len) sb.append(arr[i++]);
                        break;
                    default  : sb.append(arr[i]);
                        break;
                }
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}