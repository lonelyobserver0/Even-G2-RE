package org.bouncycastle.operator.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.jcajce.util.AlgorithmParametersUtils;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.operator.DefaultSignatureNameFinder;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class OperatorHelper {
    private static final Map asymmetricWrapperAlgNames;
    private static final Map oids;
    private static DefaultSignatureNameFinder sigFinder;
    private static final Map symmetricKeyAlgNames;
    private static final Map symmetricWrapperAlgNames;
    private static final Map symmetricWrapperKeySizes;
    private JcaJceHelper helper;

    public static class OpCertificateException extends CertificateException {
        private Throwable cause;

        public OpCertificateException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        oids = hashMap;
        HashMap hashMap2 = new HashMap();
        asymmetricWrapperAlgNames = hashMap2;
        HashMap hashMap3 = new HashMap();
        symmetricWrapperAlgNames = hashMap3;
        HashMap hashMap4 = new HashMap();
        symmetricKeyAlgNames = hashMap4;
        HashMap hashMap5 = new HashMap();
        symmetricWrapperKeySizes = hashMap5;
        sigFinder = new DefaultSignatureNameFinder();
        hashMap.put(OIWObjectIdentifiers.idSHA1, StubApp.getString2(21748));
        hashMap.put(NISTObjectIdentifiers.id_sha224, StubApp.getString2(28054));
        hashMap.put(NISTObjectIdentifiers.id_sha256, StubApp.getString2(21749));
        hashMap.put(NISTObjectIdentifiers.id_sha384, StubApp.getString2(21750));
        hashMap.put(NISTObjectIdentifiers.id_sha512, StubApp.getString2(21751));
        hashMap.put(TeleTrusTObjectIdentifiers.ripemd128, StubApp.getString2(28185));
        hashMap.put(TeleTrusTObjectIdentifiers.ripemd160, StubApp.getString2(21747));
        hashMap.put(TeleTrusTObjectIdentifiers.ripemd256, StubApp.getString2(28186));
        hashMap2.put(PKCSObjectIdentifiers.rsaEncryption, StubApp.getString2(28053));
        hashMap2.put(CryptoProObjectIdentifiers.gostR3410_2001, StubApp.getString2(28166));
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_CMS3DESwrap;
        hashMap3.put(aSN1ObjectIdentifier, StubApp.getString2(33872));
        hashMap3.put(PKCSObjectIdentifiers.id_alg_CMSRC2wrap, StubApp.getString2(33873));
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes128_wrap;
        String string2 = StubApp.getString2(33874);
        hashMap3.put(aSN1ObjectIdentifier2, string2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes192_wrap;
        hashMap3.put(aSN1ObjectIdentifier3, string2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes256_wrap;
        hashMap3.put(aSN1ObjectIdentifier4, string2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NTTObjectIdentifiers.id_camellia128_wrap;
        String string22 = StubApp.getString2(33875);
        hashMap3.put(aSN1ObjectIdentifier5, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NTTObjectIdentifiers.id_camellia192_wrap;
        hashMap3.put(aSN1ObjectIdentifier6, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NTTObjectIdentifiers.id_camellia256_wrap;
        hashMap3.put(aSN1ObjectIdentifier7, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap;
        hashMap3.put(aSN1ObjectIdentifier8, StubApp.getString2(33876));
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.des_EDE3_CBC;
        String string23 = StubApp.getString2(28590);
        hashMap3.put(aSN1ObjectIdentifier9, string23);
        hashMap5.put(aSN1ObjectIdentifier, Integers.valueOf(192));
        hashMap5.put(aSN1ObjectIdentifier2, Integers.valueOf(128));
        hashMap5.put(aSN1ObjectIdentifier3, Integers.valueOf(192));
        hashMap5.put(aSN1ObjectIdentifier4, Integers.valueOf(256));
        hashMap5.put(aSN1ObjectIdentifier5, Integers.valueOf(128));
        hashMap5.put(aSN1ObjectIdentifier6, Integers.valueOf(192));
        hashMap5.put(aSN1ObjectIdentifier7, Integers.valueOf(256));
        hashMap5.put(aSN1ObjectIdentifier8, Integers.valueOf(128));
        hashMap5.put(aSN1ObjectIdentifier9, Integers.valueOf(192));
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.aes;
        String string24 = StubApp.getString2(461);
        hashMap4.put(aSN1ObjectIdentifier10, string24);
        hashMap4.put(NISTObjectIdentifiers.id_aes128_CBC, string24);
        hashMap4.put(NISTObjectIdentifiers.id_aes192_CBC, string24);
        hashMap4.put(NISTObjectIdentifiers.id_aes256_CBC, string24);
        hashMap4.put(aSN1ObjectIdentifier9, string23);
        hashMap4.put(PKCSObjectIdentifiers.RC2_CBC, StubApp.getString2(28256));
    }

    public OperatorHelper(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    public static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String digestName = MessageDigestUtils.getDigestName(aSN1ObjectIdentifier);
        int indexOf = digestName.indexOf(45);
        if (indexOf <= 0 || digestName.startsWith(StubApp.getString2(29255))) {
            return digestName;
        }
        return digestName.substring(0, indexOf) + digestName.substring(indexOf + 1);
    }

    private static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        return sigFinder.getAlgorithmName(algorithmIdentifier);
    }

    private boolean notDefaultPSSParams(ASN1Sequence aSN1Sequence) throws GeneralSecurityException {
        if (aSN1Sequence != null && aSN1Sequence.size() != 0) {
            RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(aSN1Sequence);
            if (!rSASSAPSSparams.getMaskGenAlgorithm().getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_mgf1) || !rSASSAPSSparams.getHashAlgorithm().equals(AlgorithmIdentifier.getInstance(rSASSAPSSparams.getMaskGenAlgorithm().getParameters()))) {
                return true;
            }
            if (rSASSAPSSparams.getSaltLength().intValue() != createDigest(rSASSAPSSparams.getHashAlgorithm()).getDigestLength()) {
                return true;
            }
        }
        return false;
    }

    public X509Certificate convertCertificate(X509CertificateHolder x509CertificateHolder) throws CertificateException {
        try {
            return (X509Certificate) this.helper.createCertificateFactory(StubApp.getString2("19963")).generateCertificate(new ByteArrayInputStream(x509CertificateHolder.getEncoded()));
        } catch (IOException e10) {
            throw new OpCertificateException(u.q(e10, new StringBuilder(StubApp.getString2(33878))), e10);
        } catch (NoSuchProviderException e11) {
            throw new OpCertificateException(StubApp.getString2(33877) + e11.getMessage(), e11);
        }
    }

    public PublicKey convertPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws OperatorCreationException {
        String string2 = StubApp.getString2(28275);
        try {
            return this.helper.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm().getId()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (IOException e10) {
            throw new OperatorCreationException(u.q(e10, new StringBuilder(StubApp.getString2(33879))), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new OperatorCreationException(string2 + e11.getMessage(), e11);
        } catch (NoSuchProviderException e12) {
            throw new OperatorCreationException(StubApp.getString2(33877) + e12.getMessage(), e12);
        } catch (InvalidKeySpecException e13) {
            throw new OperatorCreationException(string2 + e13.getMessage(), e13);
        }
    }

    public AlgorithmParameters createAlgorithmParameters(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.rsaEncryption)) {
            return null;
        }
        try {
            AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(algorithmIdentifier.getAlgorithm().getId());
            try {
                createAlgorithmParameters.init(algorithmIdentifier.getParameters().toASN1Primitive().getEncoded());
                return createAlgorithmParameters;
            } catch (IOException e10) {
                throw new OperatorCreationException(u.q(e10, new StringBuilder(StubApp.getString2(33880))), e10);
            }
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (NoSuchProviderException e11) {
            throw new OperatorCreationException(StubApp.getString2(33881) + e11.getMessage(), e11);
        }
    }

    public Cipher createAsymmetricWrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier, Map map) throws OperatorCreationException {
        try {
            String str = !map.isEmpty() ? (String) map.get(aSN1ObjectIdentifier) : null;
            if (str == null) {
                str = (String) asymmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
            }
            if (str != null) {
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                    if (str.equals(StubApp.getString2("28053"))) {
                        try {
                            return this.helper.createCipher(StubApp.getString2("33882"));
                        } catch (NoSuchAlgorithmException unused2) {
                        }
                    }
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new OperatorCreationException(a.h(e10, new StringBuilder(StubApp.getString2(28067))), e10);
        }
    }

    public Cipher createCipher(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws OperatorCreationException {
        try {
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new OperatorCreationException(a.h(e10, new StringBuilder(StubApp.getString2(28067))), e10);
        }
    }

    public MessageDigest createDigest(AlgorithmIdentifier algorithmIdentifier) throws GeneralSecurityException {
        JcaJceHelper jcaJceHelper;
        String digestName;
        String string2 = StubApp.getString2(33883);
        String string22 = StubApp.getString2(33884);
        try {
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256_len)) {
                jcaJceHelper = this.helper;
                digestName = string22 + ASN1Integer.getInstance(algorithmIdentifier.getParameters()).getValue();
            } else {
                if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128_len)) {
                    return this.helper.createMessageDigest(string2 + ASN1Integer.getInstance(algorithmIdentifier.getParameters()).getValue());
                }
                jcaJceHelper = this.helper;
                digestName = MessageDigestUtils.getDigestName(algorithmIdentifier.getAlgorithm());
            }
            return jcaJceHelper.createMessageDigest(digestName);
        } catch (NoSuchAlgorithmException e10) {
            Map map = oids;
            if (map.get(algorithmIdentifier.getAlgorithm()) == null) {
                throw e10;
            }
            return this.helper.createMessageDigest((String) map.get(algorithmIdentifier.getAlgorithm()));
        }
    }

    public KeyAgreement createKeyAgreement(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws OperatorCreationException {
        try {
            return this.helper.createKeyAgreement(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new OperatorCreationException(a.h(e10, new StringBuilder(StubApp.getString2(28274))), e10);
        }
    }

    public KeyPairGenerator createKeyPairGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            return this.helper.createKeyPairGenerator(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new CMSException(a.h(e10, new StringBuilder(StubApp.getString2(28274))), e10);
        }
    }

    public Signature createRawSignature(AlgorithmIdentifier algorithmIdentifier) {
        String string2 = StubApp.getString2(207);
        try {
            String signatureName = getSignatureName(algorithmIdentifier);
            String str = string2 + signatureName.substring(signatureName.indexOf(StubApp.getString2("32434")));
            Signature createSignature = this.helper.createSignature(str);
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(str);
                AlgorithmParametersUtils.loadParameters(createAlgorithmParameters, algorithmIdentifier.getParameters());
                createSignature.setParameter((PSSParameterSpec) createAlgorithmParameters.getParameterSpec(PSSParameterSpec.class));
            }
            return createSignature;
        } catch (Exception unused) {
            return null;
        }
    }

    public Signature createSignature(AlgorithmIdentifier algorithmIdentifier) throws GeneralSecurityException {
        Signature createSignature;
        String signatureName = getSignatureName(algorithmIdentifier);
        try {
            createSignature = this.helper.createSignature(signatureName);
        } catch (NoSuchAlgorithmException e10) {
            if (!signatureName.endsWith(StubApp.getString2(32737))) {
                throw e10;
            }
            createSignature = this.helper.createSignature(signatureName.substring(0, signatureName.indexOf(87)) + StubApp.getString2(30305));
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(algorithmIdentifier.getParameters());
            if (notDefaultPSSParams(aSN1Sequence)) {
                try {
                    AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(StubApp.getString2("30318"));
                    createAlgorithmParameters.init(aSN1Sequence.getEncoded());
                    createSignature.setParameter(createAlgorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (IOException e11) {
                    throw new GeneralSecurityException(u.q(e11, new StringBuilder(StubApp.getString2(33885))));
                }
            }
        }
        return createSignature;
    }

    public Cipher createSymmetricWrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws OperatorCreationException {
        try {
            String str = (String) symmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new OperatorCreationException(a.h(e10, new StringBuilder(StubApp.getString2(28067))), e10);
        }
    }

    public String getKeyAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) symmetricKeyAlgNames.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    public int getKeySizeInBits(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return ((Integer) symmetricWrapperKeySizes.get(aSN1ObjectIdentifier)).intValue();
    }

    public String getWrappingAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) symmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
    }
}
