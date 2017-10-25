public class StringHelper {
 public String Remplacer(String s, char c1 , char c2){
        Method m = new Method();
        String s1,s2=new String("");
        char c;
        for(int i=0;i<s.length();i++){
           if(s.indexOf(c1)!=-1){
             
               if(s.indexOf(c1)==0){
               // s1=s.substring(1);
                 s1=m.SubString(1, s.length(), s);
                    if(s1.indexOf(c1)!=-1){
                
               // s2+=c2+s1.substring(0, s1.indexOf(c1));
                  s2+=c2+m.SubString(0, s1.indexOf(c1), s1);
               // s1=s1.substring(s1.indexOf(c1));
                  s1=m.SubString(s1.indexOf(c1), s1.length(), s1);
                s=s1;
                    }else {
                        s2+=c2+s1;
                        return s2;
                    }
            }else {
                   s1=s;
                //   s2+=s1.substring(0, s1.indexOf(c1))+c2;
                     s2+=m.SubString(0, s1.indexOf(c1), s1)+c2;
                //   s=s1.substring(s1.indexOf(c1)+1);
                     s=m.SubString(s1.indexOf(c1)+1, s1.length(), s1);
                   
               }
           }
        } //fin for
        if(s.lastIndexOf(c1)!=-1){
            
        //return s2+s.substring(0, s.length()-1)+c2;
        return s2+m.SubString(0, s.length()-1, s)+c2;
        }
        
        return s2+s;
    }    

}
