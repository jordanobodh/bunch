public class HelloWorld{

     public static void main(String []args) throws Exception {
        //Assuming a > 0 && b > 0
        int a = 8;
        int b = 3;
        
        float aByb = a/b;
        float bBya = b/a;
        if(aByb >= 3.0 || bBya >= 3.0) throw new Exception("String cannot be formed");
        else System.out.println(stringBuilder(a, b));
     }
     
     public static String stringBuilder(int a, int b) {
         StringBuilder str = new StringBuilder("");
         str.append("a");
         a--;
         char lastChar = 'a';
         while(a > 0 || b > 0 ) {
             if(str.length() - 1 >= 0) {
                 lastChar = str.charAt(str.length() - 1);
             }
             if(a > 1 && lastChar == 'b') {
                str.append("aa");
                a -= 2;  
             }
             
             if(b > 1 && lastChar == 'a') {
                 str.append("bb");
                 b -= 2;
             }
             
             if(a == 1 && lastChar == 'b'){
                    str.append("a");
                    a--;
             }
             
             if(b == 1 && lastChar == 'a'){
                    str.append("b");
                    b--;
             }
         }
         return str.toString();
     }
}
