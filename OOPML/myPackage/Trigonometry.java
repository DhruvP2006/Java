package myPackage;


public class Trigonometry {

    private static final double SQRT3_DIV_2 = 0.8660254;

    public static double sine(int degree) {
        switch (degree) {
            case 0: return 0.0;
            case 30: return 0.5;
            case 60: return SQRT3_DIV_2;
            case 90: return 1.0;
            default: return Double.NaN; 
        }
    }

    public static double cos(int degree) {
        switch (degree) {
            case 0: return 1.0;
            case 30: return SQRT3_DIV_2;
            case 60: return 0.5;
            case 90: return 0.0;
            default: return Double.NaN;
        }
    }

    public static double tan(int degree) {    
        if (degree == 90) {
            return Double.POSITIVE_INFINITY;
        }
        double cosVal = cos(degree);
        if (Double.isNaN(cosVal)) return Double.NaN;
        return sine(degree) / cosVal;
    }

    public static double cot(int degree) {
        if (degree == 0) {
            return Double.POSITIVE_INFINITY;
        }
        double sinVal = sine(degree);
        if (Double.isNaN(sinVal)) return Double.NaN;
        return cos(degree) / sinVal;
    }

    public static double sec(int degree) {
        if (degree == 90) {
            return Double.POSITIVE_INFINITY;
        }
        double cosVal = cos(degree);
        if (Double.isNaN(cosVal)) return Double.NaN;
        return 1 / cosVal;
    }

    public static double cosec(int degree) {
        if (degree == 0) {
            return Double.POSITIVE_INFINITY;
        }
        double sinVal = sine(degree);
        if (Double.isNaN(sinVal)) return Double.NaN;
        return 1 / sinVal;
    }
}
