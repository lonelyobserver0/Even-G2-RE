package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1OctetString;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HashedId3 extends HashedId {
    public HashedId3(byte[] bArr) {
        super(bArr);
        if (bArr.length != 3) {
            throw new IllegalArgumentException(StubApp.getString2(33204));
        }
    }

    public static HashedId3 getInstance(Object obj) {
        if (obj instanceof HashedId3) {
            return (HashedId3) obj;
        }
        if (obj != null) {
            return new HashedId3(ASN1OctetString.getInstance(obj).getOctets());
        }
        return null;
    }
}
