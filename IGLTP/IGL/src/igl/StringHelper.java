public class StringHelper {
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
}