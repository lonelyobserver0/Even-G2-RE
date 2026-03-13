package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Kangaroo {
    private static final int DIGESTLEN = 32;

    public static abstract class KangarooBase implements ExtendedDigest, Xof {
        private static final int BLKSIZE = 8192;
        private final CryptoServicePurpose purpose;
        private final byte[] singleByte = new byte[1];
        private boolean squeezing;
        private final int theChainLen;
        private int theCurrNode;
        private final KangarooSponge theLeaf;
        private byte[] thePersonal;
        private int theProcessed;
        private final KangarooSponge theTree;
        private static final byte[] SINGLE = {7};
        private static final byte[] INTERMEDIATE = {11};
        private static final byte[] FINAL = {-1, -1, 6};
        private static final byte[] FIRST = {3, 0, 0, 0, 0, 0, 0, 0};

        public KangarooBase(int i3, int i10, int i11, CryptoServicePurpose cryptoServicePurpose) {
            this.theTree = new KangarooSponge(i3, i10);
            this.theLeaf = new KangarooSponge(i3, i10);
            this.theChainLen = i3 >> 2;
            buildPersonal(null);
            this.purpose = cryptoServicePurpose;
            CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i3, cryptoServicePurpose));
        }

        private void buildPersonal(byte[] bArr) {
            int length = bArr == null ? 0 : bArr.length;
            byte[] lengthEncode = lengthEncode(length);
            byte[] copyOf = bArr == null ? new byte[lengthEncode.length + length] : Arrays.copyOf(bArr, lengthEncode.length + length);
            this.thePersonal = copyOf;
            System.arraycopy(lengthEncode, 0, copyOf, length, lengthEncode.length);
        }

        private static byte[] lengthEncode(long j) {
            byte b2;
            if (j != 0) {
                long j3 = j;
                b2 = 1;
                while (true) {
                    j3 >>= 8;
                    if (j3 == 0) {
                        break;
                    }
                    b2 = (byte) (b2 + 1);
                }
            } else {
                b2 = 0;
            }
            byte[] bArr = new byte[b2 + 1];
            bArr[b2] = b2;
            for (int i3 = 0; i3 < b2; i3++) {
                bArr[i3] = (byte) (j >> (((b2 - i3) - 1) * 8));
            }
            return bArr;
        }

        private void processData(byte[] bArr, int i3, int i10) {
            if (this.squeezing) {
                throw new IllegalStateException(StubApp.getString2(28488));
            }
            KangarooSponge kangarooSponge = this.theCurrNode == 0 ? this.theTree : this.theLeaf;
            int i11 = 8192 - this.theProcessed;
            if (i11 >= i10) {
                kangarooSponge.absorb(bArr, i3, i10);
                this.theProcessed += i10;
                return;
            }
            if (i11 > 0) {
                kangarooSponge.absorb(bArr, i3, i11);
                this.theProcessed += i11;
            }
            while (i11 < i10) {
                if (this.theProcessed == 8192) {
                    switchLeaf(true);
                }
                int min = Math.min(i10 - i11, 8192);
                this.theLeaf.absorb(bArr, i3 + i11, min);
                this.theProcessed += min;
                i11 += min;
            }
        }

        private void switchFinal() {
            switchLeaf(false);
            byte[] lengthEncode = lengthEncode(this.theCurrNode);
            this.theTree.absorb(lengthEncode, 0, lengthEncode.length);
            KangarooSponge kangarooSponge = this.theTree;
            byte[] bArr = FINAL;
            kangarooSponge.absorb(bArr, 0, bArr.length);
            this.theTree.padAndSwitchToSqueezingPhase();
        }

        private void switchLeaf(boolean z2) {
            if (this.theCurrNode == 0) {
                KangarooSponge kangarooSponge = this.theTree;
                byte[] bArr = FIRST;
                kangarooSponge.absorb(bArr, 0, bArr.length);
            } else {
                KangarooSponge kangarooSponge2 = this.theLeaf;
                byte[] bArr2 = INTERMEDIATE;
                kangarooSponge2.absorb(bArr2, 0, bArr2.length);
                int i3 = this.theChainLen;
                byte[] bArr3 = new byte[i3];
                this.theLeaf.squeeze(bArr3, 0, i3);
                this.theTree.absorb(bArr3, 0, this.theChainLen);
                this.theLeaf.initSponge();
            }
            if (z2) {
                this.theCurrNode++;
            }
            this.theProcessed = 0;
        }

        private void switchSingle() {
            this.theTree.absorb(SINGLE, 0, 1);
            this.theTree.padAndSwitchToSqueezingPhase();
        }

        private void switchToSqueezing() {
            byte[] bArr = this.thePersonal;
            processData(bArr, 0, bArr.length);
            if (this.theCurrNode == 0) {
                switchSingle();
            } else {
                switchFinal();
            }
        }

        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i3) {
            return doFinal(bArr, i3, getDigestSize());
        }

        @Override // org.bouncycastle.crypto.Xof
        public int doOutput(byte[] bArr, int i3, int i10) {
            if (!this.squeezing) {
                switchToSqueezing();
            }
            if (i10 < 0) {
                throw new IllegalArgumentException(StubApp.getString2(28489));
            }
            this.theTree.squeeze(bArr, i3, i10);
            return i10;
        }

        @Override // org.bouncycastle.crypto.ExtendedDigest
        public int getByteLength() {
            return this.theTree.theRateBytes;
        }

        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return this.theChainLen >> 1;
        }

        public void init(KangarooParameters kangarooParameters) {
            buildPersonal(kangarooParameters.getPersonalisation());
            reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
            this.theTree.initSponge();
            this.theLeaf.initSponge();
            this.theCurrNode = 0;
            this.theProcessed = 0;
            this.squeezing = false;
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b2) {
            byte[] bArr = this.singleByte;
            bArr[0] = b2;
            update(bArr, 0, 1);
        }

        @Override // org.bouncycastle.crypto.Xof
        public int doFinal(byte[] bArr, int i3, int i10) {
            if (this.squeezing) {
                throw new IllegalStateException(StubApp.getString2(28473));
            }
            int doOutput = doOutput(bArr, i3, i10);
            reset();
            return doOutput;
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i3, int i10) {
            processData(bArr, i3, i10);
        }
    }

    public static class KangarooParameters implements CipherParameters {
        private byte[] thePersonal;

        public static class Builder {
            private byte[] thePersonal;

            public KangarooParameters build() {
                KangarooParameters kangarooParameters = new KangarooParameters();
                byte[] bArr = this.thePersonal;
                if (bArr != null) {
                    kangarooParameters.thePersonal = bArr;
                }
                return kangarooParameters;
            }

            public Builder setPersonalisation(byte[] bArr) {
                this.thePersonal = Arrays.clone(bArr);
                return this;
            }
        }

        public byte[] getPersonalisation() {
            return Arrays.clone(this.thePersonal);
        }
    }

    public static class KangarooSponge {
        private static long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
        private int bytesInQueue;
        private boolean squeezing;
        private final byte[] theQueue;
        private final int theRateBytes;
        private final int theRounds;
        private final long[] theState = new long[25];

        public KangarooSponge(int i3, int i10) {
            int i11 = (1600 - (i3 << 1)) >> 3;
            this.theRateBytes = i11;
            this.theRounds = i10;
            this.theQueue = new byte[i11];
            initSponge();
        }

        private void KangarooAbsorb(byte[] bArr, int i3) {
            int i10 = this.theRateBytes >> 3;
            for (int i11 = 0; i11 < i10; i11++) {
                long[] jArr = this.theState;
                jArr[i11] = jArr[i11] ^ Pack.littleEndianToLong(bArr, i3);
                i3 += 8;
            }
            KangarooPermutation();
        }

        private void KangarooExtract() {
            Pack.longToLittleEndian(this.theState, 0, this.theRateBytes >> 3, this.theQueue, 0);
        }

        private void KangarooPermutation() {
            KangarooSponge kangarooSponge = this;
            long[] jArr = kangarooSponge.theState;
            long j = jArr[0];
            long j3 = jArr[1];
            long j10 = jArr[2];
            char c10 = 3;
            long j11 = jArr[3];
            char c11 = 4;
            long j12 = jArr[4];
            long j13 = jArr[5];
            long j14 = jArr[6];
            long j15 = jArr[7];
            long j16 = jArr[8];
            long j17 = jArr[9];
            long j18 = jArr[10];
            long j19 = jArr[11];
            long j20 = jArr[12];
            long j21 = jArr[13];
            long j22 = jArr[14];
            long j23 = jArr[15];
            long j24 = jArr[16];
            long j25 = jArr[17];
            long j26 = jArr[18];
            long j27 = jArr[19];
            long j28 = jArr[20];
            long j29 = jArr[21];
            long j30 = jArr[22];
            long j31 = jArr[23];
            long j32 = jArr[24];
            int length = KeccakRoundConstants.length - kangarooSponge.theRounds;
            int i3 = 0;
            while (i3 < kangarooSponge.theRounds) {
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
                char c12 = c10;
                long j69 = (j49 << 44) | (j49 >>> 20);
                char c13 = c11;
                long j70 = (j64 << 20) | (j64 >>> 44);
                long j71 = (j57 << 61) | (j57 >>> c12);
                long j72 = (j65 << 39) | (j65 >>> 25);
                long j73 = (j47 << 18) | (j47 >>> 46);
                int i10 = i3;
                long j74 = (j53 << 62) | (j53 >>> 2);
                long j75 = (j55 << 43) | (j55 >>> 21);
                long j76 = (j60 << 25) | (j60 >>> 39);
                long j77 = (j66 << 8) | (j66 >>> 56);
                long j78 = (j62 << 56) | (j62 >>> 8);
                long j79 = (j46 << 41) | (j46 >>> 23);
                long j80 = (j63 << 27) | (j63 >>> 37);
                long j81 = (j67 << 14) | (j67 >>> 50);
                long j82 = (j52 << 2) | (j52 >>> 62);
                long j83 = (j59 << 55) | (j59 >>> 9);
                long j84 = (j51 << 45) | (j51 >>> 19);
                long j85 = (j44 << 36) | (j44 >>> 28);
                long j86 = (j58 << 28) | (j58 >>> 36);
                long j87 = (j61 << 21) | (j61 >>> 43);
                long j88 = (j56 << 15) | (j56 >>> 49);
                long j89 = (j50 << 10) | (j50 >>> 54);
                long j90 = (j54 << 6) | (j54 >>> 58);
                long j91 = (j45 << c12) | (j45 >>> 61);
                long j92 = ((~j69) & j75) ^ j43;
                long j93 = ((~j75) & j87) ^ j69;
                long j94 = j75 ^ ((~j87) & j81);
                long j95 = j87 ^ ((~j81) & j43);
                long j96 = ((~j43) & j69) ^ j81;
                long j97 = j86 ^ ((~j70) & j91);
                long j98 = ((~j91) & j84) ^ j70;
                int i11 = length;
                long j99 = ((~j84) & j71) ^ j91;
                j16 = j84 ^ ((~j71) & j86);
                long j100 = ((~j86) & j70) ^ j71;
                j18 = j68 ^ ((~j90) & j76);
                long j101 = ((~j76) & j77) ^ j90;
                long j102 = ((~j77) & j73) ^ j76;
                j21 = j77 ^ ((~j73) & j68);
                long j103 = ((~j68) & j90) ^ j73;
                long j104 = j80 ^ ((~j85) & j89);
                long j105 = ((~j89) & j88) ^ j85;
                long j106 = j89 ^ ((~j88) & j78);
                long j107 = j88 ^ ((~j78) & j80);
                long j108 = j78 ^ ((~j80) & j85);
                long j109 = j74 ^ ((~j83) & j72);
                long j110 = ((~j72) & j79) ^ j83;
                long j111 = j72 ^ ((~j79) & j82);
                j31 = j79 ^ ((~j82) & j74);
                j32 = j82 ^ ((~j74) & j83);
                j = j92 ^ KeccakRoundConstants[i11 + i10];
                j20 = j102;
                j15 = j99;
                jArr = jArr;
                c10 = c12;
                j14 = j98;
                length = i11;
                j27 = j108;
                j24 = j105;
                j19 = j101;
                j26 = j107;
                j22 = j103;
                j28 = j109;
                j29 = j110;
                j30 = j111;
                j17 = j100;
                j12 = j96;
                j25 = j106;
                j23 = j104;
                j11 = j95;
                c11 = c13;
                j13 = j97;
                j10 = j94;
                j3 = j93;
                i3 = i10 + 1;
                kangarooSponge = this;
            }
            long[] jArr2 = jArr;
            jArr2[0] = j;
            jArr2[1] = j3;
            jArr2[2] = j10;
            jArr2[c10] = j11;
            jArr2[c11] = j12;
            jArr2[5] = j13;
            jArr2[6] = j14;
            jArr2[7] = j15;
            jArr2[8] = j16;
            jArr2[9] = j17;
            jArr2[10] = j18;
            jArr2[11] = j19;
            jArr2[12] = j20;
            jArr2[13] = j21;
            jArr2[14] = j22;
            jArr2[15] = j23;
            jArr2[16] = j24;
            jArr2[17] = j25;
            jArr2[18] = j26;
            jArr2[19] = j27;
            jArr2[20] = j28;
            jArr2[21] = j29;
            jArr2[22] = j30;
            jArr2[23] = j31;
            jArr2[24] = j32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void absorb(byte[] bArr, int i3, int i10) {
            int i11;
            if (this.squeezing) {
                throw new IllegalStateException(StubApp.getString2(28488));
            }
            int i12 = 0;
            while (i12 < i10) {
                int i13 = this.bytesInQueue;
                if (i13 != 0 || i12 > i10 - this.theRateBytes) {
                    int min = Math.min(this.theRateBytes - i13, i10 - i12);
                    System.arraycopy(bArr, i3 + i12, this.theQueue, this.bytesInQueue, min);
                    int i14 = this.bytesInQueue + min;
                    this.bytesInQueue = i14;
                    i12 += min;
                    if (i14 == this.theRateBytes) {
                        KangarooAbsorb(this.theQueue, 0);
                        this.bytesInQueue = 0;
                    }
                } else {
                    do {
                        KangarooAbsorb(bArr, i3 + i12);
                        i11 = this.theRateBytes;
                        i12 += i11;
                    } while (i12 <= i10 - i11);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initSponge() {
            Arrays.fill(this.theState, 0L);
            Arrays.fill(this.theQueue, (byte) 0);
            this.bytesInQueue = 0;
            this.squeezing = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void padAndSwitchToSqueezingPhase() {
            int i3 = this.bytesInQueue;
            while (true) {
                int i10 = this.theRateBytes;
                if (i3 >= i10) {
                    byte[] bArr = this.theQueue;
                    int i11 = i10 - 1;
                    bArr[i11] = (byte) (bArr[i11] ^ ByteCompanionObject.MIN_VALUE);
                    KangarooAbsorb(bArr, 0);
                    KangarooExtract();
                    this.bytesInQueue = this.theRateBytes;
                    this.squeezing = true;
                    return;
                }
                this.theQueue[i3] = 0;
                i3++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void squeeze(byte[] bArr, int i3, int i10) {
            if (!this.squeezing) {
                padAndSwitchToSqueezingPhase();
            }
            int i11 = 0;
            while (i11 < i10) {
                if (this.bytesInQueue == 0) {
                    KangarooPermutation();
                    KangarooExtract();
                    this.bytesInQueue = this.theRateBytes;
                }
                int min = Math.min(this.bytesInQueue, i10 - i11);
                System.arraycopy(this.theQueue, this.theRateBytes - this.bytesInQueue, bArr, i3 + i11, min);
                this.bytesInQueue -= min;
                i11 += min;
            }
        }
    }

    public static class KangarooTwelve extends KangarooBase {
        public KangarooTwelve() {
            this(32, CryptoServicePurpose.ANY);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i3) {
            return super.doFinal(bArr, i3);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i3, int i10) {
            return super.doOutput(bArr, i3, i10);
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return StubApp.getString2(28490);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.ExtendedDigest
        public /* bridge */ /* synthetic */ int getByteLength() {
            return super.getByteLength();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int getDigestSize() {
            return super.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase
        public /* bridge */ /* synthetic */ void init(KangarooParameters kangarooParameters) {
            super.init(kangarooParameters);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte b2) {
            super.update(b2);
        }

        public KangarooTwelve(int i3, CryptoServicePurpose cryptoServicePurpose) {
            super(128, 12, i3, cryptoServicePurpose);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i3, int i10) {
            return super.doFinal(bArr, i3, i10);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte[] bArr, int i3, int i10) {
            super.update(bArr, i3, i10);
        }

        public KangarooTwelve(CryptoServicePurpose cryptoServicePurpose) {
            this(32, cryptoServicePurpose);
        }
    }

    public static class MarsupilamiFourteen extends KangarooBase {
        public MarsupilamiFourteen() {
            this(32, CryptoServicePurpose.ANY);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i3) {
            return super.doFinal(bArr, i3);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i3, int i10) {
            return super.doOutput(bArr, i3, i10);
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return StubApp.getString2(28491);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.ExtendedDigest
        public /* bridge */ /* synthetic */ int getByteLength() {
            return super.getByteLength();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int getDigestSize() {
            return super.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase
        public /* bridge */ /* synthetic */ void init(KangarooParameters kangarooParameters) {
            super.init(kangarooParameters);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte b2) {
            super.update(b2);
        }

        public MarsupilamiFourteen(int i3, CryptoServicePurpose cryptoServicePurpose) {
            super(256, 14, i3, cryptoServicePurpose);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i3, int i10) {
            return super.doFinal(bArr, i3, i10);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte[] bArr, int i3, int i10) {
            super.update(bArr, i3, i10);
        }

        public MarsupilamiFourteen(CryptoServicePurpose cryptoServicePurpose) {
            this(32, cryptoServicePurpose);
        }
    }
}
