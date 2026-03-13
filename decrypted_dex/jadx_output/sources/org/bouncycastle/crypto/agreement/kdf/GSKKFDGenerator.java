package org.bouncycastle.crypto.agreement.kdf;

import com.stub.StubApp;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GSKKFDGenerator implements DigestDerivationFunction {
    private byte[] buf;
    private int counter;
    private final Digest digest;

    /* renamed from: r, reason: collision with root package name */
    private byte[] f18751r;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f18752z;

    public GSKKFDGenerator(Digest digest) {
        this.digest = digest;
        this.buf = new byte[digest.getDigestSize()];
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalArgumentException {
        if (i3 + i10 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28433));
        }
        Digest digest = this.digest;
        byte[] bArr2 = this.f18752z;
        digest.update(bArr2, 0, bArr2.length);
        int i11 = this.counter;
        this.counter = i11 + 1;
        byte[] intToBigEndian = Pack.intToBigEndian(i11);
        this.digest.update(intToBigEndian, 0, intToBigEndian.length);
        byte[] bArr3 = this.f18751r;
        if (bArr3 != null) {
            this.digest.update(bArr3, 0, bArr3.length);
        }
        this.digest.doFinal(this.buf, 0);
        System.arraycopy(this.buf, 0, bArr, i3, i10);
        Arrays.clear(this.buf);
        return i10;
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof GSKKDFParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(28438));
        }
        GSKKDFParameters gSKKDFParameters = (GSKKDFParameters) derivationParameters;
        this.f18752z = gSKKDFParameters.getZ();
        this.counter = gSKKDFParameters.getStartCounter();
        this.f18751r = gSKKDFParameters.getNonce();
    }
}
