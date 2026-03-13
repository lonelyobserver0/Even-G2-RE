package org.bouncycastle.pqc.crypto.hqc;

import com.stub.StubApp;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class HQCKeccakRandomGenerator {
    private static long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    protected int bitsInQueue;
    protected int fixedOutputLength;
    protected int rate;
    protected boolean squeezing;
    protected long[] state = new long[26];
    protected byte[] dataQueue = new byte[192];

    public HQCKeccakRandomGenerator(int i3) {
        init(i3);
    }

    private void KeccakIncAbsorb(byte[] bArr, int i3) {
        long j;
        long j3;
        long[] jArr;
        long j10;
        if (bArr == null) {
            return;
        }
        int i10 = this.rate >> 3;
        int i11 = i3;
        int i12 = 0;
        while (true) {
            j = i11;
            long j11 = i10;
            j3 = 8;
            if (this.state[25] + j < j11) {
                break;
            }
            int i13 = 0;
            while (true) {
                long j12 = i13;
                jArr = this.state;
                j10 = jArr[25];
                if (j12 < j11 - j10) {
                    int i14 = ((int) (j10 + j12)) >> 3;
                    jArr[i14] = jArr[i14] ^ ((bArr[r21 + i12] & 255) << ((int) (((j10 + j12) & 7) * 8)));
                    i13++;
                    j11 = j11;
                }
            }
            long j13 = j11;
            i11 = (int) (j - (j13 - j10));
            i12 = (int) ((j13 - j10) + i12);
            jArr[25] = 0;
            KeccakPermutation(jArr);
        }
        int i15 = 0;
        while (true) {
            long[] jArr2 = this.state;
            if (i15 >= i11) {
                jArr2[25] = jArr2[25] + j;
                return;
            }
            long j14 = jArr2[25];
            long j15 = i15;
            int i16 = ((int) (j14 + j15)) >> 3;
            long j16 = j3;
            jArr2[i16] = jArr2[i16] ^ ((bArr[i15 + i12] & 255) << ((int) (((j14 + j15) & 7) * j16)));
            i15++;
            j3 = j16;
        }
    }

    private void KeccakIncFinalize(int i3) {
        int i10 = this.rate >> 3;
        long[] jArr = this.state;
        long j = jArr[25];
        int i11 = ((int) j) >> 3;
        jArr[i11] = ((i3 & BodyPartID.bodyIdMax) << ((int) ((j & 7) * 8))) ^ jArr[i11];
        int i12 = i10 - 1;
        int i13 = i12 >> 3;
        jArr[i13] = jArr[i13] ^ (128 << ((i12 & 7) * 8));
        jArr[25] = 0;
    }

    private void KeccakIncSqueeze(byte[] bArr, int i3) {
        int i10 = this.rate >> 3;
        int i11 = 0;
        while (i11 < i3) {
            if (i11 >= this.state[25]) {
                break;
            }
            long j = i10;
            bArr[i11] = (byte) (r9[(int) (((j - r10) + r7) >> 3)] >> ((int) ((7 & ((j - r10) + r7)) * 8)));
            i11++;
        }
        int i12 = i3 - i11;
        long[] jArr = this.state;
        jArr[25] = jArr[25] - i11;
        while (i12 > 0) {
            KeccakPermutation(this.state);
            int i13 = 0;
            while (i13 < i12 && i13 < i10) {
                bArr[i11 + i13] = (byte) (this.state[i13 >> 3] >> ((i13 & 7) * 8));
                i13++;
            }
            i11 += i13;
            i12 -= i13;
            this.state[25] = i10 - i13;
        }
    }

    private void KeccakPermutation(long[] jArr) {
        long[] jArr2 = this.state;
        long j = jArr2[0];
        long j3 = jArr2[1];
        char c10 = 2;
        long j10 = jArr2[2];
        char c11 = 3;
        long j11 = jArr2[3];
        char c12 = 4;
        long j12 = jArr2[4];
        long j13 = jArr2[5];
        long j14 = jArr2[6];
        long j15 = jArr2[7];
        long j16 = jArr2[8];
        long j17 = jArr2[9];
        long j18 = jArr2[10];
        long j19 = jArr2[11];
        long j20 = jArr2[12];
        long j21 = jArr2[13];
        long j22 = jArr2[14];
        long j23 = jArr2[15];
        long j24 = jArr2[16];
        long j25 = jArr2[17];
        long j26 = jArr2[18];
        long j27 = jArr2[19];
        long j28 = jArr2[20];
        long j29 = jArr2[21];
        long j30 = jArr2[22];
        long j31 = jArr2[23];
        int i3 = 24;
        long j32 = jArr2[24];
        int i10 = 0;
        while (i10 < i3) {
            long j33 = (((j ^ j13) ^ j18) ^ j23) ^ j28;
            long j34 = (((j3 ^ j14) ^ j19) ^ j24) ^ j29;
            long j35 = (((j10 ^ j15) ^ j20) ^ j25) ^ j30;
            long j36 = (((j11 ^ j16) ^ j21) ^ j26) ^ j31;
            long j37 = (((j12 ^ j17) ^ j22) ^ j27) ^ j32;
            long j38 = ((j34 << 1) | (j34 >>> (-1))) ^ j37;
            long j39 = ((j35 << 1) | (j35 >>> (-1))) ^ j33;
            long j40 = ((j36 << 1) | (j36 >>> (-1))) ^ j34;
            long j41 = ((j37 << 1) | (j37 >>> (-1))) ^ j35;
            long j42 = ((j33 << 1) | (j33 >>> (-1))) ^ j36;
            long j43 = j ^ j38;
            long j44 = j13 ^ j38;
            long j45 = j18 ^ j38;
            long j46 = j23 ^ j38;
            long j47 = j28 ^ j38;
            long j48 = j3 ^ j39;
            long j49 = j14 ^ j39;
            long j50 = j19 ^ j39;
            long j51 = j24 ^ j39;
            long j52 = j29 ^ j39;
            long j53 = j10 ^ j40;
            long j54 = j15 ^ j40;
            long j55 = j20 ^ j40;
            long j56 = j25 ^ j40;
            long j57 = j30 ^ j40;
            long j58 = j11 ^ j41;
            long j59 = j16 ^ j41;
            long j60 = j21 ^ j41;
            long j61 = j26 ^ j41;
            long j62 = j31 ^ j41;
            long j63 = j12 ^ j42;
            long j64 = j17 ^ j42;
            long j65 = j22 ^ j42;
            long j66 = j27 ^ j42;
            long j67 = j32 ^ j42;
            long j68 = (j48 << 1) | (j48 >>> 63);
            char c13 = c10;
            long j69 = (j49 << 44) | (j49 >>> 20);
            char c14 = c11;
            long j70 = (j64 << 20) | (j64 >>> 44);
            char c15 = c12;
            long j71 = (j57 << 61) | (j57 >>> c14);
            int i11 = i3;
            long j72 = (j65 << 39) | (j65 >>> 25);
            long j73 = (j47 << 18) | (j47 >>> 46);
            int i12 = i10;
            long j74 = (j53 << 62) | (j53 >>> c13);
            long j75 = (j55 << 43) | (j55 >>> 21);
            long j76 = (j60 << 25) | (j60 >>> 39);
            long j77 = (j66 << 8) | (j66 >>> 56);
            long j78 = (j62 << 56) | (j62 >>> 8);
            long j79 = (j46 << 41) | (j46 >>> 23);
            long j80 = (j63 << 27) | (j63 >>> 37);
            long j81 = (j67 << 14) | (j67 >>> 50);
            long j82 = (j52 << c13) | (j52 >>> 62);
            long j83 = (j59 << 55) | (j59 >>> 9);
            long j84 = (j51 << 45) | (j51 >>> 19);
            long j85 = (j44 << 36) | (j44 >>> 28);
            long j86 = (j58 << 28) | (j58 >>> 36);
            long j87 = (j61 << 21) | (j61 >>> 43);
            long j88 = (j56 << 15) | (j56 >>> 49);
            long j89 = (j50 << 10) | (j50 >>> 54);
            long j90 = (j54 << 6) | (j54 >>> 58);
            long j91 = (j45 << c14) | (j45 >>> 61);
            long j92 = j43 ^ ((~j69) & j75);
            j3 = ((~j75) & j87) ^ j69;
            long j93 = j75 ^ ((~j87) & j81);
            long j94 = j87 ^ ((~j81) & j43);
            long j95 = j81 ^ ((~j43) & j69);
            long j96 = j86 ^ ((~j70) & j91);
            long j97 = ((~j91) & j84) ^ j70;
            long j98 = ((~j84) & j71) ^ j91;
            long j99 = j84 ^ ((~j71) & j86);
            long j100 = ((~j86) & j70) ^ j71;
            j18 = j68 ^ ((~j90) & j76);
            long j101 = ((~j76) & j77) ^ j90;
            long j102 = ((~j77) & j73) ^ j76;
            long j103 = j77 ^ ((~j73) & j68);
            j22 = j73 ^ ((~j68) & j90);
            long j104 = j80 ^ ((~j85) & j89);
            long j105 = j85 ^ ((~j89) & j88);
            long j106 = ((~j88) & j78) ^ j89;
            long j107 = j88 ^ ((~j78) & j80);
            long j108 = ((~j80) & j85) ^ j78;
            long j109 = j74 ^ ((~j83) & j72);
            long j110 = ((~j72) & j79) ^ j83;
            long j111 = j72 ^ ((~j79) & j82);
            j31 = j79 ^ ((~j82) & j74);
            j24 = j105;
            j15 = j98;
            j29 = j110;
            j28 = j109;
            j30 = j111;
            j17 = j100;
            j16 = j99;
            j25 = j106;
            j21 = j103;
            j27 = j108;
            j13 = j96;
            j20 = j102;
            j14 = j97;
            c12 = c15;
            c10 = c13;
            j32 = j82 ^ ((~j74) & j83);
            jArr2 = jArr2;
            i10 = i12 + 1;
            j = j92 ^ KeccakRoundConstants[i12];
            j11 = j94;
            j12 = j95;
            j19 = j101;
            i3 = i11;
            j26 = j107;
            j23 = j104;
            c11 = c14;
            j10 = j93;
        }
        long[] jArr3 = jArr2;
        jArr3[0] = j;
        jArr3[1] = j3;
        jArr3[c10] = j10;
        jArr3[c11] = j11;
        jArr3[c12] = j12;
        jArr3[5] = j13;
        jArr3[6] = j14;
        jArr3[7] = j15;
        jArr3[8] = j16;
        jArr3[9] = j17;
        jArr3[10] = j18;
        jArr3[11] = j19;
        jArr3[12] = j20;
        jArr3[13] = j21;
        jArr3[14] = j22;
        jArr3[15] = j23;
        jArr3[16] = j24;
        jArr3[17] = j25;
        jArr3[18] = j26;
        jArr3[19] = j27;
        jArr3[20] = j28;
        jArr3[21] = j29;
        jArr3[22] = j30;
        jArr3[23] = j31;
        jArr3[i3] = j32;
    }

    private void init(int i3) {
        if (i3 != 128 && i3 != 224 && i3 != 256 && i3 != 288 && i3 != 384 && i3 != 512) {
            throw new IllegalArgumentException(StubApp.getString2(28492));
        }
        initSponge(1600 - (i3 << 1));
    }

    private void initSponge(int i3) {
        if (i3 <= 0 || i3 >= 1600 || i3 % 64 != 0) {
            throw new IllegalStateException(StubApp.getString2(28493));
        }
        this.rate = i3;
        int i10 = 0;
        while (true) {
            long[] jArr = this.state;
            if (i10 >= jArr.length) {
                Arrays.fill(this.dataQueue, (byte) 0);
                this.bitsInQueue = 0;
                this.squeezing = false;
                this.fixedOutputLength = (1600 - i3) / 2;
                return;
            }
            jArr[i10] = 0;
            i10++;
        }
    }

    public void SHAKE256_512_ds(byte[] bArr, byte[] bArr2, int i3, byte[] bArr3) {
        int i10 = 0;
        while (true) {
            long[] jArr = this.state;
            if (i10 >= jArr.length) {
                KeccakIncAbsorb(bArr2, i3);
                KeccakIncAbsorb(bArr3, bArr3.length);
                KeccakIncFinalize(31);
                KeccakIncSqueeze(bArr, 64);
                return;
            }
            jArr[i10] = 0;
            i10++;
        }
    }

    public void expandSeed(byte[] bArr, int i3) {
        int i10 = i3 % 8;
        byte[] bArr2 = new byte[8];
        int i11 = i3 - i10;
        KeccakIncSqueeze(bArr, i11);
        if (i10 != 0) {
            KeccakIncSqueeze(bArr2, 8);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i11 + i12] = bArr2[i12];
            }
        }
    }

    public void randomGeneratorInit(byte[] bArr, byte[] bArr2, int i3, int i10) {
        KeccakIncAbsorb(bArr, i3);
        KeccakIncAbsorb(bArr2, i10);
        KeccakIncAbsorb(new byte[]{1}, 1);
        KeccakIncFinalize(31);
    }

    public void seedExpanderInit(byte[] bArr, int i3) {
        KeccakIncAbsorb(bArr, i3);
        KeccakIncAbsorb(new byte[]{2}, 1);
        KeccakIncFinalize(31);
    }

    public void squeeze(byte[] bArr, int i3) {
        KeccakIncSqueeze(bArr, i3);
    }
}
