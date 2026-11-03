package CSS217_250103140.week10.task2;

public interface StockProvider {
    double getMarketPrice(String ticker);
    String getStatus(String ticker);
}
