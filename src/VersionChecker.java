import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

class VersionChecker {
    /*
     * This class is used to read the latest version number from the official Abitti website and compare the results
     * to the version number stored in local memory (.ver file).
     */

    private static VersionChecker instance = null;
    private String latestStudentVersion = null;
    private String latestServerVersion = null;
    private String localStudentVersion = null;
    private String localServerVersion = null;

    public VersionChecker() {
        this.latestStudentVersion = readLatestVersion(OSTypes.STUDENT);
        this.latestServerVersion = readLatestVersion(OSTypes.SERVER);
    }

    public static VersionChecker getInstance() {
        if (instance == null) {
            instance = new VersionChecker();
        }
        return instance;
    }

    private String readLatestVersion(int osType) {
        String urlString;
        URL url;
        Scanner scanner;
        String latestVersion = null;

        try {
            urlString = OSInfo.DATA[osType][OSInfo.FIELD_VERSION_INFO_LINK];
            url = new URL(urlString);
            scanner = new Scanner(url.openStream());
            latestVersion = scanner.nextLine();
            scanner.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return latestVersion;
    }

    public String getLatestVersion(int osType) {
        if (osType == OSTypes.STUDENT) return latestStudentVersion;
        if (osType == OSTypes.SERVER) return latestServerVersion;
        return null;
    }
}
