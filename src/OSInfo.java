public class OSInfo {
    // OS Types
    public static final int OS_STUDENT = 0;
    public static final int OS_SERVER = 1;

    // Information matrix field codes
    public static final int FIELD_NAME = 0;
    public static final int FIELD_VERSION_INFO_LINK = 1;
    public static final int FIELD_DOWNLOAD_LINK = 2;

    // Information matrix
    public static final String[][] DATA = {
            // Student OS
            {
                    "ABITTI",
                    "https://static.abitti.fi/etcher-usb/koe-etcher.ver",
                    "https://static.abitti.fi/etcher-usb/koe-etcher.zip"
            },

            // Server OS
            {
                    "SERVER",
                    "https://static.abitti.fi/etcher-usb/koe-etcher.ver",
                    "https://static.abitti.fi/etcher-usb/koe-etcher.zip"
            }
    };
}
