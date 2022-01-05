package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
            if (counts.cycles<400){
                lowCount=lowCount+1;}
            else if (400<=counts.cycles&&counts.cycles<919)
            {
                mediumCount=mediumCount+1;}
            else{
                highCount=highCount+1;}
    
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
     
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    
    testBucketingByNumberOfCycles();
  }
}
