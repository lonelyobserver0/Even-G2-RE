package org.bouncycastle.crypto.agreement;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.RawAgreement;
import org.bouncycastle.crypto.params.XDHUPrivateParameters;
import org.bouncycastle.crypto.params.XDHUPublicParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XDHUnifiedAgreement implements RawAgreement {
    private XDHUPrivateParameters privParams;
    private final RawAgreement xAgreement;

    public XDHUnifiedAgreement(RawAgreement rawAgreement) {
        this.xAgreement = rawAgreement;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public void calculateAgreement(CipherParameters cipherParameters, byte[] bArr, int i3) {
        XDHUPublicParameters xDHUPublicParameters = (XDHUPublicParameters) cipherParameters;
        this.xAgreement.init(this.privParams.getEphemeralPrivateKey());
        this.xAgreement.calculateAgreement(xDHUPublicParameters.getEphemeralPublicKey(), bArr, i3);
        this.xAgreement.init(this.privParams.getStaticPrivateKey());
        this.xAgreement.calculateAgreement(xDHUPublicParameters.getStaticPublicKey(), bArr, this.xAgreement.getAgreementSize() + i3);
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public int getAgreementSize() {
        return this.xAgreement.getAgreementSize() * 2;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public void init(CipherParameters cipherParameters) {
        XDHUPrivateParameters xDHUPrivateParameters = (XDHUPrivateParameters) cipherParameters;
        this.privParams = xDHUPrivateParameters;
        this.xAgreement.init(xDHUPrivateParameters.getStaticPrivateKey());
    }
}
