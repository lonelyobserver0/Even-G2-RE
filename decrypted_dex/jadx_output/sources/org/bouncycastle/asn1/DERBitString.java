package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DERBitString extends ASN1BitString {
    public DERBitString(byte b2, int i3) {
        super(b2, i3);
    }

    public static DERBitString convert(ASN1BitString aSN1BitString) {
        return (DERBitString) aSN1BitString.toDERObject();
    }

    public static DERBitString fromOctetString(ASN1OctetString aSN1OctetString) {
        return new DERBitString(aSN1OctetString.getOctets(), true);
    }

    public static DERBitString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERBitString)) {
            return (DERBitString) obj;
        }
        if (obj instanceof ASN1BitString) {
            return convert((ASN1BitString) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return convert((ASN1BitString) ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder(StubApp.getString2(26707))));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        byte[] bArr = this.contents;
        int i3 = bArr[0] & UByte.MAX_VALUE;
        int length = bArr.length - 1;
        byte b2 = bArr[length];
        byte b10 = (byte) ((255 << i3) & b2);
        if (b2 == b10) {
            aSN1OutputStream.writeEncodingDL(z2, 3, bArr);
        } else {
            aSN1OutputStream.writeEncodingDL(z2, 3, bArr, 0, length, b10);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, this.contents.length);
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DERBitString(int i3) {
        super(ASN1BitString.getBytes(i3), ASN1BitString.getPadBits(i3));
    }

    public DERBitString(ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2(26791)), 0);
    }

    public DERBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DERBitString(byte[] bArr, int i3) {
        super(bArr, i3);
    }

    public DERBitString(byte[] bArr, boolean z2) {
        super(bArr, z2);
    }

    public static DERBitString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z2 || (object instanceof DERBitString)) ? getInstance((Object) object) : fromOctetString(ASN1OctetString.getInstance(object));
    }
}
