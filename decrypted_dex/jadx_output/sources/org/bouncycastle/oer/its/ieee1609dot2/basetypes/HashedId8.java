package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1OctetString;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HashedId8 extends HashedId {
    public HashedId8(byte[] bArr) {
        super(bArr);
        if (bArr.length != 8) {
            throw new IllegalArgumentException(StubApp.getString2(33205));
        }
    }

    public static HashedId8 getInstance(Object obj) {
        if (obj instanceof HashedId8) {
            return (HashedId8) obj;
        }
        if (obj != null) {
            return new HashedId8(ASN1OctetString.getInstance(obj).getOctets());
        }
        return null;
    }
}
