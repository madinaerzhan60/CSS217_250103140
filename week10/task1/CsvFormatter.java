package CSS217_250103140.week10.task1;

public class CsvFormatter implements ReportFormatter {
    @Override
    public String format(String title, String[] headers, String[][] rows) {
        StringBuilder sb = new StringBuilder();
        sb.append("# TITLE: ").append(title).append("\n");
        sb.append(formatRow(headers)).append("\n");
        for (String[] row : rows) {
            sb.append(formatRow(row)).append("\n");
        }
        return sb.toString();
    }

    private String formatRow(String[] row) {
        String[] values = new String[row.length];
        for (int i = 0; i < row.length; i++) {
            values[i] = "\"" + row[i].replace("\"", "\"\"") + "\"";
        }
        return String.join(",", values);
    }
}
