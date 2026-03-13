package org.bouncycastle.crypto;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.Permission;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAValidationParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class CryptoServicesRegistrar {
    private static final AtomicReference<SecureRandomProvider> defaultSecureRandomProvider;
    private static final CryptoServicesConstraints noConstraintsImpl;
    private static final boolean preconfiguredConstraints;
    private static final AtomicReference<CryptoServicesConstraints> servicesConstraints;
    private static final Logger LOG = Logger.getLogger(CryptoServicesRegistrar.class.getName());
    private static final Permission CanSetDefaultProperty = new CryptoServicesPermission(StubApp.getString2(28319));
    private static final Permission CanSetThreadProperty = new CryptoServicesPermission(StubApp.getString2(28320));
    private static final Permission CanSetDefaultRandom = new CryptoServicesPermission(StubApp.getString2(28318));
    private static final Permission CanSetConstraints = new CryptoServicesPermission(StubApp.getString2(28317));
    private static final ThreadLocal<Map<String, Object[]>> threadProperties = new ThreadLocal<>();
    private static final Map<String, Object[]> globalProperties = Collections.synchronizedMap(new HashMap());
    private static final SecureRandomProvider defaultRandomProviderImpl = new SecureRandomProvider() { // from class: org.bouncycastle.crypto.CryptoServicesRegistrar.1
        @Override // org.bouncycastle.crypto.SecureRandomProvider
        public SecureRandom get() {
            return new SecureRandom();
        }
    };

    public static final class Property {
        private final String name;
        private final Class type;
        public static final Property EC_IMPLICITLY_CA = new Property(StubApp.getString2(28321), X9ECParameters.class);
        public static final Property DH_DEFAULT_PARAMS = new Property(StubApp.getString2(28322), DHParameters.class);
        public static final Property DSA_DEFAULT_PARAMS = new Property(StubApp.getString2(28323), DSAParameters.class);

        private Property(String str, Class cls) {
            this.name = str;
            this.type = cls;
        }
    }

    static {
        CryptoServicesConstraints cryptoServicesConstraints = new CryptoServicesConstraints() { // from class: org.bouncycastle.crypto.CryptoServicesRegistrar.2
            @Override // org.bouncycastle.crypto.CryptoServicesConstraints
            public void check(CryptoServiceProperties cryptoServiceProperties) {
            }
        };
        noConstraintsImpl = cryptoServicesConstraints;
        defaultSecureRandomProvider = new AtomicReference<>();
        AtomicReference<CryptoServicesConstraints> atomicReference = new AtomicReference<>();
        servicesConstraints = atomicReference;
        DSAParameters dSAParameters = new DSAParameters(new BigInteger(StubApp.getString2(28324), 16), new BigInteger(StubApp.getString2(28325), 16), new BigInteger(StubApp.getString2(28326), 16), new DSAValidationParameters(Hex.decodeStrict(StubApp.getString2(28327)), 123));
        DSAParameters dSAParameters2 = new DSAParameters(new BigInteger(StubApp.getString2(28328), 16), new BigInteger(StubApp.getString2(28329), 16), new BigInteger(StubApp.getString2(28330), 16), new DSAValidationParameters(Hex.decodeStrict(StubApp.getString2(28331)), 263));
        DSAParameters dSAParameters3 = new DSAParameters(new BigInteger(StubApp.getString2(28332), 16), new BigInteger(StubApp.getString2(28333), 16), new BigInteger(StubApp.getString2(28334), 16), new DSAValidationParameters(Hex.decodeStrict(StubApp.getString2(28335)), 92));
        DSAParameters dSAParameters4 = new DSAParameters(new BigInteger(StubApp.getString2(28336), 16), new BigInteger(StubApp.getString2(28337), 16), new BigInteger(StubApp.getString2(28338), 16), new DSAValidationParameters(Hex.decodeStrict(StubApp.getString2(28339)), 497));
        localSetGlobalProperty(Property.DSA_DEFAULT_PARAMS, dSAParameters, dSAParameters2, dSAParameters3, dSAParameters4);
        localSetGlobalProperty(Property.DH_DEFAULT_PARAMS, toDH(dSAParameters), toDH(dSAParameters2), toDH(dSAParameters3), toDH(dSAParameters4));
        atomicReference.set(getDefaultConstraints());
        preconfiguredConstraints = atomicReference.get() != cryptoServicesConstraints;
    }

    private CryptoServicesRegistrar() {
    }

    public static void checkConstraints(CryptoServiceProperties cryptoServiceProperties) {
        servicesConstraints.get().check(cryptoServiceProperties);
    }

    private static void checkPermission(final Permission permission) {
        final SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.bouncycastle.crypto.CryptoServicesRegistrar.4
                @Override // java.security.PrivilegedAction
                public Object run() {
                    securityManager.checkPermission(permission);
                    return null;
                }
            });
        }
    }

    private static int chooseLowerBound(int i3) {
        if (i3 <= 1024) {
            return 160;
        }
        if (i3 <= 2048) {
            return BERTags.FLAGS;
        }
        if (i3 <= 3072) {
            return 256;
        }
        if (i3 <= 7680) {
            return KyberEngine.KyberPolyBytes;
        }
        return 512;
    }

    public static <T> T[] clearGlobalProperty(Property property) {
        checkPermission(CanSetDefaultProperty);
        localClearThreadProperty(property);
        return (T[]) globalProperties.remove(property.name);
    }

    public static <T> T[] clearThreadProperty(Property property) {
        checkPermission(CanSetThreadProperty);
        return (T[]) localClearThreadProperty(property);
    }

    private static CryptoServicesConstraints getDefaultConstraints() {
        return noConstraintsImpl;
    }

    public static <T> T getProperty(Property property) {
        Object[] lookupProperty = lookupProperty(property);
        if (lookupProperty != null) {
            return (T) lookupProperty[0];
        }
        return null;
    }

    public static SecureRandom getSecureRandom() {
        AtomicReference<SecureRandomProvider> atomicReference = defaultSecureRandomProvider;
        SecureRandomProvider secureRandomProvider = defaultRandomProviderImpl;
        while (!atomicReference.compareAndSet(null, secureRandomProvider) && atomicReference.get() == null) {
        }
        return defaultSecureRandomProvider.get().get();
    }

    public static CryptoServicesConstraints getServicesConstraints() {
        return servicesConstraints.get();
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [T, org.bouncycastle.crypto.params.DSAParameters] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, org.bouncycastle.crypto.params.DHParameters] */
    public static <T> T getSizedProperty(Property property, int i3) {
        Object[] lookupProperty = lookupProperty(property);
        if (lookupProperty == null) {
            return null;
        }
        int i10 = 0;
        if (property.type.isAssignableFrom(DHParameters.class)) {
            while (i10 != lookupProperty.length) {
                ?? r42 = (T) ((DHParameters) lookupProperty[i10]);
                if (r42.getP().bitLength() == i3) {
                    return r42;
                }
                i10++;
            }
        } else if (property.type.isAssignableFrom(DSAParameters.class)) {
            while (i10 != lookupProperty.length) {
                ?? r43 = (T) ((DSAParameters) lookupProperty[i10]);
                if (r43.getP().bitLength() == i3) {
                    return r43;
                }
                i10++;
            }
        }
        return null;
    }

    private static Object[] localClearThreadProperty(Property property) {
        ThreadLocal<Map<String, Object[]>> threadLocal = threadProperties;
        Map<String, Object[]> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
        }
        return map.remove(property.name);
    }

    private static <T> void localSetGlobalProperty(Property property, T... tArr) {
        if (!property.type.isAssignableFrom(tArr[0].getClass())) {
            throw new IllegalArgumentException(StubApp.getString2(28340));
        }
        localSetThread(property, tArr);
        globalProperties.put(property.name, tArr);
    }

    private static <T> void localSetThread(Property property, T[] tArr) {
        ThreadLocal<Map<String, Object[]>> threadLocal = threadProperties;
        Map<String, Object[]> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
        }
        map.put(property.name, tArr);
    }

    private static Object[] lookupProperty(Property property) {
        Map<String, Object[]> map = threadProperties.get();
        if (map == null || !map.containsKey(property.name)) {
            map = globalProperties;
        }
        return map.get(property.name);
    }

    public static <T> void setGlobalProperty(Property property, T... tArr) {
        checkPermission(CanSetDefaultProperty);
        localSetGlobalProperty(property, (Object[]) tArr.clone());
    }

    public static void setSecureRandom(final SecureRandom secureRandom) {
        checkPermission(CanSetDefaultRandom);
        if (secureRandom == null) {
            defaultSecureRandomProvider.set(defaultRandomProviderImpl);
        } else {
            defaultSecureRandomProvider.set(new SecureRandomProvider() { // from class: org.bouncycastle.crypto.CryptoServicesRegistrar.3
                @Override // org.bouncycastle.crypto.SecureRandomProvider
                public SecureRandom get() {
                    return secureRandom;
                }
            });
        }
    }

    public static void setSecureRandomProvider(SecureRandomProvider secureRandomProvider) {
        checkPermission(CanSetDefaultRandom);
        defaultSecureRandomProvider.set(secureRandomProvider);
    }

    public static void setServicesConstraints(CryptoServicesConstraints cryptoServicesConstraints) {
        checkPermission(CanSetConstraints);
        if (cryptoServicesConstraints == null) {
            cryptoServicesConstraints = noConstraintsImpl;
        }
        if (!preconfiguredConstraints) {
            servicesConstraints.set(cryptoServicesConstraints);
        } else if (Properties.isOverrideSet(StubApp.getString2(28341))) {
            servicesConstraints.set(cryptoServicesConstraints);
        } else {
            LOG.warning(StubApp.getString2(28342));
        }
    }

    public static <T> void setThreadProperty(Property property, T... tArr) {
        checkPermission(CanSetThreadProperty);
        if (!property.type.isAssignableFrom(tArr[0].getClass())) {
            throw new IllegalArgumentException(StubApp.getString2(28340));
        }
        localSetThread(property, (Object[]) tArr.clone());
    }

    private static DHParameters toDH(DSAParameters dSAParameters) {
        return new DHParameters(dSAParameters.getP(), dSAParameters.getG(), dSAParameters.getQ(), chooseLowerBound(dSAParameters.getP().bitLength()), 0, null, new DHValidationParameters(dSAParameters.getValidationParameters().getSeed(), dSAParameters.getValidationParameters().getCounter()));
    }

    public static <T> T[] getSizedProperty(Property property) {
        Object[] lookupProperty = lookupProperty(property);
        if (lookupProperty == null) {
            return null;
        }
        return (T[]) ((Object[]) lookupProperty.clone());
    }

    public static SecureRandom getSecureRandom(SecureRandom secureRandom) {
        return secureRandom == null ? getSecureRandom() : secureRandom;
    }
}
