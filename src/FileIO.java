import org.jetbrains.annotations.NotNull;

import java.io.*;

public class FileIO {
    public static int DEFAULT_BUFFER_SIZE = 4096;

    /*
     * If no buffer size is specified, this function forces the use of the default buffer size to read a file.
     * Returns read data as long integer.
     */
    public static int readFile(@NotNull InputStream inputStream) {
        return readFile(inputStream, DEFAULT_BUFFER_SIZE);
    }

    /*
     * Reads data from inputStream in chunks of bufferSizeInBytes bytes.
     * Returns read data as long integer.
     */
    public static int readFile(@NotNull InputStream inputStream, int bufferSizeInBytes) {
        byte[] buffer = new byte[bufferSizeInBytes];
        int bytesRead = -1;
        int data = -1;

        try {
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                data += bytesRead;
                System.out.println(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return data;
    }

    public static void writeFile(int data, String path) {
        try {
            OutputStream outputStream = new FileOutputStream(path);
            outputStream.write(data);
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
