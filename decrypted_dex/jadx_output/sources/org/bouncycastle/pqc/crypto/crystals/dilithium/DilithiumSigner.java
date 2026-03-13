package org.bouncycastle.pqc.crypto.crystals.dilithium;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DilithiumSigner implements MessageSigner {
    private DilithiumPrivateKeyParameters privKey;
    private DilithiumPublicKeyParameters pubKey;
    private SecureRandom random;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        DilithiumEngine engine = this.privKey.getParameters().getEngine(this.random);
        int length = bArr.length;
        DilithiumPrivateKeyParameters dilithiumPrivateKeyParameters = this.privKey;
        return engine.sign(bArr, length, dilithiumPrivateKeyParameters.rho, dilithiumPrivateKeyParameters.f19373k, dilithiumPrivateKeyParameters.tr, dilithiumPrivateKeyParameters.f19376t0, dilithiumPrivateKeyParameters.f19374s1, dilithiumPrivateKeyParameters.f19375s2);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!z2) {
            this.pubKey = (DilithiumPublicKeyParameters) cipherParameters;
            return;
        }
        if (!(cipherParameters instanceof ParametersWithRandom)) {
            this.privKey = (DilithiumPrivateKeyParameters) cipherParameters;
            this.random = null;
        } else {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.privKey = (DilithiumPrivateKeyParameters) parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        DilithiumEngine engine = this.pubKey.getParameters().getEngine(this.random);
        int length = bArr2.length;
        DilithiumPublicKeyParameters dilithiumPublicKeyParameters = this.pubKey;
        return engine.signOpen(bArr, bArr2, length, dilithiumPublicKeyParameters.rho, dilithiumPublicKeyParameters.f19378t1);
    }
}
