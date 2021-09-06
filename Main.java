class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int totalNumMm;
    totalNumMm = 55 * 11;

    double numBlueMm;
    numBlueMm = totalNumMm * .24;
    System.out.println("Blue: " + numBlueMm);

    double numBrownMm;
    numBrownMm = totalNumMm * .13;
    System.out.println("Brown: " + numBrownMm);

    double numGreenMm;
    numGreenMm = totalNumMm * .16;
    System.out.println("Green: " + numGreenMm);

    double numOrangeMm;
    numOrangeMm = totalNumMm * .20;
    System.out.println("Orange: " + numOrangeMm);

    double numRedMm;
    numRedMm = totalNumMm * .13;
    System.out.println("Red: " + numRedMm);

    double numYellowMm;
    numYellowMm = totalNumMm * .14;
    System.out.println("Yellow: " + numYellowMm);

    double sumMm;
    sumMm = numBlueMm + numBrownMm + numGreenMm + numOrangeMm + numRedMm + numYellowMm;
    System.out.println("Sum: " + sumMm);

    if (numBlueMm < numBrownMm && numRedMm > numOrangeMm) { System.out.println("Blue under Brown and Red over Orange");
    }

    if (numBrownMm >= numGreenMm) {
    System.out.println("Brown is greater than or equal to Green");}

    if (sumMm == totalNumMm) {
    System.out.println("Numbers match");
    }
  }
}