package org.bouncycastle.util.encoders;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Hex {
    private static final HexEncoder encoder = new HexEncoder();

    public static int decode(String str, OutputStream outputStream) throws IOException {
        return encoder.decode(str, outputStream);
    }

    public static byte[] decodeStrict(String str) {
        try {
            return encoder.decodeStrict(str, 0, str.length());
        } catch (Exception e10) {
            throw new DecoderException(u.r(e10, new StringBuilder(StubApp.getString2(34999))), e10);
        }
    }

    public static int encode(byte[] bArr, int i3, int i10, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, i3, i10, outputStream);
    }

    public static String toHexString(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length);
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new DecoderException(u.r(e10, new StringBuilder(StubApp.getString2(34999))), e10);
        }
    }

    public static int encode(byte[] bArr, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static String toHexString(byte[] bArr, int i3, int i10) {
        return Strings.fromByteArray(encode(bArr, i3, i10));
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static byte[] encode(byte[] bArr, int i3, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.encode(bArr, i3, i10, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new EncoderException(u.r(e10, new StringBuilder(StubApp.getString2(35001))), e10);
        }
    }

    public static byte[] decodeStrict(String str, int i3, int i10) {
        try {
            return encoder.decodeStrict(str, i3, i10);
        } catch (Exception e10) {
            throw new DecoderException(u.r(e10, new StringBuilder(StubApp.getString2(34999))), e10);
        }
    }

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new DecoderException(u.r(e10, new StringBuilder(StubApp.getString2(35000))), e10);
        }
    }
}
