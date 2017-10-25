public class StringHelper {
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
}