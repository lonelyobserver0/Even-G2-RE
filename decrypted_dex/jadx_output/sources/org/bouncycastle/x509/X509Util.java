package org.bouncycastle.x509;

import E1.a;
import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class X509Util {
    private static Hashtable algorithms = new Hashtable();
    private static Hashtable params = new Hashtable();
    private static Set noParams = new HashSet();

    public static class Implementation {
        Object engine;
        Provider provider;

        public Implementation(Object obj, Provider provider) {
            this.engine = obj;
            this.provider = provider;
        }

        public Object getEngine() {
            return this.engine;
        }

        public Provider getProvider() {
            return this.provider;
        }
    }

    static {
        Hashtable hashtable = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.md2WithRSAEncryption;
        hashtable.put(StubApp.getString2(32458), aSN1ObjectIdentifier);
        algorithms.put(StubApp.getString2(32459), aSN1ObjectIdentifier);
        Hashtable hashtable2 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.md5WithRSAEncryption;
        hashtable2.put(StubApp.getString2(32461), aSN1ObjectIdentifier2);
        algorithms.put(StubApp.getString2(32462), aSN1ObjectIdentifier2);
        Hashtable hashtable3 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.sha1WithRSAEncryption;
        hashtable3.put(StubApp.getString2(32465), aSN1ObjectIdentifier3);
        algorithms.put(StubApp.getString2(30425), aSN1ObjectIdentifier3);
        Hashtable hashtable4 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.sha224WithRSAEncryption;
        hashtable4.put(StubApp.getString2(32466), aSN1ObjectIdentifier4);
        algorithms.put(StubApp.getString2(32467), aSN1ObjectIdentifier4);
        Hashtable hashtable5 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.sha256WithRSAEncryption;
        hashtable5.put(StubApp.getString2(32468), aSN1ObjectIdentifier5);
        algorithms.put(StubApp.getString2(32469), aSN1ObjectIdentifier5);
        Hashtable hashtable6 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.sha384WithRSAEncryption;
        hashtable6.put(StubApp.getString2(32470), aSN1ObjectIdentifier6);
        algorithms.put(StubApp.getString2(32471), aSN1ObjectIdentifier6);
        Hashtable hashtable7 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PKCSObjectIdentifiers.sha512WithRSAEncryption;
        hashtable7.put(StubApp.getString2(32472), aSN1ObjectIdentifier7);
        algorithms.put(StubApp.getString2(32473), aSN1ObjectIdentifier7);
        Hashtable hashtable8 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = PKCSObjectIdentifiers.id_RSASSA_PSS;
        String string2 = StubApp.getString2(32474);
        hashtable8.put(string2, aSN1ObjectIdentifier8);
        Hashtable hashtable9 = algorithms;
        String string22 = StubApp.getString2(32475);
        hashtable9.put(string22, aSN1ObjectIdentifier8);
        Hashtable hashtable10 = algorithms;
        String string23 = StubApp.getString2(32476);
        hashtable10.put(string23, aSN1ObjectIdentifier8);
        Hashtable hashtable11 = algorithms;
        String string24 = StubApp.getString2(32477);
        hashtable11.put(string24, aSN1ObjectIdentifier8);
        Hashtable hashtable12 = algorithms;
        String string25 = StubApp.getString2(32478);
        hashtable12.put(string25, aSN1ObjectIdentifier8);
        Hashtable hashtable13 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160;
        hashtable13.put(StubApp.getString2(32482), aSN1ObjectIdentifier9);
        algorithms.put(StubApp.getString2(32483), aSN1ObjectIdentifier9);
        Hashtable hashtable14 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128;
        hashtable14.put(StubApp.getString2(32480), aSN1ObjectIdentifier10);
        algorithms.put(StubApp.getString2(32481), aSN1ObjectIdentifier10);
        Hashtable hashtable15 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256;
        hashtable15.put(StubApp.getString2(32484), aSN1ObjectIdentifier11);
        algorithms.put(StubApp.getString2(32485), aSN1ObjectIdentifier11);
        Hashtable hashtable16 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = X9ObjectIdentifiers.id_dsa_with_sha1;
        hashtable16.put(StubApp.getString2(32487), aSN1ObjectIdentifier12);
        algorithms.put(StubApp.getString2(32488), aSN1ObjectIdentifier12);
        Hashtable hashtable17 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.dsa_with_sha224;
        hashtable17.put(StubApp.getString2(32489), aSN1ObjectIdentifier13);
        Hashtable hashtable18 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.dsa_with_sha256;
        hashtable18.put(StubApp.getString2(32490), aSN1ObjectIdentifier14);
        Hashtable hashtable19 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NISTObjectIdentifiers.dsa_with_sha384;
        hashtable19.put(StubApp.getString2(32491), aSN1ObjectIdentifier15);
        Hashtable hashtable20 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NISTObjectIdentifiers.dsa_with_sha512;
        hashtable20.put(StubApp.getString2(32492), aSN1ObjectIdentifier16);
        Hashtable hashtable21 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = X9ObjectIdentifiers.ecdsa_with_SHA1;
        hashtable21.put(StubApp.getString2(32493), aSN1ObjectIdentifier17);
        algorithms.put(StubApp.getString2(32498), aSN1ObjectIdentifier17);
        Hashtable hashtable22 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = X9ObjectIdentifiers.ecdsa_with_SHA224;
        hashtable22.put(StubApp.getString2(32494), aSN1ObjectIdentifier18);
        Hashtable hashtable23 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = X9ObjectIdentifiers.ecdsa_with_SHA256;
        hashtable23.put(StubApp.getString2(32495), aSN1ObjectIdentifier19);
        Hashtable hashtable24 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = X9ObjectIdentifiers.ecdsa_with_SHA384;
        hashtable24.put(StubApp.getString2(32496), aSN1ObjectIdentifier20);
        Hashtable hashtable25 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = X9ObjectIdentifiers.ecdsa_with_SHA512;
        hashtable25.put(StubApp.getString2(32497), aSN1ObjectIdentifier21);
        Hashtable hashtable26 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94;
        hashtable26.put(StubApp.getString2(32499), aSN1ObjectIdentifier22);
        algorithms.put(StubApp.getString2(33697), aSN1ObjectIdentifier22);
        Hashtable hashtable27 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001;
        hashtable27.put(StubApp.getString2(32501), aSN1ObjectIdentifier23);
        algorithms.put(StubApp.getString2(32502), aSN1ObjectIdentifier23);
        algorithms.put(StubApp.getString2(32503), aSN1ObjectIdentifier23);
        noParams.add(aSN1ObjectIdentifier17);
        noParams.add(aSN1ObjectIdentifier18);
        noParams.add(aSN1ObjectIdentifier19);
        noParams.add(aSN1ObjectIdentifier20);
        noParams.add(aSN1ObjectIdentifier21);
        noParams.add(aSN1ObjectIdentifier12);
        noParams.add(OIWObjectIdentifiers.dsaWithSHA1);
        noParams.add(aSN1ObjectIdentifier13);
        noParams.add(aSN1ObjectIdentifier14);
        noParams.add(aSN1ObjectIdentifier15);
        noParams.add(aSN1ObjectIdentifier16);
        noParams.add(aSN1ObjectIdentifier22);
        noParams.add(aSN1ObjectIdentifier23);
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = OIWObjectIdentifiers.idSHA1;
        DERNull dERNull = DERNull.INSTANCE;
        params.put(string2, creatPSSParams(new AlgorithmIdentifier(aSN1ObjectIdentifier24, dERNull), 20));
        params.put(string22, creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224, dERNull), 28));
        params.put(string23, creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, dERNull), 32));
        params.put(string24, creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384, dERNull), 48));
        params.put(string25, creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512, dERNull), 64));
    }

    public static byte[] calculateSignature(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, String str2, PrivateKey privateKey, SecureRandom secureRandom, ASN1Encodable aSN1Encodable) throws IOException, NoSuchProviderException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        if (aSN1ObjectIdentifier == null) {
            throw new IllegalStateException(StubApp.getString2(35139));
        }
        Signature signatureInstance = getSignatureInstance(str, str2);
        if (secureRandom != null) {
            signatureInstance.initSign(privateKey, secureRandom);
        } else {
            signatureInstance.initSign(privateKey);
        }
        signatureInstance.update(aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2(26791)));
        return signatureInstance.sign();
    }

    public static X509Principal convertPrincipal(X500Principal x500Principal) {
        try {
            return new X509Principal(x500Principal.getEncoded());
        } catch (IOException unused) {
            throw new IllegalArgumentException(StubApp.getString2(35140));
        }
    }

    private static RSASSAPSSparams creatPSSParams(AlgorithmIdentifier algorithmIdentifier, int i3) {
        return new RSASSAPSSparams(algorithmIdentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier), new ASN1Integer(i3), new ASN1Integer(1L));
    }

    public static Iterator getAlgNames() {
        Enumeration keys = algorithms.keys();
        ArrayList arrayList = new ArrayList();
        while (keys.hasMoreElements()) {
            arrayList.add(keys.nextElement());
        }
        return arrayList.iterator();
    }

    public static ASN1ObjectIdentifier getAlgorithmOID(String str) {
        String upperCase = Strings.toUpperCase(str);
        return algorithms.containsKey(upperCase) ? (ASN1ObjectIdentifier) algorithms.get(upperCase) : new ASN1ObjectIdentifier(upperCase);
    }

    public static Implementation getImplementation(String str, String str2) throws NoSuchAlgorithmException {
        Provider[] providers = Security.getProviders();
        for (int i3 = 0; i3 != providers.length; i3++) {
            Implementation implementation = getImplementation(str, Strings.toUpperCase(str2), providers[i3]);
            if (implementation != null) {
                return implementation;
            }
            try {
                getImplementation(str, str2, providers[i3]);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        throw new NoSuchAlgorithmException(a.j(StubApp.getString2(35141), str2));
    }

    public static Provider getProvider(String str) throws NoSuchProviderException {
        Provider provider = Security.getProvider(str);
        if (provider != null) {
            return provider;
        }
        throw new NoSuchProviderException(a.k(StubApp.getString2(35148), str, StubApp.getString2(6390)));
    }

    public static AlgorithmIdentifier getSigAlgID(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (noParams.contains(aSN1ObjectIdentifier)) {
            return new AlgorithmIdentifier(aSN1ObjectIdentifier);
        }
        String upperCase = Strings.toUpperCase(str);
        return params.containsKey(upperCase) ? new AlgorithmIdentifier(aSN1ObjectIdentifier, (ASN1Encodable) params.get(upperCase)) : new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE);
    }

    public static Signature getSignatureInstance(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str);
    }

    public static byte[] calculateSignature(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, PrivateKey privateKey, SecureRandom secureRandom, ASN1Encodable aSN1Encodable) throws IOException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        if (aSN1ObjectIdentifier == null) {
            throw new IllegalStateException(StubApp.getString2(35139));
        }
        Signature signatureInstance = getSignatureInstance(str);
        if (secureRandom != null) {
            signatureInstance.initSign(privateKey, secureRandom);
        } else {
            signatureInstance.initSign(privateKey);
        }
        signatureInstance.update(aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2(26791)));
        return signatureInstance.sign();
    }

    public static Signature getSignatureInstance(String str, String str2) throws NoSuchProviderException, NoSuchAlgorithmException {
        return str2 != null ? Signature.getInstance(str, str2) : Signature.getInstance(str);
    }

    public static Implementation getImplementation(String str, String str2, Provider provider) throws NoSuchAlgorithmException {
        String string2;
        String string22 = StubApp.getString2(35142);
        String string23 = StubApp.getString2(30843);
        String upperCase = Strings.toUpperCase(str2);
        while (true) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(32619));
            sb2.append(str);
            string2 = StubApp.getString2(1);
            sb2.append(string2);
            sb2.append(upperCase);
            String property = provider.getProperty(sb2.toString());
            if (property == null) {
                break;
            }
            upperCase = property;
        }
        String property2 = provider.getProperty(str + string2 + upperCase);
        if (property2 != null) {
            try {
                ClassLoader classLoader = provider.getClass().getClassLoader();
                return new Implementation((classLoader != null ? classLoader.loadClass(property2) : Class.forName(property2)).newInstance(), provider);
            } catch (ClassNotFoundException unused) {
                StringBuilder l9 = b.l(string23, upperCase, string22);
                l9.append(provider.getName());
                l9.append(StubApp.getString2(35145));
                l9.append(property2);
                l9.append(StubApp.getString2(35146));
                throw new IllegalStateException(l9.toString());
            } catch (Exception unused2) {
                StringBuilder l10 = b.l(string23, upperCase, string22);
                l10.append(provider.getName());
                l10.append(StubApp.getString2(35143));
                l10.append(property2);
                l10.append(StubApp.getString2(35144));
                throw new IllegalStateException(l10.toString());
            }
        }
        StringBuilder l11 = b.l(StubApp.getString2(35141), upperCase, StubApp.getString2(35147));
        l11.append(provider.getName());
        throw new NoSuchAlgorithmException(l11.toString());
    }
}
