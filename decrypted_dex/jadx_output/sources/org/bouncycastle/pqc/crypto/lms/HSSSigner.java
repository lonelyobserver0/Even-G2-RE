package org.bouncycastle.pqc.crypto.lms;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.MessageSigner;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HSSSigner implements MessageSigner {
    private HSSPrivateKeyParameters privKey;
    private HSSPublicKeyParameters pubKey;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        try {
            return HSS.generateSignature(this.privKey, bArr).getEncoded();
        } catch (IOException e10) {
            throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(29327))));
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (z2) {
            this.privKey = (HSSPrivateKeyParameters) cipherParameters;
        } else {
            this.pubKey = (HSSPublicKeyParameters) cipherParameters;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        try {
            HSSPublicKeyParameters hSSPublicKeyParameters = this.pubKey;
            return HSS.verifySignature(hSSPublicKeyParameters, HSSSignature.getInstance(bArr2, hSSPublicKeyParameters.getL()), bArr);
        } catch (IOException e10) {
            throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(34036))));
        }
    }
}
