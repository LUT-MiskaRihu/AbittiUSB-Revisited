import java.io.*;
import java.net.URL;

public class NetIO {
    /*
     * Universal method to copy data from an online stream to a local file.
     * Data is read and written in chunks of DEFAULT_BUFFER_SIZE bytes.
     */
    public static void downloadFile(String urlFrom, String pathTo) {
        downloadFile(urlFrom, pathTo, Settings.DEFAULT_BUFFER_SIZE);
    }

    /*
     * Universal method to copy data from an online stream to a local file.
     * Data is read and written in chunks of bufferSize bytes.
     */
    public static void downloadFile(String urlFrom, String pathTo, int bufferSize) {
        URL url;
        InputStream inputStream;
        OutputStream outputStream;
        byte[] buffer = new byte[bufferSize];
        int bytesRead = -1;

        try {
            url = new URL(urlFrom);
            inputStream = url.openStream();
            outputStream = new FileOutputStream(pathTo);

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
