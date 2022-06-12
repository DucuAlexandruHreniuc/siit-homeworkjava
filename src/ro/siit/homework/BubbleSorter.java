package ro.siit.homework;

public class BubbleSorter {
    public static void main(String[] args) {

        SalesRepresentatives[] salesmen = new SalesRepresentatives[6];
        salesmen[0] = new SalesRepresentatives(10, 500);
        salesmen[1] = new SalesRepresentatives(7, 800);
        salesmen[2] = new SalesRepresentatives(9, 350);
        salesmen[3] = new SalesRepresentatives(4, 950);
        salesmen[4] = new SalesRepresentatives(13, 125);
        salesmen[5] = new SalesRepresentatives(2, 120);
        /**
          this creates and array of objects which have parameters
         */
        boolean switchedPosition = true;
        while (switchedPosition) {
            switchedPosition = false;
            for (int i = 0; i < salesmen.length -1; i++)
                if (salesmen[i].getRevenue() < salesmen[i + 1].getRevenue()) {
                    switchedPosition = true;
                    SalesRepresentatives temp = salesmen[i];
                    salesmen[i] = salesmen[i + 1];
                    salesmen[i + 1] = temp;
                }
            /**
             * this is the BubbleSort algorithm that enables us to sort our array with multiple iterations
             * it takes the first two adjacent objects and switches places so the first number is always the biggest until the array is sorted
             * the boolean is used and set to true, so it enters the while loop
             * the length of the array is set to -1 because the last object cannot be compared to the next since it's the last one
             */
            }
        System.out.println("The revenue of the salesmen sorted by the BubbleSort algorithm is: ");
        for (SalesRepresentatives salesman : salesmen) {
            System.out.println(salesman);
        }
        /**
         * this prints our array sorted with the algorithm used previously
         */
            }
    }

/**PS: I don't know what "Dangling Javadoc comment" means */


    // failed attempt
//  if (salesmen[0].getRevenue() < salesmen[1].getRevenue()) {
//            int originalPosition = 0;
//            int newPosition = 1;
//            ro.siit.homework.SalesRepresentatives temp = salesmen[originalPosition];
//            salesmen[originalPosition] = salesmen[newPosition];
//            salesmen[newPosition] = temp;*/