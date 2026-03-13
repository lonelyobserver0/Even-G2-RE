package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ASN1Boolean extends ASN1Primitive {
    private static final byte FALSE_VALUE = 0;
    private static final byte TRUE_VALUE = -1;
    private final byte value;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Boolean.class, 1) { // from class: org.bouncycastle.asn1.ASN1Boolean.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Boolean.createPrimitive(dEROctetString.getOctets());
        }
    };
    public static final ASN1Boolean FALSE = new ASN1Boolean((byte) 0);
    public static final ASN1Boolean TRUE = new ASN1Boolean((byte) -1);

    private ASN1Boolean(byte b2) {
        this.value = b2;
    }

    public static ASN1Boolean createPrimitive(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException(StubApp.getString2(26720));
        }
        byte b2 = bArr[0];
        return b2 != -1 ? b2 != 0 ? new ASN1Boolean(b2) : FALSE : TRUE;
    }

    public static ASN1Boolean getInstance(int i3) {
        return i3 != 0 ? TRUE : FALSE;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return (aSN1Primitive instanceof ASN1Boolean) && isTrue() == ((ASN1Boolean) aSN1Primitive).isTrue();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        aSN1OutputStream.writeEncodingDL(z2, 1, this.value);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, 1);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return isTrue() ? 1 : 0;
    }

    public boolean isTrue() {
        return this.value != 0;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return isTrue() ? TRUE : FALSE;
    }

    public String toString() {
        return isTrue() ? StubApp.getString2(10221) : StubApp.getString2(10222);
    }

    public static ASN1Boolean getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Boolean)) {
            return (ASN1Boolean) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return (ASN1Boolean) TYPE.fromByteArray((byte[]) obj);
        } catch (IOException e10) {
            throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(26721))));
        }
    }

    public static ASN1Boolean getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1Boolean) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }

    public static ASN1Boolean getInstance(boolean z2) {
        return z2 ? TRUE : FALSE;
    }
}
