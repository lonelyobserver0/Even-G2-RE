package org.bouncycastle.util.encoders;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Base32 {
    private static final Encoder encoder = new Base32Encoder();

    public static int decode(String str, OutputStream outputStream) throws IOException {
        return encoder.decode(str, outputStream);
    }

    public static int encode(byte[] bArr, int i3, int i10, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, i3, i10, outputStream);
    }

    public static String toBase32String(byte[] bArr) {
        return toBase32String(bArr, 0, bArr.length);
    }

    public static int decode(byte[] bArr, int i3, int i10, OutputStream outputStream) {
        try {
            return encoder.decode(bArr, i3, i10, outputStream);
        } catch (Exception e10) {
            throw new DecoderException(u.r(e10, new StringBuilder(StubApp.getString2(34987))), e10);
        }
    }

    public static int encode(byte[] bArr, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static String toBase32String(byte[] bArr, int i3, int i10) {
        return Strings.fromByteArray(encode(bArr, i3, i10));
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static byte[] encode(byte[] bArr, int i3, int i10) {
        Encoder encoder2 = encoder;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(encoder2.getEncodedLength(i10));
        try {
            encoder2.encode(bArr, i3, i10, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new EncoderException(u.r(e10, new StringBuilder(StubApp.getString2(34989))), e10);
        }
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 8) * 5);
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new DecoderException(u.r(e10, new StringBuilder(StubApp.getString2(34988))), e10);
        }
    }

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((bArr.length / 8) * 5);
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new DecoderException(u.r(e10, new StringBuilder(StubApp.getString2(34987))), e10);
        }
    }
}
