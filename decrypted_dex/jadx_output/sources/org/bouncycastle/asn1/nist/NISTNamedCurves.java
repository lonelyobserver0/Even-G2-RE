package org.bouncycastle.asn1.nist;

import com.stub.StubApp;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NISTNamedCurves {
    static final Hashtable objIds = new Hashtable();
    static final Hashtable names = new Hashtable();

    static {
        defineCurve(StubApp.getString2(27149), SECObjectIdentifiers.sect571r1);
        defineCurve(StubApp.getString2(27150), SECObjectIdentifiers.sect409r1);
        defineCurve(StubApp.getString2(27151), SECObjectIdentifiers.sect283r1);
        defineCurve(StubApp.getString2(27152), SECObjectIdentifiers.sect233r1);
        defineCurve(StubApp.getString2(27153), SECObjectIdentifiers.sect163r2);
        defineCurve(StubApp.getString2(27154), SECObjectIdentifiers.sect571k1);
        defineCurve(StubApp.getString2(27155), SECObjectIdentifiers.sect409k1);
        defineCurve(StubApp.getString2(27156), SECObjectIdentifiers.sect283k1);
        defineCurve(StubApp.getString2(27157), SECObjectIdentifiers.sect233k1);
        defineCurve(StubApp.getString2(27158), SECObjectIdentifiers.sect163k1);
        defineCurve(StubApp.getString2(27159), SECObjectIdentifiers.secp521r1);
        defineCurve(StubApp.getString2(27160), SECObjectIdentifiers.secp384r1);
        defineCurve(StubApp.getString2(27161), SECObjectIdentifiers.secp256r1);
        defineCurve(StubApp.getString2(27162), SECObjectIdentifiers.secp224r1);
        defineCurve(StubApp.getString2(27163), SECObjectIdentifiers.secp192r1);
    }

    public static void defineCurve(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        objIds.put(str, aSN1ObjectIdentifier);
        names.put(aSN1ObjectIdentifier, str);
    }

    public static X9ECParameters getByName(String str) {
        ASN1ObjectIdentifier oid = getOID(str);
        if (oid != null) {
            return SECNamedCurves.getByOID(oid);
        }
        return null;
    }

    public static X9ECParametersHolder getByNameLazy(String str) {
        ASN1ObjectIdentifier oid = getOID(str);
        if (oid != null) {
            return SECNamedCurves.getByOIDLazy(oid);
        }
        return null;
    }

    public static X9ECParameters getByOID(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (names.containsKey(aSN1ObjectIdentifier)) {
            return SECNamedCurves.getByOID(aSN1ObjectIdentifier);
        }
        return null;
    }

    public static X9ECParametersHolder getByOIDLazy(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (names.containsKey(aSN1ObjectIdentifier)) {
            return SECNamedCurves.getByOIDLazy(aSN1ObjectIdentifier);
        }
        return null;
    }

    public static String getName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) names.get(aSN1ObjectIdentifier);
    }

    public static Enumeration getNames() {
        return objIds.keys();
    }

    public static ASN1ObjectIdentifier getOID(String str) {
        return (ASN1ObjectIdentifier) objIds.get(Strings.toUpperCase(str));
    }
}
