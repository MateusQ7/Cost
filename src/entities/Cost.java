package entities;

public class Cost {
    private Double distance;
    private Double performance;
    private Integer people;
    private Double gasolineCost;
    private String place;
    public Cost(Double distance, Double performance, Integer people, Double gasolineCost, String place) {
        this.distance = distance;
        this.performance = performance;
        this.people = people;
        this.gasolineCost = gasolineCost;
        this.place = place;
    }
    public Double getDistance() {
        return distance;
    }
    public void setDistance(Double distance) {
        this.distance = distance;
    }
    public Double getPerformance() {
        return performance;
    }
    public void setPerformance(Double performance) {
        this.performance = performance;
    }
    public Integer getPeople() {
        return people;
    }
    public void setPeople(Integer people) {
        this.people = people;
    }
    public Double getGasolineCost() {
        return gasolineCost;
    }
    public void setGasolineCost(Double gasolineCost) {
        this.gasolineCost = gasolineCost;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public void totalValue(){
        double valueOfL;
        valueOfL = distance / performance * 2.0;
        double finalPriceL;
        finalPriceL = gasolineCost * valueOfL;
        double finalPriceTotal;
        finalPriceTotal = finalPriceL / people;
        System.out.println("Your destination: " + place);
        System.out.println("It was R$" + String.format("%.2f", finalPriceTotal) + " for each!");
    }
}
