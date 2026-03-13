package org.bouncycastle.cert.crmf.jcajce;

import com.stub.StubApp;
import java.io.InputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.cert.crmf.ValueDecryptorGenerator;
import org.bouncycastle.jcajce.io.CipherInputStream;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.InputDecryptor;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JceAsymmetricValueDecryptorGenerator implements ValueDecryptorGenerator {
    private CRMFHelper helper = new CRMFHelper(new DefaultJcaJceHelper());
    private Provider provider = null;
    private String providerName = null;
    private PrivateKey recipientKey;

    public JceAsymmetricValueDecryptorGenerator(PrivateKey privateKey) {
        this.recipientKey = privateKey;
    }

    private Key extractSecretKey(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws CRMFException {
        try {
            JceAsymmetricKeyUnwrapper jceAsymmetricKeyUnwrapper = new JceAsymmetricKeyUnwrapper(algorithmIdentifier, this.recipientKey);
            Provider provider = this.provider;
            if (provider != null) {
                jceAsymmetricKeyUnwrapper.setProvider(provider);
            }
            String str = this.providerName;
            if (str != null) {
                jceAsymmetricKeyUnwrapper.setProvider(str);
            }
            return new SecretKeySpec((byte[]) jceAsymmetricKeyUnwrapper.generateUnwrappedKey(algorithmIdentifier2, bArr).getRepresentation(), algorithmIdentifier2.getAlgorithm().getId());
        } catch (OperatorException e10) {
            throw new CRMFException(StubApp.getString2(28075) + e10.getMessage(), e10);
        }
    }

    @Override // org.bouncycastle.cert.crmf.ValueDecryptorGenerator
    public InputDecryptor getValueDecryptor(AlgorithmIdentifier algorithmIdentifier, final AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws CRMFException {
        final Cipher createContentCipher = this.helper.createContentCipher(extractSecretKey(algorithmIdentifier, algorithmIdentifier2, bArr), algorithmIdentifier2);
        return new InputDecryptor() { // from class: org.bouncycastle.cert.crmf.jcajce.JceAsymmetricValueDecryptorGenerator.1
            @Override // org.bouncycastle.operator.InputDecryptor
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier2;
            }

            @Override // org.bouncycastle.operator.InputDecryptor
            public InputStream getInputStream(InputStream inputStream) {
                return new CipherInputStream(inputStream, createContentCipher);
            }
        };
    }

    public JceAsymmetricValueDecryptorGenerator setProvider(String str) {
        this.helper = new CRMFHelper(new NamedJcaJceHelper(str));
        this.provider = null;
        this.providerName = str;
        return this;
    }

    public JceAsymmetricValueDecryptorGenerator setProvider(Provider provider) {
        this.helper = new CRMFHelper(new ProviderJcaJceHelper(provider));
        this.provider = provider;
        this.providerName = null;
        return this;
    }
}
