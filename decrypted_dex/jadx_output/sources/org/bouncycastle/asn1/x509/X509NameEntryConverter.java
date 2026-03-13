package org.bouncycastle.asn1.x509;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class X509NameEntryConverter {
    public boolean canBePrintable(String str) {
        return ASN1PrintableString.isPrintableString(str);
    }

    public ASN1Primitive convertHexEncoded(String str, int i3) throws IOException {
        return ASN1Primitive.fromByteArray(Hex.decodeStrict(str, i3, str.length() - i3));
    }

    public abstract ASN1Primitive getConvertedValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str);
}
