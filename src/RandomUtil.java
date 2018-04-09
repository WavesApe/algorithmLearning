public class RandomUtil {
    /**
     * 生成随机数
     * @param nub
     * @return
     */
    public int[] romdom(int nub){
        Double[] doubles = new Double[nub];
        int[] ints = new int[nub];
        for(int i =0;i<nub;i++){
            ints[i] = (int) (StdRandom.uniform()*1000);
        }
        return ints;
    }
}
