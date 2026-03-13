package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ASN1UniversalString extends ASN1Primitive implements ASN1String {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1UniversalString.class, 28) { // from class: org.bouncycastle.asn1.ASN1UniversalString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1UniversalString.createPrimitive(dEROctetString.getOctets());
        }
    };
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] contents;

    public ASN1UniversalString(byte[] bArr, boolean z2) {
        this.contents = z2 ? Arrays.clone(bArr) : bArr;
    }

    public static ASN1UniversalString createPrimitive(byte[] bArr) {
        return new DERUniversalString(bArr, false);
    }

    private static void encodeHexByte(StringBuffer stringBuffer, int i3) {
        char[] cArr = table;
        stringBuffer.append(cArr[(i3 >>> 4) & 15]);
        stringBuffer.append(cArr[i3 & 15]);
    }

    private static void encodeHexDL(StringBuffer stringBuffer, int i3) {
        int i10;
        if (i3 < 128) {
            encodeHexByte(stringBuffer, i3);
            return;
        }
        byte[] bArr = new byte[5];
        int i11 = 5;
        while (true) {
            i10 = i11 - 1;
            bArr[i10] = (byte) i3;
            i3 >>>= 8;
            if (i3 == 0) {
                break;
            } else {
                i11 = i10;
            }
        }
        int i12 = i11 - 2;
        bArr[i12] = (byte) ((5 - i10) | 128);
        while (true) {
            int i13 = i12 + 1;
            encodeHexByte(stringBuffer, bArr[i12]);
            if (i13 >= 5) {
                return;
            } else {
                i12 = i13;
            }
        }
    }

    public static ASN1UniversalString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1UniversalString)) {
            return (ASN1UniversalString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1UniversalString) {
                return (ASN1UniversalString) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return (ASN1UniversalString) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder(StubApp.getString2(26828))));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1UniversalString) {
            return Arrays.areEqual(this.contents, ((ASN1UniversalString) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        aSN1OutputStream.writeEncodingDL(z2, 28, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int encodedLength(boolean z2) {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, this.contents.length);
    }

    public final byte[] getOctets() {
        return Arrays.clone(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        int length = this.contents.length;
        StringBuffer stringBuffer = new StringBuffer(((ASN1OutputStream.getLengthOfDL(length) + length) * 2) + 3);
        stringBuffer.append(StubApp.getString2(26829));
        encodeHexDL(stringBuffer, length);
        for (int i3 = 0; i3 < length; i3++) {
            encodeHexByte(stringBuffer, this.contents[i3]);
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return getString();
    }

    public static ASN1UniversalString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1UniversalString) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }
}
