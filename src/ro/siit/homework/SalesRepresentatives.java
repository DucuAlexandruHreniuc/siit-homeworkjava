package ro.siit.homework;

public class SalesRepresentatives implements Comparable<SalesRepresentatives> {
    private int numberOfSales;
    private int quota;
    private int revenue;

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public int getQuota() {
        return quota;
    }

    /**
     *
     * @param numberOfSales - is the parameter used for recognizing the number of sales
     * @param quota - is the limit which a salesman can do per sale
     */
    public SalesRepresentatives(int numberOfSales, int quota) {
        this.numberOfSales = numberOfSales;
        this.quota = quota;
        this.revenue = numberOfSales * quota;
    }

    public int getRevenue() {
            return getNumberOfSales() * getQuota();
        }

    /**
     *
     * @return is used to get the final revenue which represents every object/salesman
     */

    public String toString(){
        return revenue +"$";

    }

    @Override
    public int compareTo(SalesRepresentatives o) {
        return this.getRevenue() - o.getRevenue();
    }

}

