package org.bouncycastle.cms.jcajce;

import com.stub.StubApp;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JceAlgorithmIdentifierConverter {
    private EnvelopedDataHelper helper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
    private SecureRandom random;

    public AlgorithmParameters getAlgorithmParameters(AlgorithmIdentifier algorithmIdentifier) throws CMSException {
        if (algorithmIdentifier.getParameters() == null) {
            return null;
        }
        try {
            AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
            CMSUtils.loadParameters(createAlgorithmParameters, algorithmIdentifier.getParameters());
            return createAlgorithmParameters;
        } catch (NoSuchAlgorithmException e10) {
            throw new CMSException(StubApp.getString2(28283), e10);
        } catch (NoSuchProviderException e11) {
            throw new CMSException(StubApp.getString2(28282), e11);
        }
    }

    public JceAlgorithmIdentifierConverter setProvider(String str) {
        this.helper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        return this;
    }

    public JceAlgorithmIdentifierConverter setProvider(Provider provider) {
        this.helper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        return this;
    }
}
