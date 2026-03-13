package org.bouncycastle.crypto.digests;

import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class LongDigest implements ExtendedDigest, Memoable, EncodableDigest {
    private static final int BYTE_LENGTH = 128;

    /* renamed from: K, reason: collision with root package name */
    static final long[] f18802K = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: H1, reason: collision with root package name */
    protected long f18803H1;
    protected long H2;

    /* renamed from: H3, reason: collision with root package name */
    protected long f18804H3;

    /* renamed from: H4, reason: collision with root package name */
    protected long f18805H4;

    /* renamed from: H5, reason: collision with root package name */
    protected long f18806H5;

    /* renamed from: H6, reason: collision with root package name */
    protected long f18807H6;

    /* renamed from: H7, reason: collision with root package name */
    protected long f18808H7;

    /* renamed from: H8, reason: collision with root package name */
    protected long f18809H8;

    /* renamed from: W, reason: collision with root package name */
    private long[] f18810W;
    private long byteCount1;
    private long byteCount2;
    protected final CryptoServicePurpose purpose;
    private int wOff;
    private byte[] xBuf;
    private int xBufOff;

    public LongDigest() {
        this(CryptoServicePurpose.ANY);
    }

    private long Ch(long j, long j3, long j10) {
        return ((~j) & j10) ^ (j3 & j);
    }

    private long Maj(long j, long j3, long j10) {
        return ((j & j10) ^ (j & j3)) ^ (j3 & j10);
    }

    private long Sigma0(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    private long Sigma1(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    private long Sum0(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    private long Sum1(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    private void adjustByteCounts() {
        long j = this.byteCount1;
        if (j > 2305843009213693951L) {
            this.byteCount2 += j >>> 61;
            this.byteCount1 = j & 2305843009213693951L;
        }
    }

    public void copyIn(LongDigest longDigest) {
        byte[] bArr = longDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = longDigest.xBufOff;
        this.byteCount1 = longDigest.byteCount1;
        this.byteCount2 = longDigest.byteCount2;
        this.f18803H1 = longDigest.f18803H1;
        this.H2 = longDigest.H2;
        this.f18804H3 = longDigest.f18804H3;
        this.f18805H4 = longDigest.f18805H4;
        this.f18806H5 = longDigest.f18806H5;
        this.f18807H6 = longDigest.f18807H6;
        this.f18808H7 = longDigest.f18808H7;
        this.f18809H8 = longDigest.f18809H8;
        long[] jArr = longDigest.f18810W;
        System.arraycopy(jArr, 0, this.f18810W, 0, jArr.length);
        this.wOff = longDigest.wOff;
    }

    public abstract CryptoServiceProperties cryptoServiceProperties();

    public void finish() {
        adjustByteCounts();
        long j = this.byteCount1 << 3;
        long j3 = this.byteCount2;
        byte b2 = ByteCompanionObject.MIN_VALUE;
        while (true) {
            update(b2);
            if (this.xBufOff == 0) {
                processLength(j, j3);
                processBlock();
                return;
            }
            b2 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    public int getEncodedStateSize() {
        return (this.wOff * 8) + 96;
    }

    public void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 8);
        Pack.longToBigEndian(this.byteCount1, bArr, 12);
        Pack.longToBigEndian(this.byteCount2, bArr, 20);
        Pack.longToBigEndian(this.f18803H1, bArr, 28);
        Pack.longToBigEndian(this.H2, bArr, 36);
        Pack.longToBigEndian(this.f18804H3, bArr, 44);
        Pack.longToBigEndian(this.f18805H4, bArr, 52);
        Pack.longToBigEndian(this.f18806H5, bArr, 60);
        Pack.longToBigEndian(this.f18807H6, bArr, 68);
        Pack.longToBigEndian(this.f18808H7, bArr, 76);
        Pack.longToBigEndian(this.f18809H8, bArr, 84);
        Pack.intToBigEndian(this.wOff, bArr, 92);
        for (int i3 = 0; i3 < this.wOff; i3++) {
            Pack.longToBigEndian(this.f18810W[i3], bArr, (i3 * 8) + 96);
        }
    }

    public void processBlock() {
        adjustByteCounts();
        for (int i3 = 16; i3 <= 79; i3++) {
            long[] jArr = this.f18810W;
            long Sigma1 = Sigma1(jArr[i3 - 2]);
            long[] jArr2 = this.f18810W;
            jArr[i3] = Sigma1 + jArr2[i3 - 7] + Sigma0(jArr2[i3 - 15]) + this.f18810W[i3 - 16];
        }
        long j = this.f18803H1;
        long j3 = this.H2;
        long j10 = this.f18804H3;
        long j11 = this.f18805H4;
        long j12 = this.f18806H5;
        long j13 = j11;
        long j14 = this.f18807H6;
        int i10 = 0;
        int i11 = 0;
        long j15 = j10;
        long j16 = this.f18808H7;
        long j17 = this.f18809H8;
        long j18 = j;
        long j19 = j12;
        long j20 = j3;
        while (i10 < 10) {
            long j21 = j14;
            long j22 = j19;
            long j23 = j16;
            long Sum1 = Sum1(j19) + Ch(j19, j21, j16);
            long[] jArr3 = f18802K;
            int i12 = i11 + 1;
            long j24 = Sum1 + jArr3[i11] + this.f18810W[i11] + j17;
            long j25 = j13 + j24;
            long j26 = j18;
            long j27 = j20;
            long j28 = j15;
            long Sum0 = Sum0(j18) + Maj(j26, j27, j28) + j24;
            long Sum12 = Sum1(j25) + Ch(j25, j22, j21) + jArr3[i12];
            int i13 = i11 + 2;
            long j29 = Sum12 + this.f18810W[i12] + j23;
            long j30 = j28 + j29;
            long Sum02 = Sum0(Sum0) + Maj(Sum0, j26, j27) + j29;
            int i14 = i11 + 3;
            long Sum13 = Sum1(j30) + Ch(j30, j25, j22) + jArr3[i13] + this.f18810W[i13] + j21;
            long j31 = j27 + Sum13;
            long Sum03 = Sum0(Sum02) + Maj(Sum02, Sum0, j26) + Sum13;
            long Sum14 = Sum1(j31) + Ch(j31, j30, j25) + jArr3[i14];
            int i15 = i11 + 4;
            long j32 = Sum14 + this.f18810W[i14] + j22;
            long j33 = j26 + j32;
            long Sum04 = Sum0(Sum03) + Maj(Sum03, Sum02, Sum0) + j32;
            long Sum15 = Sum1(j33) + Ch(j33, j31, j30) + jArr3[i15];
            int i16 = i11 + 5;
            long j34 = Sum15 + this.f18810W[i15] + j25;
            long j35 = Sum0 + j34;
            long Sum05 = Sum0(Sum04) + Maj(Sum04, Sum03, Sum02) + j34;
            long Sum16 = Sum1(j35) + Ch(j35, j33, j31) + jArr3[i16];
            int i17 = i11 + 6;
            long j36 = Sum16 + this.f18810W[i16] + j30;
            long j37 = Sum02 + j36;
            long Sum06 = Sum0(Sum05) + Maj(Sum05, Sum04, Sum03) + j36;
            int i18 = i11 + 7;
            long Sum17 = Sum1(j37) + Ch(j37, j35, j33) + jArr3[i17] + this.f18810W[i17] + j31;
            long j38 = Sum03 + Sum17;
            long Sum07 = Sum0(Sum06) + Maj(Sum06, Sum05, Sum04) + Sum17;
            i11 += 8;
            long Sum18 = Sum1(j38) + Ch(j38, j37, j35) + jArr3[i18] + this.f18810W[i18] + j33;
            long Sum08 = Sum0(Sum07) + Maj(Sum07, Sum06, Sum05) + Sum18;
            i10++;
            j20 = Sum07;
            j15 = Sum06;
            j19 = Sum04 + Sum18;
            j17 = j35;
            j14 = j38;
            j13 = Sum05;
            j18 = Sum08;
            j16 = j37;
        }
        this.f18803H1 += j18;
        this.H2 += j20;
        this.f18804H3 += j15;
        this.f18805H4 += j13;
        this.f18806H5 += j19;
        this.f18807H6 += j14;
        this.f18808H7 += j16;
        this.f18809H8 += j17;
        this.wOff = 0;
        for (int i19 = 0; i19 < 16; i19++) {
            this.f18810W[i19] = 0;
        }
    }

    public void processLength(long j, long j3) {
        if (this.wOff > 14) {
            processBlock();
        }
        long[] jArr = this.f18810W;
        jArr[14] = j3;
        jArr[15] = j;
    }

    public void processWord(byte[] bArr, int i3) {
        this.f18810W[this.wOff] = Pack.bigEndianToLong(bArr, i3);
        int i10 = this.wOff + 1;
        this.wOff = i10;
        if (i10 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount1 = 0L;
        this.byteCount2 = 0L;
        int i3 = 0;
        this.xBufOff = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i10 >= bArr.length) {
                break;
            }
            bArr[i10] = 0;
            i10++;
        }
        this.wOff = 0;
        while (true) {
            long[] jArr = this.f18810W;
            if (i3 == jArr.length) {
                return;
            }
            jArr[i3] = 0;
            i3++;
        }
    }

    public void restoreState(byte[] bArr) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, 8);
        this.xBufOff = bigEndianToInt;
        System.arraycopy(bArr, 0, this.xBuf, 0, bigEndianToInt);
        this.byteCount1 = Pack.bigEndianToLong(bArr, 12);
        this.byteCount2 = Pack.bigEndianToLong(bArr, 20);
        this.f18803H1 = Pack.bigEndianToLong(bArr, 28);
        this.H2 = Pack.bigEndianToLong(bArr, 36);
        this.f18804H3 = Pack.bigEndianToLong(bArr, 44);
        this.f18805H4 = Pack.bigEndianToLong(bArr, 52);
        this.f18806H5 = Pack.bigEndianToLong(bArr, 60);
        this.f18807H6 = Pack.bigEndianToLong(bArr, 68);
        this.f18808H7 = Pack.bigEndianToLong(bArr, 76);
        this.f18809H8 = Pack.bigEndianToLong(bArr, 84);
        this.wOff = Pack.bigEndianToInt(bArr, 92);
        for (int i3 = 0; i3 < this.wOff; i3++) {
            this.f18810W[i3] = Pack.bigEndianToLong(bArr, (i3 * 8) + 96);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        byte[] bArr = this.xBuf;
        int i3 = this.xBufOff;
        int i10 = i3 + 1;
        this.xBufOff = i10;
        bArr[i3] = b2;
        if (i10 == bArr.length) {
            processWord(bArr, 0);
            this.xBufOff = 0;
        }
        this.byteCount1++;
    }

    public LongDigest(CryptoServicePurpose cryptoServicePurpose) {
        this.xBuf = new byte[8];
        this.f18810W = new long[80];
        this.purpose = cryptoServicePurpose;
        this.xBufOff = 0;
        reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        while (this.xBufOff != 0 && i10 > 0) {
            update(bArr[i3]);
            i3++;
            i10--;
        }
        while (i10 >= this.xBuf.length) {
            processWord(bArr, i3);
            byte[] bArr2 = this.xBuf;
            i3 += bArr2.length;
            i10 -= bArr2.length;
            this.byteCount1 += bArr2.length;
        }
        while (i10 > 0) {
            update(bArr[i3]);
            i3++;
            i10--;
        }
    }

    public LongDigest(LongDigest longDigest) {
        this.xBuf = new byte[8];
        this.f18810W = new long[80];
        this.purpose = longDigest.purpose;
        copyIn(longDigest);
    }
}
