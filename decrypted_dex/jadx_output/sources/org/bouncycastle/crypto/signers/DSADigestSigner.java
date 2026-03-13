package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSADigestSigner implements Signer {
    private final Digest digest;
    private final DSA dsa;
    private final DSAEncoding encoding;
    private boolean forSigning;

    public DSADigestSigner(DSA dsa, Digest digest) {
        this.dsa = dsa;
        this.digest = digest;
        this.encoding = StandardDSAEncoding.INSTANCE;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.forSigning) {
            throw new IllegalStateException(StubApp.getString2(29288));
        }
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        BigInteger[] generateSignature = this.dsa.generateSignature(bArr);
        try {
            return this.encoding.encode(getOrder(), generateSignature[0], generateSignature[1]);
        } catch (Exception unused) {
            throw new IllegalStateException(StubApp.getString2(29287));
        }
    }

    public BigInteger getOrder() {
        DSA dsa = this.dsa;
        if (dsa instanceof DSAExt) {
            return ((DSAExt) dsa).getOrder();
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forSigning = z2;
        AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof ParametersWithRandom ? (AsymmetricKeyParameter) ((ParametersWithRandom) cipherParameters).getParameters() : (AsymmetricKeyParameter) cipherParameters;
        if (z2 && !asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException(StubApp.getString2(29289));
        }
        if (!z2 && asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException(StubApp.getString2(29290));
        }
        reset();
        this.dsa.init(z2, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b2) {
        this.digest.update(b2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.forSigning) {
            throw new IllegalStateException(StubApp.getString2(29291));
        }
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            BigInteger[] decode = this.encoding.decode(getOrder(), bArr);
            return this.dsa.verifySignature(bArr2, decode[0], decode[1]);
        } catch (Exception unused) {
            return false;
        }
    }

    public DSADigestSigner(DSAExt dSAExt, Digest digest, DSAEncoding dSAEncoding) {
        this.dsa = dSAExt;
        this.digest = digest;
        this.encoding = dSAEncoding;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i3, int i10) {
        this.digest.update(bArr, i3, i10);
    }
}
