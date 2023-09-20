public class Main {
    public static void main(String[] args)
    {
      String text="us  df34439s  %*%)№ аввпdf84whавппsg4П_*кАААяяЛЛ";
      char[] text_letters=text.toCharArray();
      String new_text="";
      for(int i=0; i<text.length(); i++)
      {
          if(text_letters[i]>='A' && text_letters[i]<='Z' || text_letters[i]>='a' && text_letters[i]<='z' || text_letters[i]>='А' && text_letters[i]<='я')
          {
                new_text+=text_letters[i];
          }
          else
          {
              new_text+=" ";
          }
      }
      System.out.print(new_text);
    }
}