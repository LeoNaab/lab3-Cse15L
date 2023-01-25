import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedLong(){
    int[] input1 = {4, 7, 9};
    int[] expectedOut = {9, 7, 4};

    assertArrayEquals(expectedOut, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceLong(){
    int[] input1 = {4, 8, 3, 9};
    int[] expectedOut = {9, 3, 8, 4};
    ArrayExamples.reverseInPlace(input1);

    assertArrayEquals(expectedOut, input1);
  }
}
