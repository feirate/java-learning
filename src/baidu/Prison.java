package jtest.com.baidu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by YAO on 2017/2/28.
 */
public class Prison {
  public List<Criminal> Criminals = new ArrayList<>();
  private List<Criminal> Sorted = new ArrayList<>();

  Prison(int criminals) {
    for (int i = 0; i < criminals; i++) {
      putIn(i, criminals);
    }
  }

  private void putIn(int id, int criminals) {
    Criminal newOne = new Criminal(id, criminals);
    this.Criminals.add(newOne);
//    System.out.println(newOne.getId() + " " + newOne.getValue());
  }

  public int getCriminalNumber() {
    return Criminals.size();
  }

  public List<Criminal> getCriminals() {
    return Criminals;
  }

  private void sortByValue() {
    this.Sorted.addAll(this.Criminals);
    Collections.sort(Sorted, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
  }

}
