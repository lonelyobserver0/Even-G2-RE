package org.bouncycastle.operator.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.TeeOutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaContentSignerBuilder {
    private static final Set isAlgIdFromPrivate;
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());
    private SecureRandom random;
    private AlgorithmIdentifier sigAlgId;
    private AlgorithmParameterSpec sigAlgSpec;
    private final String signatureAlgorithm;

    static {
        HashSet hashSet = new HashSet();
        isAlgIdFromPrivate = hashSet;
        hashSet.add(StubApp.getString2(33849));
        hashSet.add(StubApp.getString2(33701));
        hashSet.add(StubApp.getString2(28199));
    }

    public JcaContentSignerBuilder(String str) {
        this.signatureAlgorithm = str;
    }

    private ContentSigner buildComposite(CompositePrivateKey compositePrivateKey) throws OperatorCreationException {
        try {
            List<PrivateKey> privateKeys = compositePrivateKey.getPrivateKeys();
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(this.sigAlgId.getParameters());
            int size = aSN1Sequence.size();
            Signature[] signatureArr = new Signature[size];
            for (int i3 = 0; i3 != aSN1Sequence.size(); i3++) {
                Signature createSignature = this.helper.createSignature(AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i3)));
                signatureArr[i3] = createSignature;
                if (this.random != null) {
                    createSignature.initSign(privateKeys.get(i3), this.random);
                } else {
                    createSignature.initSign(privateKeys.get(i3));
                }
            }
            OutputStream createStream = OutputStreamFactory.createStream(signatureArr[0]);
            int i10 = 1;
            while (i10 != size) {
                TeeOutputStream teeOutputStream = new TeeOutputStream(createStream, OutputStreamFactory.createStream(signatureArr[i10]));
                i10++;
                createStream = teeOutputStream;
            }
            return new ContentSigner(createStream, signatureArr) { // from class: org.bouncycastle.operator.jcajce.JcaContentSignerBuilder.2
                OutputStream stream;
                final /* synthetic */ OutputStream val$sigStream;
                final /* synthetic */ Signature[] val$sigs;

                {
                    this.val$sigStream = createStream;
                    this.val$sigs = signatureArr;
                    this.stream = createStream;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return JcaContentSignerBuilder.this.sigAlgId;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public OutputStream getOutputStream() {
                    return this.stream;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public byte[] getSignature() {
                    try {
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        for (int i11 = 0; i11 != this.val$sigs.length; i11++) {
                            aSN1EncodableVector.add(new DERBitString(this.val$sigs[i11].sign()));
                        }
                        return new DERSequence(aSN1EncodableVector).getEncoded(StubApp.getString2("26791"));
                    } catch (IOException e10) {
                        throw new RuntimeOperatorException(u.q(e10, new StringBuilder(StubApp.getString2(33848))), e10);
                    } catch (SignatureException e11) {
                        throw new RuntimeOperatorException(StubApp.getString2(29435) + e11.getMessage(), e11);
                    }
                }
            };
        } catch (GeneralSecurityException e10) {
            throw new OperatorCreationException(a.h(e10, new StringBuilder(StubApp.getString2(33851))), e10);
        }
    }

    private static ASN1Sequence createCompParams(CompositeAlgorithmSpec compositeAlgorithmSpec) {
        ASN1Encodable createPSSParams;
        DefaultSignatureAlgorithmIdentifierFinder defaultSignatureAlgorithmIdentifierFinder = new DefaultSignatureAlgorithmIdentifierFinder();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        List<String> algorithmNames = compositeAlgorithmSpec.getAlgorithmNames();
        List<AlgorithmParameterSpec> parameterSpecs = compositeAlgorithmSpec.getParameterSpecs();
        for (int i3 = 0; i3 != algorithmNames.size(); i3++) {
            AlgorithmParameterSpec algorithmParameterSpec = parameterSpecs.get(i3);
            if (algorithmParameterSpec == null) {
                createPSSParams = defaultSignatureAlgorithmIdentifierFinder.find(algorithmNames.get(i3));
            } else {
                if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
                    throw new IllegalArgumentException(StubApp.getString2(33852));
                }
                createPSSParams = createPSSParams((PSSParameterSpec) algorithmParameterSpec);
            }
            aSN1EncodableVector.add(createPSSParams);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private static RSASSAPSSparams createPSSParams(PSSParameterSpec pSSParameterSpec) {
        DefaultDigestAlgorithmIdentifierFinder defaultDigestAlgorithmIdentifierFinder = new DefaultDigestAlgorithmIdentifierFinder();
        AlgorithmIdentifier find = defaultDigestAlgorithmIdentifierFinder.find(pSSParameterSpec.getDigestAlgorithm());
        if (find.getParameters() == null) {
            find = new AlgorithmIdentifier(find.getAlgorithm(), DERNull.INSTANCE);
        }
        AlgorithmIdentifier find2 = defaultDigestAlgorithmIdentifierFinder.find(((MGF1ParameterSpec) pSSParameterSpec.getMGFParameters()).getDigestAlgorithm());
        if (find2.getParameters() == null) {
            find2 = new AlgorithmIdentifier(find2.getAlgorithm(), DERNull.INSTANCE);
        }
        return new RSASSAPSSparams(find, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, find2), new ASN1Integer(pSSParameterSpec.getSaltLength()), new ASN1Integer(pSSParameterSpec.getTrailerField()));
    }

    public ContentSigner build(PrivateKey privateKey) throws OperatorCreationException {
        if (privateKey instanceof CompositePrivateKey) {
            return buildComposite((CompositePrivateKey) privateKey);
        }
        try {
            if (this.sigAlgSpec == null) {
                if (isAlgIdFromPrivate.contains(Strings.toUpperCase(this.signatureAlgorithm))) {
                    this.sigAlgId = PrivateKeyInfo.getInstance(privateKey.getEncoded()).getPrivateKeyAlgorithm();
                } else {
                    this.sigAlgId = new DefaultSignatureAlgorithmIdentifierFinder().find(this.signatureAlgorithm);
                }
                this.sigAlgSpec = null;
            }
            AlgorithmIdentifier algorithmIdentifier = this.sigAlgId;
            Signature createSignature = this.helper.createSignature(algorithmIdentifier);
            SecureRandom secureRandom = this.random;
            if (secureRandom != null) {
                createSignature.initSign(privateKey, secureRandom);
            } else {
                createSignature.initSign(privateKey);
            }
            return new ContentSigner(createSignature, algorithmIdentifier) { // from class: org.bouncycastle.operator.jcajce.JcaContentSignerBuilder.1
                private OutputStream stream;
                final /* synthetic */ Signature val$sig;
                final /* synthetic */ AlgorithmIdentifier val$signatureAlgId;

                {
                    this.val$sig = createSignature;
                    this.val$signatureAlgId = algorithmIdentifier;
                    this.stream = OutputStreamFactory.createStream(createSignature);
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return this.val$signatureAlgId;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public OutputStream getOutputStream() {
                    return this.stream;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public byte[] getSignature() {
                    try {
                        return this.val$sig.sign();
                    } catch (SignatureException e10) {
                        throw new RuntimeOperatorException(StubApp.getString2(29435) + e10.getMessage(), e10);
                    }
                }
            };
        } catch (GeneralSecurityException e10) {
            throw new OperatorCreationException(a.h(e10, new StringBuilder(StubApp.getString2(33851))), e10);
        }
    }

    public JcaContentSignerBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JcaContentSignerBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JcaContentSignerBuilder(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        AlgorithmIdentifier algorithmIdentifier;
        this.signatureAlgorithm = str;
        if (algorithmParameterSpec instanceof PSSParameterSpec) {
            PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
            this.sigAlgSpec = pSSParameterSpec;
            algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSASSA_PSS, createPSSParams(pSSParameterSpec));
        } else {
            if (!(algorithmParameterSpec instanceof CompositeAlgorithmSpec)) {
                throw new IllegalArgumentException(StubApp.getString2(33850).concat(algorithmParameterSpec == null ? StubApp.getString2(1116) : algorithmParameterSpec.getClass().getName()));
            }
            CompositeAlgorithmSpec compositeAlgorithmSpec = (CompositeAlgorithmSpec) algorithmParameterSpec;
            this.sigAlgSpec = compositeAlgorithmSpec;
            algorithmIdentifier = new AlgorithmIdentifier(MiscObjectIdentifiers.id_alg_composite, createCompParams(compositeAlgorithmSpec));
        }
        this.sigAlgId = algorithmIdentifier;
    }

    public JcaContentSignerBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }
}
