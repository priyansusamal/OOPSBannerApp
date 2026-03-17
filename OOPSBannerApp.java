public class OOPSBannerApp {

feature/UC6-BannerPrintStatements
    public static String[] getOPattern() {
        return new String[]{
                "   ***   ",
                "  ** **  ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                "  ** **  ",
                "   ***   "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " **   ** ",
                " **      ",
                "  *****  ",
                "      ** ",
                " **   ** ",
                "  *****  "
        };
    }

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
=======
feature/UC5-BannerPrintStatements
    public static void main(String[] args) {

        String[] banner = {

            String.join("   ", " ***** ", " ***** ", " ****** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*      *", "*     "),
            String.join("   ", "*     *", "*     *", "*      *", "*     "),
            String.join("   ", "*     *", "*     *", " ****** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*       ", "     * "),
            String.join("   ", "*     *", "*     *", "*       ", "*    * "),
            String.join("   ", " ***** ", " ***** ", "*       ", " ****  ")

        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
=======
 public static void main(String args[]){
     System.out.println("OOPS");

    }



main
main
}