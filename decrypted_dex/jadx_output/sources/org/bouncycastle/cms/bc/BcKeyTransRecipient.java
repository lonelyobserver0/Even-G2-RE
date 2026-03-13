package org.bouncycastle.cms.bc;

import com.stub.StubApp;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.KeyTransRecipient;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.bc.BcRSAAsymmetricKeyUnwrapper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class BcKeyTransRecipient implements KeyTransRecipient {
    private AsymmetricKeyParameter recipientKey;

    public BcKeyTransRecipient(AsymmetricKeyParameter asymmetricKeyParameter) {
        this.recipientKey = asymmetricKeyParameter;
    }

    public CipherParameters extractSecretKey(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws CMSException {
        try {
            return CMSUtils.getBcKey(new BcRSAAsymmetricKeyUnwrapper(algorithmIdentifier, this.recipientKey).generateUnwrappedKey(algorithmIdentifier2, bArr));
        } catch (OperatorException e10) {
            throw new CMSException(StubApp.getString2(28246) + e10.getMessage(), e10);
        }
    }
}
