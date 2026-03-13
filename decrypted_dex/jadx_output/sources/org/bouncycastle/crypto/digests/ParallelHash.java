package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ParallelHash implements Xof, Digest {
    private static final byte[] N_PARALLEL_HASH = Strings.toByteArray(StubApp.getString2(28499));

    /* renamed from: B, reason: collision with root package name */
    private final int f18823B;
    private final int bitLength;
    private int bufOff;
    private final byte[] buffer;
    private final CSHAKEDigest compressor;
    private final byte[] compressorBuffer;
    private final CSHAKEDigest cshake;
    private boolean firstOutput;
    private int nCount;
    private final int outputLength;
    private final CryptoServicePurpose purpose;

    public ParallelHash(int i3, byte[] bArr, int i10) {
        this(i3, bArr, i10, i3 * 2, CryptoServicePurpose.ANY);
    }

    private void compress() {
        compress(this.buffer, 0, this.bufOff);
        this.bufOff = 0;
    }

    private void wrapUp(int i3) {
        if (this.bufOff != 0) {
            compress();
        }
        byte[] rightEncode = XofUtils.rightEncode(this.nCount);
        byte[] rightEncode2 = XofUtils.rightEncode(i3 * 8);
        this.cshake.update(rightEncode, 0, rightEncode.length);
        this.cshake.update(rightEncode2, 0, rightEncode2.length);
        this.firstOutput = false;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        if (this.firstOutput) {
            wrapUp(this.outputLength);
        }
        int doFinal = this.cshake.doFinal(bArr, i3, getDigestSize());
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i3, int i10) {
        if (this.firstOutput) {
            wrapUp(0);
        }
        return this.cshake.doOutput(bArr, i3, i10);
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28499) + this.cshake.getAlgorithmName().substring(6);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.cshake.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.outputLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.cshake.reset();
        Arrays.clear(this.buffer);
        byte[] leftEncode = XofUtils.leftEncode(this.f18823B);
        this.cshake.update(leftEncode, 0, leftEncode.length);
        this.nCount = 0;
        this.bufOff = 0;
        this.firstOutput = true;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) throws IllegalStateException {
        byte[] bArr = this.buffer;
        int i3 = this.bufOff;
        int i10 = i3 + 1;
        this.bufOff = i10;
        bArr[i3] = b2;
        if (i10 == bArr.length) {
            compress();
        }
    }

    public ParallelHash(int i3, byte[] bArr, int i10, int i11) {
        this(i3, bArr, i10, i11, CryptoServicePurpose.ANY);
    }

    private void compress(byte[] bArr, int i3, int i10) {
        this.compressor.update(bArr, i3, i10);
        CSHAKEDigest cSHAKEDigest = this.compressor;
        byte[] bArr2 = this.compressorBuffer;
        cSHAKEDigest.doFinal(bArr2, 0, bArr2.length);
        CSHAKEDigest cSHAKEDigest2 = this.cshake;
        byte[] bArr3 = this.compressorBuffer;
        cSHAKEDigest2.update(bArr3, 0, bArr3.length);
        this.nCount++;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i3, int i10) {
        if (this.firstOutput) {
            wrapUp(this.outputLength);
        }
        int doFinal = this.cshake.doFinal(bArr, i3, i10);
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalStateException {
        int i11 = 0;
        int max = Math.max(0, i10);
        if (this.bufOff != 0) {
            while (i11 < max) {
                int i12 = this.bufOff;
                byte[] bArr2 = this.buffer;
                if (i12 == bArr2.length) {
                    break;
                }
                this.bufOff = i12 + 1;
                bArr2[i12] = bArr[i11 + i3];
                i11++;
            }
            if (this.bufOff == this.buffer.length) {
                compress();
            }
        }
        if (i11 < max) {
            while (true) {
                int i13 = max - i11;
                int i14 = this.f18823B;
                if (i13 < i14) {
                    break;
                }
                compress(bArr, i3 + i11, i14);
                i11 += this.f18823B;
            }
        }
        while (i11 < max) {
            update(bArr[i11 + i3]);
            i11++;
        }
    }

    public ParallelHash(int i3, byte[] bArr, int i10, int i11, CryptoServicePurpose cryptoServicePurpose) {
        this.cshake = new CSHAKEDigest(i3, N_PARALLEL_HASH, bArr);
        this.compressor = new CSHAKEDigest(i3, new byte[0], new byte[0]);
        this.bitLength = i3;
        this.f18823B = i10;
        this.outputLength = (i11 + 7) / 8;
        this.buffer = new byte[i10];
        this.compressorBuffer = new byte[(i3 * 2) / 8];
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i3, cryptoServicePurpose));
        reset();
    }

    public ParallelHash(ParallelHash parallelHash) {
        this.cshake = new CSHAKEDigest(parallelHash.cshake);
        this.compressor = new CSHAKEDigest(parallelHash.compressor);
        int i3 = parallelHash.bitLength;
        this.bitLength = i3;
        this.f18823B = parallelHash.f18823B;
        this.outputLength = parallelHash.outputLength;
        this.buffer = Arrays.clone(parallelHash.buffer);
        this.compressorBuffer = Arrays.clone(parallelHash.compressorBuffer);
        CryptoServicePurpose cryptoServicePurpose = parallelHash.purpose;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i3, cryptoServicePurpose));
    }
}
