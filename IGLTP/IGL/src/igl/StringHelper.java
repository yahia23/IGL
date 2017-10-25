public class StringHelper {
 public String Remplacer(String s, char c1 , char c2){
        String s1,s2=new String("");
        char c;
        for(int i=0;i<s.length();i++){
           if(s.indexOf(c1)!=-1){
             
               if(s.indexOf(c1)==0){
               // s1=s.substring(1);
                 s1=SubString(1, s.length(), s);
                    if(s1.indexOf(c1)!=-1){
                
               // s2+=c2+s1.substring(0, s1.indexOf(c1));
                  s2+=c2+SubString(0, s1.indexOf(c1), s1);
               // s1=s1.substring(s1.indexOf(c1));
                  s1=SubString(s1.indexOf(c1), s1.length(), s1);
                s=s1;
                    }else {
                        s2+=c2+s1;
                        return s2;
                    }
            }else {
                   s1=s;
                //   s2+=s1.substring(0, s1.indexOf(c1))+c2;
                     s2+=SubString(0, s1.indexOf(c1), s1)+c2;
                //   s=s1.substring(s1.indexOf(c1)+1);
                     s=SubString(s1.indexOf(c1)+1, s1.length(), s1);
                   
               }
           }
        } //fin for
        if(s.lastIndexOf(c1)!=-1){
            
        //return s2+s.substring(0, s.length()-1)+c2;
        return s2+SubString(0, s.length()-1, s)+c2;
        }
        
        return s2+s;
    }  
     public String Maj(String s){
        String s1 =new String();
        String s2=new String();
        ArrayList<String> tab = new ArrayList<>();
        s=s.toLowerCase();
         boolean trove = ((s.indexOf(','))!=-1);
       while(trove){
           tab.add(s.substring(0, s.indexOf(',')+1));
           s=s.substring(s.indexOf(',')+1);
           trove = ((s.indexOf(','))!=-1);
           
    }
        if(s.length()!=-1) tab.add(s);
        for (int i = 0; i < tab.size(); i++) {
            s1+=tab.get(i).substring(0,1).toUpperCase()+tab.get(i).substring(1);
            
        }
        return s1;
}
         public String SubString(int d,int f, String s){
        ArrayList<Character> tab = new ArrayList<>();
        String s1 =new String();
        for(int i=0;i<s.length();i++){
            tab.add(s.charAt(i));
        }
        
        for(int i= d ;i<f;i++){
            s1+=tab.get(i);
        }
        return s1;
    }
 public int index(String s, char c){
     ArrayList<Character> tab = new ArrayList<>();
     for(int i=0;i<s.length();i++){
         tab.add(s.charAt(i));
     } 
     for(int i=0;i<tab.size();i++){
         if(tab.get(i)==c) return i;
     }
     return -1;
 }

}
