public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
  }

  public SuperArray(int initialCapacity) {
    if(initialCapacity < 0) {
      throw new IllegalArgumentException("Initial Capicity " + initialCapacity +
        " can not be negative");
    }
    data = new String[initialCapacity];
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
    if(size >= data.length) {
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException ("Index " + index +
        " is out of range");
    }
    return data[index];
  }

  public String set(int index, String element) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException ("Index " + index +
        " is out of range");
    }
    String orig = data[index];
    data[index] = element;
    return orig;
  }

  private void resize() {
    int length = data.length;
    String [] sizedUpArray = new String[length + length];
    for(int i = 0; i < size; i++) {
      sizedUpArray[i] = data[i];
    }
    data = sizedUpArray;
  }

  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    return false;
  }

  public void clear() {
    data = new String[10];
    size = 0;
  }

  public String toString() {
    String result = "[";
    if(size > 0) {
     for(int i = 0; i < size-1; i++) {
       result = result + (data[i]);
       result = result + ", ";
     }
     result = result + (data[size-1]);
    }
   result = result + "]";
   return result;
  }

  public boolean contains(String s) {
    for(int i = 0; i < size; i++) {
      if(data[i].equals(s)) {
        return true;
      }
    }
    return false;
  }

  public void add(int index, String element) {
    size++;
    for(int i = size; i > index; i--) {
      String old = data[i-1];
      data[i] = old;
    }
    data[index] = element;
  }

  public String remove(int index) {
    size--;
    String orig = data[index];
    for(int i = index; i < size; i++) {
      String old = data[i+1];
      data[i] = old;
    }
    return orig;
  }

  public int indexOf(String s) {
    int index = -1;
    for(int i = 0; i < size; i++) {
      if(data[i].equals(s)) {
        index = i;
      }
    }
    return index;
  }

  public String[] toArray() {
    String[] newArray = new String[size];
    for(int i = 0; i < size; i++) {
      newArray[i] = data[i];
    }
    return newArray;
  }

  public int lastIndexOf(String value) {
    for(int i = size - 1; i > -1; i--) {
      if(data[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other) {
    for(int i = 0; i < size; i++) {
      if(data[i].equals(other.data[i])) {
      }
      else {
        return false;
      }
    }
    return true;
  }

}
