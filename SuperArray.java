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

  public String set(int index, String element) {
    String orig = data[index];
    data[index] = element;
    return "replaced " + orig + " with " + element;
  }

  private void resize() {
    int length = data.length;
    String [] sizedUpArray = new String[length + length];
    for(int i = 0; i < size; i++) {
      sizedUpArray[i] = data[i];
    }
    data = sizedUpArray;
  }

}
