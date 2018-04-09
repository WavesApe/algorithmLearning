import java.util.Arrays;

public class StdDrawDemo {
    /**
     * 图形库使用demo
     * addPerson ： hzb 2018-3-14
     * @param arags
     */
    public static void main(String[] arags ){
        demo2();
    }

    /**
     * 画个简单的函数图
     * addPerson : hzb 2018-3-14
     */
    public static void demo1(){
        int n =100;

        StdDraw.setXscale(0,n);
        StdDraw.setYscale(0,n*n);
        StdDraw.setPenRadius(.01);

        for (int i =1;i<=n;i++){
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));
        }

    }

    /**
     * 画个随机数组的图形形态
     * addPerson ： hzb 2018-3-14
     */
    public static void demo2(){
        int n =50;
        double[] doubles = new double[n];
        for (int i=0;i<n;i++){
            //用随机函数生成随机数
            doubles[i] = StdRandom.random();

        }
        Arrays.sort(doubles);
        for(int i=0;i<n;i++){
            double x = 1.0*i/n;
            double y = doubles[i]/2.0;
            double rw =0.5/n;
            double rh = doubles[i]/2.0;
            //x 代表线在那个位置  y代表这个线的高度
            // rw rh 理解成平面坐标参数
            StdDraw.filledRectangle(x,y,rw,rh);

        }


    }

}
