package org.bouncycastle.pqc.crypto;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DigestingMessageSigner implements Signer {
    private boolean forSigning;
    private final Digest messDigest;
    private final MessageSigner messSigner;

    public DigestingMessageSigner(MessageSigner messageSigner, Digest digest) {
        this.messSigner = messageSigner;
        this.messDigest = digest;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.forSigning) {
            throw new IllegalStateException(StubApp.getString2(33954));
        }
        byte[] bArr = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr, 0);
        return this.messSigner.generateSignature(bArr);
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
        this.messSigner.init(z2, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.messDigest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b2) {
        this.messDigest.update(b2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.forSigning) {
            throw new IllegalStateException(StubApp.getString2(33955));
        }
        byte[] bArr2 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr2, 0);
        return this.messSigner.verifySignature(bArr2, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i3, int i10) {
        this.messDigest.update(bArr, i3, i10);
    }
}
