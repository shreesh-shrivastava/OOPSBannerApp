public class OOPSBannerApp {

    public static String[] createBanner() {
        return new String[]{
                "  *****    ******    ****** ",
                " *     *   *     *   *      ",
                " *     *   *     *   *      ",
                " *     *   ******    ****** ",
                " *     *   *         *      ",
                " *     *   *         *      ",
                "  *****    *         ****** "
        };
    }

    public static void printBanner(String[] lines) {
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        String[] banner = createBanner();
        printBanner(banner);
    }
}