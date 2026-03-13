package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Ed448phSigner implements Signer {
    private final byte[] context;
    private boolean forSigning;
    private final Xof prehash = Ed448.createPrehash();
    private Ed448PrivateKeyParameters privateKey;
    private Ed448PublicKeyParameters publicKey;

    public Ed448phSigner(byte[] bArr) {
        this.context = Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.forSigning || this.privateKey == null) {
            throw new IllegalStateException(StubApp.getString2(29309));
        }
        byte[] bArr = new byte[64];
        if (64 != this.prehash.doFinal(bArr, 0, 64)) {
            throw new IllegalStateException(StubApp.getString2(29304));
        }
        byte[] bArr2 = new byte[114];
        this.privateKey.sign(1, this.context, bArr, 0, 64, bArr2, 0);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forSigning = z2;
        Ed448PublicKeyParameters ed448PublicKeyParameters = null;
        if (z2) {
            this.privateKey = (Ed448PrivateKeyParameters) cipherParameters;
        } else {
            this.privateKey = null;
            ed448PublicKeyParameters = (Ed448PublicKeyParameters) cipherParameters;
        }
        this.publicKey = ed448PublicKeyParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28197), BERTags.FLAGS, cipherParameters, z2));
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.prehash.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b2) {
        this.prehash.update(b2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        Ed448PublicKeyParameters ed448PublicKeyParameters;
        if (this.forSigning || (ed448PublicKeyParameters = this.publicKey) == null) {
            throw new IllegalStateException(StubApp.getString2(29310));
        }
        if (114 == bArr.length) {
            return Ed448.verifyPrehash(bArr, 0, ed448PublicKeyParameters.getEncoded(), 0, this.context, this.prehash);
        }
        this.prehash.reset();
        return false;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i3, int i10) {
        this.prehash.update(bArr, i3, i10);
    }
}
