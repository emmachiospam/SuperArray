public class Demo{

  public static void removeDuplicates(SuperArray s) {
    // int n = s.size();
    for(int i = 0; i < s.size(); i++) {
      String test = s.get(i);
      for(int j = s.size()-1; j > i; j--) {
        if(test.equals(s.get(j))) {
          s.remove(j);
        }
      }
    }
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }


}
