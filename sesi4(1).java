package pbosesi4;

public class HelperService {
 private String formatNumber(int value) {
        return String.format("%d", value);
    }

    private String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    private String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        HelperService hs = new HelperService();
        System.out.println(hs.formatNumber(10));
        System.out.println(hs.formatNumber(13.3456));
        System.out.println(hs.formatNumber("150"));
    }
}
