/**
 * 静态方法小样类
 * @addPerson ： hzb 2018-3-122
 */
public class StaticDemo {
    public static  void main(String[] args){

    }
    /**
     * 计算一个绝对值
     */
    public static int abs(int x){
        if(x < 0){
            return -x;
        }else {
            return x;
        }
    }
    /**
     * 计算一个浮点数的绝对值
     */
    public static double abs1(double x){
        if(x < 0.0){
            return -x;
        }else {
            return x;
        }
    }

    /**
     * 计算一个是否素数
     */
    public static boolean abs2(int x){
        if(x < 2){
            return false;
        }
        for(int i =2;i*i<=x;i++){
            if(x % i==0){
                return false;
            }

        }
        return true;
    }

    /**
     * 计算平方根
     * 注意这个地方用的是迭代的方法你们可以搜索一下牛顿迭代法
     */
    public static double abs3(double x){
        if(x < 0){
            return Double.NaN;
        }
        double err = 1e-15;
        double t = x;
        while(Math.abs(t-x/t)>err*t){
            t= (x/t+t)/2.0;

        }
        return t;
    }

  

}
