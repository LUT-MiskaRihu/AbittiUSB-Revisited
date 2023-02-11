public class Main {
    public static void main(String[] args) {
        NetIO.downloadFile(
                "\"https://static.abitti.fi/etcher-usb/koe-etcher.zip\"",
                "D:\\file.zip",
                4096
        );
    }
}