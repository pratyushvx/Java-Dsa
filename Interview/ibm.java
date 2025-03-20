public class ibm {
    public static void main(String[] args) {
        String a="bokkkkmlls";
       
        char s='c';
        int count=0;
        for(int i=0;i<a.length()-1;i++){
         char c=a.charAt(i);
         
         char b=a.charAt(i+1);
         
         if(b==s){
            continue;
         }
         else if(c==b){
            s=c;
            count++;
            
         }
        }
        System.out.println(count);
    }
    
}
