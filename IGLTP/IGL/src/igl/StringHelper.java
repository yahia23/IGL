package igl;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class StringHelper {
 public String Remplacer(String s, char c1 , char c2){
        String s1,s2=new String("");
        char c;
        for(int i=0;i<s.length();i++){
           if(index(s,c1) !=-1){
             
               if(index(s,c1) ==0){
               // s1=s.substring(1);
                 s1=SubString(1, s.length(), s);
                    if(index(s1,c1)!=-1){
                
               // s2+=c2+s1.substring(0, s1.indexOf(c1));
                  s2+=c2+SubString(0,index(s1,c1) , s1);
               // s1=s1.substring(s1.indexOf(c1));
                  s1=SubString(index(s1,c1), s1.length(), s1);
                s=s1;
                    }else {
                        s2+=c2+s1;
                        return s2;
                    }
            }else {
                   s1=s;
                //   s2+=s1.substring(0, s1.indexOf(c1))+c2;
                     s2+=SubString(0,index(s1,c1), s1)+c2;
                //   s=s1.substring(s1.indexOf(c1)+1);
                     s=SubString(index(s1,c1) +1, s1.length(), s1);
                   
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
         boolean trove = ((index(s,',') )!=-1);
       while(trove){
           tab.add(s.substring(0, index(s,',')+1));
           s=s.substring( index(s,',')+1);
           trove = ((index(s,','))!=-1);       
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


    //this is for spliting the string 
	  public List<String> splitString(String parg,char separ)
          {
              List<String> lst = new ArrayList<String>();
              try
              {
                  int i = 0;
                  String ss = "";
                  for (i = 0; i <= parg.length(); i++)
                  {
                      try
                      {
                          if (parg.charAt(i)== separ || i==parg.length())
                              throw new Exception();
                          ss += parg.charAt(i);
  
                      }
                      catch (Exception ex)
                      {
                          try
                          {
                              if(ss!="")
                              lst.add(ss);
                          }
                          catch (Exception e)
                          {
                          }
  
                          ss = "";
                      }
                  }
              }
              catch (Exception ex)
              {
                System.out.println(ex.getMessage());
              }
              return lst;       
      }

    //this is for occurance methode
	public List<Integer> RepeatNumber(String parag,String word)
          {
              int i = 0  ;
              String ss = " " + parag + " ";
              int count = 0;
              List<Integer> indexes = new ArrayList<Integer>();
              while(i+word.length()<ss.length() )
              {
                  int k = 0;i++;
                  /*while (k<word.length() && parag[i] == word[i] && parag[word.length()+i]==word[word.length()-i])
                  {
                      k++;
                  }*/
                  while (k < word.length() && ss.charAt(k+i) == word.charAt(k))
                  {
                      k++;
                  }
                  if(k==word.length())
                  {
                      if (ss.charAt(i-1) == ' ' && ss.charAt(i + word.length()) == ' ')
                          {
                          count++;
                          indexes.add(i-1);
                      }
                      i += word.length();     
                  }
              }
              return indexes;
          }

    //this is to for emptyMethode
	public String  SuppEmpty(String parag, List<String> ss)
          {
              String s = parag+" ";
              String n="";
              for (String word : ss)
              {
                  List<Integer> x = RepeatNumber(s, word);
                  int k=0;
                  int first=0,last;
                  int length=word.length()  ;
                  for (Integer i : x)
                  {
                    
                      if(k==x.size()-1)
                      {
                        last=x.get(k);
                        n=n+ s.substring(first, last);
                        first=x.get(k) + length + 1;
                        //////
                        last=s.length();
                        first=x.get(k)+length+1;
                        n=n+ s.substring(first);
                      }
                      else
                      {                         
                      last=x.get(k);
                      n=n+ s.substring(first, last);
                      first=x.get(k) + length + 1;
                      }
                      //try
                      //{
                      //}catch(Exception ex){}
                      k++;
                      
                      
                  }
                  k=0;
                  if(x.size()>0)
                  {
                    s=n;
                    n="";
                  }
                  
              }
  
  
              return s;
          }
// this is for Fractionner method
      public String Fractionner(String ss,char c)
    {
        List<String> lst = splitString(ss, c);
        String s = "";
        for (String item : lst)
        {
            s += "-" + item + '\n';
        }
        return s;
    }
    
	// this is for join methode
	public String  Join (String ss,char c)
    {
        List<String> lst = splitString(ss, ' ');
        for (int i = 0; i < lst.size() - 1; i++)
        {
            String o=lst.get(i);
            lst.set(i,"<"+o+">"+c);
        }
        String u=lst.get(lst.size() - 1);
        lst.set(lst.size() - 1,"<" + u + ">");
        String s = "";
        for (String item : lst)
        {
            s += item;
        }
        return s;
    }
}