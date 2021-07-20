import java.util.*;

class Program {

  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    // Write your code here.
		Collections.sort(redShirtHeights);
		Collections.sort(blueShirtHeights);
		int red = 0;
		int blue = 0;
		int length = redShirtHeights.size();
		for (int i = 0; i < length; i++) {
			if (redShirtHeights.get(i) > blueShirtHeights.get(i)) {
				red++;
			} else if (blueShirtHeights.get(i) > redShirtHeights.get(i)) {
				blue++;
			}
		}
    return blue == length || red == length;
  }
}
