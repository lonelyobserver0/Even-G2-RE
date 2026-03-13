package org.bouncycastle.asn1.cryptopro;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3410NamedParameters {
    private static GOST3410ParamSetParameters cryptoProA;
    private static GOST3410ParamSetParameters cryptoProB;
    private static GOST3410ParamSetParameters cryptoProXchA;
    static final Hashtable names;
    static final Hashtable objIds;
    static final Hashtable params;

    static {
        Hashtable hashtable = new Hashtable();
        objIds = hashtable;
        Hashtable hashtable2 = new Hashtable();
        params = hashtable2;
        names = new Hashtable();
        cryptoProA = new GOST3410ParamSetParameters(1024, new BigInteger(StubApp.getString2(26993)), new BigInteger(StubApp.getString2(26994)), new BigInteger(StubApp.getString2(26995)));
        cryptoProB = new GOST3410ParamSetParameters(1024, new BigInteger(StubApp.getString2(26996)), new BigInteger(StubApp.getString2(26997)), new BigInteger(StubApp.getString2(26998)));
        cryptoProXchA = new GOST3410ParamSetParameters(1024, new BigInteger(StubApp.getString2(26999)), new BigInteger(StubApp.getString2(27000)), new BigInteger(StubApp.getString2(27001)));
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.gostR3410_94_CryptoPro_A;
        hashtable2.put(aSN1ObjectIdentifier, cryptoProA);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CryptoProObjectIdentifiers.gostR3410_94_CryptoPro_B;
        hashtable2.put(aSN1ObjectIdentifier2, cryptoProB);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CryptoProObjectIdentifiers.gostR3410_94_CryptoPro_XchA;
        hashtable2.put(aSN1ObjectIdentifier3, cryptoProXchA);
        hashtable.put(StubApp.getString2(27002), aSN1ObjectIdentifier);
        hashtable.put(StubApp.getString2(27003), aSN1ObjectIdentifier2);
        hashtable.put(StubApp.getString2(27004), aSN1ObjectIdentifier3);
    }

    public static GOST3410ParamSetParameters getByName(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) objIds.get(str);
        if (aSN1ObjectIdentifier != null) {
            return (GOST3410ParamSetParameters) params.get(aSN1ObjectIdentifier);
        }
        return null;
    }

    public static GOST3410ParamSetParameters getByOID(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (GOST3410ParamSetParameters) params.get(aSN1ObjectIdentifier);
    }

    public static Enumeration getNames() {
        return objIds.keys();
    }

    public static ASN1ObjectIdentifier getOID(String str) {
        return (ASN1ObjectIdentifier) objIds.get(str);
    }
}
