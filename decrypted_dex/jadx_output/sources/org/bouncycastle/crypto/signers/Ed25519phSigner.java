package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Ed25519phSigner implements Signer {
    private final byte[] context;
    private boolean forSigning;
    private final Digest prehash = Ed25519.createPrehash();
    private Ed25519PrivateKeyParameters privateKey;
    private Ed25519PublicKeyParameters publicKey;

    public Ed25519phSigner(byte[] bArr) {
        this.context = Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.forSigning || this.privateKey == null) {
            throw new IllegalStateException(StubApp.getString2(29305));
        }
        byte[] bArr = new byte[64];
        if (64 != this.prehash.doFinal(bArr, 0)) {
            throw new IllegalStateException(StubApp.getString2(29304));
        }
        byte[] bArr2 = new byte[64];
        this.privateKey.sign(2, this.context, bArr, 0, 64, bArr2, 0);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forSigning = z2;
        Ed25519PublicKeyParameters ed25519PublicKeyParameters = null;
        if (z2) {
            this.privateKey = (Ed25519PrivateKeyParameters) cipherParameters;
        } else {
            this.privateKey = null;
            ed25519PublicKeyParameters = (Ed25519PublicKeyParameters) cipherParameters;
        }
        this.publicKey = ed25519PublicKeyParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28196), 128, cipherParameters, z2));
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
        Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        if (this.forSigning || (ed25519PublicKeyParameters = this.publicKey) == null) {
            throw new IllegalStateException(StubApp.getString2(29306));
        }
        if (64 == bArr.length) {
            return Ed25519.verifyPrehash(bArr, 0, ed25519PublicKeyParameters.getEncoded(), 0, this.context, this.prehash);
        }
        this.prehash.reset();
        return false;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i3, int i10) {
        this.prehash.update(bArr, i3, i10);
    }
}
