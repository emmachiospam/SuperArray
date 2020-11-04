public class Tester {

  public static void main(String[] args) {
    SuperArray a1 = new SuperArray();
    // System.out.println(a1.size());
    a1.add("hullo");
    a1.add("hullo");
    System.out.println(arrToString(a1.data()));
    a1.add("hullo");
    System.out.println(arrToString(a1.data()));
  }

  public static String arrToString(String[] arr){
  String result = "{";
  if(arr.length > 0) {
    for(int i = 0; i < arr.length-1; i++) {
      result = result + (arr[i]);
      result = result + ", ";
    }
    result = result + (arr[arr.length-1]);
  }
  result = result + "}";
  return result;
  }

}
