package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.CSHAKEDigest;
import org.bouncycastle.crypto.digests.XofUtils;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KMAC implements Mac, Xof {
    private static final byte[] padding = new byte[100];
    private final int bitLength;
    private final CSHAKEDigest cshake;
    private boolean firstOutput;
    private boolean initialised;
    private byte[] key;
    private final int outputLength;

    public KMAC(int i3, byte[] bArr) {
        this.cshake = new CSHAKEDigest(i3, Strings.toByteArray(StubApp.getString2(29040)), bArr);
        this.bitLength = i3;
        this.outputLength = (i3 * 2) / 8;
    }

    private void bytePad(byte[] bArr, int i3) {
        byte[] leftEncode = XofUtils.leftEncode(i3);
        update(leftEncode, 0, leftEncode.length);
        byte[] encode = encode(bArr);
        update(encode, 0, encode.length);
        int length = i3 - ((leftEncode.length + encode.length) % i3);
        if (length <= 0 || length == i3) {
            return;
        }
        while (true) {
            byte[] bArr2 = padding;
            if (length <= bArr2.length) {
                update(bArr2, 0, length);
                return;
            } else {
                update(bArr2, 0, bArr2.length);
                length -= bArr2.length;
            }
        }
    }

    private static byte[] encode(byte[] bArr) {
        return Arrays.concatenate(XofUtils.leftEncode(bArr.length * 8), bArr);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        if (this.firstOutput) {
            if (!this.initialised) {
                throw new IllegalStateException(StubApp.getString2(29041));
            }
            byte[] rightEncode = XofUtils.rightEncode(getMacSize() * 8);
            this.cshake.update(rightEncode, 0, rightEncode.length);
        }
        int doFinal = this.cshake.doFinal(bArr, i3, getMacSize());
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i3, int i10) {
        if (this.firstOutput) {
            if (!this.initialised) {
                throw new IllegalStateException(StubApp.getString2(29041));
            }
            byte[] rightEncode = XofUtils.rightEncode(0L);
            this.cshake.update(rightEncode, 0, rightEncode.length);
            this.firstOutput = false;
        }
        return this.cshake.doOutput(bArr, i3, i10);
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return StubApp.getString2(29040) + this.cshake.getAlgorithmName().substring(6);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.cshake.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.outputLength;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.outputLength;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        this.key = Arrays.clone(((KeyParameter) cipherParameters).getKey());
        this.initialised = true;
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.cshake.reset();
        byte[] bArr = this.key;
        if (bArr != null) {
            bytePad(bArr, this.bitLength == 128 ? 168 : 136);
        }
        this.firstOutput = true;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) throws IllegalStateException {
        if (!this.initialised) {
            throw new IllegalStateException(StubApp.getString2(29041));
        }
        this.cshake.update(b2);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i3, int i10) {
        if (this.firstOutput) {
            if (!this.initialised) {
                throw new IllegalStateException(StubApp.getString2(29041));
            }
            byte[] rightEncode = XofUtils.rightEncode(i10 * 8);
            this.cshake.update(rightEncode, 0, rightEncode.length);
        }
        int doFinal = this.cshake.doFinal(bArr, i3, i10);
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalStateException {
        if (!this.initialised) {
            throw new IllegalStateException(StubApp.getString2(29041));
        }
        this.cshake.update(bArr, i3, i10);
    }
}
