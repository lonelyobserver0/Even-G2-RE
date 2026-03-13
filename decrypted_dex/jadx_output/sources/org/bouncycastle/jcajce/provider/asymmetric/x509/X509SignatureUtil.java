package org.bouncycastle.jcajce.provider.asymmetric.x509;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.util.encoders.Hex;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class X509SignatureUtil {
    private static final Map<ASN1ObjectIdentifier, String> algNames;
    private static final ASN1Null derNull;

    static {
        HashMap hashMap = new HashMap();
        algNames = hashMap;
        hashMap.put(EdECObjectIdentifiers.id_Ed25519, StubApp.getString2(28196));
        hashMap.put(EdECObjectIdentifiers.id_Ed448, StubApp.getString2(28197));
        ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.dsaWithSHA1;
        String string2 = StubApp.getString2(30933);
        hashMap.put(aSN1ObjectIdentifier, string2);
        hashMap.put(X9ObjectIdentifiers.id_dsa_with_sha1, string2);
        derNull = DERNull.INSTANCE;
    }

    private static String findAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String lookupAlg;
        String lookupAlg2;
        Provider provider = Security.getProvider(StubApp.getString2(21668));
        if (provider != null && (lookupAlg2 = lookupAlg(provider, aSN1ObjectIdentifier)) != null) {
            return lookupAlg2;
        }
        Provider[] providers = Security.getProviders();
        for (int i3 = 0; i3 != providers.length; i3++) {
            Provider provider2 = providers[i3];
            if (provider != provider2 && (lookupAlg = lookupAlg(provider2, aSN1ObjectIdentifier)) != null) {
                return lookupAlg;
            }
        }
        return aSN1ObjectIdentifier.getId();
    }

    private static String getDigestAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String digestName = MessageDigestUtils.getDigestName(aSN1ObjectIdentifier);
        int indexOf = digestName.indexOf(45);
        if (indexOf <= 0 || digestName.startsWith(StubApp.getString2(29255))) {
            return digestName;
        }
        return digestName.substring(0, indexOf) + digestName.substring(indexOf + 1);
    }

    public static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters != null && !derNull.equals(parameters)) {
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                return AbstractC1482f.k(new StringBuilder(), getDigestAlgName(RSASSAPSSparams.getInstance(parameters).getHashAlgorithm().getAlgorithm()), StubApp.getString2(30934));
            }
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) X9ObjectIdentifiers.ecdsa_with_SHA2)) {
                return AbstractC1482f.k(new StringBuilder(), getDigestAlgName((ASN1ObjectIdentifier) ASN1Sequence.getInstance(parameters).getObjectAt(0)), StubApp.getString2(30935));
            }
        }
        String str = algNames.get(algorithmIdentifier.getAlgorithm());
        return str != null ? str : findAlgName(algorithmIdentifier.getAlgorithm());
    }

    public static boolean isCompositeAlgorithm(AlgorithmIdentifier algorithmIdentifier) {
        return MiscObjectIdentifiers.id_alg_composite.equals((ASN1Primitive) algorithmIdentifier.getAlgorithm());
    }

    private static String lookupAlg(Provider provider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String property = provider.getProperty(StubApp.getString2(29795) + aSN1ObjectIdentifier);
        if (property != null) {
            return property;
        }
        String property2 = provider.getProperty(StubApp.getString2(30294) + aSN1ObjectIdentifier);
        if (property2 != null) {
            return property2;
        }
        return null;
    }

    public static void prettyPrintSignature(byte[] bArr, StringBuffer stringBuffer, String str) {
        int length = bArr.length;
        stringBuffer.append(StubApp.getString2(30936));
        if (length <= 20) {
            stringBuffer.append(Hex.toHexString(bArr));
            stringBuffer.append(str);
            return;
        }
        stringBuffer.append(Hex.toHexString(bArr, 0, 20));
        stringBuffer.append(str);
        int i3 = 20;
        while (i3 < bArr.length) {
            int length2 = bArr.length - 20;
            stringBuffer.append(StubApp.getString2(30937));
            stringBuffer.append(i3 < length2 ? Hex.toHexString(bArr, i3, 20) : Hex.toHexString(bArr, i3, bArr.length - i3));
            stringBuffer.append(str);
            i3 += 20;
        }
    }

    public static void setSignatureParameters(Signature signature, ASN1Encodable aSN1Encodable) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (aSN1Encodable == null || derNull.equals(aSN1Encodable)) {
            return;
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try {
            algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded());
            if (signature.getAlgorithm().endsWith(StubApp.getString2(30299))) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (GeneralSecurityException e10) {
                    throw new SignatureException(a.h(e10, new StringBuilder(StubApp.getString2(30938))));
                }
            }
        } catch (IOException e11) {
            throw new SignatureException(u.q(e11, new StringBuilder(StubApp.getString2(30939))));
        }
    }
}
