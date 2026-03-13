package org.bouncycastle.jce.provider;

import E1.a;
import com.stub.StubApp;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CryptoServiceConstraintsException;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.newhope.NHKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.picnic.PicnicKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.qtesla.QTESLAKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyFactorySpi;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class BouncyCastleProvider extends Provider implements ConfigurableProvider {
    private static final String ASYMMETRIC_PACKAGE = StubApp.getString2(32554);
    private static final String DIGEST_PACKAGE = StubApp.getString2(32555);
    private static final String KEYSTORE_PACKAGE = StubApp.getString2(32556);
    public static final String PROVIDER_NAME = StubApp.getString2(21668);
    private static final String SECURE_RANDOM_PACKAGE = StubApp.getString2(32557);
    private static final String SYMMETRIC_PACKAGE = StubApp.getString2(32558);
    private static final Logger LOG = Logger.getLogger(BouncyCastleProvider.class.getName());
    private static String info = StubApp.getString2(32534);
    public static final ProviderConfiguration CONFIGURATION = new BouncyCastleProviderConfiguration();
    private static final Map keyInfoConverters = new HashMap();
    private static final Class revChkClass = ClassUtil.loadClass(BouncyCastleProvider.class, StubApp.getString2(32535));
    private static final String[] SYMMETRIC_GENERIC = {StubApp.getString2(32538), StubApp.getString2(32536), StubApp.getString2(32537), StubApp.getString2(32539), StubApp.getString2(32169)};
    private static final String[] SYMMETRIC_MACS = {StubApp.getString2(32220), StubApp.getString2(32231), StubApp.getString2(29046)};
    private static final CryptoServiceProperties[] SYMMETRIC_CIPHERS = {service(StubApp.getString2(461), 256), service(StubApp.getString2(28456), 20), service(StubApp.getString2(28558), 256), service(StubApp.getString2(28562), 128), service(StubApp.getString2(28258), 256), service(StubApp.getString2(28257), 128), service(StubApp.getString2(28568), 256), service(StubApp.getString2(28578), 128), service(StubApp.getString2(28171), 56), service(StubApp.getString2(28590), 112), service(StubApp.getString2(28261), 128), service(StubApp.getString2(31972), 128), service(StubApp.getString2(31968), 128), service(StubApp.getString2(31977), 128), service(StubApp.getString2(31982), 256), service(StubApp.getString2(28667), 128), service(StubApp.getString2(28708), 128), service(StubApp.getString2(28256), 128), service(StubApp.getString2(32133), 128), service(StubApp.getString2(28721), 256), service(StubApp.getString2(28739), 256), service(StubApp.getString2(28759), 128), service(StubApp.getString2(28259), 128), service(StubApp.getString2(28768), 256), service(StubApp.getString2(28770), 128), service(StubApp.getString2(32241), 80), service(StubApp.getString2(28750), 128), service(StubApp.getString2(28777), 128), service(StubApp.getString2(28788), 256), service(StubApp.getString2(32540), 128), service(StubApp.getString2(28791), 128), service(StubApp.getString2(32541), 128), service(StubApp.getString2(28799), 128), service(StubApp.getString2(28796), 128), service(StubApp.getString2(32020), 128), service(StubApp.getString2(28603), 256), service(StubApp.getString2(28641), 256), service(StubApp.getString2(32542), 128)};
    private static final String[] ASYMMETRIC_GENERIC = {StubApp.getString2(29560), StubApp.getString2(30502), StubApp.getString2(28200), StubApp.getString2(32543)};
    private static final String[] ASYMMETRIC_CIPHERS = {StubApp.getString2(28060), StubApp.getString2(28348), StubApp.getString2(4707), StubApp.getString2(24659), StubApp.getString2(32410), StubApp.getString2(32545), StubApp.getString2(30721), StubApp.getString2(29292), StubApp.getString2(4686), StubApp.getString2(32544), StubApp.getString2(28198), StubApp.getString2(28199)};
    private static final String[] DIGESTS = {StubApp.getString2(28192), StubApp.getString2(32547), StubApp.getString2(28179), StubApp.getString2(28178), StubApp.getString2(4894), StubApp.getString2(21748), StubApp.getString2(28185), StubApp.getString2(21747), StubApp.getString2(28186), StubApp.getString2(28500), StubApp.getString2(28054), StubApp.getString2(21749), StubApp.getString2(21750), StubApp.getString2(21751), StubApp.getString2(29255), StubApp.getString2(32548), StubApp.getString2(28189), StubApp.getString2(28523), StubApp.getString2(28525), StubApp.getString2(32549), StubApp.getString2(32546), StubApp.getString2(28479), StubApp.getString2(32550), StubApp.getString2(32551)};
    private static final String[] KEYSTORES = {StubApp.getString2(21668), StubApp.getString2(32552), StubApp.getString2(28343)};
    private static final String[] SECURE_RANDOMS = {StubApp.getString2(32553)};

    public static class JcaCryptoService implements CryptoServiceProperties {
        private final int bitsOfSecurity;
        private final String name;

        public JcaCryptoService(String str, int i3) {
            this.name = str;
            this.bitsOfSecurity = i3;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public int bitsOfSecurity() {
            return this.bitsOfSecurity;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public Object getParams() {
            return null;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public CryptoServicePurpose getPurpose() {
            return CryptoServicePurpose.ANY;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public String getServiceName() {
            return this.name;
        }
    }

    public BouncyCastleProvider() {
        super(StubApp.getString2(21668), 1.72d, info);
        AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.jce.provider.BouncyCastleProvider.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                BouncyCastleProvider.this.setup();
                return null;
            }
        });
    }

    private static AsymmetricKeyInfoConverter getAsymmetricKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        Map map = keyInfoConverters;
        synchronized (map) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) map.get(aSN1ObjectIdentifier);
        }
        return asymmetricKeyInfoConverter;
    }

    public static PrivateKey getPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.generatePrivate(privateKeyInfo);
    }

    public static PublicKey getPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        if (subjectPublicKeyInfo.getAlgorithm().getAlgorithm().on(BCObjectIdentifiers.picnic_key)) {
            return new PicnicKeyFactorySpi().generatePublic(subjectPublicKeyInfo);
        }
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.generatePublic(subjectPublicKeyInfo);
    }

    private void loadAlgorithms(String str, String[] strArr) {
        for (int i3 = 0; i3 != strArr.length; i3++) {
            loadServiceClass(str, strArr[i3]);
        }
    }

    private void loadPQCKeys() {
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_256, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha_256, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha_512, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.sphincs256, new Sphincs256KeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.newHope, new NHKeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.xmss, new XMSSKeyFactorySpi());
        addKeyInfoConverter(IsaraObjectIdentifiers.id_alg_xmss, new XMSSKeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.xmss_mt, new XMSSMTKeyFactorySpi());
        addKeyInfoConverter(IsaraObjectIdentifiers.id_alg_xmssmt, new XMSSMTKeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.mcEliece, new McElieceKeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.mcElieceCca2, new McElieceCCA2KeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.rainbow, new RainbowKeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.qTESLA_p_I, new QTESLAKeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.qTESLA_p_III, new QTESLAKeyFactorySpi());
        addKeyInfoConverter(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig, new LMSKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.picnic_key, new PicnicKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.falcon_512, new FalconKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.falcon_1024, new FalconKeyFactorySpi());
    }

    private void loadServiceClass(String str, String str2) {
        Class loadClass = ClassUtil.loadClass(BouncyCastleProvider.class, str + str2 + StubApp.getString2(32561));
        if (loadClass != null) {
            try {
                ((AlgorithmProvider) loadClass.newInstance()).configure(this);
            } catch (Exception e10) {
                throw new InternalError(StubApp.getString2(32562) + str + str2 + StubApp.getString2(32563) + e10);
            }
        }
    }

    private static CryptoServiceProperties service(String str, int i3) {
        return new JcaCryptoService(str, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setup() {
        String string2;
        String string22;
        loadAlgorithms(StubApp.getString2(32555), DIGESTS);
        String[] strArr = SYMMETRIC_GENERIC;
        String string23 = StubApp.getString2(32558);
        loadAlgorithms(string23, strArr);
        loadAlgorithms(string23, SYMMETRIC_MACS);
        loadAlgorithms(string23, SYMMETRIC_CIPHERS);
        String[] strArr2 = ASYMMETRIC_GENERIC;
        String string24 = StubApp.getString2(32554);
        loadAlgorithms(string24, strArr2);
        loadAlgorithms(string24, ASYMMETRIC_CIPHERS);
        loadAlgorithms(StubApp.getString2(32556), KEYSTORES);
        loadAlgorithms(StubApp.getString2(32557), SECURE_RANDOMS);
        loadPQCKeys();
        put(StubApp.getString2(32564), StubApp.getString2(32565));
        put(StubApp.getString2(32566), StubApp.getString2(32567));
        put(StubApp.getString2(32568), StubApp.getString2(32569));
        put(StubApp.getString2(32570), StubApp.getString2(32571));
        put(StubApp.getString2(32572), StubApp.getString2(32573));
        put(StubApp.getString2(32574), StubApp.getString2(32575));
        put(StubApp.getString2(32576), StubApp.getString2(32577));
        put(StubApp.getString2(32578), StubApp.getString2(32579));
        put(StubApp.getString2(32580), StubApp.getString2(32581));
        put(StubApp.getString2(32582), StubApp.getString2(32583));
        put(StubApp.getString2(32584), StubApp.getString2(32585));
        put(StubApp.getString2(32586), StubApp.getString2(32587));
        put(StubApp.getString2(32588), StubApp.getString2(32589));
        put(StubApp.getString2(32590), StubApp.getString2(32591));
        put(StubApp.getString2(32592), StubApp.getString2(32593));
        Class cls = revChkClass;
        String string25 = StubApp.getString2(32594);
        String string26 = StubApp.getString2(32595);
        String string27 = StubApp.getString2(32596);
        String string28 = StubApp.getString2(32597);
        String string29 = StubApp.getString2(32598);
        String string210 = StubApp.getString2(32599);
        put(StubApp.getString2(32601), StubApp.getString2(32600));
        put(string210, string29);
        if (cls != null) {
            string2 = StubApp.getString2(32602);
            put(string28, string2);
            string22 = StubApp.getString2(32603);
        } else {
            string2 = StubApp.getString2(32604);
            put(string28, string2);
            string22 = StubApp.getString2(32605);
        }
        put(string27, string22);
        put(string26, string2);
        put(string25, string22);
        put(StubApp.getString2(32606), StubApp.getString2(32607));
        put(StubApp.getString2(32608), StubApp.getString2(32609));
        put(StubApp.getString2(32610), StubApp.getString2(32611));
        put(StubApp.getString2(32612), StubApp.getString2(32613));
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, String str2) {
        if (containsKey(str)) {
            throw new IllegalStateException(a.k(StubApp.getString2(32614), str, StubApp.getString2(32615)));
        }
        put(str, str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAttributes(String str, Map<String, String> map) {
        put(str + StubApp.getString2(32617), StubApp.getString2(8660));
        for (String str2 : map.keySet()) {
            String h2 = AbstractC1482f.h(str, StubApp.getString2(397), str2);
            if (containsKey(h2)) {
                throw new IllegalStateException(a.k(StubApp.getString2(32618), h2, StubApp.getString2(32615)));
            }
            put(h2, map.get(str2));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        Map map = keyInfoConverters;
        synchronized (map) {
            map.put(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public AsymmetricKeyInfoConverter getKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (AsymmetricKeyInfoConverter) keyInfoConverters.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public boolean hasAlgorithm(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String string2 = StubApp.getString2(1);
        sb2.append(string2);
        sb2.append(str2);
        if (containsKey(sb2.toString())) {
            return true;
        }
        StringBuilder sb3 = new StringBuilder(StubApp.getString2(32619));
        sb3.append(str);
        sb3.append(string2);
        sb3.append(str2);
        return containsKey(sb3.toString());
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void setParameter(String str, Object obj) {
        ProviderConfiguration providerConfiguration = CONFIGURATION;
        synchronized (providerConfiguration) {
            ((BouncyCastleProviderConfiguration) providerConfiguration).setParameter(str, obj);
        }
    }

    private void loadAlgorithms(String str, CryptoServiceProperties[] cryptoServicePropertiesArr) {
        for (int i3 = 0; i3 != cryptoServicePropertiesArr.length; i3++) {
            CryptoServiceProperties cryptoServiceProperties = cryptoServicePropertiesArr[i3];
            try {
                CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties);
                loadServiceClass(str, cryptoServiceProperties.getServiceName());
            } catch (CryptoServiceConstraintsException unused) {
                Logger logger = LOG;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(StubApp.getString2(32559) + cryptoServiceProperties.getServiceName() + StubApp.getString2(32560));
                }
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, String str2, Map<String, String> map) {
        addAlgorithm(str, str2);
        addAttributes(str, map);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        addAlgorithm(str + StubApp.getString2(1) + aSN1ObjectIdentifier, str2);
        addAlgorithm(str + StubApp.getString2(32616) + aSN1ObjectIdentifier, str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2, Map<String, String> map) {
        addAlgorithm(str, aSN1ObjectIdentifier, str2);
        addAttributes(str + StubApp.getString2(1) + aSN1ObjectIdentifier, map);
        addAttributes(str + StubApp.getString2(32616) + aSN1ObjectIdentifier, map);
    }
}
