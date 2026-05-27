class Drawingbook
{
public static int pageCount(int n, int p) {

    // Turns from front
    int front = p / 2;

    // Turns from back
    int back = (n / 2) - (p / 2);

    return Math.min(front, back);
  }
}