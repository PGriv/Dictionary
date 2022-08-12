import java.util.ArrayList;
import java.util.LinkedList;

public class Index {
   private ArrayList<LinkedList<String>> ind;

   public Index(){
       ind= new ArrayList<>(26);

       for (int i = 0; i<26; i++)
           ind.add(new LinkedList<>());
   }
   public void add(String s){
       char c= s.charAt(0);
       int pos = c-'a';

       if (!ind.get(pos).contains(s))
           ind.get(pos).add(s);
       else
           System.out.println("String: "+s +" already exists!!!!");

   }

    @Override
    public String toString() {
        String message = "";
        char c = 'a';
        for (int i=0; i<ind.size(); i++){
            message+=c+": ";
            message+=String.join(", ", ind.get(i));
            message+="\n";
            c++;
        }
        return message;
    }
}
