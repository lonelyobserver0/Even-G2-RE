package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1OctetString;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HashedId32 extends HashedId {
    public HashedId32(byte[] bArr) {
        super(bArr);
        if (bArr.length != 32) {
            throw new IllegalArgumentException(StubApp.getString2(33203));
        }
    }

    public static HashedId32 getInstance(Object obj) {
        if (obj instanceof HashedId32) {
            return (HashedId32) obj;
        }
        if (obj != null) {
            return new HashedId32(ASN1OctetString.getInstance(obj).getOctets());
        }
        return null;
    }
}
