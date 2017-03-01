package jtest.com.baidu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.System.out;

/**
 * Created by YAO on 2017/2/27.
 * C市现在要转移一批罪犯到D市，C市有n名罪犯，按照入狱时间有顺序，另外每个罪犯有一个罪行值，值越大罪越重。
 * 现在为了方便管理，市长决定转移入狱时间连续的c名犯人，同时要求转移犯人的罪行值之和不超过t，问有多少种选择的方式？
 */
public class MoveCriminal {

  public static Set<List<Criminal>> move(Prison prison, int count, int limit) {
    Set<List<Criminal>> ways = new HashSet<>();
    List<Criminal> CriminalsInPrison = prison.getCriminals();
    List<Criminal> toMove = new ArrayList<>();

    int totalValue = 0;
    // 第一批C-1名犯人
    for (int i = 0; i < count - 1; i++) {
      Criminal moveOne = CriminalsInPrison.get(i);
      toMove.add(moveOne);
      totalValue += moveOne.getValue();
    }

    //滑动窗口模式
    try {
      for (int i = count - 1, j = 0; i < CriminalsInPrison.size(); i++, j++) {
        Criminal moveOne = CriminalsInPrison.get(i);
        toMove.add(moveOne);
        totalValue += moveOne.getValue();
        if (totalValue <= limit) {
          ways.add(toMove);
//          showTheCriminals(toMove, totalValue);
        }
        Criminal next = CriminalsInPrison.get(j);
        totalValue -= next.getValue();
        toMove.remove(0);
      }
    } catch (IndexOutOfBoundsException e) {
      out.println(toMove);
    }
    return ways;
  }

  private static void showTheCriminals(List<Criminal> toMove, int totalValue) {
    out.println("===============================");
    for (Criminal c : toMove) {
      out.println("id:" + c.getId());
      out.println("value:" + c.getValue());
    }
    out.println("totalValue:" + totalValue);
    out.println("===============================");
  }

  public static void main(String[] args) {
    int criminals = 2000;
    int moveNum = 100; // move criminal numbers should be more then 2
    int limit = 90000; // should small then criminals*moveNum,should more then min value

    Prison C = new Prison(criminals);
    Set<List<Criminal>> a = move(C, moveNum, limit);
    System.out.println("ways:" + a.size());
  }

//    public static void main(String[] args){
//
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){
//            int number = scanner.nextInt(); // 罪犯总数
//            int limit = scanner.nextInt(); // 犯罪值总数
//            int count = scanner.nextInt(); // 移动的罪犯个数
//
//            int[] arr = new int[number];
//
//            for (int i =0;i<number;i++){
//                arr[i] = scanner.nextInt(); // 每个罪犯值？
//            }
//            int total = 0;
//            for (int i =0; i < count -1 && i < arr.length; ++i) {
//                total += arr[i];
//            }
//            int result =0;
//            for (int i = count -1,j=0; i < arr.length; ++i,++j){
//                total += arr[i];
//                if (total <= limit){
//                    ++result;
//                }
//                total -=arr[j];
//            }
//            System.out.println(result);
//        }
//        scanner.close();
//    }
}
