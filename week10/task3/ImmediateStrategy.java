package CSS217_250103140.week10.task3;

public class ImmediateStrategy implements DispatchStrategy {
    @Override
    public boolean shouldDispatch(int severityLevel, int currentHour) {
        return true;
    }
    @Override
    public String getStrategyName() { return "IMMEDIATE_DISPATCH"; }
}
