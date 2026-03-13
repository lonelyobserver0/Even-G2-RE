package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class COMPOSITE {
    private static final String PREFIX = StubApp.getString2(29657);
    private static AsymmetricKeyInfoConverter baseConverter;
    private static final Map<String, String> compositeAttributes;

    public static class CompositeKeyInfoConverter implements AsymmetricKeyInfoConverter {
        private final ConfigurableProvider provider;

        public CompositeKeyInfoConverter(ConfigurableProvider configurableProvider) {
            this.provider = configurableProvider;
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(privateKeyInfo.getPrivateKey().getOctets());
            PrivateKey[] privateKeyArr = new PrivateKey[aSN1Sequence.size()];
            for (int i3 = 0; i3 != aSN1Sequence.size(); i3++) {
                PrivateKeyInfo privateKeyInfo2 = PrivateKeyInfo.getInstance(aSN1Sequence.getObjectAt(i3));
                privateKeyArr[i3] = this.provider.getKeyInfoConverter(privateKeyInfo2.getPrivateKeyAlgorithm().getAlgorithm()).generatePrivate(privateKeyInfo2);
            }
            return new CompositePrivateKey(privateKeyArr);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(subjectPublicKeyInfo.getPublicKeyData().getBytes());
            PublicKey[] publicKeyArr = new PublicKey[aSN1Sequence.size()];
            for (int i3 = 0; i3 != aSN1Sequence.size(); i3++) {
                SubjectPublicKeyInfo subjectPublicKeyInfo2 = SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(i3));
                publicKeyArr[i3] = this.provider.getKeyInfoConverter(subjectPublicKeyInfo2.getAlgorithm().getAlgorithm()).generatePublic(subjectPublicKeyInfo2);
            }
            return new CompositePublicKey(publicKeyArr);
        }
    }

    public static class KeyFactory extends BaseKeyFactorySpi {
        @Override // java.security.KeyFactorySpi
        public Key engineTranslateKey(Key key) throws InvalidKeyException {
            try {
                if (key instanceof PrivateKey) {
                    return generatePrivate(PrivateKeyInfo.getInstance(key.getEncoded()));
                }
                if (key instanceof PublicKey) {
                    return generatePublic(SubjectPublicKeyInfo.getInstance(key.getEncoded()));
                }
                throw new InvalidKeyException(StubApp.getString2(29647));
            } catch (IOException e10) {
                throw new InvalidKeyException(u.q(e10, new StringBuilder(StubApp.getString2(29648))));
            }
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
            return COMPOSITE.baseConverter.generatePrivate(privateKeyInfo);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            return COMPOSITE.baseConverter.generatePublic(subjectPublicKeyInfo);
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String string2 = StubApp.getString2(29649);
            String string22 = StubApp.getString2(29650);
            String string23 = StubApp.getString2(29651);
            StringBuilder r8 = a.r(configurableProvider, string2, string22, string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.id_alg_composite;
            String string24 = StubApp.getString2(29652);
            StringBuilder q10 = a.q(a.q(r8, aSN1ObjectIdentifier, configurableProvider, string22, string24), aSN1ObjectIdentifier, configurableProvider, string22, string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = MiscObjectIdentifiers.id_composite_key;
            StringBuilder q11 = a.q(q10, aSN1ObjectIdentifier2, configurableProvider, string22, string24);
            q11.append(aSN1ObjectIdentifier2);
            configurableProvider.addAlgorithm(q11.toString(), string22);
            AsymmetricKeyInfoConverter unused = COMPOSITE.baseConverter = new CompositeKeyInfoConverter(configurableProvider);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, COMPOSITE.baseConverter);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier2, COMPOSITE.baseConverter);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        compositeAttributes = hashMap;
        hashMap.put(StubApp.getString2(29653), StubApp.getString2(29654));
        hashMap.put(StubApp.getString2(29655), StubApp.getString2(29656));
    }
}
