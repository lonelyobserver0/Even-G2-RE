package org.bouncycastle.util.io;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Streams {
    private static int BUFFER_SIZE = 4096;

    public static void drain(InputStream inputStream) throws IOException {
        int i3 = BUFFER_SIZE;
        while (inputStream.read(new byte[i3], 0, i3) >= 0) {
        }
    }

    public static void pipeAll(InputStream inputStream, OutputStream outputStream) throws IOException {
        pipeAll(inputStream, outputStream, BUFFER_SIZE);
    }

    public static long pipeAllLimited(InputStream inputStream, long j, OutputStream outputStream) throws IOException {
        int i3 = BUFFER_SIZE;
        byte[] bArr = new byte[i3];
        long j3 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, i3);
            if (read < 0) {
                return j3;
            }
            long j10 = read;
            if (j - j3 < j10) {
                throw new StreamOverflowException(StubApp.getString2(35009));
            }
            j3 += j10;
            outputStream.write(bArr, 0, read);
        }
    }

    public static byte[] readAll(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAll(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] readAllLimited(InputStream inputStream, int i3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAllLimited(inputStream, i3, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int readFully(InputStream inputStream, byte[] bArr) throws IOException {
        return readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void validateBufferArguments(byte[] bArr, int i3, int i10) {
        bArr.getClass();
        int length = bArr.length - i3;
        if ((length | i3 | i10 | (length - i10)) < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void writeBufTo(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) throws IOException {
        byteArrayOutputStream.writeTo(outputStream);
    }

    public static void pipeAll(InputStream inputStream, OutputStream outputStream, int i3) throws IOException {
        byte[] bArr = new byte[i3];
        while (true) {
            int read = inputStream.read(bArr, 0, i3);
            if (read < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static int readFully(InputStream inputStream, byte[] bArr, int i3, int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i3 + i11, i10 - i11);
            if (read < 0) {
                break;
            }
            i11 += read;
        }
        return i11;
    }
}
