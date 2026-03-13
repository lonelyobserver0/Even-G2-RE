package org.bouncycastle.jcajce.util;

import E1.a;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.gnu.GNUObjectIdentifiers;
import org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MessageDigestUtils {
    private static Map<ASN1ObjectIdentifier, String> digestOidMap = new HashMap();
    private static Map<String, AlgorithmIdentifier> digestAlgIdMap = new HashMap();

    static {
        digestOidMap.put(PKCSObjectIdentifiers.md2, StubApp.getString2(28179));
        digestOidMap.put(PKCSObjectIdentifiers.md4, StubApp.getString2(28178));
        digestOidMap.put(PKCSObjectIdentifiers.md5, StubApp.getString2(4894));
        Map<ASN1ObjectIdentifier, String> map = digestOidMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.idSHA1;
        String string2 = StubApp.getString2(5778);
        map.put(aSN1ObjectIdentifier, string2);
        Map<ASN1ObjectIdentifier, String> map2 = digestOidMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha224;
        String string22 = StubApp.getString2(28501);
        map2.put(aSN1ObjectIdentifier2, string22);
        Map<ASN1ObjectIdentifier, String> map3 = digestOidMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_sha256;
        String string23 = StubApp.getString2(1488);
        map3.put(aSN1ObjectIdentifier3, string23);
        Map<ASN1ObjectIdentifier, String> map4 = digestOidMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_sha384;
        String string24 = StubApp.getString2(23704);
        map4.put(aSN1ObjectIdentifier4, string24);
        Map<ASN1ObjectIdentifier, String> map5 = digestOidMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_sha512;
        String string25 = StubApp.getString2(23705);
        map5.put(aSN1ObjectIdentifier5, string25);
        digestOidMap.put(NISTObjectIdentifiers.id_sha512_224, StubApp.getString2(30820));
        digestOidMap.put(NISTObjectIdentifiers.id_sha512_256, StubApp.getString2(30821));
        Map<ASN1ObjectIdentifier, String> map6 = digestOidMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = TeleTrusTObjectIdentifiers.ripemd128;
        String string26 = StubApp.getString2(32453);
        map6.put(aSN1ObjectIdentifier6, string26);
        Map<ASN1ObjectIdentifier, String> map7 = digestOidMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = TeleTrusTObjectIdentifiers.ripemd160;
        String string27 = StubApp.getString2(32454);
        map7.put(aSN1ObjectIdentifier7, string27);
        digestOidMap.put(TeleTrusTObjectIdentifiers.ripemd256, string26);
        digestOidMap.put(ISOIECObjectIdentifiers.ripemd128, string26);
        digestOidMap.put(ISOIECObjectIdentifiers.ripemd160, string27);
        digestOidMap.put(CryptoProObjectIdentifiers.gostR3411, StubApp.getString2(28192));
        digestOidMap.put(GNUObjectIdentifiers.Tiger_192, StubApp.getString2(28523));
        digestOidMap.put(ISOIECObjectIdentifiers.whirlpool, StubApp.getString2(28525));
        Map<ASN1ObjectIdentifier, String> map8 = digestOidMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_sha3_224;
        String string28 = StubApp.getString2(28174);
        map8.put(aSN1ObjectIdentifier8, string28);
        Map<ASN1ObjectIdentifier, String> map9 = digestOidMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_sha3_256;
        String string29 = StubApp.getString2(28175);
        map9.put(aSN1ObjectIdentifier9, string29);
        Map<ASN1ObjectIdentifier, String> map10 = digestOidMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_sha3_384;
        String string210 = StubApp.getString2(28176);
        map10.put(aSN1ObjectIdentifier10, string210);
        Map<ASN1ObjectIdentifier, String> map11 = digestOidMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_sha3_512;
        String string211 = StubApp.getString2(28177);
        map11.put(aSN1ObjectIdentifier11, string211);
        digestOidMap.put(NISTObjectIdentifiers.id_shake128, StubApp.getString2(28183));
        digestOidMap.put(NISTObjectIdentifiers.id_shake256, StubApp.getString2(28184));
        digestOidMap.put(GMObjectIdentifiers.sm3, StubApp.getString2(28189));
        Map<ASN1ObjectIdentifier, String> map12 = digestOidMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = MiscObjectIdentifiers.blake3_256;
        String string212 = StubApp.getString2(30977);
        map12.put(aSN1ObjectIdentifier12, string212);
        digestAlgIdMap.put(string2, new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE));
        digestAlgIdMap.put(string22, new AlgorithmIdentifier(aSN1ObjectIdentifier2));
        digestAlgIdMap.put(StubApp.getString2(28054), new AlgorithmIdentifier(aSN1ObjectIdentifier2));
        digestAlgIdMap.put(string23, new AlgorithmIdentifier(aSN1ObjectIdentifier3));
        digestAlgIdMap.put(StubApp.getString2(21749), new AlgorithmIdentifier(aSN1ObjectIdentifier3));
        digestAlgIdMap.put(string24, new AlgorithmIdentifier(aSN1ObjectIdentifier4));
        digestAlgIdMap.put(StubApp.getString2(21750), new AlgorithmIdentifier(aSN1ObjectIdentifier4));
        digestAlgIdMap.put(string25, new AlgorithmIdentifier(aSN1ObjectIdentifier5));
        digestAlgIdMap.put(StubApp.getString2(21751), new AlgorithmIdentifier(aSN1ObjectIdentifier5));
        digestAlgIdMap.put(string28, new AlgorithmIdentifier(aSN1ObjectIdentifier8));
        digestAlgIdMap.put(string29, new AlgorithmIdentifier(aSN1ObjectIdentifier9));
        digestAlgIdMap.put(string210, new AlgorithmIdentifier(aSN1ObjectIdentifier10));
        digestAlgIdMap.put(string211, new AlgorithmIdentifier(aSN1ObjectIdentifier11));
        digestAlgIdMap.put(string212, new AlgorithmIdentifier(aSN1ObjectIdentifier12));
    }

    public static AlgorithmIdentifier getDigestAlgID(String str) {
        if (digestAlgIdMap.containsKey(str)) {
            return digestAlgIdMap.get(str);
        }
        throw new IllegalArgumentException(a.j(StubApp.getString2(32455), str));
    }

    public static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = digestOidMap.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }
}
