import static java.util.stream.Collectors.toCollection;

import java.util.List;

public class billdivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalbill = 0;
    
        for(int i = 0;i<bill.size();i++){
              totalbill = totalbill+ bill.get(i);

        }
        int annashare = (totalbill-bill.get(k))/2;

        if (annashare == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - annashare);
        }

    }
}
