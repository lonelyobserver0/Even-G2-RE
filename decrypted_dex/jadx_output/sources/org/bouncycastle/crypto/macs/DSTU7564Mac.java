package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.digests.DSTU7564Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSTU7564Mac implements Mac {
    private static final int BITS_IN_BYTE = 8;
    private DSTU7564Digest engine;
    private long inputLength;
    private int macSize;
    private byte[] paddedKey = null;
    private byte[] invertedKey = null;

    public DSTU7564Mac(int i3) {
        this.engine = new DSTU7564Digest(i3);
        this.macSize = i3 / 8;
    }

    private void pad() {
        int byteLength = this.engine.getByteLength() - ((int) (this.inputLength % this.engine.getByteLength()));
        if (byteLength < 13) {
            byteLength += this.engine.getByteLength();
        }
        byte[] bArr = new byte[byteLength];
        bArr[0] = ByteCompanionObject.MIN_VALUE;
        Pack.longToLittleEndian(this.inputLength * 8, bArr, byteLength - 12);
        this.engine.update(bArr, 0, byteLength);
    }

    private byte[] padKey(byte[] bArr) {
        int byteLength = this.engine.getByteLength() * (((this.engine.getByteLength() + bArr.length) - 1) / this.engine.getByteLength());
        if (byteLength - bArr.length < 13) {
            byteLength += this.engine.getByteLength();
        }
        byte[] bArr2 = new byte[byteLength];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = ByteCompanionObject.MIN_VALUE;
        Pack.intToLittleEndian(bArr.length * 8, bArr2, byteLength - 12);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        if (this.paddedKey == null) {
            throw new IllegalStateException(getAlgorithmName() + StubApp.getString2(28567));
        }
        if (bArr.length - i3 < this.macSize) {
            throw new OutputLengthException(StubApp.getString2(28608));
        }
        pad();
        DSTU7564Digest dSTU7564Digest = this.engine;
        byte[] bArr2 = this.invertedKey;
        dSTU7564Digest.update(bArr2, 0, bArr2.length);
        this.inputLength = 0L;
        int doFinal = this.engine.doFinal(bArr, i3);
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return StubApp.getString2(29022);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        this.paddedKey = null;
        reset();
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(StubApp.getString2(29023));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.invertedKey = new byte[key.length];
        this.paddedKey = padKey(key);
        int i3 = 0;
        while (true) {
            byte[] bArr = this.invertedKey;
            if (i3 >= bArr.length) {
                DSTU7564Digest dSTU7564Digest = this.engine;
                byte[] bArr2 = this.paddedKey;
                dSTU7564Digest.update(bArr2, 0, bArr2.length);
                return;
            }
            bArr[i3] = (byte) (~key[i3]);
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.inputLength = 0L;
        this.engine.reset();
        byte[] bArr = this.paddedKey;
        if (bArr != null) {
            this.engine.update(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) throws IllegalStateException {
        this.engine.update(b2);
        this.inputLength++;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalStateException {
        if (bArr.length - i3 < i10) {
            throw new DataLengthException(StubApp.getString2(28609));
        }
        if (this.paddedKey != null) {
            this.engine.update(bArr, i3, i10);
            this.inputLength += i10;
        } else {
            throw new IllegalStateException(getAlgorithmName() + StubApp.getString2(28567));
        }
    }
}
