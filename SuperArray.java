public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
  }

  public int size() {
    return size;
  }

  public String[] data() {
    String [] test = new String[size];
    for(int i = 0; i < size; i++) {
      test[i] = data[i];
    }
    return test;
  }

  public boolean add(String element) {
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index) {
    return data[index];
  }

}
