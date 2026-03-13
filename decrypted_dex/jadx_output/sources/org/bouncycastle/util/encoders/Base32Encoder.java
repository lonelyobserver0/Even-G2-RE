package org.bouncycastle.util.encoders;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.UByte;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Base32Encoder implements Encoder {
    private static final byte[] DEAULT_ENCODING_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    private static final byte DEFAULT_PADDING = 61;
    private final byte[] decodingTable;
    private final byte[] encodingTable;
    private final byte padding;

    public Base32Encoder() {
        this.decodingTable = new byte[128];
        this.encodingTable = DEAULT_ENCODING_TABLE;
        this.padding = (byte) 61;
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17) throws IOException {
        char c18 = this.padding;
        String string2 = StubApp.getString2(34991);
        if (c17 != c18) {
            byte[] bArr = this.decodingTable;
            byte b2 = bArr[c10];
            byte b10 = bArr[c11];
            byte b11 = bArr[c12];
            byte b12 = bArr[c13];
            byte b13 = bArr[c14];
            byte b14 = bArr[c15];
            byte b15 = bArr[c16];
            byte b16 = bArr[c17];
            if ((b2 | b10 | b11 | b12 | b13 | b14 | b15 | b16) < 0) {
                throw new IOException(string2);
            }
            outputStream.write((b2 << 3) | (b10 >> 2));
            outputStream.write((b10 << 6) | (b11 << 1) | (b12 >> 4));
            outputStream.write((b12 << 4) | (b13 >> 1));
            outputStream.write((b13 << 7) | (b14 << 2) | (b15 >> 3));
            outputStream.write((b15 << 5) | b16);
            return 5;
        }
        if (c16 != c18) {
            byte[] bArr2 = this.decodingTable;
            byte b17 = bArr2[c10];
            byte b18 = bArr2[c11];
            byte b19 = bArr2[c12];
            byte b20 = bArr2[c13];
            byte b21 = bArr2[c14];
            byte b22 = bArr2[c15];
            byte b23 = bArr2[c16];
            if ((b17 | b18 | b19 | b20 | b21 | b22 | b23) < 0) {
                throw new IOException(string2);
            }
            outputStream.write((b17 << 3) | (b18 >> 2));
            outputStream.write((b18 << 6) | (b19 << 1) | (b20 >> 4));
            outputStream.write((b20 << 4) | (b21 >> 1));
            outputStream.write((b21 << 7) | (b22 << 2) | (b23 >> 3));
            return 4;
        }
        if (c15 != c18) {
            throw new IOException(string2);
        }
        if (c14 != c18) {
            byte[] bArr3 = this.decodingTable;
            byte b24 = bArr3[c10];
            byte b25 = bArr3[c11];
            byte b26 = bArr3[c12];
            byte b27 = bArr3[c13];
            byte b28 = bArr3[c14];
            if ((b24 | b25 | b26 | b27 | b28) < 0) {
                throw new IOException(string2);
            }
            outputStream.write((b24 << 3) | (b25 >> 2));
            outputStream.write((b25 << 6) | (b26 << 1) | (b27 >> 4));
            outputStream.write((b27 << 4) | (b28 >> 1));
            return 3;
        }
        if (c13 == c18) {
            if (c12 != c18) {
                throw new IOException(string2);
            }
            byte[] bArr4 = this.decodingTable;
            byte b29 = bArr4[c10];
            byte b30 = bArr4[c11];
            if ((b29 | b30) < 0) {
                throw new IOException(string2);
            }
            outputStream.write((b29 << 3) | (b30 >> 2));
            return 1;
        }
        byte[] bArr5 = this.decodingTable;
        byte b31 = bArr5[c10];
        byte b32 = bArr5[c11];
        byte b33 = bArr5[c12];
        byte b34 = bArr5[c13];
        if ((b31 | b32 | b33 | b34) < 0) {
            throw new IOException(string2);
        }
        outputStream.write((b31 << 3) | (b32 >> 2));
        outputStream.write((b32 << 6) | (b33 << 1) | (b34 >> 4));
        return 2;
    }

    private void encodeBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        byte b2 = bArr[i3];
        int i11 = bArr[i3 + 1] & UByte.MAX_VALUE;
        int i12 = bArr[i3 + 2] & UByte.MAX_VALUE;
        int i13 = bArr[i3 + 3] & UByte.MAX_VALUE;
        byte b10 = bArr[i3 + 4];
        int i14 = b10 & UByte.MAX_VALUE;
        byte[] bArr3 = this.encodingTable;
        bArr2[i10] = bArr3[(b2 >>> 3) & 31];
        bArr2[i10 + 1] = bArr3[((b2 << 2) | (i11 >>> 6)) & 31];
        bArr2[i10 + 2] = bArr3[(i11 >>> 1) & 31];
        bArr2[i10 + 3] = bArr3[((i11 << 4) | (i12 >>> 4)) & 31];
        bArr2[i10 + 4] = bArr3[((i12 << 1) | (i13 >>> 7)) & 31];
        bArr2[i10 + 5] = bArr3[(i13 >>> 2) & 31];
        bArr2[i10 + 6] = bArr3[((i14 >>> 5) | (i13 << 3)) & 31];
        bArr2[i10 + 7] = bArr3[b10 & 31];
    }

    private boolean ignore(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    private int nextI(byte[] bArr, int i3, int i10) {
        while (i3 < i10 && ignore((char) bArr[i3])) {
            i3++;
        }
        return i3;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        byte[] byteArray = Strings.toByteArray(str);
        return decode(byteArray, 0, byteArray.length, outputStream);
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
            int min = Math.min(45, i12);
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
        return ((i3 + 4) / 5) * 8;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i3) {
        return (i3 / 8) * 5;
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

    public Base32Encoder(byte[] bArr, byte b2) {
        this.decodingTable = new byte[128];
        if (bArr.length != 32) {
            throw new IllegalArgumentException(StubApp.getString2(34990));
        }
        this.encodingTable = Arrays.clone(bArr);
        this.padding = b2;
        initialiseDecodingTable();
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i3, int i10, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[55];
        int i11 = i3 + i10;
        while (i11 > i3 && ignore((char) bArr[i11 - 1])) {
            i11--;
        }
        if (i11 == 0) {
            return 0;
        }
        int i12 = i11;
        int i13 = 0;
        while (i12 > i3 && i13 != 8) {
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
            int nextI5 = nextI(bArr, i19, i12);
            int i20 = nextI5 + 1;
            byte b13 = this.decodingTable[bArr[nextI5]];
            int nextI6 = nextI(bArr, i20, i12);
            int i21 = nextI6 + 1;
            byte b14 = this.decodingTable[bArr[nextI6]];
            int nextI7 = nextI(bArr, i21, i12);
            int i22 = nextI7 + 1;
            byte b15 = this.decodingTable[bArr[nextI7]];
            int nextI8 = nextI(bArr, i22, i12);
            int i23 = nextI8 + 1;
            byte b16 = this.decodingTable[bArr[nextI8]];
            if ((b2 | b10 | b11 | b12 | b13 | b14 | b15 | b16) < 0) {
                throw new IOException(StubApp.getString2(34992));
            }
            bArr2[i14] = (byte) ((b2 << 3) | (b10 >> 2));
            bArr2[i14 + 1] = (byte) ((b10 << 6) | (b11 << 1) | (b12 >> 4));
            bArr2[i14 + 2] = (byte) ((b12 << 4) | (b13 >> 1));
            int i24 = i14 + 4;
            bArr2[i14 + 3] = (byte) ((b14 << 2) | (b13 << 7) | (b15 >> 3));
            i14 += 5;
            bArr2[i24] = (byte) ((b15 << 5) | b16);
            if (i14 == 55) {
                outputStream.write(bArr2);
                i14 = 0;
            }
            i15 += 5;
            nextI = nextI(bArr, i23, i12);
        }
        if (i14 > 0) {
            outputStream.write(bArr2, 0, i14);
        }
        int nextI9 = nextI(bArr, nextI, i11);
        int nextI10 = nextI(bArr, nextI9 + 1, i11);
        int nextI11 = nextI(bArr, nextI10 + 1, i11);
        int nextI12 = nextI(bArr, nextI11 + 1, i11);
        int nextI13 = nextI(bArr, nextI12 + 1, i11);
        int nextI14 = nextI(bArr, nextI13 + 1, i11);
        int nextI15 = nextI(bArr, nextI14 + 1, i11);
        return i15 + decodeLastBlock(outputStream, (char) bArr[nextI9], (char) bArr[nextI10], (char) bArr[nextI11], (char) bArr[nextI12], (char) bArr[nextI13], (char) bArr[nextI14], (char) bArr[nextI15], (char) bArr[nextI(bArr, nextI15 + 1, i11)]);
    }

    public int encode(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws IOException {
        int i12 = (i3 + i10) - 4;
        int i13 = i3;
        int i14 = i11;
        while (i13 < i12) {
            encodeBlock(bArr, i13, bArr2, i14);
            i13 += 5;
            i14 += 8;
        }
        int i15 = i10 - (i13 - i3);
        if (i15 > 0) {
            byte[] bArr3 = new byte[5];
            System.arraycopy(bArr, i13, bArr3, 0, i15);
            encodeBlock(bArr3, 0, bArr2, i14);
            if (i15 == 1) {
                byte b2 = this.padding;
                bArr2[i14 + 2] = b2;
                bArr2[i14 + 3] = b2;
                bArr2[i14 + 4] = b2;
                bArr2[i14 + 5] = b2;
                bArr2[i14 + 6] = b2;
                bArr2[i14 + 7] = b2;
            } else if (i15 == 2) {
                byte b10 = this.padding;
                bArr2[i14 + 4] = b10;
                bArr2[i14 + 5] = b10;
                bArr2[i14 + 6] = b10;
                bArr2[i14 + 7] = b10;
            } else if (i15 == 3) {
                byte b11 = this.padding;
                bArr2[i14 + 5] = b11;
                bArr2[i14 + 6] = b11;
                bArr2[i14 + 7] = b11;
            } else if (i15 == 4) {
                bArr2[i14 + 7] = this.padding;
            }
            i14 += 8;
        }
        return i14 - i11;
    }
}
