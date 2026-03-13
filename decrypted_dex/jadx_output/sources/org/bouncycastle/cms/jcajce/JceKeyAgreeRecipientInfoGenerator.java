package org.bouncycastle.cms.jcajce;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier;
import org.bouncycastle.asn1.cms.OriginatorPublicKey;
import org.bouncycastle.asn1.cms.RecipientEncryptedKey;
import org.bouncycastle.asn1.cms.RecipientKeyIdentifier;
import org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.KeyAgreeRecipientInfoGenerator;
import org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec;
import org.bouncycastle.jcajce.spec.MQVParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.operator.DefaultSecretKeySizeProvider;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.SecretKeySizeProvider;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JceKeyAgreeRecipientInfoGenerator extends KeyAgreeRecipientInfoGenerator {
    private static KeyMaterialGenerator ecc_cms_Generator = new RFC5753KeyMaterialGenerator();
    private KeyPair ephemeralKP;
    private EnvelopedDataHelper helper;
    private SecretKeySizeProvider keySizeProvider;
    private SecureRandom random;
    private List recipientIDs;
    private List recipientKeys;
    private PrivateKey senderPrivateKey;
    private PublicKey senderPublicKey;
    private byte[] userKeyingMaterial;

    public JceKeyAgreeRecipientInfoGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier, PrivateKey privateKey, PublicKey publicKey, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        super(aSN1ObjectIdentifier, SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()), aSN1ObjectIdentifier2);
        this.keySizeProvider = new DefaultSecretKeySizeProvider();
        this.recipientIDs = new ArrayList();
        this.recipientKeys = new ArrayList();
        this.helper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
        this.senderPublicKey = publicKey;
        this.senderPrivateKey = CMSUtils.cleanPrivateKey(privateKey);
    }

    private void init(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        if (CMSUtils.isMQV(aSN1ObjectIdentifier) && this.ephemeralKP == null) {
            try {
                SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(this.senderPublicKey.getEncoded());
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(aSN1ObjectIdentifier);
                createAlgorithmParameters.init(subjectPublicKeyInfo.getAlgorithm().getParameters().toASN1Primitive().getEncoded());
                KeyPairGenerator createKeyPairGenerator = this.helper.createKeyPairGenerator(aSN1ObjectIdentifier);
                createKeyPairGenerator.initialize(createAlgorithmParameters.getParameterSpec(AlgorithmParameterSpec.class), this.random);
                this.ephemeralKP = createKeyPairGenerator.generateKeyPair();
            } catch (Exception e10) {
                throw new CMSException(a.i(StubApp.getString2(28293), e10), e10);
            }
        }
    }

    public JceKeyAgreeRecipientInfoGenerator addRecipient(X509Certificate x509Certificate) throws CertificateEncodingException {
        this.recipientIDs.add(new KeyAgreeRecipientIdentifier(CMSUtils.getIssuerAndSerialNumber(x509Certificate)));
        this.recipientKeys.add(x509Certificate.getPublicKey());
        return this;
    }

    @Override // org.bouncycastle.cms.KeyAgreeRecipientInfoGenerator
    public ASN1Sequence generateRecipientEncryptedKeys(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, GenericKey genericKey) throws CMSException {
        UserKeyingMaterialSpec userKeyingMaterialSpec;
        AlgorithmParameterSpec algorithmParameterSpec;
        DEROctetString dEROctetString;
        if (this.recipientIDs.isEmpty()) {
            throw new CMSException(StubApp.getString2(28296));
        }
        init(algorithmIdentifier.getAlgorithm());
        PrivateKey privateKey = this.senderPrivateKey;
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i3 = 0; i3 != this.recipientIDs.size(); i3++) {
            PublicKey publicKey = (PublicKey) this.recipientKeys.get(i3);
            KeyAgreeRecipientIdentifier keyAgreeRecipientIdentifier = (KeyAgreeRecipientIdentifier) this.recipientIDs.get(i3);
            try {
                ASN1ObjectIdentifier algorithm2 = algorithmIdentifier2.getAlgorithm();
                if (CMSUtils.isMQV(algorithm)) {
                    algorithmParameterSpec = new MQVParameterSpec(this.ephemeralKP, publicKey, this.userKeyingMaterial);
                } else {
                    if (CMSUtils.isEC(algorithm)) {
                        userKeyingMaterialSpec = new UserKeyingMaterialSpec(ecc_cms_Generator.generateKDFMaterial(algorithmIdentifier2, this.keySizeProvider.getKeySize(algorithm2), this.userKeyingMaterial));
                    } else if (CMSUtils.isRFC2631(algorithm)) {
                        byte[] bArr = this.userKeyingMaterial;
                        if (bArr != null) {
                            userKeyingMaterialSpec = new UserKeyingMaterialSpec(bArr);
                        } else {
                            if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_alg_SSDH)) {
                                throw new CMSException("User keying material must be set for static keys.");
                            }
                            algorithmParameterSpec = null;
                        }
                    } else {
                        if (!CMSUtils.isGOST(algorithm)) {
                            throw new CMSException(StubApp.getString2("28290") + algorithm);
                        }
                        byte[] bArr2 = this.userKeyingMaterial;
                        if (bArr2 == null) {
                            throw new CMSException("User keying material must be set for static keys.");
                        }
                        userKeyingMaterialSpec = new UserKeyingMaterialSpec(bArr2);
                    }
                    algorithmParameterSpec = userKeyingMaterialSpec;
                }
                KeyAgreement createKeyAgreement = this.helper.createKeyAgreement(algorithm);
                createKeyAgreement.init(privateKey, algorithmParameterSpec, this.random);
                createKeyAgreement.doPhase(publicKey, true);
                SecretKey generateSecret = createKeyAgreement.generateSecret(algorithm2.getId());
                Cipher createCipher = this.helper.createCipher(algorithm2);
                if (!algorithm2.equals((ASN1Primitive) CryptoProObjectIdentifiers.id_Gost28147_89_None_KeyWrap) && !algorithm2.equals((ASN1Primitive) CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap)) {
                    createCipher.init(3, generateSecret, this.random);
                    dEROctetString = new DEROctetString(createCipher.wrap(this.helper.getJceKey(genericKey)));
                    aSN1EncodableVector.add(new RecipientEncryptedKey(keyAgreeRecipientIdentifier, dEROctetString));
                }
                createCipher.init(3, generateSecret, new GOST28147WrapParameterSpec(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet, this.userKeyingMaterial));
                byte[] wrap = createCipher.wrap(this.helper.getJceKey(genericKey));
                dEROctetString = new DEROctetString(new Gost2814789EncryptedKey(Arrays.copyOfRange(wrap, 0, wrap.length - 4), Arrays.copyOfRange(wrap, wrap.length - 4, wrap.length)).getEncoded(StubApp.getString2("26791")));
                aSN1EncodableVector.add(new RecipientEncryptedKey(keyAgreeRecipientIdentifier, dEROctetString));
            } catch (IOException e10) {
                throw new CMSException(u.q(e10, new StringBuilder(StubApp.getString2(28294))), e10);
            } catch (GeneralSecurityException e11) {
                throw new CMSException(org.bouncycastle.asn1.a.h(e11, new StringBuilder(StubApp.getString2(28295))), e11);
            }
        }
        return new DERSequence(aSN1EncodableVector);
    }

    @Override // org.bouncycastle.cms.KeyAgreeRecipientInfoGenerator
    public byte[] getUserKeyingMaterial(AlgorithmIdentifier algorithmIdentifier) throws CMSException {
        init(algorithmIdentifier.getAlgorithm());
        KeyPair keyPair = this.ephemeralKP;
        if (keyPair == null) {
            return this.userKeyingMaterial;
        }
        OriginatorPublicKey createOriginatorPublicKey = createOriginatorPublicKey(SubjectPublicKeyInfo.getInstance(keyPair.getPublic().getEncoded()));
        try {
            return (this.userKeyingMaterial != null ? new MQVuserKeyingMaterial(createOriginatorPublicKey, new DEROctetString(this.userKeyingMaterial)) : new MQVuserKeyingMaterial(createOriginatorPublicKey, null)).getEncoded();
        } catch (IOException e10) {
            throw new CMSException(u.q(e10, new StringBuilder(StubApp.getString2(28297))), e10);
        }
    }

    public JceKeyAgreeRecipientInfoGenerator setProvider(String str) {
        this.helper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        return this;
    }

    public JceKeyAgreeRecipientInfoGenerator setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JceKeyAgreeRecipientInfoGenerator setUserKeyingMaterial(byte[] bArr) {
        this.userKeyingMaterial = Arrays.clone(bArr);
        return this;
    }

    public JceKeyAgreeRecipientInfoGenerator addRecipient(byte[] bArr, PublicKey publicKey) throws CertificateEncodingException {
        this.recipientIDs.add(new KeyAgreeRecipientIdentifier(new RecipientKeyIdentifier(bArr)));
        this.recipientKeys.add(publicKey);
        return this;
    }

    public JceKeyAgreeRecipientInfoGenerator setProvider(Provider provider) {
        this.helper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        return this;
    }
}
