package jtest.com.baidu;

import java.util.Random;

/**
 * Created by YAO on 2017/2/28.
 */
public class Criminal {
  private int id; // 编号按照时间从小到大 time
  private int value; // 犯罪值 extent

  Criminal(int id, int CriminalNumber) {
    this.id = id;
    this.value = estimateExtent(CriminalNumber);
  }

  private int estimateExtent(int CriminalNumber) {
    int max = CriminalNumber;
    int min = 1;
    Random random = new Random();

    int s = random.nextInt(max) % (max - min + 1) + min;
    return s;
  }


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }
}
