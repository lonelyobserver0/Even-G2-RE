package org.bouncycastle.asn1;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DERVideotexString extends ASN1VideotexString {
    public DERVideotexString(byte[] bArr) {
        this(bArr, true);
    }

    public static DERVideotexString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERVideotexString)) {
            return (DERVideotexString) obj;
        }
        if (obj instanceof ASN1VideotexString) {
            return new DERVideotexString(((ASN1VideotexString) obj).contents, false);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return (DERVideotexString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder(StubApp.getString2(26707))));
        }
    }

    public DERVideotexString(byte[] bArr, boolean z2) {
        super(bArr, z2);
    }

    public static DERVideotexString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z2 || (object instanceof DERVideotexString)) ? getInstance((Object) object) : new DERVideotexString(ASN1OctetString.getInstance(object).getOctets());
    }
}
