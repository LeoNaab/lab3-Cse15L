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

  @Test
  public void testReverseInPlaceLongest(){
    int[] input1 = {4, 8, 3, 9, 7, 4, 5, 7};
    int[] expectedOut = {7, 5, 4, 7, 9, 3, 8, 4};
    ArrayExamples.reverseInPlace(input1);

    assertArrayEquals(expectedOut, input1);
  }

  @Test
  public void testAverageWithout(){ 
    double[] theNums = {1, 2, 3, 4, 5};
    double theAns = ArrayExamples.averageWithoutLowest(theNums);
    String theWarning = String.format("Got %f", theAns);
    assertEquals(theWarning,(double)(2 + 3 + 4 + 5)/4.0, theAns, 0.001);
  }

  
}
