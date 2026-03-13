package org.bouncycastle.cms.jcajce;

import com.stub.StubApp;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.KeyTransRecipient;
import org.bouncycastle.cms.KeyTransRecipientId;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class JceKTSKeyTransRecipient implements KeyTransRecipient {
    private static final byte[] ANONYMOUS_SENDER = Hex.decode(StubApp.getString2(28286));
    protected EnvelopedDataHelper contentHelper;
    protected Map extraMappings;
    protected EnvelopedDataHelper helper;
    private final byte[] partyVInfo;
    private PrivateKey recipientKey;
    protected boolean unwrappedKeyMustBeEncodable;
    protected boolean validateKeySize;

    public JceKTSKeyTransRecipient(PrivateKey privateKey, byte[] bArr) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        this.extraMappings = new HashMap();
        this.validateKeySize = false;
        this.recipientKey = CMSUtils.cleanPrivateKey(privateKey);
        this.partyVInfo = bArr;
    }

    public static byte[] getPartyVInfoFromRID(KeyTransRecipientId keyTransRecipientId) throws IOException {
        return keyTransRecipientId.getSerialNumber() != null ? new IssuerAndSerialNumber(keyTransRecipientId.getIssuer(), keyTransRecipientId.getSerialNumber()).getEncoded(StubApp.getString2(26791)) : new DEROctetString(keyTransRecipientId.getSubjectKeyIdentifier()).getEncoded();
    }

    public Key extractSecretKey(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws CMSException {
        try {
            Key jceKey = this.helper.getJceKey(algorithmIdentifier2.getAlgorithm(), this.helper.createAsymmetricUnwrapper(algorithmIdentifier, this.recipientKey, ANONYMOUS_SENDER, this.partyVInfo).generateUnwrappedKey(algorithmIdentifier2, bArr));
            if (!this.validateKeySize) {
                return jceKey;
            }
            this.helper.keySizeCheck(algorithmIdentifier2, jceKey);
            return jceKey;
        } catch (OperatorException e10) {
            throw new CMSException(StubApp.getString2(28246) + e10.getMessage(), e10);
        }
    }

    public JceKTSKeyTransRecipient setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceKTSKeyTransRecipient setContentProvider(String str) {
        this.contentHelper = CMSUtils.createContentHelper(str);
        return this;
    }

    public JceKTSKeyTransRecipient setKeySizeValidation(boolean z2) {
        this.validateKeySize = z2;
        return this;
    }

    public JceKTSKeyTransRecipient setProvider(String str) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }

    public JceKTSKeyTransRecipient setContentProvider(Provider provider) {
        this.contentHelper = CMSUtils.createContentHelper(provider);
        return this;
    }

    public JceKTSKeyTransRecipient setProvider(Provider provider) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }
}
