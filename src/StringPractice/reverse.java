package StringPractice;

public class reverse {
    /*
    请实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量)。
    给定一个string iniString，请返回一个string，为翻转后的字符串。保证字符串的长度小于等于5000。
     */
    public String reverseString1(String iniString) {
        char[] chas = iniString.toCharArray();
        for(int i = 0; i < chas.length/2; i ++){
            char tmp = chas[i];
            chas[i] = chas[chas.length-1-i];
            chas[chas.length-1-i] = tmp;
        }
        return new String(chas);
    }

    public String reverseString2(String iniString){
        String tmpstr = "";
        for(int i=iniString.length()-1;i>=0;i--){
            tmpstr += iniString.charAt(i);
        }
        return tmpstr;
    }

    public String reverseString3(String iniString){
        StringBuffer sb = new StringBuffer(iniString);
        return sb.reverse().toString();
    }

    //递归方法
    public String reverseString4(String iniString){
        if(iniString.length()==1){
            return iniString;
        }else{
            return reverseString4(iniString.substring(1))+ iniString.charAt(0);
        }
    }

    public static void main(String[] args){
        String inputstring = "abcdefgh";
        String revseredstring = new reverse().reverseString1(inputstring);
        System.out.println(revseredstring);
        String revseredstring2 = new reverse().reverseString2(inputstring);
        System.out.println(revseredstring2);
    }
}
