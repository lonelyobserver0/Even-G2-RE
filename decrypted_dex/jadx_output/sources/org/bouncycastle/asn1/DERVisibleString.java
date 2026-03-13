package org.bouncycastle.asn1;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DERVisibleString extends ASN1VisibleString {
    public DERVisibleString(String str) {
        super(str);
    }

    public static DERVisibleString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERVisibleString)) {
            return (DERVisibleString) obj;
        }
        if (obj instanceof ASN1VisibleString) {
            return new DERVisibleString(((ASN1VisibleString) obj).contents, false);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return (DERVisibleString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder(StubApp.getString2(26707))));
        }
    }

    public DERVisibleString(byte[] bArr, boolean z2) {
        super(bArr, z2);
    }

    public static DERVisibleString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z2 || (object instanceof DERVisibleString)) ? getInstance((Object) object) : new DERVisibleString(ASN1OctetString.getInstance(object).getOctets(), true);
    }
}
