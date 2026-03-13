package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;
import kotlin.UByte;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ASN1BMPString extends ASN1Primitive implements ASN1String {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1BMPString.class, 30) { // from class: org.bouncycastle.asn1.ASN1BMPString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1BMPString.createPrimitive(dEROctetString.getOctets());
        }
    };
    final char[] string;

    public ASN1BMPString(String str) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(26705));
        }
        this.string = str.toCharArray();
    }

    public static ASN1BMPString createPrimitive(byte[] bArr) {
        return new DERBMPString(bArr);
    }

    public static ASN1BMPString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1BMPString)) {
            return (ASN1BMPString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1BMPString) {
                return (ASN1BMPString) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return (ASN1BMPString) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder(StubApp.getString2(26707))));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1BMPString) {
            return Arrays.areEqual(this.string, ((ASN1BMPString) aSN1Primitive).string);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        int length = this.string.length;
        aSN1OutputStream.writeIdentifier(z2, 30);
        aSN1OutputStream.writeDL(length * 2);
        byte[] bArr = new byte[8];
        int i3 = length & (-4);
        int i10 = 0;
        while (i10 < i3) {
            char[] cArr = this.string;
            char c10 = cArr[i10];
            char c11 = cArr[i10 + 1];
            char c12 = cArr[i10 + 2];
            char c13 = cArr[i10 + 3];
            i10 += 4;
            bArr[0] = (byte) (c10 >> '\b');
            bArr[1] = (byte) c10;
            bArr[2] = (byte) (c11 >> '\b');
            bArr[3] = (byte) c11;
            bArr[4] = (byte) (c12 >> '\b');
            bArr[5] = (byte) c12;
            bArr[6] = (byte) (c13 >> '\b');
            bArr[7] = (byte) c13;
            aSN1OutputStream.write(bArr, 0, 8);
        }
        if (i10 < length) {
            int i11 = 0;
            do {
                char c14 = this.string[i10];
                i10++;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (c14 >> '\b');
                i11 += 2;
                bArr[i12] = (byte) c14;
            } while (i10 < length);
            aSN1OutputStream.write(bArr, 0, i11);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int encodedLength(boolean z2) {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, this.string.length * 2);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        return new String(this.string);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public String toString() {
        return getString();
    }

    public ASN1BMPString(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(26705));
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(26706));
        }
        int i3 = length / 2;
        char[] cArr = new char[i3];
        for (int i10 = 0; i10 != i3; i10++) {
            int i11 = i10 * 2;
            cArr[i10] = (char) ((bArr[i11 + 1] & UByte.MAX_VALUE) | (bArr[i11] << 8));
        }
        this.string = cArr;
    }

    public static ASN1BMPString createPrimitive(char[] cArr) {
        return new DERBMPString(cArr);
    }

    public ASN1BMPString(char[] cArr) {
        if (cArr == null) {
            throw new NullPointerException(StubApp.getString2(26705));
        }
        this.string = cArr;
    }

    public static ASN1BMPString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1BMPString) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }
}
