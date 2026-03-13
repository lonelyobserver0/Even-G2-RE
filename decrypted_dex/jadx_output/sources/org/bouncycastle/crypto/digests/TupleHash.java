package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TupleHash implements Xof, Digest {
    private static final byte[] N_TUPLE_HASH = Strings.toByteArray(StubApp.getString2(28524));
    private final int bitLength;
    private final CSHAKEDigest cshake;
    private boolean firstOutput;
    private final int outputLength;

    public TupleHash(int i3, byte[] bArr) {
        this(i3, bArr, i3 * 2);
    }

    private void wrapUp(int i3) {
        byte[] rightEncode = XofUtils.rightEncode(i3 * 8);
        this.cshake.update(rightEncode, 0, rightEncode.length);
        this.firstOutput = false;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        if (this.firstOutput) {
            wrapUp(getDigestSize());
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
        return StubApp.getString2(28524) + this.cshake.getAlgorithmName().substring(6);
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
        this.firstOutput = true;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) throws IllegalStateException {
        byte[] encode = XofUtils.encode(b2);
        this.cshake.update(encode, 0, encode.length);
    }

    public TupleHash(int i3, byte[] bArr, int i10) {
        this.cshake = new CSHAKEDigest(i3, N_TUPLE_HASH, bArr);
        this.bitLength = i3;
        this.outputLength = (i10 + 7) / 8;
        reset();
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i3, int i10) {
        if (this.firstOutput) {
            wrapUp(getDigestSize());
        }
        int doFinal = this.cshake.doFinal(bArr, i3, i10);
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalStateException {
        byte[] encode = XofUtils.encode(bArr, i3, i10);
        this.cshake.update(encode, 0, encode.length);
    }

    public TupleHash(TupleHash tupleHash) {
        CSHAKEDigest cSHAKEDigest = new CSHAKEDigest(tupleHash.cshake);
        this.cshake = cSHAKEDigest;
        int i3 = cSHAKEDigest.fixedOutputLength;
        this.bitLength = i3;
        this.outputLength = (i3 * 2) / 8;
        this.firstOutput = tupleHash.firstOutput;
    }
}
