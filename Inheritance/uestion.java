import java.util.List;

public class uestion {

public static int sumarr(List<Integer> ar){
    int sizeofarr = ar.size();
    int sum = 0;
    for(int i = 0;i<sizeofarr;i++){
        sum+=ar.get(i);
    }
    return sum;

}

    public static void main(String[] args) {
        sumarr()
    }
}
