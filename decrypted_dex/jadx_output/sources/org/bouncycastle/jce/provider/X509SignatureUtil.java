package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class X509SignatureUtil {
    private static final ASN1Null derNull = DERNull.INSTANCE;

    private static String getDigestAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return PKCSObjectIdentifiers.md5.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(4894) : OIWObjectIdentifiers.idSHA1.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21748) : NISTObjectIdentifiers.id_sha224.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(28054) : NISTObjectIdentifiers.id_sha256.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21749) : NISTObjectIdentifiers.id_sha384.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21750) : NISTObjectIdentifiers.id_sha512.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21751) : TeleTrusTObjectIdentifiers.ripemd128.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(28185) : TeleTrusTObjectIdentifiers.ripemd160.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21747) : TeleTrusTObjectIdentifiers.ripemd256.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(28186) : CryptoProObjectIdentifiers.gostR3411.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(28192) : aSN1ObjectIdentifier.getId();
    }

    public static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters != null && !derNull.equals(parameters)) {
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                return AbstractC1482f.k(new StringBuilder(), getDigestAlgName(RSASSAPSSparams.getInstance(parameters).getHashAlgorithm().getAlgorithm()), StubApp.getString2(30934));
            }
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) X9ObjectIdentifiers.ecdsa_with_SHA2)) {
                return AbstractC1482f.k(new StringBuilder(), getDigestAlgName(ASN1ObjectIdentifier.getInstance(ASN1Sequence.getInstance(parameters).getObjectAt(0))), StubApp.getString2(30935));
            }
        }
        return algorithmIdentifier.getAlgorithm().getId();
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
