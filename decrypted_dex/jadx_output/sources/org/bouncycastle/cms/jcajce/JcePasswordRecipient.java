package org.bouncycastle.cms.jcajce;

import com.stub.StubApp;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.PasswordRecipient;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class JcePasswordRecipient implements PasswordRecipient {
    private char[] password;
    private int schemeID = 1;
    protected EnvelopedDataHelper helper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());

    public JcePasswordRecipient(char[] cArr) {
        this.password = cArr;
    }

    @Override // org.bouncycastle.cms.PasswordRecipient
    public byte[] calculateDerivedKey(int i3, AlgorithmIdentifier algorithmIdentifier, int i10) throws CMSException {
        return this.helper.calculateDerivedKey(i3, this.password, algorithmIdentifier, i10);
    }

    public Key extractSecretKey(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr, byte[] bArr2) throws CMSException {
        Cipher createRFC3211Wrapper = this.helper.createRFC3211Wrapper(algorithmIdentifier.getAlgorithm());
        try {
            createRFC3211Wrapper.init(4, new SecretKeySpec(bArr, createRFC3211Wrapper.getAlgorithm()), new IvParameterSpec(ASN1OctetString.getInstance(algorithmIdentifier.getParameters()).getOctets()));
            return createRFC3211Wrapper.unwrap(bArr2, algorithmIdentifier2.getAlgorithm().getId(), 3);
        } catch (GeneralSecurityException e10) {
            throw new CMSException(a.h(e10, new StringBuilder(StubApp.getString2(28298))), e10);
        }
    }

    @Override // org.bouncycastle.cms.PasswordRecipient
    public char[] getPassword() {
        return this.password;
    }

    @Override // org.bouncycastle.cms.PasswordRecipient
    public int getPasswordConversionScheme() {
        return this.schemeID;
    }

    public JcePasswordRecipient setPasswordConversionScheme(int i3) {
        this.schemeID = i3;
        return this;
    }

    public JcePasswordRecipient setProvider(String str) {
        this.helper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        return this;
    }

    public JcePasswordRecipient setProvider(Provider provider) {
        this.helper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        return this;
    }
}
