package org.bouncycastle.asn1.misc;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.DERIA5String;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class VerisignCzagExtension extends DERIA5String {
    public VerisignCzagExtension(ASN1IA5String aSN1IA5String) {
        super(aSN1IA5String.getString());
    }

    @Override // org.bouncycastle.asn1.ASN1IA5String
    public String toString() {
        return StubApp.getString2(27147) + getString();
    }
}
