package jtest.com.ninety_nine.Lists;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * P01 (*) Find the last element of a list
 */
public class java99 {
  public static class core {

    public static <T> List<T> tail(LinkedList<T> elements) {
      if (elements == null || elements.isEmpty()) {
        throw new NoSuchElementException();
      }
      if (elements.size() == 1) {
        return Collections.emptyList();
      }
      return elements.subList(1, elements.size());
    }
  }


  public static class P01 {

    @Test
    public void shouldFindLastElementFromAListOfAlphabets() throws Exception {
      assertThat(P01.last(asList("a", "b", "c", "d")), is(equalTo("d")));
    }

    private static <T> T last(java.util.List<T> elements) {
      LinkedList<T> list = new LinkedList<T>(elements);
      return list.getLast();
    }
  }

  public static class P02 {
    @Test
    public void shouldFindSecondLastElementFromAList() throws Exception {
      List<Integer> numbers = asList(1, 2, 11, 4, 5, 8, 10, 6);
      assertThat(P02.secondLast(numbers), is(equalTo(10)));
    }

    private static <T> T secondLast(List<T> numbers) {
      LinkedList<T> list = new LinkedList<T>(numbers);
      return secondLast(list.subList(0, list.size() - 1));
    }
  }
}