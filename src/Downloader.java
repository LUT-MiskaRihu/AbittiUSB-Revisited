public class Downloader {
    public static void downloadOSImage(int os) {
        String path = OSInfo.DATA[os][OSInfo.FIELD_NAME] + ".zip";
        String downloadUrl = OSInfo.DATA[os][OSInfo.FIELD_DOWNLOAD_LINK];
        NetIO.downloadFile(downloadUrl, path);
    }
}
