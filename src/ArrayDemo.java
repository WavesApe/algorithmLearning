public class ArrayDemo {
    /**
     * 数组操作小样类
     * @addPerson ： hzb 2018-3-12
     * @param args
     */
    public static void main(String[] args){

    }

    /**
     * 找出数组中最大数 并返回
     */
    public double arrayIsMax(){
        //定义一个数组
        double[] unkonwn = new double[10];

        //先把第一个假设为最大值
        double isMax = unkonwn[0];
        for(int i=1;i<unkonwn.length;i++){
            if(unkonwn[i]>isMax){
                //如果当前这个索引的值大于假设最大值 就直接赋值过去
                isMax = unkonwn[i];
            }
        }
        return isMax;
    }

    /**
     * 计算元素的平均值
     */
    public double arrayIsAverage() {
        //定义一个数组
        double[] unkonwn = new double[10];
        //获取数组长度
        int N = unkonwn.length;
        //定义数组累加值字段
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            sum += unkonwn[i];
        }
        return sum/N;
    }



    /**
     * 复制数组
     */
    public double[] arrayIsCopy() {
        //定义一个数组
        double[] unkonwn = new double[10];
        //获取数组长度
        int N = unkonwn.length;
        //创建一个被复制的数组一样的壳
        double[] copyArray = new double[N];

        for (int i = 0; i < N; i++) {
            copyArray[i] = unkonwn[i];
        }
        return copyArray;
    }

    /**
     * 颠倒数组元素顺序
     */
    public double[] arrayIsFlip() {
        //定义一个数组
        double[] unkonwn = new double[10];
        //获取数组长度
        int N = unkonwn.length;

        for (int i = 0; i < N/2; i++) {
           double temp = unkonwn[i];
           unkonwn[i] = unkonwn[N-1-i];
           unkonwn[N-1-i] = temp;
        }
        return unkonwn;
    }

    /**
     * 矩阵相乘
     */
    public double[] arrayIsMatrix() {
        //定义一个数组
        double[] unkonwn = new double[10];
        //获取数组长度
        int N = unkonwn.length;

        //创建类似矩阵的双数组结构
        double[][] x = new double[N][N];

        for (int i = 0; i < N; i++) {
            for(int j =0;j<N;j++){
             //开始计算i行和j列的点乘
                for(int k =0;k<N;k++){
                    x[i][j] +=x[i][k]*x[k][j];
                }
            }
        }
        return unkonwn;
    }


}
