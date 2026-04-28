package ge.ibsu.demo.dto;

public class ProductStats {

    private String category;
    private Double averagePrice;

    public ProductStats(String category, Double averagePrice) {
        this.category = category;
        this.averagePrice = averagePrice;
    }

    public Double getAveragePrice() {
        return averagePrice;
    }

    public String getCategory() {
        return category;
    }
}