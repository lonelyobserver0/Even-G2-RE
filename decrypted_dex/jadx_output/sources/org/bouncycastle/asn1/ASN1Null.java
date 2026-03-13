package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ASN1Null extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Null.class, 5) { // from class: org.bouncycastle.asn1.ASN1Null.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Null.createPrimitive(dEROctetString.getOctets());
        }
    };

    public static ASN1Null createPrimitive(byte[] bArr) {
        if (bArr.length == 0) {
            return DERNull.INSTANCE;
        }
        throw new IllegalStateException(StubApp.getString2(26780));
    }

    public static ASN1Null getInstance(Object obj) {
        if (obj instanceof ASN1Null) {
            return (ASN1Null) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return (ASN1Null) TYPE.fromByteArray((byte[]) obj);
        } catch (IOException e10) {
            throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(26781))));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return aSN1Primitive instanceof ASN1Null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return StubApp.getString2(3796);
    }

    public static ASN1Null getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1Null) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }
}
