public class StringHelper {
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
}