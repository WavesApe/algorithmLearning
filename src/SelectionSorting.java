

/**
 * 选择排序
 * @addPerson ： hzb 2018-4-9
 */
public class SelectionSorting {
    /**
     * 值互相交换
     * @param a
     * @param i
     * @param j
     */
    private static void exch(int[] a, int i, int j){

        int x = a[i];
        a[i] = a[j];
        a[j] =x;
    }


    public static  void main(String[] args){
        int[] romdom = new RandomUtil().romdom(1000);
        System.out.println("排序前");
        for (int i =0;i<romdom.length-1;i++) {
            System.out.print(romdom[i]+"|");
        }
        long startTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("开始时间:"+startTime);
        //数l组长度 c=
        int length = romdom.length;
        for(int i=0;i<length;i++){
            //设最小值字段索引
            int min  = i;
            //先找出最小值的索引
            for(int j=i+1;j<length;j++){
                //对比两个值的大小判断谁是目前最小的值
                if(romdom[j]<romdom[min]){
                    min = j;
                }
            }
            //找到了最小值后交换值
            exch(romdom,i,min);
        }

        long sndTime  = System.currentTimeMillis();
        System.out.println("结束时间:"+sndTime);
        System.out.println("耗时:"+Double.valueOf(sndTime-startTime)/1000+"秒");


        System.out.println("排序后");
        for (int i =0;i<romdom.length-1;i++) {
            System.out.print(romdom[i]+"|");
        }
    }

}
