package StringPractice;

import java.util.HashMap;
import java.util.HashSet;

public class checkDifferent {
    /*
    请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。
    给定一个string iniString，请返回一个bool值,True代表所有字符全都不同，False代表存在相同的字符。
    保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。
     */
    public boolean checkDifferent1(String iniString) {
        // O(N2) 双指针遍历
        for(int i=0;i<iniString.length();i++){
            for(int j=i+1;j<iniString.length();j++){
                if(iniString.charAt(i) == iniString.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkDifferent2(String iniString) {
        // O(N) HashSet遍历
        HashSet<Character> tmpset = new HashSet<>();
        for(int i=0;i<iniString.length();i++){
            tmpset.add(iniString.charAt(i));
        }
        return tmpset.size() == iniString.length();
    }

    public boolean checkDifferent3(String iniString) {
        // O(N) HashMap遍历
        HashMap<Character, Integer> tmpmap = new HashMap<Character, Integer>();
        for(int i=0;i<iniString.length();i++){
            if(tmpmap.containsKey(iniString.charAt(i))){
                return false;
            }
            tmpmap.put(iniString.charAt(i),1);
        }
        return true;
    }


    public static void main(String[] args){

        String instring = "abcdefa";
        boolean StrCompare = new checkDifferent().checkDifferent1(instring);
        System.out.println(StrCompare);
    }
}