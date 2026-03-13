package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;
import org.bouncycastle.util.Pack;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    private static int[] MOD17 = null;
    private static int[] MOD3 = null;
    private static int[] MOD5 = null;
    private static int[] MOD9 = null;
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;
    private long[] kw;

    /* renamed from: t, reason: collision with root package name */
    private long[] f18963t;

    public static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f18964t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i3 = 1;
            long j3 = jArr[1];
            long j10 = jArr[2];
            long j11 = jArr[3];
            long j12 = jArr[4];
            long j13 = jArr[5];
            long j14 = jArr[6];
            long j15 = jArr[7];
            long j16 = jArr[8];
            int i10 = 9;
            long j17 = jArr[9];
            long j18 = jArr[10];
            long j19 = jArr[11];
            long j20 = jArr[12];
            long j21 = jArr[13];
            long j22 = jArr[14];
            long j23 = jArr[15];
            int i11 = 19;
            while (i11 >= i3) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                int i14 = i12 + 1;
                long j24 = j - jArr3[i14];
                int i15 = i12 + 2;
                long j25 = j3 - jArr3[i15];
                int i16 = i12 + 3;
                long j26 = j10 - jArr3[i16];
                int i17 = i12 + 4;
                long j27 = j11 - jArr3[i17];
                int i18 = i12 + 5;
                int i19 = i3;
                long j28 = j12 - jArr3[i18];
                int i20 = i12 + 6;
                long[] jArr5 = jArr3;
                long j29 = j13 - jArr3[i20];
                int i21 = i12 + 7;
                long[] jArr6 = jArr4;
                long j30 = j14 - jArr5[i21];
                int i22 = i12 + 8;
                int[] iArr3 = iArr2;
                long j31 = j15 - jArr5[i22];
                int i23 = i12 + 9;
                long j32 = j16 - jArr5[i23];
                int i24 = i12 + 10;
                long j33 = j17 - jArr5[i24];
                int i25 = i12 + 11;
                long j34 = j18 - jArr5[i25];
                int i26 = i12 + 12;
                long j35 = j19 - jArr5[i26];
                int i27 = i12 + 13;
                long j36 = j20 - jArr5[i27];
                int i28 = i12 + 14;
                int i29 = i13 + 1;
                long j37 = j21 - (jArr5[i28] + jArr6[i29]);
                int i30 = i12 + 15;
                long j38 = j22 - (jArr5[i30] + jArr6[i13 + 2]);
                long j39 = i11;
                long xorRotr = ThreefishEngine.xorRotr(j23 - ((jArr5[i12 + 16] + j39) + 1), i10, j24);
                long j40 = j24 - xorRotr;
                long xorRotr2 = ThreefishEngine.xorRotr(j35, 48, j26);
                long j41 = j26 - xorRotr2;
                long xorRotr3 = ThreefishEngine.xorRotr(j37, 35, j30);
                long j42 = j30 - xorRotr3;
                long xorRotr4 = ThreefishEngine.xorRotr(j33, 52, j28);
                long j43 = j28 - xorRotr4;
                long xorRotr5 = ThreefishEngine.xorRotr(j25, 23, j38);
                long j44 = j38 - xorRotr5;
                long xorRotr6 = ThreefishEngine.xorRotr(j29, 31, j32);
                long j45 = j32 - xorRotr6;
                long xorRotr7 = ThreefishEngine.xorRotr(j27, 37, j34);
                long j46 = j34 - xorRotr7;
                long xorRotr8 = ThreefishEngine.xorRotr(j31, 20, j36);
                long j47 = j36 - xorRotr8;
                long xorRotr9 = ThreefishEngine.xorRotr(xorRotr8, 31, j40);
                long j48 = j40 - xorRotr9;
                long xorRotr10 = ThreefishEngine.xorRotr(xorRotr6, 44, j41);
                long j49 = j41 - xorRotr10;
                long xorRotr11 = ThreefishEngine.xorRotr(xorRotr7, 47, j43);
                long j50 = j43 - xorRotr11;
                long xorRotr12 = ThreefishEngine.xorRotr(xorRotr5, 46, j42);
                long j51 = j42 - xorRotr12;
                long xorRotr13 = ThreefishEngine.xorRotr(xorRotr, 19, j47);
                long j52 = j47 - xorRotr13;
                long xorRotr14 = ThreefishEngine.xorRotr(xorRotr3, 42, j44);
                long j53 = j44 - xorRotr14;
                long xorRotr15 = ThreefishEngine.xorRotr(xorRotr2, 44, j45);
                long j54 = j45 - xorRotr15;
                long xorRotr16 = ThreefishEngine.xorRotr(xorRotr4, 25, j46);
                long j55 = j46 - xorRotr16;
                long xorRotr17 = ThreefishEngine.xorRotr(xorRotr16, 16, j48);
                long j56 = j48 - xorRotr17;
                long xorRotr18 = ThreefishEngine.xorRotr(xorRotr14, 34, j49);
                long j57 = j49 - xorRotr18;
                long xorRotr19 = ThreefishEngine.xorRotr(xorRotr15, 56, j51);
                long j58 = j51 - xorRotr19;
                long xorRotr20 = ThreefishEngine.xorRotr(xorRotr13, 51, j50);
                long j59 = j50 - xorRotr20;
                long xorRotr21 = ThreefishEngine.xorRotr(xorRotr9, 4, j55);
                long j60 = j55 - xorRotr21;
                long xorRotr22 = ThreefishEngine.xorRotr(xorRotr11, 53, j52);
                long j61 = j52 - xorRotr22;
                long xorRotr23 = ThreefishEngine.xorRotr(xorRotr10, 42, j53);
                long j62 = j53 - xorRotr23;
                long xorRotr24 = ThreefishEngine.xorRotr(xorRotr12, 41, j54);
                long j63 = j54 - xorRotr24;
                long xorRotr25 = ThreefishEngine.xorRotr(xorRotr24, 41, j56);
                long j64 = j56 - xorRotr25;
                long xorRotr26 = ThreefishEngine.xorRotr(xorRotr22, 9, j57);
                long xorRotr27 = ThreefishEngine.xorRotr(xorRotr23, 37, j59);
                long j65 = j59 - xorRotr27;
                long xorRotr28 = ThreefishEngine.xorRotr(xorRotr21, 31, j58);
                long j66 = j58 - xorRotr28;
                long xorRotr29 = ThreefishEngine.xorRotr(xorRotr17, 12, j63);
                long j67 = j63 - xorRotr29;
                long xorRotr30 = ThreefishEngine.xorRotr(xorRotr19, 47, j60);
                long j68 = j60 - xorRotr30;
                long xorRotr31 = ThreefishEngine.xorRotr(xorRotr18, 44, j61);
                long j69 = j61 - xorRotr31;
                long xorRotr32 = ThreefishEngine.xorRotr(xorRotr20, 30, j62);
                long j70 = j62 - xorRotr32;
                long j71 = j64 - jArr5[i12];
                long j72 = xorRotr25 - jArr5[i14];
                long j73 = (j57 - xorRotr26) - jArr5[i15];
                long j74 = xorRotr26 - jArr5[i16];
                long j75 = j65 - jArr5[i17];
                long j76 = xorRotr27 - jArr5[i18];
                long j77 = j66 - jArr5[i20];
                long j78 = xorRotr28 - jArr5[i21];
                long j79 = j67 - jArr5[i22];
                long j80 = xorRotr29 - jArr5[i23];
                long j81 = j68 - jArr5[i24];
                long j82 = xorRotr30 - jArr5[i25];
                long j83 = j69 - jArr5[i26];
                long j84 = xorRotr31 - (jArr5[i27] + jArr6[i13]);
                long j85 = j70 - (jArr5[i28] + jArr6[i29]);
                long xorRotr33 = ThreefishEngine.xorRotr(xorRotr32 - (jArr5[i30] + j39), 5, j71);
                long j86 = j71 - xorRotr33;
                long xorRotr34 = ThreefishEngine.xorRotr(j82, 20, j73);
                long j87 = j73 - xorRotr34;
                long xorRotr35 = ThreefishEngine.xorRotr(j84, 48, j77);
                long j88 = j77 - xorRotr35;
                long xorRotr36 = ThreefishEngine.xorRotr(j80, 41, j75);
                long j89 = j75 - xorRotr36;
                long xorRotr37 = ThreefishEngine.xorRotr(j72, 47, j85);
                long j90 = j85 - xorRotr37;
                long xorRotr38 = ThreefishEngine.xorRotr(j76, 28, j79);
                long j91 = j79 - xorRotr38;
                long xorRotr39 = ThreefishEngine.xorRotr(j74, 16, j81);
                long j92 = j81 - xorRotr39;
                long xorRotr40 = ThreefishEngine.xorRotr(j78, 25, j83);
                long j93 = j83 - xorRotr40;
                long xorRotr41 = ThreefishEngine.xorRotr(xorRotr40, 33, j86);
                long j94 = j86 - xorRotr41;
                long xorRotr42 = ThreefishEngine.xorRotr(xorRotr38, 4, j87);
                long j95 = j87 - xorRotr42;
                long xorRotr43 = ThreefishEngine.xorRotr(xorRotr39, 51, j89);
                long j96 = j89 - xorRotr43;
                long xorRotr44 = ThreefishEngine.xorRotr(xorRotr37, 13, j88);
                long j97 = j88 - xorRotr44;
                long xorRotr45 = ThreefishEngine.xorRotr(xorRotr33, 34, j93);
                long j98 = j93 - xorRotr45;
                long xorRotr46 = ThreefishEngine.xorRotr(xorRotr35, 41, j90);
                long j99 = j90 - xorRotr46;
                long xorRotr47 = ThreefishEngine.xorRotr(xorRotr34, 59, j91);
                long j100 = j91 - xorRotr47;
                long xorRotr48 = ThreefishEngine.xorRotr(xorRotr36, 17, j92);
                long j101 = j92 - xorRotr48;
                long xorRotr49 = ThreefishEngine.xorRotr(xorRotr48, 38, j94);
                long j102 = j94 - xorRotr49;
                long xorRotr50 = ThreefishEngine.xorRotr(xorRotr46, 19, j95);
                long j103 = j95 - xorRotr50;
                long xorRotr51 = ThreefishEngine.xorRotr(xorRotr47, 10, j97);
                long j104 = j97 - xorRotr51;
                long xorRotr52 = ThreefishEngine.xorRotr(xorRotr45, 55, j96);
                long j105 = j96 - xorRotr52;
                long xorRotr53 = ThreefishEngine.xorRotr(xorRotr41, ROTATION_1_4, j101);
                long j106 = j101 - xorRotr53;
                long xorRotr54 = ThreefishEngine.xorRotr(xorRotr43, 18, j98);
                long j107 = j98 - xorRotr54;
                long xorRotr55 = ThreefishEngine.xorRotr(xorRotr42, 23, j99);
                long j108 = j99 - xorRotr55;
                long xorRotr56 = ThreefishEngine.xorRotr(xorRotr44, 52, j100);
                long j109 = j100 - xorRotr56;
                long xorRotr57 = ThreefishEngine.xorRotr(xorRotr56, 24, j102);
                j = j102 - xorRotr57;
                long xorRotr58 = ThreefishEngine.xorRotr(xorRotr54, 13, j103);
                j10 = j103 - xorRotr58;
                long xorRotr59 = ThreefishEngine.xorRotr(xorRotr55, 8, j105);
                long j110 = j105 - xorRotr59;
                long xorRotr60 = ThreefishEngine.xorRotr(xorRotr53, 47, j104);
                long j111 = j104 - xorRotr60;
                long xorRotr61 = ThreefishEngine.xorRotr(xorRotr49, 8, j109);
                long j112 = j109 - xorRotr61;
                long xorRotr62 = ThreefishEngine.xorRotr(xorRotr51, 17, j106);
                j21 = ThreefishEngine.xorRotr(xorRotr50, 22, j107);
                j23 = ThreefishEngine.xorRotr(xorRotr52, 37, j108);
                j22 = j108 - j23;
                j20 = j107 - j21;
                j13 = xorRotr59;
                j16 = j112;
                j18 = j106 - xorRotr62;
                j17 = xorRotr61;
                j19 = xorRotr62;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                iArr2 = iArr3;
                j15 = xorRotr60;
                i10 = 9;
                j11 = xorRotr58;
                i11 -= 2;
                i3 = i19;
                j3 = xorRotr57;
                j14 = j111;
                j12 = j110;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i31 = i3;
            long j113 = j - jArr7[0];
            long j114 = j3 - jArr7[i31];
            long j115 = j10 - jArr7[2];
            long j116 = j11 - jArr7[3];
            long j117 = j12 - jArr7[4];
            long j118 = j13 - jArr7[5];
            long j119 = j14 - jArr7[6];
            long j120 = j15 - jArr7[7];
            long j121 = j16 - jArr7[8];
            long j122 = j17 - jArr7[9];
            long j123 = j18 - jArr7[10];
            long j124 = j19 - jArr7[11];
            long j125 = j20 - jArr7[12];
            long j126 = j21 - (jArr7[13] + jArr8[0]);
            long j127 = j22 - (jArr7[14] + jArr8[i31]);
            long j128 = j23 - jArr7[15];
            jArr2[0] = j113;
            jArr2[i31] = j114;
            jArr2[2] = j115;
            jArr2[3] = j116;
            jArr2[4] = j117;
            jArr2[5] = j118;
            jArr2[6] = j119;
            jArr2[7] = j120;
            jArr2[8] = j121;
            jArr2[9] = j122;
            jArr2[10] = j123;
            jArr2[11] = j124;
            jArr2[12] = j125;
            jArr2[13] = j126;
            jArr2[14] = j127;
            jArr2[15] = j128;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f18964t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long j3 = jArr[1];
            long j10 = jArr[2];
            long j11 = jArr[3];
            long j12 = jArr[4];
            long j13 = jArr[5];
            long j14 = jArr[6];
            long j15 = jArr[7];
            long j16 = jArr[8];
            long j17 = jArr[9];
            long j18 = jArr[10];
            long j19 = jArr[11];
            int i3 = 9;
            long j20 = jArr[12];
            int i10 = 12;
            int i11 = 13;
            long j21 = jArr[13];
            long j22 = jArr[14];
            long j23 = jArr[15];
            long j24 = j + jArr3[0];
            long j25 = j3 + jArr3[1];
            long j26 = j10 + jArr3[2];
            long j27 = j11 + jArr3[3];
            long j28 = j12 + jArr3[4];
            long j29 = j13 + jArr3[5];
            long j30 = j14 + jArr3[6];
            long j31 = j15 + jArr3[7];
            long j32 = j16 + jArr3[8];
            long j33 = j17 + jArr3[9];
            long j34 = j18 + jArr3[10];
            long j35 = j19 + jArr3[11];
            long j36 = j20 + jArr3[12];
            long j37 = jArr3[13] + jArr4[0] + j21;
            long j38 = jArr3[14] + jArr4[1] + j22;
            long j39 = j29;
            long j40 = j31;
            long j41 = j33;
            long j42 = j35;
            long j43 = j23 + jArr3[15];
            long j44 = j37;
            long j45 = j28;
            long j46 = j24;
            long j47 = j27;
            int i12 = 1;
            while (i12 < 20) {
                int i13 = iArr[i12];
                int i14 = iArr2[i12];
                long j48 = j47;
                long j49 = j46 + j25;
                long rotlXor = ThreefishEngine.rotlXor(j25, 24, j49);
                long j50 = j26 + j48;
                long rotlXor2 = ThreefishEngine.rotlXor(j48, i11, j50);
                int i15 = i12;
                long j51 = j39;
                long j52 = j45 + j51;
                long rotlXor3 = ThreefishEngine.rotlXor(j51, 8, j52);
                long[] jArr5 = jArr3;
                long j53 = j40;
                long j54 = j30 + j53;
                long[] jArr6 = jArr4;
                long rotlXor4 = ThreefishEngine.rotlXor(j53, 47, j54);
                long j55 = j41;
                long j56 = j32 + j55;
                int[] iArr3 = iArr2;
                long rotlXor5 = ThreefishEngine.rotlXor(j55, 8, j56);
                long j57 = j42;
                long j58 = j34 + j57;
                long rotlXor6 = ThreefishEngine.rotlXor(j57, 17, j58);
                long j59 = j44;
                long j60 = j36 + j59;
                long rotlXor7 = ThreefishEngine.rotlXor(j59, 22, j60);
                long j61 = j43;
                long j62 = j38 + j61;
                long rotlXor8 = ThreefishEngine.rotlXor(j61, 37, j62);
                long j63 = j49 + rotlXor5;
                long rotlXor9 = ThreefishEngine.rotlXor(rotlXor5, 38, j63);
                long j64 = j50 + rotlXor7;
                long rotlXor10 = ThreefishEngine.rotlXor(rotlXor7, 19, j64);
                long j65 = j54 + rotlXor6;
                long rotlXor11 = ThreefishEngine.rotlXor(rotlXor6, 10, j65);
                long j66 = j52 + rotlXor8;
                long rotlXor12 = ThreefishEngine.rotlXor(rotlXor8, 55, j66);
                long j67 = j58 + rotlXor4;
                long rotlXor13 = ThreefishEngine.rotlXor(rotlXor4, ROTATION_1_4, j67);
                long j68 = j60 + rotlXor2;
                long rotlXor14 = ThreefishEngine.rotlXor(rotlXor2, 18, j68);
                long j69 = j62 + rotlXor3;
                long rotlXor15 = ThreefishEngine.rotlXor(rotlXor3, 23, j69);
                long j70 = j56 + rotlXor;
                long rotlXor16 = ThreefishEngine.rotlXor(rotlXor, 52, j70);
                long j71 = j63 + rotlXor13;
                long rotlXor17 = ThreefishEngine.rotlXor(rotlXor13, 33, j71);
                long j72 = j64 + rotlXor15;
                long rotlXor18 = ThreefishEngine.rotlXor(rotlXor15, 4, j72);
                long j73 = j66 + rotlXor14;
                long rotlXor19 = ThreefishEngine.rotlXor(rotlXor14, 51, j73);
                long j74 = j65 + rotlXor16;
                long rotlXor20 = ThreefishEngine.rotlXor(rotlXor16, 13, j74);
                long j75 = j68 + rotlXor12;
                long rotlXor21 = ThreefishEngine.rotlXor(rotlXor12, 34, j75);
                long j76 = j69 + rotlXor10;
                long rotlXor22 = ThreefishEngine.rotlXor(rotlXor10, 41, j76);
                long j77 = j70 + rotlXor11;
                long rotlXor23 = ThreefishEngine.rotlXor(rotlXor11, 59, j77);
                long j78 = j67 + rotlXor9;
                long rotlXor24 = ThreefishEngine.rotlXor(rotlXor9, 17, j78);
                long j79 = j71 + rotlXor21;
                long rotlXor25 = ThreefishEngine.rotlXor(rotlXor21, 5, j79);
                long j80 = j72 + rotlXor23;
                long rotlXor26 = ThreefishEngine.rotlXor(rotlXor23, 20, j80);
                long j81 = j74 + rotlXor22;
                long rotlXor27 = ThreefishEngine.rotlXor(rotlXor22, 48, j81);
                long j82 = j73 + rotlXor24;
                long rotlXor28 = ThreefishEngine.rotlXor(rotlXor24, 41, j82);
                long j83 = j76 + rotlXor20;
                long rotlXor29 = ThreefishEngine.rotlXor(rotlXor20, 47, j83);
                long j84 = j77 + rotlXor18;
                long rotlXor30 = ThreefishEngine.rotlXor(rotlXor18, 28, j84);
                long j85 = j78 + rotlXor19;
                long rotlXor31 = ThreefishEngine.rotlXor(rotlXor19, 16, j85);
                long j86 = j75 + rotlXor17;
                long rotlXor32 = ThreefishEngine.rotlXor(rotlXor17, 25, j86);
                long j87 = j79 + jArr5[i13];
                int i16 = i13 + 1;
                long j88 = rotlXor29 + jArr5[i16];
                int i17 = i13 + 2;
                long j89 = j80 + jArr5[i17];
                int i18 = i13 + 3;
                long j90 = rotlXor31 + jArr5[i18];
                int i19 = i13 + 4;
                long j91 = j82 + jArr5[i19];
                int i20 = i13 + 5;
                long j92 = rotlXor30 + jArr5[i20];
                int i21 = i13 + 6;
                long j93 = j81 + jArr5[i21];
                int i22 = i13 + 7;
                long j94 = rotlXor32 + jArr5[i22];
                int i23 = i13 + 8;
                long j95 = j84 + jArr5[i23];
                int i24 = i13 + 9;
                long j96 = rotlXor28 + jArr5[i24];
                int i25 = i13 + 10;
                long j97 = j85 + jArr5[i25];
                int i26 = i13 + 11;
                long j98 = rotlXor26 + jArr5[i26];
                int i27 = i13 + 12;
                long j99 = j86 + jArr5[i27];
                int i28 = i13 + 13;
                long j100 = jArr5[i28] + jArr6[i14] + rotlXor27;
                int i29 = i13 + 14;
                int i30 = i14 + 1;
                long j101 = jArr5[i29] + jArr6[i30] + j83;
                int i31 = i13 + 15;
                long j102 = i15;
                long j103 = jArr5[i31] + j102 + rotlXor25;
                long j104 = j87 + j88;
                long rotlXor33 = ThreefishEngine.rotlXor(j88, 41, j104);
                long j105 = j89 + j90;
                long rotlXor34 = ThreefishEngine.rotlXor(j90, i3, j105);
                long j106 = j91 + j92;
                long rotlXor35 = ThreefishEngine.rotlXor(j92, 37, j106);
                long j107 = j93 + j94;
                long rotlXor36 = ThreefishEngine.rotlXor(j94, 31, j107);
                long j108 = j95 + j96;
                long rotlXor37 = ThreefishEngine.rotlXor(j96, i10, j108);
                long j109 = j97 + j98;
                long rotlXor38 = ThreefishEngine.rotlXor(j98, 47, j109);
                long j110 = j99 + j100;
                long rotlXor39 = ThreefishEngine.rotlXor(j100, 44, j110);
                long j111 = j101 + j103;
                long rotlXor40 = ThreefishEngine.rotlXor(j103, 30, j111);
                long j112 = j104 + rotlXor37;
                long rotlXor41 = ThreefishEngine.rotlXor(rotlXor37, 16, j112);
                long j113 = j105 + rotlXor39;
                long rotlXor42 = ThreefishEngine.rotlXor(rotlXor39, 34, j113);
                long j114 = j107 + rotlXor38;
                long rotlXor43 = ThreefishEngine.rotlXor(rotlXor38, 56, j114);
                long j115 = j106 + rotlXor40;
                long rotlXor44 = ThreefishEngine.rotlXor(rotlXor40, 51, j115);
                long j116 = j109 + rotlXor36;
                long rotlXor45 = ThreefishEngine.rotlXor(rotlXor36, 4, j116);
                long j117 = j110 + rotlXor34;
                long rotlXor46 = ThreefishEngine.rotlXor(rotlXor34, 53, j117);
                long j118 = j111 + rotlXor35;
                long rotlXor47 = ThreefishEngine.rotlXor(rotlXor35, 42, j118);
                long j119 = j108 + rotlXor33;
                long rotlXor48 = ThreefishEngine.rotlXor(rotlXor33, 41, j119);
                long j120 = j112 + rotlXor45;
                long rotlXor49 = ThreefishEngine.rotlXor(rotlXor45, 31, j120);
                long j121 = j113 + rotlXor47;
                long rotlXor50 = ThreefishEngine.rotlXor(rotlXor47, 44, j121);
                long j122 = j115 + rotlXor46;
                long rotlXor51 = ThreefishEngine.rotlXor(rotlXor46, 47, j122);
                long j123 = j114 + rotlXor48;
                long rotlXor52 = ThreefishEngine.rotlXor(rotlXor48, 46, j123);
                long j124 = j117 + rotlXor44;
                long rotlXor53 = ThreefishEngine.rotlXor(rotlXor44, 19, j124);
                long j125 = j118 + rotlXor42;
                long rotlXor54 = ThreefishEngine.rotlXor(rotlXor42, 42, j125);
                long j126 = j119 + rotlXor43;
                long rotlXor55 = ThreefishEngine.rotlXor(rotlXor43, 44, j126);
                long j127 = j116 + rotlXor41;
                long rotlXor56 = ThreefishEngine.rotlXor(rotlXor41, 25, j127);
                long j128 = j120 + rotlXor53;
                long rotlXor57 = ThreefishEngine.rotlXor(rotlXor53, 9, j128);
                long j129 = j121 + rotlXor55;
                long rotlXor58 = ThreefishEngine.rotlXor(rotlXor55, 48, j129);
                long j130 = j123 + rotlXor54;
                long rotlXor59 = ThreefishEngine.rotlXor(rotlXor54, 35, j130);
                long j131 = j122 + rotlXor56;
                long rotlXor60 = ThreefishEngine.rotlXor(rotlXor56, 52, j131);
                long j132 = j125 + rotlXor52;
                long rotlXor61 = ThreefishEngine.rotlXor(rotlXor52, 23, j132);
                long j133 = j126 + rotlXor50;
                long rotlXor62 = ThreefishEngine.rotlXor(rotlXor50, 31, j133);
                long j134 = j127 + rotlXor51;
                long rotlXor63 = ThreefishEngine.rotlXor(rotlXor51, 37, j134);
                long j135 = j124 + rotlXor49;
                long rotlXor64 = ThreefishEngine.rotlXor(rotlXor49, 20, j135);
                long j136 = jArr5[i16] + j128;
                long j137 = rotlXor61 + jArr5[i17];
                long j138 = j129 + jArr5[i18];
                long j139 = rotlXor63 + jArr5[i19];
                long j140 = j131 + jArr5[i20];
                long j141 = rotlXor62 + jArr5[i21];
                long j142 = j130 + jArr5[i22];
                long j143 = rotlXor64 + jArr5[i23];
                long j144 = j133 + jArr5[i24];
                long j145 = rotlXor60 + jArr5[i25];
                long j146 = j134 + jArr5[i26];
                j42 = rotlXor58 + jArr5[i27];
                long j147 = j135 + jArr5[i28];
                long j148 = jArr5[i29] + jArr6[i30] + rotlXor59;
                j38 = jArr5[i31] + jArr6[i14 + 2] + j132;
                j43 = jArr5[i13 + 16] + j102 + 1 + rotlXor57;
                j34 = j146;
                i12 = i15 + 2;
                j44 = j148;
                j39 = j141;
                j45 = j140;
                i3 = 9;
                i10 = 12;
                j40 = j143;
                j46 = j136;
                j32 = j144;
                j30 = j142;
                j25 = j137;
                j41 = j145;
                j47 = j139;
                jArr3 = jArr5;
                iArr2 = iArr3;
                j36 = j147;
                j26 = j138;
                jArr4 = jArr6;
                iArr = iArr;
                i11 = 13;
            }
            jArr2[0] = j46;
            jArr2[1] = j25;
            jArr2[2] = j26;
            jArr2[3] = j47;
            jArr2[4] = j45;
            jArr2[5] = j39;
            jArr2[6] = j30;
            jArr2[7] = j40;
            jArr2[8] = j32;
            jArr2[9] = j41;
            jArr2[10] = j34;
            jArr2[11] = j42;
            jArr2[12] = j36;
            jArr2[13] = j44;
            jArr2[14] = j38;
            jArr2[15] = j43;
        }
    }

    public static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f18964t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i3 = 1;
            long j3 = jArr[1];
            char c10 = 2;
            long j10 = jArr[2];
            long j11 = jArr[3];
            int i10 = 17;
            while (i10 >= i3) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                int i13 = i11 + 1;
                long j12 = j - jArr3[i13];
                int i14 = i11 + 2;
                int i15 = i12 + 1;
                long j13 = j3 - (jArr3[i14] + jArr4[i15]);
                int i16 = i11 + 3;
                long j14 = j10 - (jArr3[i16] + jArr4[i12 + 2]);
                int i17 = i3;
                long j15 = i10;
                char c11 = c10;
                long xorRotr = ThreefishEngine.xorRotr(j11 - ((jArr3[i11 + 4] + j15) + 1), 32, j12);
                long j16 = j12 - xorRotr;
                long[] jArr5 = jArr3;
                long xorRotr2 = ThreefishEngine.xorRotr(j13, 32, j14);
                long j17 = j14 - xorRotr2;
                long[] jArr6 = jArr4;
                long xorRotr3 = ThreefishEngine.xorRotr(xorRotr2, 58, j16);
                long j18 = j16 - xorRotr3;
                long xorRotr4 = ThreefishEngine.xorRotr(xorRotr, 22, j17);
                long j19 = j17 - xorRotr4;
                long xorRotr5 = ThreefishEngine.xorRotr(xorRotr4, 46, j18);
                long j20 = j18 - xorRotr5;
                long xorRotr6 = ThreefishEngine.xorRotr(xorRotr3, 12, j19);
                long j21 = j19 - xorRotr6;
                long xorRotr7 = ThreefishEngine.xorRotr(xorRotr6, 25, j20);
                long xorRotr8 = ThreefishEngine.xorRotr(xorRotr5, 33, j21);
                long j22 = (j20 - xorRotr7) - jArr5[i11];
                long j23 = xorRotr7 - (jArr5[i13] + jArr6[i12]);
                long j24 = (j21 - xorRotr8) - (jArr5[i14] + jArr6[i15]);
                long xorRotr9 = ThreefishEngine.xorRotr(xorRotr8 - (jArr5[i16] + j15), 5, j22);
                long j25 = j22 - xorRotr9;
                long xorRotr10 = ThreefishEngine.xorRotr(j23, 37, j24);
                long j26 = j24 - xorRotr10;
                long xorRotr11 = ThreefishEngine.xorRotr(xorRotr10, 23, j25);
                long j27 = j25 - xorRotr11;
                long xorRotr12 = ThreefishEngine.xorRotr(xorRotr9, 40, j26);
                long j28 = j26 - xorRotr12;
                long xorRotr13 = ThreefishEngine.xorRotr(xorRotr12, 52, j27);
                long j29 = j27 - xorRotr13;
                long xorRotr14 = ThreefishEngine.xorRotr(xorRotr11, 57, j28);
                long j30 = j28 - xorRotr14;
                long xorRotr15 = ThreefishEngine.xorRotr(xorRotr14, 14, j29);
                j11 = ThreefishEngine.xorRotr(xorRotr13, 16, j30);
                j10 = j30 - j11;
                i10 -= 2;
                j3 = xorRotr15;
                i3 = i17;
                jArr3 = jArr5;
                c10 = c11;
                j = j29 - xorRotr15;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i18 = i3;
            char c12 = c10;
            long j31 = j - jArr7[0];
            long j32 = j3 - (jArr7[i18] + jArr8[0]);
            long j33 = j10 - (jArr7[c12] + jArr8[i18]);
            long j34 = j11 - jArr7[3];
            jArr2[0] = j31;
            jArr2[i18] = j32;
            jArr2[c12] = j33;
            jArr2[3] = j34;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f18964t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long j3 = jArr[1];
            char c10 = 2;
            long j10 = jArr[2];
            long j11 = jArr[3];
            long j12 = j + jArr3[0];
            long j13 = jArr3[1] + jArr4[0] + j3;
            long j14 = jArr3[2] + jArr4[1] + j10;
            long j15 = j11 + jArr3[3];
            long j16 = j14;
            long j17 = j13;
            int i3 = 1;
            while (i3 < 18) {
                int i10 = iArr[i3];
                int i11 = iArr2[i3];
                long j18 = j12 + j17;
                char c11 = c10;
                long rotlXor = ThreefishEngine.rotlXor(j17, 14, j18);
                long j19 = j16 + j15;
                long rotlXor2 = ThreefishEngine.rotlXor(j15, 16, j19);
                long[] jArr5 = jArr3;
                long j20 = j18 + rotlXor2;
                long rotlXor3 = ThreefishEngine.rotlXor(rotlXor2, 52, j20);
                long j21 = j19 + rotlXor;
                long rotlXor4 = ThreefishEngine.rotlXor(rotlXor, 57, j21);
                long j22 = j20 + rotlXor4;
                long rotlXor5 = ThreefishEngine.rotlXor(rotlXor4, 23, j22);
                long j23 = j21 + rotlXor3;
                long rotlXor6 = ThreefishEngine.rotlXor(rotlXor3, 40, j23);
                long j24 = j22 + rotlXor6;
                long rotlXor7 = ThreefishEngine.rotlXor(rotlXor6, 5, j24);
                long j25 = j23 + rotlXor5;
                long rotlXor8 = ThreefishEngine.rotlXor(rotlXor5, 37, j25);
                long j26 = j24 + jArr5[i10];
                int i12 = i10 + 1;
                long j27 = jArr5[i12] + jArr4[i11] + rotlXor8;
                int i13 = i10 + 2;
                int i14 = i11 + 1;
                long j28 = jArr5[i13] + jArr4[i14] + j25;
                int i15 = i10 + 3;
                long j29 = i3;
                long j30 = jArr5[i15] + j29 + rotlXor7;
                long[] jArr6 = jArr4;
                long j31 = j26 + j27;
                long rotlXor9 = ThreefishEngine.rotlXor(j27, 25, j31);
                long j32 = j28 + j30;
                long rotlXor10 = ThreefishEngine.rotlXor(j30, 33, j32);
                long j33 = j31 + rotlXor10;
                long rotlXor11 = ThreefishEngine.rotlXor(rotlXor10, 46, j33);
                long j34 = j32 + rotlXor9;
                long rotlXor12 = ThreefishEngine.rotlXor(rotlXor9, 12, j34);
                long j35 = j33 + rotlXor12;
                long rotlXor13 = ThreefishEngine.rotlXor(rotlXor12, 58, j35);
                long j36 = j34 + rotlXor11;
                long rotlXor14 = ThreefishEngine.rotlXor(rotlXor11, 22, j36);
                long j37 = j35 + rotlXor14;
                long rotlXor15 = ThreefishEngine.rotlXor(rotlXor14, 32, j37);
                long j38 = j36 + rotlXor13;
                long rotlXor16 = ThreefishEngine.rotlXor(rotlXor13, 32, j38);
                long j39 = j37 + jArr5[i12];
                j17 = jArr5[i13] + jArr6[i14] + rotlXor16;
                j16 = jArr5[i15] + jArr6[i11 + 2] + j38;
                j15 = jArr5[i10 + 4] + j29 + 1 + rotlXor15;
                i3 += 2;
                j12 = j39;
                c10 = c11;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
            }
            jArr2[0] = j12;
            jArr2[1] = j17;
            jArr2[c10] = j16;
            jArr2[3] = j15;
        }
    }

    public static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        public Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f18964t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            char c10 = 5;
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i3 = 1;
            long j3 = jArr[1];
            char c11 = 2;
            long j10 = jArr[2];
            long j11 = jArr[3];
            long j12 = jArr[4];
            long j13 = jArr[5];
            long j14 = jArr[6];
            long j15 = jArr[7];
            int i10 = 17;
            while (i10 >= i3) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                int i13 = i11 + 1;
                long j16 = j - jArr3[i13];
                int i14 = i11 + 2;
                long j17 = j3 - jArr3[i14];
                int i15 = i11 + 3;
                long j18 = j10 - jArr3[i15];
                int i16 = i11 + 4;
                long j19 = j11 - jArr3[i16];
                int i17 = i11 + 5;
                char c12 = c11;
                long j20 = j12 - jArr3[i17];
                int i18 = i11 + 6;
                int i19 = i12 + 1;
                int i20 = i3;
                long j21 = j13 - (jArr3[i18] + jArr4[i19]);
                int i21 = i11 + 7;
                long[] jArr5 = jArr3;
                long j22 = j14 - (jArr3[i21] + jArr4[i12 + 2]);
                long[] jArr6 = jArr4;
                long j23 = i10;
                long j24 = j15 - ((jArr5[i11 + 8] + j23) + 1);
                int[] iArr3 = iArr2;
                long xorRotr = ThreefishEngine.xorRotr(j17, 8, j22);
                long j25 = j22 - xorRotr;
                long xorRotr2 = ThreefishEngine.xorRotr(j24, 35, j16);
                long j26 = j16 - xorRotr2;
                long xorRotr3 = ThreefishEngine.xorRotr(j21, 56, j18);
                long j27 = j18 - xorRotr3;
                long xorRotr4 = ThreefishEngine.xorRotr(j19, 22, j20);
                long j28 = j20 - xorRotr4;
                long xorRotr5 = ThreefishEngine.xorRotr(xorRotr, 25, j28);
                long j29 = j28 - xorRotr5;
                long xorRotr6 = ThreefishEngine.xorRotr(xorRotr4, 29, j25);
                long j30 = j25 - xorRotr6;
                long xorRotr7 = ThreefishEngine.xorRotr(xorRotr3, 39, j26);
                long j31 = j26 - xorRotr7;
                long xorRotr8 = ThreefishEngine.xorRotr(xorRotr2, 43, j27);
                long j32 = j27 - xorRotr8;
                long xorRotr9 = ThreefishEngine.xorRotr(xorRotr5, 13, j32);
                long j33 = j32 - xorRotr9;
                long xorRotr10 = ThreefishEngine.xorRotr(xorRotr8, 50, j29);
                long j34 = j29 - xorRotr10;
                long xorRotr11 = ThreefishEngine.xorRotr(xorRotr7, 10, j30);
                long j35 = j30 - xorRotr11;
                long xorRotr12 = ThreefishEngine.xorRotr(xorRotr6, 17, j31);
                long j36 = j31 - xorRotr12;
                long xorRotr13 = ThreefishEngine.xorRotr(xorRotr9, 39, j36);
                long j37 = j36 - xorRotr13;
                long xorRotr14 = ThreefishEngine.xorRotr(xorRotr12, 30, j33);
                long xorRotr15 = ThreefishEngine.xorRotr(xorRotr11, 34, j34);
                long xorRotr16 = ThreefishEngine.xorRotr(xorRotr10, 24, j35);
                long j38 = j35 - xorRotr16;
                long j39 = j37 - jArr5[i11];
                long j40 = xorRotr13 - jArr5[i13];
                long j41 = (j33 - xorRotr14) - jArr5[i14];
                long j42 = xorRotr14 - jArr5[i15];
                long j43 = (j34 - xorRotr15) - jArr5[i16];
                long j44 = xorRotr15 - (jArr5[i17] + jArr6[i12]);
                long j45 = j38 - (jArr5[i18] + jArr6[i19]);
                long j46 = xorRotr16 - (jArr5[i21] + j23);
                long xorRotr17 = ThreefishEngine.xorRotr(j40, 44, j45);
                long j47 = j45 - xorRotr17;
                long xorRotr18 = ThreefishEngine.xorRotr(j46, 9, j39);
                long j48 = j39 - xorRotr18;
                long xorRotr19 = ThreefishEngine.xorRotr(j44, 54, j41);
                long j49 = j41 - xorRotr19;
                long xorRotr20 = ThreefishEngine.xorRotr(j42, 56, j43);
                long j50 = j43 - xorRotr20;
                long xorRotr21 = ThreefishEngine.xorRotr(xorRotr17, 17, j50);
                long j51 = j50 - xorRotr21;
                long xorRotr22 = ThreefishEngine.xorRotr(xorRotr20, ROTATION_2_1, j47);
                long j52 = j47 - xorRotr22;
                long xorRotr23 = ThreefishEngine.xorRotr(xorRotr19, 36, j48);
                long j53 = j48 - xorRotr23;
                long xorRotr24 = ThreefishEngine.xorRotr(xorRotr18, 39, j49);
                long j54 = j49 - xorRotr24;
                long xorRotr25 = ThreefishEngine.xorRotr(xorRotr21, 33, j54);
                long j55 = j54 - xorRotr25;
                long xorRotr26 = ThreefishEngine.xorRotr(xorRotr24, 27, j51);
                long j56 = j51 - xorRotr26;
                long xorRotr27 = ThreefishEngine.xorRotr(xorRotr23, 14, j52);
                long j57 = j52 - xorRotr27;
                long xorRotr28 = ThreefishEngine.xorRotr(xorRotr22, 42, j53);
                long j58 = j53 - xorRotr28;
                long xorRotr29 = ThreefishEngine.xorRotr(xorRotr25, 46, j58);
                long j59 = j58 - xorRotr29;
                j11 = ThreefishEngine.xorRotr(xorRotr28, 36, j55);
                j13 = ThreefishEngine.xorRotr(xorRotr27, 19, j56);
                j15 = ThreefishEngine.xorRotr(xorRotr26, 37, j57);
                j14 = j57 - j15;
                j10 = j55 - j11;
                j12 = j56 - j13;
                j3 = xorRotr29;
                i10 -= 2;
                i3 = i20;
                jArr3 = jArr5;
                c11 = c12;
                jArr4 = jArr6;
                iArr = iArr;
                iArr2 = iArr3;
                j = j59;
                c10 = c10;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            char c13 = c10;
            int i22 = i3;
            char c14 = c11;
            long j60 = j - jArr7[0];
            long j61 = j3 - jArr7[i22];
            long j62 = j10 - jArr7[c14];
            long j63 = j11 - jArr7[3];
            long j64 = j12 - jArr7[4];
            long j65 = j13 - (jArr7[c13] + jArr8[0]);
            long j66 = j14 - (jArr7[6] + jArr8[i22]);
            long j67 = j15 - jArr7[7];
            jArr2[0] = j60;
            jArr2[i22] = j61;
            jArr2[c14] = j62;
            jArr2[3] = j63;
            jArr2[4] = j64;
            jArr2[c13] = j65;
            jArr2[6] = j66;
            jArr2[7] = j67;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f18964t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long j3 = jArr[1];
            long j10 = jArr[2];
            long j11 = jArr[3];
            long j12 = jArr[4];
            long j13 = jArr[5];
            long j14 = jArr[6];
            long j15 = jArr[7];
            long j16 = j + jArr3[0];
            long j17 = j3 + jArr3[1];
            long j18 = j10 + jArr3[2];
            long j19 = j11 + jArr3[3];
            long j20 = j12 + jArr3[4];
            long j21 = jArr3[5] + jArr4[0] + j13;
            long j22 = jArr3[6] + jArr4[1] + j14;
            long j23 = j15 + jArr3[7];
            long j24 = j22;
            long j25 = j20;
            long j26 = j16;
            int i3 = 1;
            long j27 = j19;
            long j28 = j21;
            long j29 = j18;
            long j30 = j23;
            while (i3 < 18) {
                int i10 = iArr[i3];
                int i11 = iArr2[i3];
                long j31 = j27;
                long j32 = j26 + j17;
                long rotlXor = ThreefishEngine.rotlXor(j17, 46, j32);
                long[] jArr5 = jArr3;
                long j33 = j29 + j31;
                long[] jArr6 = jArr4;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long rotlXor2 = ThreefishEngine.rotlXor(j31, 36, j33);
                long j34 = j25 + j28;
                long rotlXor3 = ThreefishEngine.rotlXor(j28, 19, j34);
                long j35 = j24 + j30;
                long rotlXor4 = ThreefishEngine.rotlXor(j30, 37, j35);
                long j36 = j33 + rotlXor;
                long rotlXor5 = ThreefishEngine.rotlXor(rotlXor, 33, j36);
                long j37 = j34 + rotlXor4;
                long rotlXor6 = ThreefishEngine.rotlXor(rotlXor4, 27, j37);
                long j38 = j35 + rotlXor3;
                long rotlXor7 = ThreefishEngine.rotlXor(rotlXor3, 14, j38);
                long j39 = j32 + rotlXor2;
                long rotlXor8 = ThreefishEngine.rotlXor(rotlXor2, 42, j39);
                long j40 = j37 + rotlXor5;
                long rotlXor9 = ThreefishEngine.rotlXor(rotlXor5, 17, j40);
                long j41 = j38 + rotlXor8;
                long rotlXor10 = ThreefishEngine.rotlXor(rotlXor8, ROTATION_2_1, j41);
                long j42 = j39 + rotlXor7;
                long rotlXor11 = ThreefishEngine.rotlXor(rotlXor7, 36, j42);
                long j43 = j36 + rotlXor6;
                long rotlXor12 = ThreefishEngine.rotlXor(rotlXor6, 39, j43);
                int i12 = i3;
                long j44 = j41 + rotlXor9;
                long rotlXor13 = ThreefishEngine.rotlXor(rotlXor9, 44, j44);
                long j45 = j42 + rotlXor12;
                long rotlXor14 = ThreefishEngine.rotlXor(rotlXor12, 9, j45);
                long j46 = j43 + rotlXor11;
                long rotlXor15 = ThreefishEngine.rotlXor(rotlXor11, 54, j46);
                long j47 = j40 + rotlXor10;
                long rotlXor16 = ThreefishEngine.rotlXor(rotlXor10, 56, j47);
                long j48 = j45 + jArr5[i10];
                int i13 = i10 + 1;
                long j49 = rotlXor13 + jArr5[i13];
                int i14 = i10 + 2;
                long j50 = j46 + jArr5[i14];
                int i15 = i10 + 3;
                long j51 = rotlXor16 + jArr5[i15];
                int i16 = i10 + 4;
                long j52 = j47 + jArr5[i16];
                int i17 = i10 + 5;
                long j53 = jArr5[i17] + jArr6[i11] + rotlXor15;
                int i18 = i10 + 6;
                int i19 = i11 + 1;
                long j54 = jArr5[i18] + jArr6[i19] + j44;
                int i20 = i10 + 7;
                long j55 = i12;
                long j56 = jArr5[i20] + j55 + rotlXor14;
                long j57 = j48 + j49;
                long rotlXor17 = ThreefishEngine.rotlXor(j49, 39, j57);
                long j58 = j50 + j51;
                long rotlXor18 = ThreefishEngine.rotlXor(j51, 30, j58);
                long j59 = j52 + j53;
                long rotlXor19 = ThreefishEngine.rotlXor(j53, 34, j59);
                long j60 = j54 + j56;
                long rotlXor20 = ThreefishEngine.rotlXor(j56, 24, j60);
                long j61 = j58 + rotlXor17;
                long rotlXor21 = ThreefishEngine.rotlXor(rotlXor17, 13, j61);
                long j62 = j59 + rotlXor20;
                long rotlXor22 = ThreefishEngine.rotlXor(rotlXor20, 50, j62);
                long j63 = j60 + rotlXor19;
                long rotlXor23 = ThreefishEngine.rotlXor(rotlXor19, 10, j63);
                long j64 = j57 + rotlXor18;
                long rotlXor24 = ThreefishEngine.rotlXor(rotlXor18, 17, j64);
                long j65 = j62 + rotlXor21;
                long rotlXor25 = ThreefishEngine.rotlXor(rotlXor21, 25, j65);
                long j66 = j63 + rotlXor24;
                long rotlXor26 = ThreefishEngine.rotlXor(rotlXor24, 29, j66);
                long j67 = j64 + rotlXor23;
                long rotlXor27 = ThreefishEngine.rotlXor(rotlXor23, 39, j67);
                long j68 = j61 + rotlXor22;
                long rotlXor28 = ThreefishEngine.rotlXor(rotlXor22, 43, j68);
                long j69 = j66 + rotlXor25;
                long rotlXor29 = ThreefishEngine.rotlXor(rotlXor25, 8, j69);
                long j70 = j67 + rotlXor28;
                long rotlXor30 = ThreefishEngine.rotlXor(rotlXor28, 35, j70);
                long j71 = j68 + rotlXor27;
                long rotlXor31 = ThreefishEngine.rotlXor(rotlXor27, 56, j71);
                long j72 = j65 + rotlXor26;
                long rotlXor32 = ThreefishEngine.rotlXor(rotlXor26, 22, j72);
                long j73 = j70 + jArr5[i13];
                long j74 = rotlXor29 + jArr5[i14];
                long j75 = j71 + jArr5[i15];
                long j76 = rotlXor32 + jArr5[i16];
                long j77 = j72 + jArr5[i17];
                long j78 = jArr5[i18] + jArr6[i19] + rotlXor31;
                j24 = jArr5[i20] + jArr6[i11 + 2] + j69;
                j25 = j77;
                j26 = j73;
                j29 = j75;
                jArr4 = jArr6;
                iArr = iArr3;
                j17 = j74;
                j30 = jArr5[i10 + 8] + j55 + 1 + rotlXor30;
                j27 = j76;
                jArr3 = jArr5;
                i3 = i12 + 2;
                j28 = j78;
                iArr2 = iArr4;
            }
            jArr2[0] = j26;
            jArr2[1] = j17;
            jArr2[2] = j29;
            jArr2[3] = j27;
            jArr2[4] = j25;
            jArr2[5] = j28;
            jArr2[6] = j24;
            jArr2[7] = j30;
        }
    }

    public static abstract class ThreefishCipher {
        protected final long[] kw;

        /* renamed from: t, reason: collision with root package name */
        protected final long[] f18964t;

        public ThreefishCipher(long[] jArr, long[] jArr2) {
            this.kw = jArr;
            this.f18964t = jArr2;
        }

        public abstract void decryptBlock(long[] jArr, long[] jArr2);

        public abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i3 = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i3 >= iArr2.length) {
                return;
            }
            MOD17[i3] = i3 % 17;
            iArr2[i3] = i3 % 9;
            MOD5[i3] = i3 % 5;
            MOD3[i3] = i3 % 3;
            i3++;
        }
    }

    public ThreefishEngine(int i3) {
        ThreefishCipher threefish256Cipher;
        long[] jArr = new long[5];
        this.f18963t = jArr;
        int i10 = i3 / 8;
        this.blocksizeBytes = i10;
        int i11 = i10 / 8;
        this.blocksizeWords = i11;
        this.currentBlock = new long[i11];
        long[] jArr2 = new long[(i11 * 2) + 1];
        this.kw = jArr2;
        if (i3 == 256) {
            threefish256Cipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i3 == 512) {
            threefish256Cipher = new Threefish512Cipher(jArr2, jArr);
        } else {
            if (i3 != 1024) {
                throw new IllegalArgumentException(StubApp.getString2(28779));
            }
            threefish256Cipher = new Threefish1024Cipher(jArr2, jArr);
        }
        this.cipher = threefish256Cipher;
    }

    public static long bytesToWord(byte[] bArr, int i3) {
        return Pack.littleEndianToLong(bArr, i3);
    }

    public static long rotlXor(long j, int i3, long j3) {
        return ((j >>> (-i3)) | (j << i3)) ^ j3;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            throw new IllegalArgumentException(AbstractC1482f.f(this.blocksizeWords, StubApp.getString2(28781), new StringBuilder(StubApp.getString2(28780))));
        }
        long j = C_240;
        int i3 = 0;
        while (true) {
            int i10 = this.blocksizeWords;
            if (i3 >= i10) {
                long[] jArr2 = this.kw;
                jArr2[i10] = j;
                System.arraycopy(jArr2, 0, jArr2, i10 + 1, i10);
                return;
            } else {
                long[] jArr3 = this.kw;
                long j3 = jArr[i3];
                jArr3[i3] = j3;
                j ^= j3;
                i3++;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException(StubApp.getString2(28782));
        }
        long[] jArr2 = this.f18963t;
        long j = jArr[0];
        jArr2[0] = j;
        long j3 = jArr[1];
        jArr2[1] = j3;
        jArr2[2] = j ^ j3;
        jArr2[3] = j;
        jArr2[4] = j3;
    }

    public static void wordToBytes(long j, byte[] bArr, int i3) {
        Pack.longToLittleEndian(j, bArr, i3);
    }

    public static long xorRotr(long j, int i3, long j3) {
        long j10 = j ^ j3;
        return (j10 << (-i3)) | (j10 >>> i3);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28783) + (this.blocksizeBytes * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] key;
        byte[] bArr;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            bArr = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(a.g(StubApp.getString2(28785), cipherParameters));
            }
            key = ((KeyParameter) cipherParameters).getKey();
            bArr = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.blocksizeBytes) {
                throw new IllegalArgumentException(AbstractC1482f.f(this.blocksizeBytes, StubApp.getString2(26559), new StringBuilder(StubApp.getString2(28780))));
            }
            jArr = new long[this.blocksizeWords];
            Pack.littleEndianToLong(key, 0, jArr);
        }
        if (bArr != null) {
            if (bArr.length != 16) {
                throw new IllegalArgumentException(StubApp.getString2(28784));
            }
            jArr2 = new long[2];
            Pack.littleEndianToLong(bArr, 0, jArr2);
        }
        init(z2, jArr, jArr2);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256, cipherParameters, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        int i11 = this.blocksizeBytes;
        if (i3 + i11 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28609));
        }
        if (i11 + i10 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28608));
        }
        Pack.littleEndianToLong(bArr, i3, this.currentBlock);
        long[] jArr = this.currentBlock;
        processBlock(jArr, jArr);
        Pack.longToLittleEndian(this.currentBlock, bArr2, i10);
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public int processBlock(long[] jArr, long[] jArr2) throws DataLengthException, IllegalStateException {
        long[] jArr3 = this.kw;
        int i3 = this.blocksizeWords;
        if (jArr3[i3] == 0) {
            throw new IllegalStateException(StubApp.getString2(28786));
        }
        if (jArr.length != i3) {
            throw new DataLengthException(StubApp.getString2(28609));
        }
        if (jArr2.length != i3) {
            throw new OutputLengthException(StubApp.getString2(28608));
        }
        if (this.forEncryption) {
            this.cipher.encryptBlock(jArr, jArr2);
        } else {
            this.cipher.decryptBlock(jArr, jArr2);
        }
        return this.blocksizeWords;
    }

    public void init(boolean z2, long[] jArr, long[] jArr2) {
        this.forEncryption = z2;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }
}
