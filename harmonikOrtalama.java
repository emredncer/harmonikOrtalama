public class harmonikOrtalama {
    public static void main(String[] args) {
        double[] list = {1, 2, 3, 4, 5};
        double harmonic = 0.0;
        for (int i = 0; i < list.length; i++) {
            harmonic += 1 / list[i];
        }
        double harmonicOrt = (list.length / harmonic);
        System.out.println("Harmonik ortalama: " + harmonicOrt);
    }
}
