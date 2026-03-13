package org.bouncycastle.util.encoders;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HexEncoder implements Encoder {
    protected final byte[] encodingTable = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    protected final byte[] decodingTable = new byte[128];

    public HexEncoder() {
        initialiseDecodingTable();
    }

    private static boolean ignore(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[36];
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i3 < length) {
            while (i3 < length && ignore(str.charAt(i3))) {
                i3++;
            }
            int i12 = i3 + 1;
            byte b2 = this.decodingTable[str.charAt(i3)];
            while (i12 < length && ignore(str.charAt(i12))) {
                i12++;
            }
            int i13 = i12 + 1;
            byte b10 = this.decodingTable[str.charAt(i12)];
            if ((b2 | b10) < 0) {
                throw new IOException(StubApp.getString2(35002));
            }
            int i14 = i10 + 1;
            bArr[i10] = (byte) ((b2 << 4) | b10);
            if (i14 == 36) {
                outputStream.write(bArr);
                i10 = 0;
            } else {
                i10 = i14;
            }
            i11++;
            i3 = i13;
        }
        if (i10 > 0) {
            outputStream.write(bArr, 0, i10);
        }
        return i11;
    }

    public byte[] decodeStrict(String str, int i3, int i10) throws IOException {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(35006));
        }
        if (i3 < 0 || i10 < 0 || i3 > str.length() - i10) {
            throw new IndexOutOfBoundsException(StubApp.getString2(35005));
        }
        if ((i10 & 1) != 0) {
            throw new IOException(StubApp.getString2(35004));
        }
        int i11 = i10 >>> 1;
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i3 + 1;
            byte b2 = this.decodingTable[str.charAt(i3)];
            i3 += 2;
            int i14 = (b2 << 4) | this.decodingTable[str.charAt(i13)];
            if (i14 < 0) {
                throw new IOException(StubApp.getString2(35002));
            }
            bArr[i12] = (byte) i14;
        }
        return bArr;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i3, int i10, OutputStream outputStream) throws IOException {
        if (i10 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i11 = i3;
        int i12 = i10;
        while (i12 > 0) {
            int min = Math.min(36, i12);
            byte[] bArr3 = bArr;
            outputStream.write(bArr2, 0, encode(bArr3, i11, min, bArr2, 0));
            i11 += min;
            i12 -= min;
            bArr = bArr3;
        }
        return i10 * 2;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i3) {
        return i3 * 2;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i3) {
        return i3 / 2;
    }

    public void initialiseDecodingTable() {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i10 >= bArr.length) {
                break;
            }
            bArr[i10] = -1;
            i10++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i3 >= bArr2.length) {
                byte[] bArr3 = this.decodingTable;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.decodingTable[bArr2[i3]] = (byte) i3;
            i3++;
        }
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i3, int i10, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[36];
        int i11 = i10 + i3;
        while (i11 > i3 && ignore((char) bArr[i11 - 1])) {
            i11--;
        }
        int i12 = 0;
        int i13 = 0;
        while (i3 < i11) {
            while (i3 < i11 && ignore((char) bArr[i3])) {
                i3++;
            }
            int i14 = i3 + 1;
            byte b2 = this.decodingTable[bArr[i3]];
            while (i14 < i11 && ignore((char) bArr[i14])) {
                i14++;
            }
            int i15 = i14 + 1;
            byte b10 = this.decodingTable[bArr[i14]];
            if ((b2 | b10) < 0) {
                throw new IOException(StubApp.getString2(35003));
            }
            int i16 = i12 + 1;
            bArr2[i12] = (byte) ((b2 << 4) | b10);
            if (i16 == 36) {
                outputStream.write(bArr2);
                i12 = 0;
            } else {
                i12 = i16;
            }
            i13++;
            i3 = i15;
        }
        if (i12 > 0) {
            outputStream.write(bArr2, 0, i12);
        }
        return i13;
    }

    public int encode(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws IOException {
        int i12 = i10 + i3;
        int i13 = i11;
        while (i3 < i12) {
            int i14 = i3 + 1;
            byte b2 = bArr[i3];
            int i15 = b2 & UByte.MAX_VALUE;
            int i16 = i13 + 1;
            byte[] bArr3 = this.encodingTable;
            bArr2[i13] = bArr3[i15 >>> 4];
            i13 += 2;
            bArr2[i16] = bArr3[b2 & 15];
            i3 = i14;
        }
        return i13 - i11;
    }
}
