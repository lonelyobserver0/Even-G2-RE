package org.bouncycastle.asn1;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DERUniversalString extends ASN1UniversalString {
    public DERUniversalString(byte[] bArr) {
        this(bArr, true);
    }

    public static DERUniversalString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERUniversalString)) {
            return (DERUniversalString) obj;
        }
        if (obj instanceof ASN1UniversalString) {
            return new DERUniversalString(((ASN1UniversalString) obj).contents, false);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return (DERUniversalString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder(StubApp.getString2(26828))));
        }
    }

    public DERUniversalString(byte[] bArr, boolean z2) {
        super(bArr, z2);
    }

    public static DERUniversalString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z2 || (object instanceof DERUniversalString)) ? getInstance((Object) object) : new DERUniversalString(ASN1OctetString.getInstance(object).getOctets(), true);
    }
}
