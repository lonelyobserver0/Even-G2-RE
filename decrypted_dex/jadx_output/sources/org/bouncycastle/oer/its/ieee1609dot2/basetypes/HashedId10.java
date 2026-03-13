package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1OctetString;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HashedId10 extends HashedId {
    public HashedId10(byte[] bArr) {
        super(bArr);
        if (bArr.length != 10) {
            throw new IllegalArgumentException(StubApp.getString2(33202));
        }
    }

    public static HashedId10 getInstance(Object obj) {
        if (obj instanceof HashedId10) {
            return (HashedId10) obj;
        }
        if (obj != null) {
            return new HashedId10(ASN1OctetString.getInstance(obj).getOctets());
        }
        return null;
    }
}
