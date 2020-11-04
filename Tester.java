public class Tester {

  public static void main(String[] args) {
    SuperArray a1 = new SuperArray();
    System.out.println(a1.toString());
    a1.add("hullo1");
    a1.add("hullo2");
    a1.add("hullo3");
    a1.add("hullo4");
    a1.add("hullo5");
    a1.add("hullo6");
    a1.add("hullo7");
    a1.add("hullo8");
    a1.add("hullo9");
    a1.add("hullo10");
    a1.add("hullo11");
    a1.add("hullo12");
    a1.add("hullo13");
    a1.add("hullo14");
    System.out.println(a1.set(2, "testing"));
    System.out.println(a1.toString());
    a1.clear();
    System.out.println(a1.toString());


    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
  }

}
