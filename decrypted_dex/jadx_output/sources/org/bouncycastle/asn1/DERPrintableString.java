package org.bouncycastle.asn1;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DERPrintableString extends ASN1PrintableString {
    public DERPrintableString(String str) {
        this(str, false);
    }

    public static DERPrintableString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERPrintableString)) {
            return (DERPrintableString) obj;
        }
        if (obj instanceof ASN1PrintableString) {
            return new DERPrintableString(((ASN1PrintableString) obj).contents, false);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return (DERPrintableString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder(StubApp.getString2(26707))));
        }
    }

    public DERPrintableString(String str, boolean z2) {
        super(str, z2);
    }

    public DERPrintableString(byte[] bArr, boolean z2) {
        super(bArr, z2);
    }

    public static DERPrintableString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z2 || (object instanceof DERPrintableString)) ? getInstance((Object) object) : new DERPrintableString(ASN1OctetString.getInstance(object).getOctets(), true);
    }
}
