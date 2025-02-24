public class TestCounter {
  public static void main(String[] args) {
    Counter counter = new Counter();
    for(int i=0; i<5; ++i) {
        counter.inc();
    }
    System.out.println("Counter: " + counter.getValue());

  }
}