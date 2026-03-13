package org.bouncycastle.crypto.digests;

import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class GeneralDigest implements ExtendedDigest, Memoable {
    private static final int BYTE_LENGTH = 64;
    private long byteCount;
    protected final CryptoServicePurpose purpose;
    private final byte[] xBuf;
    private int xBufOff;

    public GeneralDigest() {
        this(CryptoServicePurpose.ANY);
    }

    public void copyIn(GeneralDigest generalDigest) {
        byte[] bArr = generalDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = generalDigest.xBufOff;
        this.byteCount = generalDigest.byteCount;
    }

    public abstract CryptoServiceProperties cryptoServiceProperties();

    public void finish() {
        long j = this.byteCount << 3;
        byte b2 = ByteCompanionObject.MIN_VALUE;
        while (true) {
            update(b2);
            if (this.xBufOff == 0) {
                processLength(j);
                processBlock();
                return;
            }
            b2 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    public void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 4);
        Pack.longToBigEndian(this.byteCount, bArr, 8);
    }

    public abstract void processBlock();

    public abstract void processLength(long j);

    public abstract void processWord(byte[] bArr, int i3);

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i3 >= bArr.length) {
                return;
            }
            bArr[i3] = 0;
            i3++;
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
        this.byteCount++;
    }

    public GeneralDigest(CryptoServicePurpose cryptoServicePurpose) {
        this.xBuf = new byte[4];
        this.purpose = cryptoServicePurpose;
        this.xBufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        int i11 = 0;
        int max = Math.max(0, i10);
        if (this.xBufOff != 0) {
            int i12 = 0;
            while (true) {
                if (i12 >= max) {
                    i11 = i12;
                    break;
                }
                byte[] bArr2 = this.xBuf;
                int i13 = this.xBufOff;
                int i14 = i13 + 1;
                this.xBufOff = i14;
                int i15 = i12 + 1;
                bArr2[i13] = bArr[i12 + i3];
                if (i14 == 4) {
                    processWord(bArr2, 0);
                    this.xBufOff = 0;
                    i11 = i15;
                    break;
                }
                i12 = i15;
            }
        }
        int i16 = max - 3;
        while (i11 < i16) {
            processWord(bArr, i3 + i11);
            i11 += 4;
        }
        while (i11 < max) {
            byte[] bArr3 = this.xBuf;
            int i17 = this.xBufOff;
            this.xBufOff = i17 + 1;
            bArr3[i17] = bArr[i11 + i3];
            i11++;
        }
        this.byteCount += max;
    }

    public GeneralDigest(GeneralDigest generalDigest) {
        this.xBuf = new byte[4];
        this.purpose = generalDigest.purpose;
        copyIn(generalDigest);
    }

    public GeneralDigest(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        this.xBuf = bArr2;
        this.purpose = CryptoServicePurpose.values()[bArr[bArr.length - 1]];
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.xBufOff = Pack.bigEndianToInt(bArr, 4);
        this.byteCount = Pack.bigEndianToLong(bArr, 8);
    }
}
