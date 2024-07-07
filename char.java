
class c{
    public static void main(String[] args) {
        String s1 = "Nithin";
        String s2="thiuk";
        char c;
        int a;
        StringBuffer br = new StringBuffer(s1);
        for(int i=0;i<s2.length();i++){
           c=s2.charAt(i);
           // a = s1.indexOf(c);
            for(int j=0;j<s1.length();j++){
            if (c == s1.charAt(j)) {
                
                br.deleteCharAt(j);
            }
        }
    }
    System.out.println(br);
}
}