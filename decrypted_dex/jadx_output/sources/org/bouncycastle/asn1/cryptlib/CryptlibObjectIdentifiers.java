package org.bouncycastle.asn1.cryptlib;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CryptlibObjectIdentifiers {
    public static final ASN1ObjectIdentifier cryptlib;
    public static final ASN1ObjectIdentifier curvey25519;
    public static final ASN1ObjectIdentifier ecc;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(StubApp.getString2(26947));
        cryptlib = aSN1ObjectIdentifier;
        String string2 = StubApp.getString2(878);
        ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch(string2).branch(StubApp.getString2(4970));
        ecc = branch;
        curvey25519 = branch.branch(string2);
    }
}
