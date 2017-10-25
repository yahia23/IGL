public class StringHelper {
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
}