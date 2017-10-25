public class StringHelper {
    
	// this is for join methode
	public String  Join (String ss,char c)
    {
        List<String> lst =new ArrayList<>();//= splitString(ss, ' ');
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