package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LottoMain {
   public static void main(String[] args) {
      Random r = new Random();
      ArrayList<Integer> lotto = new ArrayList<>();
      Lotto l = new Lotto();
      

//      int lottoNum = 0;
//      
//      while(lotto.size() < 5) {
//         lottoNum = r.nextInt(45) + 1;
//         if(!lotto.contains(lottoNum)) {
//            lotto.add(lottoNum);
//         }
//      }
//      Collections.sort(lotto);
//      System.out.println(lotto);

      l.buyLotto();
      
   }
}
