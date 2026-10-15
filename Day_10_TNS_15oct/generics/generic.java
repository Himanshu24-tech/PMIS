class Box<T>{ //box<T> is generic
  private T value;
  public void set(T value){
    this.value = value;
  }
  public T get(){
    return value;
  }
}

public class generic {
    public static void main (String[] args){
        Box<String> box = new Box<>();
        box.set("Hello");
        String s = box.get();
        System.out.println(s);

    }
}

//without generics we cNT DETECT COMPILE TIME ERRORS,no manual casting,resuseable code