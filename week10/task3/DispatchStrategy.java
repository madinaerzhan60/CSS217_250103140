package CSS217_250103140.week10.task3;

public interface DispatchStrategy {
    boolean shouldDispatch(int severityLevel, int currentHour);
    String getStrategyName();
}
