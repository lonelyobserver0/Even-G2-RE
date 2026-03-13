package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FalconSigner implements MessageSigner {
    private byte[] encodedkey;
    private FalconNIST nist;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        FalconNIST falconNIST = this.nist;
        return falconNIST.crypto_sign(new byte[falconNIST.CRYPTO_BYTES], bArr, 0, bArr.length, this.encodedkey, 0);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!z2) {
            FalconPublicKeyParameters falconPublicKeyParameters = (FalconPublicKeyParameters) cipherParameters;
            this.encodedkey = falconPublicKeyParameters.getH();
            this.nist = new FalconNIST(falconPublicKeyParameters.getParameters().getLogN(), falconPublicKeyParameters.getParameters().getNonceLength(), CryptoServicesRegistrar.getSecureRandom());
        } else if (!(cipherParameters instanceof ParametersWithRandom)) {
            FalconPrivateKeyParameters falconPrivateKeyParameters = (FalconPrivateKeyParameters) cipherParameters;
            this.encodedkey = falconPrivateKeyParameters.getEncoded();
            this.nist = new FalconNIST(falconPrivateKeyParameters.getParameters().getLogN(), falconPrivateKeyParameters.getParameters().getNonceLength(), CryptoServicesRegistrar.getSecureRandom());
        } else {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            FalconPrivateKeyParameters falconPrivateKeyParameters2 = (FalconPrivateKeyParameters) parametersWithRandom.getParameters();
            this.encodedkey = falconPrivateKeyParameters2.getEncoded();
            this.nist = new FalconNIST(falconPrivateKeyParameters2.getParameters().getLogN(), falconPrivateKeyParameters2.getParameters().getNonceLength(), parametersWithRandom.getRandom());
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        byte b2 = bArr2[0];
        FalconNIST falconNIST = this.nist;
        if (b2 != ((byte) (falconNIST.LOGN + 48))) {
            return false;
        }
        int i3 = falconNIST.NONCELEN;
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[(bArr2.length - i3) - 1];
        System.arraycopy(bArr2, 1, bArr3, 0, i3);
        int i10 = this.nist.NONCELEN;
        System.arraycopy(bArr2, i10 + 1, bArr4, 0, (bArr2.length - i10) - 1);
        return this.nist.crypto_sign_open(bArr4, bArr3, bArr, this.encodedkey, 0) == 0;
    }
}
