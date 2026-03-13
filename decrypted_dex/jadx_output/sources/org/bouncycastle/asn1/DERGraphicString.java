package org.bouncycastle.asn1;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DERGraphicString extends ASN1GraphicString {
    public DERGraphicString(byte[] bArr) {
        this(bArr, true);
    }

    public static DERGraphicString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERGraphicString)) {
            return (DERGraphicString) obj;
        }
        if (obj instanceof ASN1GraphicString) {
            return new DERGraphicString(((ASN1GraphicString) obj).contents, false);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return (DERGraphicString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder(StubApp.getString2(26707))));
        }
    }

    public DERGraphicString(byte[] bArr, boolean z2) {
        super(bArr, z2);
    }

    public static DERGraphicString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z2 || (object instanceof DERGraphicString)) ? getInstance((Object) object) : new DERGraphicString(ASN1OctetString.getInstance(object).getOctets());
    }
}
