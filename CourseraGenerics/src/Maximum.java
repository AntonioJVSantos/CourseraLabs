public class Maximum {
    public static <T extends Comparable<T>> T maximum(T x,T z,T y){
        T max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }
}
