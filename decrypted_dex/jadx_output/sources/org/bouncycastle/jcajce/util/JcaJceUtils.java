package org.bouncycastle.jcajce.util;

import com.stub.StubApp;
import java.io.IOException;
import java.security.AlgorithmParameters;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaJceUtils {
    private JcaJceUtils() {
    }

    public static ASN1Encodable extractParameters(AlgorithmParameters algorithmParameters) throws IOException {
        try {
            return ASN1Primitive.fromByteArray(algorithmParameters.getEncoded(StubApp.getString2("30489")));
        } catch (Exception unused) {
            return ASN1Primitive.fromByteArray(algorithmParameters.getEncoded());
        }
    }

    public static String getDigestAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return PKCSObjectIdentifiers.md5.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(4894) : OIWObjectIdentifiers.idSHA1.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21748) : NISTObjectIdentifiers.id_sha224.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(28054) : NISTObjectIdentifiers.id_sha256.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21749) : NISTObjectIdentifiers.id_sha384.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21750) : NISTObjectIdentifiers.id_sha512.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21751) : TeleTrusTObjectIdentifiers.ripemd128.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(28185) : TeleTrusTObjectIdentifiers.ripemd160.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21747) : TeleTrusTObjectIdentifiers.ripemd256.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(28186) : CryptoProObjectIdentifiers.gostR3411.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(28192) : aSN1ObjectIdentifier.getId();
    }

    public static void loadParameters(AlgorithmParameters algorithmParameters, ASN1Encodable aSN1Encodable) throws IOException {
        try {
            algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded(), StubApp.getString2("30489"));
        } catch (Exception unused) {
            algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded());
        }
    }
}
