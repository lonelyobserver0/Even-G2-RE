package org.bouncycastle.cms;

import com.stub.StubApp;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cms.KEKIdentifier;
import org.bouncycastle.asn1.cms.KEKRecipientInfo;
import org.bouncycastle.asn1.cms.RecipientInfo;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.SymmetricKeyWrapper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class KEKRecipientInfoGenerator implements RecipientInfoGenerator {
    private final KEKIdentifier kekIdentifier;
    protected final SymmetricKeyWrapper wrapper;

    public KEKRecipientInfoGenerator(KEKIdentifier kEKIdentifier, SymmetricKeyWrapper symmetricKeyWrapper) {
        this.kekIdentifier = kEKIdentifier;
        this.wrapper = symmetricKeyWrapper;
    }

    @Override // org.bouncycastle.cms.RecipientInfoGenerator
    public final RecipientInfo generate(GenericKey genericKey) throws CMSException {
        try {
            return new RecipientInfo(new KEKRecipientInfo(this.kekIdentifier, this.wrapper.getAlgorithmIdentifier(), new DEROctetString(this.wrapper.generateWrappedKey(genericKey))));
        } catch (OperatorException e10) {
            throw new CMSException(StubApp.getString2(28205) + e10.getMessage(), e10);
        }
    }
}
