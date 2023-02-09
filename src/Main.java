import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        VersionChecker versionChecker = VersionChecker.getInstance();
        System.out.println(versionChecker.getLatestVersion(OSTypes.STUDENT));
        System.out.println(versionChecker.getLatestVersion(OSTypes.SERVER));
    }
}