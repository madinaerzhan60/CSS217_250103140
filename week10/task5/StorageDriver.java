package CSS217_250103140.week10.task5;

public interface StorageDriver {
    byte[] loadRawBlob(String resourceUri);
    String getStorageType();
}
