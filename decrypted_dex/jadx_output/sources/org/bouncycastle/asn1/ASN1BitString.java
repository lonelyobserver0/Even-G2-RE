package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ASN1BitString extends ASN1Primitive implements ASN1String, ASN1BitStringParser {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1BitString.class, 3) { // from class: org.bouncycastle.asn1.ASN1BitString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.toASN1BitString();
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1BitString.createPrimitive(dEROctetString.getOctets());
        }
    };
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] contents;

    public ASN1BitString(byte b2, int i3) {
        if (i3 > 7 || i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(26709));
        }
        this.contents = new byte[]{(byte) i3, b2};
    }

    public static ASN1BitString createPrimitive(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            throw new IllegalArgumentException(StubApp.getString2(26715));
        }
        int i3 = bArr[0] & UByte.MAX_VALUE;
        if (i3 > 0) {
            if (i3 > 7 || length < 2) {
                throw new IllegalArgumentException(StubApp.getString2(26714));
            }
            byte b2 = bArr[length - 1];
            if (b2 != ((byte) ((255 << i3) & b2))) {
                return new DLBitString(bArr, false);
            }
        }
        return new DERBitString(bArr, false);
    }

    public static ASN1BitString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1BitString)) {
            return (ASN1BitString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1BitString) {
                return (ASN1BitString) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1BitString) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(26716))));
            }
        }
        throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1BitString)) {
            return false;
        }
        byte[] bArr = this.contents;
        byte[] bArr2 = ((ASN1BitString) aSN1Primitive).contents;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i3 = length - 1;
        for (int i10 = 0; i10 < i3; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        int i11 = 255 << (bArr[0] & UByte.MAX_VALUE);
        return ((byte) (bArr[i3] & i11)) == ((byte) (bArr2[i3] & i11));
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getBitStream() throws IOException {
        byte[] bArr = this.contents;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    public byte[] getBytes() {
        byte[] bArr = this.contents;
        if (bArr.length == 1) {
            return ASN1OctetString.EMPTY_OCTETS;
        }
        int i3 = bArr[0] & UByte.MAX_VALUE;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, bArr.length);
        int length = copyOfRange.length - 1;
        copyOfRange[length] = (byte) (((byte) (255 << i3)) & copyOfRange[length]);
        return copyOfRange;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getOctetStream() throws IOException {
        int i3 = this.contents[0] & UByte.MAX_VALUE;
        if (i3 == 0) {
            return getBitStream();
        }
        throw new IOException(u.p(i3, StubApp.getString2(26717)));
    }

    public byte[] getOctets() {
        byte[] bArr = this.contents;
        if (bArr[0] == 0) {
            return Arrays.copyOfRange(bArr, 1, bArr.length);
        }
        throw new IllegalStateException(StubApp.getString2(26718));
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public int getPadBits() {
        return this.contents[0] & UByte.MAX_VALUE;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i3 = 0; i3 != encoded.length; i3++) {
                byte b2 = encoded[i3];
                char[] cArr = table;
                stringBuffer.append(cArr[(b2 >>> 4) & 15]);
                stringBuffer.append(cArr[b2 & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e10) {
            throw new ASN1ParsingException(u.q(e10, new StringBuilder(StubApp.getString2(26719))), e10);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        byte[] bArr = this.contents;
        if (bArr.length < 2) {
            return 1;
        }
        int i3 = bArr[0] & UByte.MAX_VALUE;
        int length = bArr.length - 1;
        return (Arrays.hashCode(bArr, 0, length) * 257) ^ ((byte) ((255 << i3) & bArr[length]));
    }

    public int intValue() {
        int min = Math.min(5, this.contents.length - 1);
        int i3 = 0;
        for (int i10 = 1; i10 < min; i10++) {
            i3 |= (255 & this.contents[i10]) << ((i10 - 1) * 8);
        }
        if (1 > min || min >= 5) {
            return i3;
        }
        byte[] bArr = this.contents;
        return ((((byte) (bArr[min] & (255 << (bArr[0] & UByte.MAX_VALUE)))) & UByte.MAX_VALUE) << ((min - 1) * 8)) | i3;
    }

    public ASN1BitStringParser parser() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERBitString(this.contents, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLBitString(this.contents, false);
    }

    public String toString() {
        return getString();
    }

    public ASN1BitString(byte[] bArr, int i3) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(26711));
        }
        if (bArr.length == 0 && i3 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(26710));
        }
        if (i3 > 7 || i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(26709));
        }
        this.contents = Arrays.prepend(bArr, (byte) i3);
    }

    public static byte[] getBytes(int i3) {
        if (i3 == 0) {
            return new byte[0];
        }
        int i10 = 4;
        for (int i11 = 3; i11 >= 1 && ((255 << (i11 * 8)) & i3) == 0; i11--) {
            i10--;
        }
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) ((i3 >> (i12 * 8)) & 255);
        }
        return bArr;
    }

    public static int getPadBits(int i3) {
        int i10;
        int i11 = 3;
        while (true) {
            if (i11 < 0) {
                i10 = 0;
                break;
            }
            if (i11 != 0) {
                int i12 = i3 >> (i11 * 8);
                if (i12 != 0) {
                    i10 = i12 & 255;
                    break;
                }
                i11--;
            } else {
                if (i3 != 0) {
                    i10 = i3 & 255;
                    break;
                }
                i11--;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        int i13 = 1;
        while (true) {
            i10 <<= 1;
            if ((i10 & 255) == 0) {
                return 8 - i13;
            }
            i13++;
        }
    }

    public ASN1BitString(byte[] bArr, boolean z2) {
        if (z2) {
            if (bArr == null) {
                throw new NullPointerException(StubApp.getString2(26713));
            }
            if (bArr.length < 1) {
                throw new IllegalArgumentException(StubApp.getString2(26712));
            }
            int i3 = bArr[0] & UByte.MAX_VALUE;
            if (i3 > 0) {
                if (bArr.length < 2) {
                    throw new IllegalArgumentException(StubApp.getString2(26710));
                }
                if (i3 > 7) {
                    throw new IllegalArgumentException(StubApp.getString2(26709));
                }
            }
        }
        this.contents = bArr;
    }

    public static ASN1BitString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1BitString) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }
}
