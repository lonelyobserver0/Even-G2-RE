package org.bouncycastle.util.encoders;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class UrlBase64 {
    private static final Encoder encoder = new UrlBase64Encoder();

    public static int decode(String str, OutputStream outputStream) throws IOException {
        return encoder.decode(str, outputStream);
    }

    public static int encode(byte[] bArr, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static int decode(byte[] bArr, OutputStream outputStream) throws IOException {
        return encoder.decode(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] encode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.encode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new EncoderException(u.r(e10, new StringBuilder(StubApp.getString2(35008))), e10);
        }
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new DecoderException(u.r(e10, new StringBuilder(StubApp.getString2(35007))), e10);
        }
    }

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new DecoderException(u.r(e10, new StringBuilder(StubApp.getString2(35007))), e10);
        }
    }
}
