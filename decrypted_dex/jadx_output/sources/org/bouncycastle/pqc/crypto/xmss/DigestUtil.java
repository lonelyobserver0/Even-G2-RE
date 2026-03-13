package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DigestUtil {
    private static Map<String, ASN1ObjectIdentifier> nameToOid = new HashMap();
    private static Map<ASN1ObjectIdentifier, String> oidToName = new HashMap();

    static {
        Map<String, ASN1ObjectIdentifier> map = nameToOid;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        String string2 = StubApp.getString2(1488);
        map.put(string2, aSN1ObjectIdentifier);
        Map<String, ASN1ObjectIdentifier> map2 = nameToOid;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha512;
        String string22 = StubApp.getString2(23705);
        map2.put(string22, aSN1ObjectIdentifier2);
        Map<String, ASN1ObjectIdentifier> map3 = nameToOid;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_shake128;
        String string23 = StubApp.getString2(28183);
        map3.put(string23, aSN1ObjectIdentifier3);
        Map<String, ASN1ObjectIdentifier> map4 = nameToOid;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_shake256;
        String string24 = StubApp.getString2(28184);
        map4.put(string24, aSN1ObjectIdentifier4);
        oidToName.put(aSN1ObjectIdentifier, string2);
        oidToName.put(aSN1ObjectIdentifier2, string22);
        oidToName.put(aSN1ObjectIdentifier3, string23);
        oidToName.put(aSN1ObjectIdentifier4, string24);
    }

    public static Digest getDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return new SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return new SHA512Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return new SHAKEDigest(128);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
            return new SHAKEDigest(256);
        }
        throw new IllegalArgumentException(a.e(StubApp.getString2(34023), aSN1ObjectIdentifier));
    }

    public static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = oidToName.get(aSN1ObjectIdentifier);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException(a.e(StubApp.getString2(34024), aSN1ObjectIdentifier));
    }

    public static ASN1ObjectIdentifier getDigestOID(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = nameToOid.get(str);
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException(E1.a.j(StubApp.getString2(34025), str));
    }

    public static int getDigestSize(Digest digest) {
        boolean z2 = digest instanceof Xof;
        int digestSize = digest.getDigestSize();
        return z2 ? digestSize * 2 : digestSize;
    }
}
