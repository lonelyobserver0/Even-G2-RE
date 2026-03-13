package org.bouncycastle.pqc.jcajce.provider;

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
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BouncyCastlePQCProvider extends Provider implements ConfigurableProvider {
    public static final ProviderConfiguration CONFIGURATION = null;
    private static final String ALGORITHM_PACKAGE = StubApp.getString2(34409);
    public static String PROVIDER_NAME = StubApp.getString2(34410);
    private static String info = StubApp.getString2(34411);
    private static final Map keyInfoConverters = new HashMap();
    private static final String[] ALGORITHMS = {StubApp.getString2(34399), StubApp.getString2(28198), StubApp.getString2(34400), StubApp.getString2(32734), StubApp.getString2(28199), StubApp.getString2(34401), StubApp.getString2(34402), StubApp.getString2(34403), StubApp.getString2(28191), StubApp.getString2(34404), StubApp.getString2(34405), StubApp.getString2(34406), StubApp.getString2(34407), StubApp.getString2(34408), StubApp.getString2(34396), StubApp.getString2(34398)};

    public BouncyCastlePQCProvider() {
        super(PROVIDER_NAME, 1.72d, info);
        AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                BouncyCastlePQCProvider.this.setup();
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
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.generatePublic(subjectPublicKeyInfo);
    }

    private void loadAlgorithms(String str, String[] strArr) {
        for (int i3 = 0; i3 != strArr.length; i3++) {
            StringBuilder b2 = AbstractC1856e.b(str);
            b2.append(strArr[i3]);
            b2.append(StubApp.getString2(32561));
            Class loadClass = loadClass(BouncyCastlePQCProvider.class, b2.toString());
            if (loadClass != null) {
                try {
                    ((AlgorithmProvider) loadClass.newInstance()).configure(this);
                } catch (Exception e10) {
                    throw new InternalError(StubApp.getString2(32562) + str + strArr[i3] + StubApp.getString2(32563) + e10);
                }
            }
        }
    }

    public static Class loadClass(Class cls, final String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider.2
                @Override // java.security.PrivilegedAction
                public Object run() {
                    try {
                        return Class.forName(str);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            });
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setup() {
        loadAlgorithms(StubApp.getString2(34409), ALGORITHMS);
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
        synchronized (CONFIGURATION) {
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, String str2, Map<String, String> map) {
        addAlgorithm(str, str2);
        addAttributes(str, map);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String string2 = StubApp.getString2(1);
        sb2.append(string2);
        sb2.append(str2);
        if (!containsKey(sb2.toString())) {
            throw new IllegalStateException(AbstractC1482f.j(StubApp.getString2(34412), str, string2, str2, StubApp.getString2(22878)));
        }
        addAlgorithm(str + string2 + aSN1ObjectIdentifier, str2);
        addAlgorithm(str + StubApp.getString2(32616) + aSN1ObjectIdentifier, str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2, Map<String, String> map) {
        addAlgorithm(str, aSN1ObjectIdentifier, str2);
        addAttributes(str + StubApp.getString2(1) + aSN1ObjectIdentifier, map);
        addAttributes(str + StubApp.getString2(32616) + aSN1ObjectIdentifier, map);
    }
}
