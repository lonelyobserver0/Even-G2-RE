package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSTU7564Digest implements ExtendedDigest, Memoable {
    private static final int NB_1024 = 16;
    private static final int NB_512 = 8;
    private static final int NR_1024 = 14;
    private static final int NR_512 = 10;

    /* renamed from: S0, reason: collision with root package name */
    private static final byte[] f18781S0 = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, -16, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, 14, 31, -65, 21, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, -125, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, 15, PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, 52, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, 30, 34, 51, 36, 40, 54, -57, -78, 59, -114, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, 92, -38, 24, 70, -51, 125, 33, -80, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, 112, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, -116, 53, 3, -44, ByteCompanionObject.MAX_VALUE, -5, 5, -63, 94, -112, 32, Base64.padSymbol, -126, -9, -22, 10, 13, 126, -8, 80, 26, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, Tnaf.POW_2_WIDTH, -48, -39, 19, 12, 18, 41, 81, -71, -49, -42, 115, -115, -127, 84, -64, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, ByteCompanionObject.MIN_VALUE};

    /* renamed from: S1, reason: collision with root package name */
    private static final byte[] f18782S1 = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, -78, -46, -112, 23, -8, 66, 21, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, Tnaf.POW_2_WIDTH, -40, PSSSigner.TRAILER_IMPLICIT, 26, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, -114, 91, -52, 60, 25, -95, -127, 73, 123, -39, 111, 55, 96, -54, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, 95, 42, -38, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, Base64.padSymbol, 81, 125, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, -80, -104, 24, 50, 113, 75, -17, 59, 112, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, ByteCompanionObject.MIN_VALUE, 30, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, -16, 90, -19, -89, 102, 33, ByteCompanionObject.MAX_VALUE, -118, 39, -57, -64, 41, -41};

    /* renamed from: S2, reason: collision with root package name */
    private static final byte[] f18783S2 = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, 112, 22, -31, 73, 60, -64, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, Tnaf.POW_2_WIDTH, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, -127, -113, 119, -52, -100, -71, -30, -84, -72, 47, 21, -92, 124, -38, 56, 30, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, 96, -81, 94, 51, -121, -55, -16, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, ByteCompanionObject.MIN_VALUE, 41, 39, -49, -103, -88, 80, 15, 55, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, 31, 7, 28, -118, PSSSigner.TRAILER_IMPLICIT, 32, -21, -50, -114, -85, -18, 49, -94, 115, -7, -54, 58, 26, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, 27, 35, Base64.padSymbol, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, ByteCompanionObject.MAX_VALUE, -59, -89, -25, 97, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};

    /* renamed from: S3, reason: collision with root package name */
    private static final byte[] f18784S3 = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, 30, 25, 31, 34, 3, 70, Base64.padSymbol, 45, 74, 83, -125, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, 112, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, 58, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, -42, -123, 35, -49, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, 21, -3, 55, -66, 95, -86, -101, -120, -40, -85, -119, -100, -6, 96, -22, PSSSigner.TRAILER_IMPLICIT, 98, 12, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, Tnaf.POW_2_WIDTH, -15, 123, -113, 99, -96, 5, -102, 67, 119, 33, -65, 39, 9, -61, -97, -74, -41, 41, -62, -21, -64, -92, -117, -116, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, 53, -34, -76, -91, -4, ByteCompanionObject.MIN_VALUE, -17, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, -16, 89, -87, 76, 23, ByteCompanionObject.MAX_VALUE, -111, -72, -55, 87, 27, -32, 97};
    private int blockSize;
    private byte[] buf;
    private int bufOff;
    private int columns;
    private int hashSize;
    private long inputBlocks;
    private final CryptoServicePurpose purpose;
    private int rounds;
    private long[] state;
    private long[] tempState1;
    private long[] tempState2;

    public DSTU7564Digest(int i3) {
        this(i3, CryptoServicePurpose.ANY);
    }

    private void P(long[] jArr) {
        for (int i3 = 0; i3 < this.rounds; i3++) {
            long j = i3;
            for (int i10 = 0; i10 < this.columns; i10++) {
                jArr[i10] = jArr[i10] ^ j;
                j += 16;
            }
            shiftRows(jArr);
            subBytes(jArr);
            mixColumns(jArr);
        }
    }

    private void Q(long[] jArr) {
        for (int i3 = 0; i3 < this.rounds; i3++) {
            long j = ((((this.columns - 1) << 4) ^ i3) << 56) | 67818912035696883L;
            for (int i10 = 0; i10 < this.columns; i10++) {
                jArr[i10] = jArr[i10] + j;
                j -= 1152921504606846976L;
            }
            shiftRows(jArr);
            subBytes(jArr);
            mixColumns(jArr);
        }
    }

    private void copyIn(DSTU7564Digest dSTU7564Digest) {
        this.hashSize = dSTU7564Digest.hashSize;
        this.blockSize = dSTU7564Digest.blockSize;
        this.rounds = dSTU7564Digest.rounds;
        int i3 = this.columns;
        if (i3 <= 0 || i3 != dSTU7564Digest.columns) {
            this.columns = dSTU7564Digest.columns;
            this.state = Arrays.clone(dSTU7564Digest.state);
            int i10 = this.columns;
            this.tempState1 = new long[i10];
            this.tempState2 = new long[i10];
            this.buf = Arrays.clone(dSTU7564Digest.buf);
        } else {
            System.arraycopy(dSTU7564Digest.state, 0, this.state, 0, i3);
            System.arraycopy(dSTU7564Digest.buf, 0, this.buf, 0, this.blockSize);
        }
        this.inputBlocks = dSTU7564Digest.inputBlocks;
        this.bufOff = dSTU7564Digest.bufOff;
    }

    private static long mixColumn(long j) {
        long j3 = ((9187201950435737471L & j) << 1) ^ (((j & (-9187201950435737472L)) >>> 7) * 29);
        long rotate = rotate(8, j) ^ j;
        long rotate2 = (rotate ^ rotate(16, rotate)) ^ rotate(48, j);
        long j10 = (j ^ rotate2) ^ j3;
        return ((rotate(32, (((j10 & 4629771061636907072L) >>> 6) * 29) ^ (((((-9187201950435737472L) & j10) >>> 6) * 29) ^ ((4557430888798830399L & j10) << 2))) ^ rotate2) ^ rotate(40, j3)) ^ rotate(48, j3);
    }

    private void mixColumns(long[] jArr) {
        for (int i3 = 0; i3 < this.columns; i3++) {
            jArr[i3] = mixColumn(jArr[i3]);
        }
    }

    private void processBlock(byte[] bArr, int i3) {
        for (int i10 = 0; i10 < this.columns; i10++) {
            long littleEndianToLong = Pack.littleEndianToLong(bArr, i3);
            i3 += 8;
            this.tempState1[i10] = this.state[i10] ^ littleEndianToLong;
            this.tempState2[i10] = littleEndianToLong;
        }
        P(this.tempState1);
        Q(this.tempState2);
        for (int i11 = 0; i11 < this.columns; i11++) {
            long[] jArr = this.state;
            jArr[i11] = jArr[i11] ^ (this.tempState1[i11] ^ this.tempState2[i11]);
        }
    }

    private static long rotate(int i3, long j) {
        return (j << (-i3)) | (j >>> i3);
    }

    private void shiftRows(long[] jArr) {
        int i3 = this.columns;
        if (i3 == 8) {
            long j = jArr[0];
            long j3 = jArr[1];
            long j10 = jArr[2];
            long j11 = jArr[3];
            long j12 = jArr[4];
            long j13 = jArr[5];
            long j14 = jArr[6];
            long j15 = jArr[7];
            long j16 = (j ^ j12) & (-4294967296L);
            long j17 = j ^ j16;
            long j18 = j12 ^ j16;
            long j19 = (j3 ^ j13) & 72057594021150720L;
            long j20 = j3 ^ j19;
            long j21 = j13 ^ j19;
            long j22 = (j10 ^ j14) & 281474976645120L;
            long j23 = j10 ^ j22;
            long j24 = j14 ^ j22;
            long j25 = (j11 ^ j15) & 1099511627520L;
            long j26 = j11 ^ j25;
            long j27 = j15 ^ j25;
            long j28 = (j17 ^ j23) & (-281470681808896L);
            long j29 = j17 ^ j28;
            long j30 = j23 ^ j28;
            long j31 = (j20 ^ j26) & 72056494543077120L;
            long j32 = j20 ^ j31;
            long j33 = j26 ^ j31;
            long j34 = (j18 ^ j24) & (-281470681808896L);
            long j35 = j18 ^ j34;
            long j36 = j24 ^ j34;
            long j37 = (j21 ^ j27) & 72056494543077120L;
            long j38 = j21 ^ j37;
            long j39 = j27 ^ j37;
            long j40 = (j29 ^ j32) & (-71777214294589696L);
            long j41 = j29 ^ j40;
            long j42 = j32 ^ j40;
            long j43 = (j30 ^ j33) & (-71777214294589696L);
            long j44 = j30 ^ j43;
            long j45 = j33 ^ j43;
            long j46 = (j35 ^ j38) & (-71777214294589696L);
            long j47 = (j36 ^ j39) & (-71777214294589696L);
            jArr[0] = j41;
            jArr[1] = j42;
            jArr[2] = j44;
            jArr[3] = j45;
            jArr[4] = j35 ^ j46;
            jArr[5] = j38 ^ j46;
            jArr[6] = j36 ^ j47;
            jArr[7] = j39 ^ j47;
            return;
        }
        if (i3 != 16) {
            throw new IllegalStateException(StubApp.getString2(28478));
        }
        long j48 = jArr[0];
        long j49 = jArr[1];
        long j50 = jArr[2];
        long j51 = jArr[3];
        long j52 = jArr[4];
        long j53 = jArr[5];
        long j54 = jArr[6];
        long j55 = jArr[7];
        long j56 = jArr[8];
        long j57 = jArr[9];
        long j58 = jArr[10];
        long j59 = jArr[11];
        long j60 = jArr[12];
        long j61 = jArr[13];
        long j62 = jArr[14];
        long j63 = jArr[15];
        long j64 = (j48 ^ j56) & (-72057594037927936L);
        long j65 = j48 ^ j64;
        long j66 = j56 ^ j64;
        long j67 = (j49 ^ j57) & (-72057594037927936L);
        long j68 = j49 ^ j67;
        long j69 = j57 ^ j67;
        long j70 = (j50 ^ j58) & (-281474976710656L);
        long j71 = j50 ^ j70;
        long j72 = j58 ^ j70;
        long j73 = (j51 ^ j59) & (-1099511627776L);
        long j74 = j51 ^ j73;
        long j75 = j59 ^ j73;
        long j76 = (j52 ^ j60) & (-4294967296L);
        long j77 = j52 ^ j76;
        long j78 = j60 ^ j76;
        long j79 = (j53 ^ j61) & 72057594021150720L;
        long j80 = j53 ^ j79;
        long j81 = j61 ^ j79;
        long j82 = (j54 ^ j62) & 72057594037862400L;
        long j83 = j54 ^ j82;
        long j84 = j62 ^ j82;
        long j85 = (j55 ^ j63) & 72057594037927680L;
        long j86 = j55 ^ j85;
        long j87 = j63 ^ j85;
        long j88 = (j65 ^ j77) & 72057589742960640L;
        long j89 = j65 ^ j88;
        long j90 = j77 ^ j88;
        long j91 = (j68 ^ j80) & (-16777216);
        long j92 = j68 ^ j91;
        long j93 = j80 ^ j91;
        long j94 = (j71 ^ j83) & (-71776119061282816L);
        long j95 = j71 ^ j94;
        long j96 = j83 ^ j94;
        long j97 = (j74 ^ j86) & (-72056494526300416L);
        long j98 = j74 ^ j97;
        long j99 = j86 ^ j97;
        long j100 = (j66 ^ j78) & 72057589742960640L;
        long j101 = j66 ^ j100;
        long j102 = j78 ^ j100;
        long j103 = (j69 ^ j81) & (-16777216);
        long j104 = j69 ^ j103;
        long j105 = j81 ^ j103;
        long j106 = (j72 ^ j84) & (-71776119061282816L);
        long j107 = j72 ^ j106;
        long j108 = j84 ^ j106;
        long j109 = (j75 ^ j87) & (-72056494526300416L);
        long j110 = j75 ^ j109;
        long j111 = j87 ^ j109;
        long j112 = (j89 ^ j95) & (-281470681808896L);
        long j113 = j89 ^ j112;
        long j114 = j95 ^ j112;
        long j115 = (j92 ^ j98) & 72056494543077120L;
        long j116 = j92 ^ j115;
        long j117 = j98 ^ j115;
        long j118 = (j90 ^ j96) & (-281470681808896L);
        long j119 = j90 ^ j118;
        long j120 = j96 ^ j118;
        long j121 = (j93 ^ j99) & 72056494543077120L;
        long j122 = j93 ^ j121;
        long j123 = j99 ^ j121;
        long j124 = (j101 ^ j107) & (-281470681808896L);
        long j125 = j101 ^ j124;
        long j126 = j107 ^ j124;
        long j127 = (j104 ^ j110) & 72056494543077120L;
        long j128 = j104 ^ j127;
        long j129 = j110 ^ j127;
        long j130 = (j102 ^ j108) & (-281470681808896L);
        long j131 = j102 ^ j130;
        long j132 = j108 ^ j130;
        long j133 = (j105 ^ j111) & 72056494543077120L;
        long j134 = j105 ^ j133;
        long j135 = j111 ^ j133;
        long j136 = (j113 ^ j116) & (-71777214294589696L);
        long j137 = j113 ^ j136;
        long j138 = j116 ^ j136;
        long j139 = (j114 ^ j117) & (-71777214294589696L);
        long j140 = j114 ^ j139;
        long j141 = j117 ^ j139;
        long j142 = (j119 ^ j122) & (-71777214294589696L);
        long j143 = j119 ^ j142;
        long j144 = j122 ^ j142;
        long j145 = (j120 ^ j123) & (-71777214294589696L);
        long j146 = j120 ^ j145;
        long j147 = j123 ^ j145;
        long j148 = (j125 ^ j128) & (-71777214294589696L);
        long j149 = j125 ^ j148;
        long j150 = j128 ^ j148;
        long j151 = (j126 ^ j129) & (-71777214294589696L);
        long j152 = j126 ^ j151;
        long j153 = j129 ^ j151;
        long j154 = (j131 ^ j134) & (-71777214294589696L);
        long j155 = (j132 ^ j135) & (-71777214294589696L);
        jArr[0] = j137;
        jArr[1] = j138;
        jArr[2] = j140;
        jArr[3] = j141;
        jArr[4] = j143;
        jArr[5] = j144;
        jArr[6] = j146;
        jArr[7] = j147;
        jArr[8] = j149;
        jArr[9] = j150;
        jArr[10] = j152;
        jArr[11] = j153;
        jArr[12] = j131 ^ j154;
        jArr[13] = j134 ^ j154;
        jArr[14] = j132 ^ j155;
        jArr[15] = j135 ^ j155;
    }

    private void subBytes(long[] jArr) {
        for (int i3 = 0; i3 < this.columns; i3++) {
            long j = jArr[i3];
            int i10 = (int) j;
            int i11 = (int) (j >>> 32);
            byte[] bArr = f18781S0;
            byte b2 = bArr[i10 & 255];
            byte[] bArr2 = f18782S1;
            byte b10 = bArr2[(i10 >>> 8) & 255];
            byte[] bArr3 = f18783S2;
            byte b11 = bArr3[(i10 >>> 16) & 255];
            int i12 = (f18784S3[i10 >>> 24] << 24) | (b2 & UByte.MAX_VALUE) | ((b10 & UByte.MAX_VALUE) << 8) | ((b11 & UByte.MAX_VALUE) << 16);
            byte b12 = bArr[i11 & 255];
            byte b13 = bArr2[(i11 >>> 8) & 255];
            byte b14 = bArr3[(i11 >>> 16) & 255];
            jArr[i3] = (i12 & BodyPartID.bodyIdMax) | (((r10[i11 >>> 24] << 24) | (((b12 & UByte.MAX_VALUE) | ((b13 & UByte.MAX_VALUE) << 8)) | ((b14 & UByte.MAX_VALUE) << 16))) << 32);
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new DSTU7564Digest(this);
    }

    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        int i10;
        int i11;
        int i12 = this.bufOff;
        byte[] bArr2 = this.buf;
        int i13 = i12 + 1;
        this.bufOff = i13;
        bArr2[i12] = ByteCompanionObject.MIN_VALUE;
        int i14 = this.blockSize - 12;
        int i15 = 0;
        if (i13 > i14) {
            while (true) {
                int i16 = this.bufOff;
                if (i16 >= this.blockSize) {
                    break;
                }
                byte[] bArr3 = this.buf;
                this.bufOff = i16 + 1;
                bArr3[i16] = 0;
            }
            this.bufOff = 0;
            processBlock(this.buf, 0);
        }
        while (true) {
            i10 = this.bufOff;
            if (i10 >= i14) {
                break;
            }
            byte[] bArr4 = this.buf;
            this.bufOff = i10 + 1;
            bArr4[i10] = 0;
        }
        long j = (((this.inputBlocks & BodyPartID.bodyIdMax) * this.blockSize) + i12) << 3;
        Pack.intToLittleEndian((int) j, this.buf, i10);
        int i17 = this.bufOff + 4;
        this.bufOff = i17;
        Pack.longToLittleEndian((j >>> 32) + (((this.inputBlocks >>> 32) * this.blockSize) << 3), this.buf, i17);
        processBlock(this.buf, 0);
        System.arraycopy(this.state, 0, this.tempState1, 0, this.columns);
        P(this.tempState1);
        while (true) {
            i11 = this.columns;
            if (i15 >= i11) {
                break;
            }
            long[] jArr = this.state;
            jArr[i15] = jArr[i15] ^ this.tempState1[i15];
            i15++;
        }
        for (int i18 = i11 - (this.hashSize >>> 3); i18 < this.columns; i18++) {
            Pack.longToLittleEndian(this.state[i18], bArr, i3);
            i3 += 8;
        }
        reset();
        return this.hashSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28479);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.hashSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.fill(this.state, 0L);
        this.state[0] = this.blockSize;
        this.inputBlocks = 0L;
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        byte[] bArr = this.buf;
        int i3 = this.bufOff;
        int i10 = i3 + 1;
        this.bufOff = i10;
        bArr[i3] = b2;
        if (i10 == this.blockSize) {
            processBlock(bArr, 0);
            this.bufOff = 0;
            this.inputBlocks++;
        }
    }

    public DSTU7564Digest(int i3, CryptoServicePurpose cryptoServicePurpose) {
        int i10;
        this.purpose = cryptoServicePurpose;
        if (i3 != 256 && i3 != 384 && i3 != 512) {
            throw new IllegalArgumentException(StubApp.getString2(28477));
        }
        this.hashSize = i3 >>> 3;
        if (i3 > 256) {
            this.columns = 16;
            i10 = 14;
        } else {
            this.columns = 8;
            i10 = 10;
        }
        this.rounds = i10;
        int i11 = this.columns;
        int i12 = i11 << 3;
        this.blockSize = i12;
        long[] jArr = new long[i11];
        this.state = jArr;
        jArr[0] = i12;
        this.tempState1 = new long[i11];
        this.tempState2 = new long[i11];
        this.buf = new byte[i12];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((DSTU7564Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        while (this.bufOff != 0 && i10 > 0) {
            update(bArr[i3]);
            i10--;
            i3++;
        }
        if (i10 > 0) {
            while (i10 >= this.blockSize) {
                processBlock(bArr, i3);
                int i11 = this.blockSize;
                i3 += i11;
                i10 -= i11;
                this.inputBlocks++;
            }
            while (i10 > 0) {
                update(bArr[i3]);
                i10--;
                i3++;
            }
        }
    }

    public DSTU7564Digest(DSTU7564Digest dSTU7564Digest) {
        this.purpose = dSTU7564Digest.purpose;
        copyIn(dSTU7564Digest);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }
}
