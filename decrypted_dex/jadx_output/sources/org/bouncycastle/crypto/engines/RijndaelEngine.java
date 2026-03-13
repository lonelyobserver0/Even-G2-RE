package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import java.lang.reflect.Array;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RijndaelEngine implements BlockCipher {
    private static final int MAXKC = 64;
    private static final int MAXROUNDS = 14;

    /* renamed from: A0, reason: collision with root package name */
    private long f18956A0;

    /* renamed from: A1, reason: collision with root package name */
    private long f18957A1;

    /* renamed from: A2, reason: collision with root package name */
    private long f18958A2;

    /* renamed from: A3, reason: collision with root package name */
    private long f18959A3;
    private int BC;
    private long BC_MASK;
    private int ROUNDS;
    private int blockBits;
    private boolean forEncryption;
    private byte[] shifts0SC;
    private byte[] shifts1SC;
    private long[][] workingKey;
    private static final byte[] logtable = {0, 0, 25, 1, 50, 2, 26, -58, 75, -57, 27, 104, 51, -18, -33, 3, 100, 4, -32, 14, 52, -115, -127, -17, 76, 113, 8, -56, -8, 105, 28, -63, 125, -62, 29, -75, -7, -71, 39, 106, 77, -28, -90, 114, -102, -55, 9, 120, 101, 47, -118, 5, 33, 15, -31, 36, 18, -16, -126, 69, 53, -109, -38, -114, -106, -113, -37, -67, 54, -48, -50, -108, 19, 92, -46, -15, 64, 70, -125, 56, 102, -35, -3, 48, -65, 6, -117, 98, -77, 37, -30, -104, 34, -120, -111, Tnaf.POW_2_WIDTH, 126, 110, 72, -61, -93, -74, 30, 66, 58, 107, 40, 84, -6, -123, Base64.padSymbol, -70, 43, 121, 10, 21, -101, -97, 94, -54, 78, -44, -84, -27, -13, 115, -89, 87, -81, 88, -88, 80, -12, -22, -42, 116, 79, -82, -23, -43, -25, -26, -83, -24, 44, -41, 117, 122, -21, 22, 11, -11, 89, -53, 95, -80, -100, -87, 81, -96, ByteCompanionObject.MAX_VALUE, 12, -10, 111, 23, -60, 73, -20, -40, 67, 31, 45, -92, 118, 123, -73, -52, -69, 62, 90, -5, 96, -79, -122, 59, 82, -95, 108, -86, 85, 41, -99, -105, -78, -121, -112, 97, -66, -36, -4, PSSSigner.TRAILER_IMPLICIT, -107, -49, -51, 55, 63, 91, -47, 83, 57, -124, 60, 65, -94, 109, 71, 20, 42, -98, 93, 86, -14, -45, -85, 68, 17, -110, -39, 35, 32, 46, -119, -76, 124, -72, 38, 119, -103, -29, -91, 103, 74, -19, -34, -59, 49, -2, 24, 13, 99, -116, ByteCompanionObject.MIN_VALUE, -64, -9, 112, 7};
    private static final byte[] aLogtable = {0, 3, 5, 15, 17, 51, 85, -1, 26, 46, 114, -106, -95, -8, 19, 53, 95, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, 30, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, ByteCompanionObject.MAX_VALUE, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, Tnaf.POW_2_WIDTH, 48, 80, -16, 11, 29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 58, 78, -46, 109, -73, -62, 93, -25, 50, 86, -6, 21, 63, 65, -61, 94, -30, Base64.padSymbol, 71, -55, 64, -64, 91, -19, 44, 116, -100, -65, -38, 117, -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, PSSSigner.TRAILER_IMPLICIT, -33, 122, -114, -119, ByteCompanionObject.MIN_VALUE, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, 31, 33, 99, -91, -12, 7, 9, 27, 45, 119, -103, -80, -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, 36, 108, -76, -57, 82, -10, 1, 3, 5, 15, 17, 51, 85, -1, 26, 46, 114, -106, -95, -8, 19, 53, 95, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, 30, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, ByteCompanionObject.MAX_VALUE, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, Tnaf.POW_2_WIDTH, 48, 80, -16, 11, 29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 58, 78, -46, 109, -73, -62, 93, -25, 50, 86, -6, 21, 63, 65, -61, 94, -30, Base64.padSymbol, 71, -55, 64, -64, 91, -19, 44, 116, -100, -65, -38, 117, -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, PSSSigner.TRAILER_IMPLICIT, -33, 122, -114, -119, ByteCompanionObject.MIN_VALUE, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, 31, 33, 99, -91, -12, 7, 9, 27, 45, 119, -103, -80, -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, 36, 108, -76, -57, 82, -10, 1};

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f18955S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, ByteCompanionObject.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, ByteCompanionObject.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, Tnaf.POW_2_WIDTH, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};
    private static final byte[] Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, Base64.padSymbol, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, Tnaf.POW_2_WIDTH, 89, 39, ByteCompanionObject.MIN_VALUE, -20, 95, 96, 81, ByteCompanionObject.MAX_VALUE, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};
    static byte[][] shifts0 = {new byte[]{0, 8, Tnaf.POW_2_WIDTH, 24}, new byte[]{0, 8, Tnaf.POW_2_WIDTH, 24}, new byte[]{0, 8, Tnaf.POW_2_WIDTH, 24}, new byte[]{0, 8, Tnaf.POW_2_WIDTH, 32}, new byte[]{0, 8, 24, 32}};
    static byte[][] shifts1 = {new byte[]{0, 24, Tnaf.POW_2_WIDTH, 8}, new byte[]{0, 32, 24, Tnaf.POW_2_WIDTH}, new byte[]{0, 40, 32, 24}, new byte[]{0, 48, 40, 24}, new byte[]{0, 56, 40, 32}};

    public RijndaelEngine() {
        this(128);
    }

    private void InvMixColumn() {
        long j = 0;
        long j3 = 0;
        long j10 = 0;
        long j11 = 0;
        for (int i3 = 0; i3 < this.BC; i3 += 8) {
            int i10 = (int) ((this.f18956A0 >> i3) & 255);
            int i11 = (int) ((this.f18957A1 >> i3) & 255);
            int i12 = (int) ((this.f18958A2 >> i3) & 255);
            int i13 = (int) ((this.f18959A3 >> i3) & 255);
            int i14 = -1;
            int i15 = i10 != 0 ? logtable[i10 & 255] & UByte.MAX_VALUE : -1;
            int i16 = i11 != 0 ? logtable[i11 & 255] & UByte.MAX_VALUE : -1;
            int i17 = i12 != 0 ? logtable[i12 & 255] & UByte.MAX_VALUE : -1;
            if (i13 != 0) {
                i14 = logtable[i13 & 255] & UByte.MAX_VALUE;
            }
            j |= ((((mul0xe(i15) ^ mul0xb(i16)) ^ mul0xd(i17)) ^ mul0x9(i14)) & 255) << i3;
            j11 |= ((((mul0xe(i16) ^ mul0xb(i17)) ^ mul0xd(i14)) ^ mul0x9(i15)) & 255) << i3;
            j3 |= ((((mul0xe(i17) ^ mul0xb(i14)) ^ mul0xd(i15)) ^ mul0x9(i16)) & 255) << i3;
            j10 = (((((mul0xe(i14) ^ mul0xb(i15)) ^ mul0xd(i16)) ^ mul0x9(i17)) & 255) << i3) | j10;
        }
        this.f18956A0 = j;
        this.f18957A1 = j11;
        this.f18958A2 = j3;
        this.f18959A3 = j10;
    }

    private void KeyAddition(long[] jArr) {
        this.f18956A0 ^= jArr[0];
        this.f18957A1 ^= jArr[1];
        this.f18958A2 ^= jArr[2];
        this.f18959A3 ^= jArr[3];
    }

    private void MixColumn() {
        long j = 0;
        long j3 = 0;
        long j10 = 0;
        long j11 = 0;
        for (int i3 = 0; i3 < this.BC; i3 += 8) {
            int i10 = (int) ((this.f18956A0 >> i3) & 255);
            int i11 = (int) ((this.f18957A1 >> i3) & 255);
            int i12 = (int) ((this.f18958A2 >> i3) & 255);
            int i13 = (int) ((this.f18959A3 >> i3) & 255);
            j |= ((((mul0x2(i10) ^ mul0x3(i11)) ^ i12) ^ i13) & 255) << i3;
            j11 |= ((((mul0x2(i11) ^ mul0x3(i12)) ^ i13) ^ i10) & 255) << i3;
            j3 |= ((((mul0x2(i12) ^ mul0x3(i13)) ^ i10) ^ i11) & 255) << i3;
            j10 = (((((mul0x2(i13) ^ mul0x3(i10)) ^ i11) ^ i12) & 255) << i3) | j10;
        }
        this.f18956A0 = j;
        this.f18957A1 = j11;
        this.f18958A2 = j3;
        this.f18959A3 = j10;
    }

    private void ShiftRow(byte[] bArr) {
        this.f18957A1 = shift(this.f18957A1, bArr[1]);
        this.f18958A2 = shift(this.f18958A2, bArr[2]);
        this.f18959A3 = shift(this.f18959A3, bArr[3]);
    }

    private void Substitution(byte[] bArr) {
        this.f18956A0 = applyS(this.f18956A0, bArr);
        this.f18957A1 = applyS(this.f18957A1, bArr);
        this.f18958A2 = applyS(this.f18958A2, bArr);
        this.f18959A3 = applyS(this.f18959A3, bArr);
    }

    private long applyS(long j, byte[] bArr) {
        long j3 = 0;
        for (int i3 = 0; i3 < this.BC; i3 += 8) {
            j3 |= (bArr[(int) ((j >> i3) & 255)] & UByte.MAX_VALUE) << i3;
        }
        return j3;
    }

    private void decryptBlock(long[][] jArr) {
        KeyAddition(jArr[this.ROUNDS]);
        Substitution(Si);
        ShiftRow(this.shifts1SC);
        for (int i3 = this.ROUNDS - 1; i3 > 0; i3--) {
            KeyAddition(jArr[i3]);
            InvMixColumn();
            Substitution(Si);
            ShiftRow(this.shifts1SC);
        }
        KeyAddition(jArr[0]);
    }

    private void encryptBlock(long[][] jArr) {
        KeyAddition(jArr[0]);
        for (int i3 = 1; i3 < this.ROUNDS; i3++) {
            Substitution(f18955S);
            ShiftRow(this.shifts0SC);
            MixColumn();
            KeyAddition(jArr[i3]);
        }
        Substitution(f18955S);
        ShiftRow(this.shifts0SC);
        KeyAddition(jArr[this.ROUNDS]);
    }

    private long[][] generateWorkingKey(byte[] bArr) {
        int i3;
        int i10 = 8;
        int length = bArr.length * 8;
        int i11 = 1;
        int i12 = 0;
        int i13 = 4;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 64);
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 15, 4);
        if (length == 128) {
            i3 = 4;
        } else if (length == 160) {
            i3 = 5;
        } else if (length == 192) {
            i3 = 6;
        } else if (length == 224) {
            i3 = 7;
        } else {
            if (length != 256) {
                throw new IllegalArgumentException(StubApp.getString2(28738));
            }
            i3 = 8;
        }
        this.ROUNDS = length >= this.blockBits ? i3 + 6 : (this.BC / 8) + 6;
        int i14 = 0;
        int i15 = 0;
        while (i14 < bArr.length) {
            bArr2[i14 % 4][i14 / 4] = bArr[i15];
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < i3 && i17 < (this.BC / i10) * (this.ROUNDS + i11)) {
            int i18 = i12;
            while (i18 < 4) {
                int i19 = this.BC;
                long[] jArr2 = jArr[i17 / (i19 / 8)];
                jArr2[i18] = ((bArr2[i18][i16] & UByte.MAX_VALUE) << ((i17 * 8) % i19)) | jArr2[i18];
                i18++;
                i11 = i11;
                i10 = i10;
                i12 = i12;
            }
            i16++;
            i17++;
        }
        int i20 = i11;
        int i21 = i12;
        int i22 = i21;
        while (i17 < (this.BC / 8) * (this.ROUNDS + 1)) {
            int i23 = i21;
            while (i23 < i13) {
                byte[] bArr3 = bArr2[i23];
                i23++;
                bArr3[i21] = (byte) (bArr3[i21] ^ f18955S[bArr2[i23 % 4][i3 - 1] & UByte.MAX_VALUE]);
            }
            byte[] bArr4 = bArr2[i21];
            int i24 = i22 + 1;
            bArr4[i21] = (byte) (rcon[i22] ^ bArr4[i21]);
            int i25 = i20;
            if (i3 <= 6) {
                while (i25 < i3) {
                    for (int i26 = i21; i26 < i13; i26++) {
                        byte[] bArr5 = bArr2[i26];
                        bArr5[i25] = (byte) (bArr5[i25] ^ bArr5[i25 - 1]);
                    }
                    i25++;
                }
            } else {
                while (i25 < i13) {
                    for (int i27 = i21; i27 < i13; i27++) {
                        byte[] bArr6 = bArr2[i27];
                        bArr6[i25] = (byte) (bArr6[i25] ^ bArr6[i25 - 1]);
                    }
                    i25++;
                }
                for (int i28 = i21; i28 < i13; i28++) {
                    byte[] bArr7 = bArr2[i28];
                    bArr7[i13] = (byte) (bArr7[i13] ^ f18955S[bArr7[3] & UByte.MAX_VALUE]);
                }
                for (int i29 = 5; i29 < i3; i29++) {
                    for (int i30 = i21; i30 < i13; i30++) {
                        byte[] bArr8 = bArr2[i30];
                        bArr8[i29] = (byte) (bArr8[i29] ^ bArr8[i29 - 1]);
                    }
                }
            }
            int i31 = i21;
            while (i31 < i3 && i17 < (this.BC / 8) * (this.ROUNDS + 1)) {
                int i32 = i21;
                while (i32 < i13) {
                    int i33 = this.BC;
                    long[] jArr3 = jArr[i17 / (i33 / 8)];
                    jArr3[i32] = ((bArr2[i32][i31] & UByte.MAX_VALUE) << ((i17 * 8) % i33)) | jArr3[i32];
                    i32++;
                    i3 = i3;
                    i13 = 4;
                }
                i31++;
                i17++;
                i13 = 4;
            }
            i22 = i24;
            i3 = i3;
            i13 = 4;
        }
        return jArr;
    }

    private byte mul0x2(int i3) {
        if (i3 != 0) {
            return aLogtable[(logtable[i3] & UByte.MAX_VALUE) + 25];
        }
        return (byte) 0;
    }

    private byte mul0x3(int i3) {
        if (i3 != 0) {
            return aLogtable[(logtable[i3] & UByte.MAX_VALUE) + 1];
        }
        return (byte) 0;
    }

    private byte mul0x9(int i3) {
        if (i3 >= 0) {
            return aLogtable[i3 + 199];
        }
        return (byte) 0;
    }

    private byte mul0xb(int i3) {
        if (i3 >= 0) {
            return aLogtable[i3 + 104];
        }
        return (byte) 0;
    }

    private byte mul0xd(int i3) {
        if (i3 >= 0) {
            return aLogtable[i3 + 238];
        }
        return (byte) 0;
    }

    private byte mul0xe(int i3) {
        if (i3 >= 0) {
            return aLogtable[i3 + 223];
        }
        return (byte) 0;
    }

    private void packBlock(byte[] bArr, int i3) {
        for (int i10 = 0; i10 != this.BC; i10 += 8) {
            bArr[i3] = (byte) (this.f18956A0 >> i10);
            bArr[i3 + 1] = (byte) (this.f18957A1 >> i10);
            int i11 = i3 + 3;
            bArr[i3 + 2] = (byte) (this.f18958A2 >> i10);
            i3 += 4;
            bArr[i11] = (byte) (this.f18959A3 >> i10);
        }
    }

    private long shift(long j, int i3) {
        return ((j << (this.BC - i3)) | (j >>> i3)) & this.BC_MASK;
    }

    private void unpackBlock(byte[] bArr, int i3) {
        this.f18956A0 = bArr[i3] & UByte.MAX_VALUE;
        this.f18957A1 = bArr[i3 + 1] & UByte.MAX_VALUE;
        int i10 = i3 + 3;
        this.f18958A2 = bArr[i3 + 2] & UByte.MAX_VALUE;
        int i11 = i3 + 4;
        this.f18959A3 = bArr[i10] & UByte.MAX_VALUE;
        for (int i12 = 8; i12 != this.BC; i12 += 8) {
            this.f18956A0 |= (bArr[i11] & UByte.MAX_VALUE) << i12;
            this.f18957A1 |= (bArr[i11 + 1] & UByte.MAX_VALUE) << i12;
            int i13 = i11 + 3;
            this.f18958A2 |= (bArr[i11 + 2] & UByte.MAX_VALUE) << i12;
            i11 += 4;
            this.f18959A3 |= (bArr[i13] & UByte.MAX_VALUE) << i12;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28739);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.BC / 2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28740), cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = generateWorkingKey(key);
        this.forEncryption = z2;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        if (this.workingKey == null) {
            throw new IllegalStateException(StubApp.getString2(28741));
        }
        int i11 = this.BC;
        if ((i11 / 2) + i3 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if ((i11 / 2) + i10 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        boolean z2 = this.forEncryption;
        unpackBlock(bArr, i3);
        long[][] jArr = this.workingKey;
        if (z2) {
            encryptBlock(jArr);
        } else {
            decryptBlock(jArr);
        }
        packBlock(bArr2, i10);
        return this.BC / 2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public RijndaelEngine(int i3) {
        if (i3 == 128) {
            this.BC = 32;
            this.BC_MASK = BodyPartID.bodyIdMax;
            this.shifts0SC = shifts0[0];
            this.shifts1SC = shifts1[0];
        } else if (i3 == 160) {
            this.BC = 40;
            this.BC_MASK = 1099511627775L;
            this.shifts0SC = shifts0[1];
            this.shifts1SC = shifts1[1];
        } else if (i3 == 192) {
            this.BC = 48;
            this.BC_MASK = 281474976710655L;
            this.shifts0SC = shifts0[2];
            this.shifts1SC = shifts1[2];
        } else if (i3 == 224) {
            this.BC = 56;
            this.BC_MASK = 72057594037927935L;
            this.shifts0SC = shifts0[3];
            this.shifts1SC = shifts1[3];
        } else {
            if (i3 != 256) {
                throw new IllegalArgumentException(StubApp.getString2(28737));
            }
            this.BC = 64;
            this.BC_MASK = -1L;
            this.shifts0SC = shifts0[4];
            this.shifts1SC = shifts1[4];
        }
        this.blockBits = i3;
    }
}
