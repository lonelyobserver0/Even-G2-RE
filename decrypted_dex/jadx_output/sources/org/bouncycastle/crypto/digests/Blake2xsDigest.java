package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Blake2xsDigest implements Xof {
    private static final int DIGEST_LENGTH = 32;
    private static final long MAX_NUMBER_BLOCKS = 4294967296L;
    public static final int UNKNOWN_DIGEST_LENGTH = 65535;
    private long blockPos;
    private byte[] buf;
    private int bufPos;
    private int digestLength;
    private int digestPos;
    private byte[] h0;
    private Blake2sDigest hash;
    private long nodeOffset;
    private final CryptoServicePurpose purpose;

    public Blake2xsDigest() {
        this(UNKNOWN_DIGEST_LENGTH, CryptoServicePurpose.ANY);
    }

    private long computeNodeOffset() {
        return this.digestLength * MAX_NUMBER_BLOCKS;
    }

    private int computeStepLength() {
        int i3 = this.digestLength;
        if (i3 == 65535) {
            return 32;
        }
        return Math.min(32, i3 - this.digestPos);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        return doFinal(bArr, i3, bArr.length);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i3, int i10) {
        if (this.h0 == null) {
            byte[] bArr2 = new byte[this.hash.getDigestSize()];
            this.h0 = bArr2;
            this.hash.doFinal(bArr2, 0);
        }
        int i11 = this.digestLength;
        if (i11 != 65535) {
            if (this.digestPos + i10 > i11) {
                throw new IllegalArgumentException(StubApp.getString2(28470));
            }
        } else if ((this.blockPos << 5) >= getUnknownMaxLength()) {
            throw new IllegalArgumentException(StubApp.getString2(28471));
        }
        for (int i12 = 0; i12 < i10; i12++) {
            if (this.bufPos >= 32) {
                Blake2sDigest blake2sDigest = new Blake2sDigest(computeStepLength(), 32, this.nodeOffset);
                byte[] bArr3 = this.h0;
                blake2sDigest.update(bArr3, 0, bArr3.length);
                Arrays.fill(this.buf, (byte) 0);
                blake2sDigest.doFinal(this.buf, 0);
                this.bufPos = 0;
                this.nodeOffset++;
                this.blockPos++;
            }
            byte[] bArr4 = this.buf;
            int i13 = this.bufPos;
            bArr[i12] = bArr4[i13];
            this.bufPos = i13 + 1;
            this.digestPos++;
        }
        return i10;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28472);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.hash.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    public long getUnknownMaxLength() {
        return 137438953472L;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.hash.reset();
        this.h0 = null;
        this.bufPos = 32;
        this.digestPos = 0;
        this.blockPos = 0L;
        this.nodeOffset = computeNodeOffset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        this.hash.update(b2);
    }

    public Blake2xsDigest(int i3) {
        this(i3, CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i3, int i10) {
        int doOutput = doOutput(bArr, i3, i10);
        reset();
        return doOutput;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        this.hash.update(bArr, i3, i10);
    }

    public Blake2xsDigest(int i3, CryptoServicePurpose cryptoServicePurpose) {
        this(i3, null, null, null, cryptoServicePurpose);
    }

    public Blake2xsDigest(int i3, byte[] bArr) {
        this(i3, bArr, null, null, CryptoServicePurpose.ANY);
    }

    public Blake2xsDigest(int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, CryptoServicePurpose cryptoServicePurpose) {
        this.h0 = null;
        this.buf = new byte[32];
        this.bufPos = 32;
        this.digestPos = 0;
        this.blockPos = 0L;
        if (i3 < 1 || i3 > 65535) {
            throw new IllegalArgumentException(StubApp.getString2(28469));
        }
        this.digestLength = i3;
        long computeNodeOffset = computeNodeOffset();
        this.nodeOffset = computeNodeOffset;
        this.purpose = cryptoServicePurpose;
        this.hash = new Blake2sDigest(32, bArr, bArr2, bArr3, computeNodeOffset, cryptoServicePurpose);
    }

    public Blake2xsDigest(Blake2xsDigest blake2xsDigest) {
        this.h0 = null;
        this.buf = new byte[32];
        this.bufPos = 32;
        this.digestPos = 0;
        this.blockPos = 0L;
        this.digestLength = blake2xsDigest.digestLength;
        this.hash = new Blake2sDigest(blake2xsDigest.hash);
        this.h0 = Arrays.clone(blake2xsDigest.h0);
        this.buf = Arrays.clone(blake2xsDigest.buf);
        this.bufPos = blake2xsDigest.bufPos;
        this.digestPos = blake2xsDigest.digestPos;
        this.blockPos = blake2xsDigest.blockPos;
        this.nodeOffset = blake2xsDigest.nodeOffset;
        this.purpose = blake2xsDigest.purpose;
    }
}
