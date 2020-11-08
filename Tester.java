public class Tester {

  public static void main(String[] args) {
    SuperArray a1 = new SuperArray();
    SuperArray a2 = new SuperArray();
    // System.out.println(a1.toString());
    // System.out.println(a1.size());
    a1.add("hullo0");     a1.add("hullo1");     a1.add("hullo2");
    a1.add("hullo3");     a1.add("hullo14");    a1.add("hullo5");
    a1.add("hullo6");     a1.add("hullo7");     a1.add("hullo8");
    a1.add("hullo9");     a1.add("hullo10");    a1.add("hullo11");
    a1.add("hullo12");    a1.add("hullo13");    a1.add("hullo14");
    a2.add("hullo0");     a2.add("hullo1");     a2.add("hullo2");
    a2.add("hullo3");     a2.add("hullo4");     a2.add("hullo5");
    a2.add("hullo6");     a2.add("hullo7");     a2.add("hullo8");
    a2.add("hullo9");     a2.add("hullo10");    a2.add("hullo11");
    a2.add("hullo12");    a2.add("hullo13");    a2.add("hullo14");
    // a2.add("hullo15");
    // a1.set(2, "testing");
    // a1.clear();
    System.out.println(a1.toString());
    // System.out.println(arrToString(a1.toArray()));
    // System.out.println(a1.indexOf("hullo"));
    // System.out.println(a1.toString());
    System.out.println(a1.equals(a2));
  }


  //   SuperArray words = new SuperArray();
  //   words.add("kani");
  //   words.add("uni");
  //   words.add("ebi");
  //   for(int i = 0; i < words.size(); i++){
  //     System.out.println( words.get(i) );
  //   }
  // }

  public static String arrToString(String[] s) {
    String result = "[";
    if(s.length > 0) {
     for(int i = 0; i < s.length-1; i++) {
       result = result + (s[i]);
       result = result + ", ";
     }
     result = result + (s[s.length-1]);
    }
   result = result + "]";
   return result;
  }

}
