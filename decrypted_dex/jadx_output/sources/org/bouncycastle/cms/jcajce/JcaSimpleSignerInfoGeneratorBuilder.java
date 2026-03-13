package org.bouncycastle.cms.jcajce;

import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.cms.DefaultSignedAttributeTableGenerator;
import org.bouncycastle.cms.SignerInfoGenerator;
import org.bouncycastle.cms.SignerInfoGeneratorBuilder;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaSimpleSignerInfoGeneratorBuilder {
    private AlgorithmIdentifier contentDigest;
    private boolean hasNoSignedAttributes;
    private Helper helper = new Helper(null);
    private CMSAttributeTableGenerator signedGen;
    private CMSAttributeTableGenerator unsignedGen;

    /* renamed from: org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Helper {
        private Helper() {
        }

        public ContentSigner createContentSigner(String str, PrivateKey privateKey) throws OperatorCreationException {
            return new JcaContentSignerBuilder(str).build(CMSUtils.cleanPrivateKey(privateKey));
        }

        public DigestCalculatorProvider createDigestCalculatorProvider() throws OperatorCreationException {
            return new JcaDigestCalculatorProviderBuilder().build();
        }

        public /* synthetic */ Helper(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class NamedHelper extends Helper {
        private final String providerName;

        public NamedHelper(String str) {
            super(null);
            this.providerName = str;
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper
        public ContentSigner createContentSigner(String str, PrivateKey privateKey) throws OperatorCreationException {
            return new JcaContentSignerBuilder(str).setProvider(this.providerName).build(CMSUtils.cleanPrivateKey(privateKey));
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper
        public DigestCalculatorProvider createDigestCalculatorProvider() throws OperatorCreationException {
            return new JcaDigestCalculatorProviderBuilder().setProvider(this.providerName).build();
        }
    }

    public static class ProviderHelper extends Helper {
        private final Provider provider;

        public ProviderHelper(Provider provider) {
            super(null);
            this.provider = provider;
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper
        public ContentSigner createContentSigner(String str, PrivateKey privateKey) throws OperatorCreationException {
            return new JcaContentSignerBuilder(str).setProvider(this.provider).build(CMSUtils.cleanPrivateKey(privateKey));
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper
        public DigestCalculatorProvider createDigestCalculatorProvider() throws OperatorCreationException {
            return new JcaDigestCalculatorProviderBuilder().setProvider(this.provider).build();
        }
    }

    private SignerInfoGeneratorBuilder configureAndBuild() throws OperatorCreationException {
        SignerInfoGeneratorBuilder signerInfoGeneratorBuilder = new SignerInfoGeneratorBuilder(this.helper.createDigestCalculatorProvider());
        signerInfoGeneratorBuilder.setDirectSignature(this.hasNoSignedAttributes);
        signerInfoGeneratorBuilder.setContentDigest(this.contentDigest);
        signerInfoGeneratorBuilder.setSignedAttributeGenerator(this.signedGen);
        signerInfoGeneratorBuilder.setUnsignedAttributeGenerator(this.unsignedGen);
        return signerInfoGeneratorBuilder;
    }

    public SignerInfoGenerator build(String str, PrivateKey privateKey, X509Certificate x509Certificate) throws OperatorCreationException, CertificateEncodingException {
        return configureAndBuild().build(this.helper.createContentSigner(str, CMSUtils.cleanPrivateKey(privateKey)), new JcaX509CertificateHolder(x509Certificate));
    }

    public JcaSimpleSignerInfoGeneratorBuilder setContentDigest(AlgorithmIdentifier algorithmIdentifier) {
        this.contentDigest = algorithmIdentifier;
        return this;
    }

    public JcaSimpleSignerInfoGeneratorBuilder setDirectSignature(boolean z2) {
        this.hasNoSignedAttributes = z2;
        return this;
    }

    public JcaSimpleSignerInfoGeneratorBuilder setProvider(String str) throws OperatorCreationException {
        this.helper = new NamedHelper(str);
        return this;
    }

    public JcaSimpleSignerInfoGeneratorBuilder setSignedAttributeGenerator(AttributeTable attributeTable) {
        this.signedGen = new DefaultSignedAttributeTableGenerator(attributeTable);
        return this;
    }

    public JcaSimpleSignerInfoGeneratorBuilder setUnsignedAttributeGenerator(CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.unsignedGen = cMSAttributeTableGenerator;
        return this;
    }

    public SignerInfoGenerator build(String str, PrivateKey privateKey, X509CertificateHolder x509CertificateHolder) throws OperatorCreationException {
        return configureAndBuild().build(this.helper.createContentSigner(str, CMSUtils.cleanPrivateKey(privateKey)), x509CertificateHolder);
    }

    public JcaSimpleSignerInfoGeneratorBuilder setProvider(Provider provider) throws OperatorCreationException {
        this.helper = new ProviderHelper(provider);
        return this;
    }

    public JcaSimpleSignerInfoGeneratorBuilder setSignedAttributeGenerator(CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.signedGen = cMSAttributeTableGenerator;
        return this;
    }

    public SignerInfoGenerator build(String str, PrivateKey privateKey, byte[] bArr) throws OperatorCreationException {
        return configureAndBuild().build(this.helper.createContentSigner(str, CMSUtils.cleanPrivateKey(privateKey)), bArr);
    }
}
