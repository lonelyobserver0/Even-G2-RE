package org.bouncycastle.asn1;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DERIA5String extends ASN1IA5String {
    public DERIA5String(String str) {
        this(str, false);
    }

    public static DERIA5String getInstance(Object obj) {
        if (obj == null || (obj instanceof DERIA5String)) {
            return (DERIA5String) obj;
        }
        if (obj instanceof ASN1IA5String) {
            return new DERIA5String(((ASN1IA5String) obj).contents, false);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return (DERIA5String) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder(StubApp.getString2(26707))));
        }
    }

    public DERIA5String(String str, boolean z2) {
        super(str, z2);
    }

    public DERIA5String(byte[] bArr, boolean z2) {
        super(bArr, z2);
    }

    public static DERIA5String getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z2 || (object instanceof DERIA5String)) ? getInstance((Object) object) : new DERIA5String(ASN1OctetString.getInstance(object).getOctets(), true);
    }
}
