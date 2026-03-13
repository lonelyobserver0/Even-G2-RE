package org.bouncycastle.util.encoders;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Base64Encoder implements Encoder {
    protected final byte[] encodingTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected byte padding = kotlin.io.encoding.Base64.padSymbol;
    protected final byte[] decodingTable = new byte[128];

    public Base64Encoder() {
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c10, char c11, char c12, char c13) throws IOException {
        char c14 = this.padding;
        String string2 = StubApp.getString2(34996);
        if (c12 == c14) {
            if (c13 != c14) {
                throw new IOException(string2);
            }
            byte[] bArr = this.decodingTable;
            byte b2 = bArr[c10];
            byte b10 = bArr[c11];
            if ((b2 | b10) < 0) {
                throw new IOException(string2);
            }
            outputStream.write((b2 << 2) | (b10 >> 4));
            return 1;
        }
        if (c13 == c14) {
            byte[] bArr2 = this.decodingTable;
            byte b11 = bArr2[c10];
            byte b12 = bArr2[c11];
            byte b13 = bArr2[c12];
            if ((b11 | b12 | b13) < 0) {
                throw new IOException(string2);
            }
            outputStream.write((b11 << 2) | (b12 >> 4));
            outputStream.write((b12 << 4) | (b13 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b14 = bArr3[c10];
        byte b15 = bArr3[c11];
        byte b16 = bArr3[c12];
        byte b17 = bArr3[c13];
        if ((b14 | b15 | b16 | b17) < 0) {
            throw new IOException(string2);
        }
        outputStream.write((b14 << 2) | (b15 >> 4));
        outputStream.write((b15 << 4) | (b16 >> 2));
        outputStream.write((b16 << 6) | b17);
        return 3;
    }

    private boolean ignore(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    private int nextI(String str, int i3, int i10) {
        while (i3 < i10 && ignore(str.charAt(i3))) {
            i3++;
        }
        return i3;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i3 = length;
        int i10 = 0;
        while (i3 > 0 && i10 != 4) {
            if (!ignore(str.charAt(i3 - 1))) {
                i10++;
            }
            i3--;
        }
        int nextI = nextI(str, 0, i3);
        int i11 = 0;
        int i12 = 0;
        while (nextI < i3) {
            int i13 = nextI + 1;
            byte b2 = this.decodingTable[str.charAt(nextI)];
            int nextI2 = nextI(str, i13, i3);
            int i14 = nextI2 + 1;
            byte b10 = this.decodingTable[str.charAt(nextI2)];
            int nextI3 = nextI(str, i14, i3);
            int i15 = nextI3 + 1;
            byte b11 = this.decodingTable[str.charAt(nextI3)];
            int nextI4 = nextI(str, i15, i3);
            int i16 = nextI4 + 1;
            byte b12 = this.decodingTable[str.charAt(nextI4)];
            if ((b2 | b10 | b11 | b12) < 0) {
                throw new IOException(StubApp.getString2(34997));
            }
            bArr[i11] = (byte) ((b2 << 2) | (b10 >> 4));
            int i17 = i11 + 2;
            bArr[i11 + 1] = (byte) ((b10 << 4) | (b11 >> 2));
            i11 += 3;
            bArr[i17] = (byte) ((b11 << 6) | b12);
            i12 += 3;
            if (i11 == 54) {
                outputStream.write(bArr);
                i11 = 0;
            }
            nextI = nextI(str, i16, i3);
        }
        if (i11 > 0) {
            outputStream.write(bArr, 0, i11);
        }
        int nextI5 = nextI(str, nextI, length);
        int nextI6 = nextI(str, nextI5 + 1, length);
        int nextI7 = nextI(str, nextI6 + 1, length);
        return i12 + decodeLastBlock(outputStream, str.charAt(nextI5), str.charAt(nextI6), str.charAt(nextI7), str.charAt(nextI(str, nextI7 + 1, length)));
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
            int min = Math.min(54, i12);
            byte[] bArr3 = bArr;
            outputStream.write(bArr2, 0, encode(bArr3, i11, min, bArr2, 0));
            i11 += min;
            i12 -= min;
            bArr = bArr3;
        }
        return ((i10 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i3) {
        return ((i3 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i3) {
        return (i3 / 4) * 3;
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
                return;
            }
            this.decodingTable[bArr2[i3]] = (byte) i3;
            i3++;
        }
    }

    private int nextI(byte[] bArr, int i3, int i10) {
        while (i3 < i10 && ignore((char) bArr[i3])) {
            i3++;
        }
        return i3;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i3, int i10, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[54];
        int i11 = i3 + i10;
        while (i11 > i3 && ignore((char) bArr[i11 - 1])) {
            i11--;
        }
        if (i11 == 0) {
            return 0;
        }
        int i12 = i11;
        int i13 = 0;
        while (i12 > i3 && i13 != 4) {
            if (!ignore((char) bArr[i12 - 1])) {
                i13++;
            }
            i12--;
        }
        int nextI = nextI(bArr, i3, i12);
        int i14 = 0;
        int i15 = 0;
        while (nextI < i12) {
            int i16 = nextI + 1;
            byte b2 = this.decodingTable[bArr[nextI]];
            int nextI2 = nextI(bArr, i16, i12);
            int i17 = nextI2 + 1;
            byte b10 = this.decodingTable[bArr[nextI2]];
            int nextI3 = nextI(bArr, i17, i12);
            int i18 = nextI3 + 1;
            byte b11 = this.decodingTable[bArr[nextI3]];
            int nextI4 = nextI(bArr, i18, i12);
            int i19 = nextI4 + 1;
            byte b12 = this.decodingTable[bArr[nextI4]];
            if ((b2 | b10 | b11 | b12) < 0) {
                throw new IOException(StubApp.getString2(34997));
            }
            bArr2[i14] = (byte) ((b2 << 2) | (b10 >> 4));
            int i20 = i14 + 2;
            bArr2[i14 + 1] = (byte) ((b10 << 4) | (b11 >> 2));
            i14 += 3;
            bArr2[i20] = (byte) ((b11 << 6) | b12);
            if (i14 == 54) {
                outputStream.write(bArr2);
                i14 = 0;
            }
            i15 += 3;
            nextI = nextI(bArr, i19, i12);
        }
        if (i14 > 0) {
            outputStream.write(bArr2, 0, i14);
        }
        int nextI5 = nextI(bArr, nextI, i11);
        int nextI6 = nextI(bArr, nextI5 + 1, i11);
        int nextI7 = nextI(bArr, nextI6 + 1, i11);
        return i15 + decodeLastBlock(outputStream, (char) bArr[nextI5], (char) bArr[nextI6], (char) bArr[nextI7], (char) bArr[nextI(bArr, nextI7 + 1, i11)]);
    }

    public int encode(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws IOException {
        int i12 = (i3 + i10) - 2;
        int i13 = i3;
        int i14 = i11;
        while (i13 < i12) {
            byte b2 = bArr[i13];
            int i15 = i13 + 2;
            int i16 = bArr[i13 + 1] & UByte.MAX_VALUE;
            i13 += 3;
            byte b10 = bArr[i15];
            int i17 = b10 & UByte.MAX_VALUE;
            byte[] bArr3 = this.encodingTable;
            bArr2[i14] = bArr3[(b2 >>> 2) & 63];
            bArr2[i14 + 1] = bArr3[((b2 << 4) | (i16 >>> 4)) & 63];
            int i18 = i14 + 3;
            bArr2[i14 + 2] = bArr3[((i16 << 2) | (i17 >>> 6)) & 63];
            i14 += 4;
            bArr2[i18] = bArr3[b10 & 63];
        }
        int i19 = i10 - (i13 - i3);
        if (i19 == 1) {
            int i20 = bArr[i13] & UByte.MAX_VALUE;
            byte[] bArr4 = this.encodingTable;
            bArr2[i14] = bArr4[(i20 >>> 2) & 63];
            bArr2[i14 + 1] = bArr4[(i20 << 4) & 63];
            int i21 = i14 + 3;
            byte b11 = this.padding;
            bArr2[i14 + 2] = b11;
            i14 += 4;
            bArr2[i21] = b11;
        } else if (i19 == 2) {
            int i22 = bArr[i13] & UByte.MAX_VALUE;
            int i23 = bArr[i13 + 1] & UByte.MAX_VALUE;
            byte[] bArr5 = this.encodingTable;
            bArr2[i14] = bArr5[(i22 >>> 2) & 63];
            bArr2[i14 + 1] = bArr5[((i22 << 4) | (i23 >>> 4)) & 63];
            int i24 = i14 + 3;
            bArr2[i14 + 2] = bArr5[(i23 << 2) & 63];
            i14 += 4;
            bArr2[i24] = this.padding;
        }
        return i14 - i11;
    }
}
