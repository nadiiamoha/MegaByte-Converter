public class MegaBytesConverter {


    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int KByteInMByte = 1024;
        int megaBytes = kiloBytes / KByteInMByte;
        int remainingKiloBytes = kiloBytes - (megaBytes * KByteInMByte);

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");


    }
}
