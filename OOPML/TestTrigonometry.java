import myPackage.Trigonometry;

public class TestTrigonometry {
    public static void main(String[] args) {
        int[] angles = {0, 30, 60, 90};

        System.out.println("--- Testing Trigonometry Package ---");

        for (int angle : angles) {
            System.out.printf("\n--- For Angle = %d Degrees ---\n", angle);
            System.out.printf("Sine:   \t%.4f\n", Trigonometry.sine(angle));
            System.out.printf("Cosine: \t%.4f\n", Trigonometry.cos(angle));
            System.out.printf("Tangent:\t%.4f\n", Trigonometry.tan(angle));
            System.out.printf("Cotangent:\t%.4f\n", Trigonometry.cot(angle));
            System.out.printf("Secant:   \t%.4f\n", Trigonometry.sec(angle));
            System.out.printf("Cosecant:\t%.4f\n", Trigonometry.cosec(angle));
        }
    }
}
