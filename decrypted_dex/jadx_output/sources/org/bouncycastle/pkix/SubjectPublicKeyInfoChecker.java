package org.bouncycastle.pkix;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAPublicKey;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9FieldID;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SubjectPublicKeyInfoChecker {
    private static final Cache validatedMods;
    private static final Cache validatedQs;
    private static final BigInteger SMALL_PRIMES_PRODUCT = new BigInteger(StubApp.getString2(29226), 16);
    private static final BigInteger ONE = BigInteger.valueOf(1);

    /* renamed from: org.bouncycastle.pkix.SubjectPublicKeyInfoChecker$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Cache {
        private final BigInteger[] preserve;
        private int preserveCounter;
        private final Map<BigInteger, Boolean> values;

        private Cache() {
            this.values = new WeakHashMap();
            this.preserve = new BigInteger[8];
            this.preserveCounter = 0;
        }

        public synchronized void add(BigInteger bigInteger) {
            this.values.put(bigInteger, Boolean.TRUE);
            BigInteger[] bigIntegerArr = this.preserve;
            int i3 = this.preserveCounter;
            bigIntegerArr[i3] = bigInteger;
            this.preserveCounter = (i3 + 1) % bigIntegerArr.length;
        }

        public synchronized void clear() {
            this.values.clear();
            int i3 = 0;
            while (true) {
                BigInteger[] bigIntegerArr = this.preserve;
                if (i3 != bigIntegerArr.length) {
                    bigIntegerArr[i3] = null;
                    i3++;
                }
            }
        }

        public synchronized boolean contains(BigInteger bigInteger) {
            return this.values.containsKey(bigInteger);
        }

        public synchronized int size() {
            return this.values.size();
        }

        public /* synthetic */ Cache(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class Properties {
        private static final ThreadLocal threadProperties = new ThreadLocal();

        private Properties() {
        }

        public static int asInteger(String str, int i3) {
            String propertyValue = getPropertyValue(str);
            return propertyValue != null ? Integer.parseInt(propertyValue) : i3;
        }

        public static String getPropertyValue(final String str) {
            String str2;
            String str3 = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.pkix.SubjectPublicKeyInfoChecker.Properties.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    return Security.getProperty(str);
                }
            });
            if (str3 != null) {
                return str3;
            }
            Map map = (Map) threadProperties.get();
            return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.pkix.SubjectPublicKeyInfoChecker.Properties.2
                @Override // java.security.PrivilegedAction
                public Object run() {
                    return System.getProperty(str);
                }
            }) : str2;
        }

        public static boolean isOverrideSet(String str) {
            try {
                return isSetTrue(getPropertyValue(str));
            } catch (AccessControlException unused) {
                return false;
            }
        }

        private static boolean isSetTrue(String str) {
            if (str == null || str.length() != 4) {
                return false;
            }
            return (str.charAt(0) == 't' || str.charAt(0) == 'T') && (str.charAt(1) == 'r' || str.charAt(1) == 'R') && ((str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E'));
        }

        public static boolean removeThreadOverride(String str) {
            String str2;
            ThreadLocal threadLocal = threadProperties;
            Map map = (Map) threadLocal.get();
            if (map == null || (str2 = (String) map.remove(str)) == null) {
                return false;
            }
            if (map.isEmpty()) {
                threadLocal.remove();
            }
            return StubApp.getString2(6547).equals(Strings.toLowerCase(str2));
        }

        public static boolean setThreadOverride(String str, boolean z2) {
            boolean isOverrideSet = isOverrideSet(str);
            ThreadLocal threadLocal = threadProperties;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            map.put(str, z2 ? StubApp.getString2(6547) : StubApp.getString2(9372));
            return isOverrideSet;
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = null;
        validatedQs = new Cache(anonymousClass1);
        validatedMods = new Cache(anonymousClass1);
    }

    public static void checkInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (!X9ObjectIdentifiers.id_ecPublicKey.equals((ASN1Primitive) algorithm)) {
            if (PKCSObjectIdentifiers.rsaEncryption.equals((ASN1Primitive) algorithm) || X509ObjectIdentifiers.id_ea_rsa.equals((ASN1Primitive) algorithm) || PKCSObjectIdentifiers.id_RSAES_OAEP.equals((ASN1Primitive) algorithm) || PKCSObjectIdentifiers.id_RSASSA_PSS.equals((ASN1Primitive) algorithm)) {
                try {
                    RSAPublicKey rSAPublicKey = RSAPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
                    if ((rSAPublicKey.getPublicExponent().intValue() & 1) == 0) {
                        throw new IllegalArgumentException(StubApp.getString2(29227));
                    }
                    Cache cache = validatedMods;
                    if (cache.contains(rSAPublicKey.getModulus())) {
                        return;
                    }
                    validate(rSAPublicKey.getModulus());
                    cache.add(rSAPublicKey.getModulus());
                    return;
                } catch (IOException unused) {
                    throw new IllegalArgumentException(StubApp.getString2(33911));
                }
            }
            return;
        }
        X962Parameters x962Parameters = X962Parameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
        if (x962Parameters.isImplicitlyCA() || x962Parameters.isNamedCurve()) {
            return;
        }
        X9FieldID x9FieldID = X9FieldID.getInstance(ASN1Sequence.getInstance(x962Parameters.getParameters()).getObjectAt(1));
        if (x9FieldID.getIdentifier().equals((ASN1Primitive) X9ObjectIdentifiers.prime_field)) {
            BigInteger value = ASN1Integer.getInstance(x9FieldID.getParameters()).getValue();
            Cache cache2 = validatedQs;
            if (cache2.contains(value)) {
                return;
            }
            int asInteger = Properties.asInteger(StubApp.getString2(32896), 1042);
            int asInteger2 = Properties.asInteger(StubApp.getString2(32897), 100);
            int bitLength = value.bitLength();
            if (asInteger < bitLength) {
                throw new IllegalArgumentException(StubApp.getString2(32899));
            }
            if (Primes.hasAnySmallFactors(value) || !Primes.isMRProbablePrime(value, CryptoServicesRegistrar.getSecureRandom(), getNumberOfIterations(bitLength, asInteger2))) {
                throw new IllegalArgumentException(StubApp.getString2(32898));
            }
            cache2.add(value);
        }
    }

    private static int getNumberOfIterations(int i3, int i10) {
        if (i3 >= 1536) {
            if (i10 <= 100) {
                return 3;
            }
            if (i10 <= 128) {
                return 4;
            }
            return u.c(i10, CertificateBody.profileType, 2, 4);
        }
        if (i3 >= 1024) {
            if (i10 <= 100) {
                return 4;
            }
            if (i10 <= 112) {
                return 5;
            }
            return u.c(i10, 111, 2, 5);
        }
        if (i3 < 512) {
            if (i10 <= 80) {
                return 40;
            }
            return u.c(i10, 79, 2, 40);
        }
        if (i10 <= 80) {
            return 5;
        }
        if (i10 <= 100) {
            return 7;
        }
        return u.c(i10, 99, 2, 7);
    }

    public static boolean removeThreadOverride(String str) {
        return Properties.removeThreadOverride(str);
    }

    public static boolean setThreadOverride(String str, boolean z2) {
        return Properties.setThreadOverride(str, z2);
    }

    private static void validate(BigInteger bigInteger) {
        if ((bigInteger.intValue() & 1) == 0) {
            throw new IllegalArgumentException(StubApp.getString2(29233));
        }
        if (Properties.isOverrideSet(StubApp.getString2(29228))) {
            return;
        }
        if (Properties.asInteger(StubApp.getString2(29229), 15360) < bigInteger.bitLength()) {
            throw new IllegalArgumentException(StubApp.getString2(29232));
        }
        if (!bigInteger.gcd(SMALL_PRIMES_PRODUCT).equals(ONE)) {
            throw new IllegalArgumentException(StubApp.getString2(29231));
        }
        int bitLength = bigInteger.bitLength() / 2;
        if (!Primes.enhancedMRProbablePrimeTest(bigInteger, CryptoServicesRegistrar.getSecureRandom(), bitLength >= 1536 ? 3 : bitLength >= 1024 ? 4 : bitLength >= 512 ? 7 : 50).isProvablyComposite()) {
            throw new IllegalArgumentException(StubApp.getString2(29230));
        }
    }
}
