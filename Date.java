public class Date {
    private int day;
    private int month;
    private int year;
  
    // Constructor
    public Date(int y, int m, int d) {
      if (DateUtil.isValidDate(y, m, d)) {
        year = y;
        month = m;
        day = d;
      }
    }
  
    public void printDate(){
      System.out.println(year + "/" + month + "/" + day);
    }
  }