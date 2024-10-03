public class TimeComplexity {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        TimeComplexity demo = new TimeComplexity();

        System.out.println(demo.findSum1(100000));

//        System.out.println(demo.findSum2(100000));

        System.out.println("Time Taken: "+(System.currentTimeMillis()-now)+" ms");
    }

    public int findSum1(int n){
        return n * (n+1)/2;
    }

    public int findSum2(int n){
        int sum = 0;
        for(int i = 1; i <=n; i++){
            sum = sum + i;
        }
        return sum;
    }

}