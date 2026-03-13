package org.bouncycastle.pqc.crypto.lms;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.MessageSigner;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LMSSigner implements MessageSigner {
    private LMSPrivateKeyParameters privKey;
    private LMSPublicKeyParameters pubKey;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        try {
            return LMS.generateSign(this.privKey, bArr).getEncoded();
        } catch (IOException e10) {
            throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(29327))));
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (z2) {
            this.privKey = (LMSPrivateKeyParameters) cipherParameters;
        } else {
            this.pubKey = (LMSPublicKeyParameters) cipherParameters;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        try {
            return LMS.verifySignature(this.pubKey, LMSSignature.getInstance(bArr2), bArr);
        } catch (IOException e10) {
            throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(34036))));
        }
    }
}
