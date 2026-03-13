package org.bouncycastle.jcajce.provider.util;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DigestFactory {
    private static Set md5 = new HashSet();
    private static Set sha1 = new HashSet();
    private static Set sha224 = new HashSet();
    private static Set sha256 = new HashSet();
    private static Set sha384 = new HashSet();
    private static Set sha512 = new HashSet();
    private static Set sha512_224 = new HashSet();
    private static Set sha512_256 = new HashSet();
    private static Set sha3_224 = new HashSet();
    private static Set sha3_256 = new HashSet();
    private static Set sha3_384 = new HashSet();
    private static Set sha3_512 = new HashSet();
    private static Set shake128 = new HashSet();
    private static Set shake256 = new HashSet();
    private static Map oids = new HashMap();

    static {
        Set set = md5;
        String string2 = StubApp.getString2(4894);
        set.add(string2);
        Set set2 = md5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.md5;
        set2.add(aSN1ObjectIdentifier.getId());
        Set set3 = sha1;
        String string22 = StubApp.getString2(21748);
        set3.add(string22);
        Set set4 = sha1;
        String string23 = StubApp.getString2(5778);
        set4.add(string23);
        Set set5 = sha1;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = OIWObjectIdentifiers.idSHA1;
        set5.add(aSN1ObjectIdentifier2.getId());
        Set set6 = sha224;
        String string24 = StubApp.getString2(28054);
        set6.add(string24);
        Set set7 = sha224;
        String string25 = StubApp.getString2(28501);
        set7.add(string25);
        Set set8 = sha224;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_sha224;
        set8.add(aSN1ObjectIdentifier3.getId());
        Set set9 = sha256;
        String string26 = StubApp.getString2(21749);
        set9.add(string26);
        Set set10 = sha256;
        String string27 = StubApp.getString2(1488);
        set10.add(string27);
        Set set11 = sha256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_sha256;
        set11.add(aSN1ObjectIdentifier4.getId());
        Set set12 = sha384;
        String string28 = StubApp.getString2(21750);
        set12.add(string28);
        Set set13 = sha384;
        String string29 = StubApp.getString2(23704);
        set13.add(string29);
        Set set14 = sha384;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_sha384;
        set14.add(aSN1ObjectIdentifier5.getId());
        Set set15 = sha512;
        String string210 = StubApp.getString2(21751);
        set15.add(string210);
        Set set16 = sha512;
        String string211 = StubApp.getString2(23705);
        set16.add(string211);
        Set set17 = sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_sha512;
        set17.add(aSN1ObjectIdentifier6.getId());
        Set set18 = sha512_224;
        String string212 = StubApp.getString2(28180);
        set18.add(string212);
        Set set19 = sha512_224;
        String string213 = StubApp.getString2(30820);
        set19.add(string213);
        Set set20 = sha512_224;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_sha512_224;
        set20.add(aSN1ObjectIdentifier7.getId());
        Set set21 = sha512_256;
        String string214 = StubApp.getString2(28181);
        set21.add(string214);
        Set set22 = sha512_256;
        String string215 = StubApp.getString2(30821);
        set22.add(string215);
        Set set23 = sha512_256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_sha512_256;
        set23.add(aSN1ObjectIdentifier8.getId());
        Set set24 = sha3_224;
        String string216 = StubApp.getString2(28174);
        set24.add(string216);
        Set set25 = sha3_224;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_sha3_224;
        set25.add(aSN1ObjectIdentifier9.getId());
        Set set26 = sha3_256;
        String string217 = StubApp.getString2(28175);
        set26.add(string217);
        Set set27 = sha3_256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_sha3_256;
        set27.add(aSN1ObjectIdentifier10.getId());
        Set set28 = sha3_384;
        String string218 = StubApp.getString2(28176);
        set28.add(string218);
        Set set29 = sha3_384;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_sha3_384;
        set29.add(aSN1ObjectIdentifier11.getId());
        Set set30 = sha3_512;
        String string219 = StubApp.getString2(28177);
        set30.add(string219);
        Set set31 = sha3_512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_sha3_512;
        set31.add(aSN1ObjectIdentifier12.getId());
        Set set32 = shake128;
        String string220 = StubApp.getString2(28183);
        set32.add(string220);
        Set set33 = shake128;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.id_shake128;
        set33.add(aSN1ObjectIdentifier13.getId());
        Set set34 = shake256;
        String string221 = StubApp.getString2(28184);
        set34.add(string221);
        Set set35 = shake256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.id_shake256;
        set35.add(aSN1ObjectIdentifier14.getId());
        oids.put(string2, aSN1ObjectIdentifier);
        oids.put(aSN1ObjectIdentifier.getId(), aSN1ObjectIdentifier);
        oids.put(string22, aSN1ObjectIdentifier2);
        oids.put(string23, aSN1ObjectIdentifier2);
        oids.put(aSN1ObjectIdentifier2.getId(), aSN1ObjectIdentifier2);
        oids.put(string24, aSN1ObjectIdentifier3);
        oids.put(string25, aSN1ObjectIdentifier3);
        oids.put(aSN1ObjectIdentifier3.getId(), aSN1ObjectIdentifier3);
        oids.put(string26, aSN1ObjectIdentifier4);
        oids.put(string27, aSN1ObjectIdentifier4);
        oids.put(aSN1ObjectIdentifier4.getId(), aSN1ObjectIdentifier4);
        oids.put(string28, aSN1ObjectIdentifier5);
        oids.put(string29, aSN1ObjectIdentifier5);
        oids.put(aSN1ObjectIdentifier5.getId(), aSN1ObjectIdentifier5);
        oids.put(string210, aSN1ObjectIdentifier6);
        oids.put(string211, aSN1ObjectIdentifier6);
        oids.put(aSN1ObjectIdentifier6.getId(), aSN1ObjectIdentifier6);
        oids.put(string212, aSN1ObjectIdentifier7);
        oids.put(string213, aSN1ObjectIdentifier7);
        oids.put(aSN1ObjectIdentifier7.getId(), aSN1ObjectIdentifier7);
        oids.put(string214, aSN1ObjectIdentifier8);
        oids.put(string215, aSN1ObjectIdentifier8);
        oids.put(aSN1ObjectIdentifier8.getId(), aSN1ObjectIdentifier8);
        oids.put(string216, aSN1ObjectIdentifier9);
        oids.put(aSN1ObjectIdentifier9.getId(), aSN1ObjectIdentifier9);
        oids.put(string217, aSN1ObjectIdentifier10);
        oids.put(aSN1ObjectIdentifier10.getId(), aSN1ObjectIdentifier10);
        oids.put(string218, aSN1ObjectIdentifier11);
        oids.put(aSN1ObjectIdentifier11.getId(), aSN1ObjectIdentifier11);
        oids.put(string219, aSN1ObjectIdentifier12);
        oids.put(aSN1ObjectIdentifier12.getId(), aSN1ObjectIdentifier12);
        oids.put(string220, aSN1ObjectIdentifier13);
        oids.put(aSN1ObjectIdentifier13.getId(), aSN1ObjectIdentifier13);
        oids.put(string221, aSN1ObjectIdentifier14);
        oids.put(aSN1ObjectIdentifier14.getId(), aSN1ObjectIdentifier14);
    }

    public static Digest getDigest(String str) {
        String upperCase = Strings.toUpperCase(str);
        if (sha1.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA1();
        }
        if (md5.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createMD5();
        }
        if (sha224.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA224();
        }
        if (sha256.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA256();
        }
        if (sha384.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA384();
        }
        if (sha512.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA512();
        }
        if (sha512_224.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA512_224();
        }
        if (sha512_256.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA512_256();
        }
        if (sha3_224.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA3_224();
        }
        if (sha3_256.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA3_256();
        }
        if (sha3_384.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA3_384();
        }
        if (sha3_512.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA3_512();
        }
        if (shake128.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHAKE128();
        }
        if (shake256.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHAKE256();
        }
        return null;
    }

    public static ASN1ObjectIdentifier getOID(String str) {
        return (ASN1ObjectIdentifier) oids.get(str);
    }

    public static boolean isSameDigest(String str, String str2) {
        if (sha1.contains(str) && sha1.contains(str2)) {
            return true;
        }
        if (sha224.contains(str) && sha224.contains(str2)) {
            return true;
        }
        if (sha256.contains(str) && sha256.contains(str2)) {
            return true;
        }
        if (sha384.contains(str) && sha384.contains(str2)) {
            return true;
        }
        if (sha512.contains(str) && sha512.contains(str2)) {
            return true;
        }
        if (sha512_224.contains(str) && sha512_224.contains(str2)) {
            return true;
        }
        if (sha512_256.contains(str) && sha512_256.contains(str2)) {
            return true;
        }
        if (sha3_224.contains(str) && sha3_224.contains(str2)) {
            return true;
        }
        if (sha3_256.contains(str) && sha3_256.contains(str2)) {
            return true;
        }
        if (sha3_384.contains(str) && sha3_384.contains(str2)) {
            return true;
        }
        if (sha3_512.contains(str) && sha3_512.contains(str2)) {
            return true;
        }
        return md5.contains(str) && md5.contains(str2);
    }
}
