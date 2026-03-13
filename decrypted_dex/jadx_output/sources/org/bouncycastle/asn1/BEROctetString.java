package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BEROctetString extends ASN1OctetString {
    private static final int DEFAULT_SEGMENT_LIMIT = 1000;
    private final ASN1OctetString[] elements;
    private final int segmentLimit;

    public BEROctetString(byte[] bArr) {
        this(bArr, DEFAULT_SEGMENT_LIMIT);
    }

    public static byte[] flattenOctetStrings(ASN1OctetString[] aSN1OctetStringArr) {
        int length = aSN1OctetStringArr.length;
        if (length == 0) {
            return ASN1OctetString.EMPTY_OCTETS;
        }
        if (length == 1) {
            return aSN1OctetStringArr[0].string;
        }
        int i3 = 0;
        for (ASN1OctetString aSN1OctetString : aSN1OctetStringArr) {
            i3 += aSN1OctetString.string.length;
        }
        byte[] bArr = new byte[i3];
        int i10 = 0;
        for (ASN1OctetString aSN1OctetString2 : aSN1OctetStringArr) {
            byte[] bArr2 = aSN1OctetString2.string;
            System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
            i10 += bArr2.length;
        }
        return bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        if (!encodeConstructed()) {
            byte[] bArr = this.string;
            DEROctetString.encode(aSN1OutputStream, z2, bArr, 0, bArr.length);
            return;
        }
        aSN1OutputStream.writeIdentifier(z2, 36);
        aSN1OutputStream.write(128);
        ASN1OctetString[] aSN1OctetStringArr = this.elements;
        if (aSN1OctetStringArr == null) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = this.string;
                if (i3 >= bArr2.length) {
                    break;
                }
                int min = Math.min(bArr2.length - i3, this.segmentLimit);
                DEROctetString.encode(aSN1OutputStream, true, this.string, i3, min);
                i3 += min;
            }
        } else {
            aSN1OutputStream.writePrimitives(aSN1OctetStringArr);
        }
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return this.elements != null || this.string.length > this.segmentLimit;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) throws IOException {
        if (!encodeConstructed()) {
            return DEROctetString.encodedLength(z2, this.string.length);
        }
        int i3 = z2 ? 4 : 3;
        if (this.elements == null) {
            int length = this.string.length;
            int i10 = this.segmentLimit;
            int i11 = length / i10;
            int encodedLength = (DEROctetString.encodedLength(true, i10) * i11) + i3;
            int length2 = this.string.length - (i11 * this.segmentLimit);
            return length2 > 0 ? DEROctetString.encodedLength(true, length2) + encodedLength : encodedLength;
        }
        int i12 = 0;
        while (true) {
            ASN1OctetString[] aSN1OctetStringArr = this.elements;
            if (i12 >= aSN1OctetStringArr.length) {
                return i3;
            }
            i3 += aSN1OctetStringArr[i12].encodedLength(true);
            i12++;
        }
    }

    public Enumeration getObjects() {
        return this.elements == null ? new Enumeration() { // from class: org.bouncycastle.asn1.BEROctetString.1
            int pos = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.pos < BEROctetString.this.string.length;
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                int i3 = this.pos;
                BEROctetString bEROctetString = BEROctetString.this;
                byte[] bArr = bEROctetString.string;
                if (i3 >= bArr.length) {
                    throw new NoSuchElementException();
                }
                int min = Math.min(bArr.length - i3, bEROctetString.segmentLimit);
                byte[] bArr2 = new byte[min];
                System.arraycopy(BEROctetString.this.string, this.pos, bArr2, 0, min);
                this.pos += min;
                return new DEROctetString(bArr2);
            }
        } : new Enumeration() { // from class: org.bouncycastle.asn1.BEROctetString.2
            int counter = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.counter < BEROctetString.this.elements.length;
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                if (this.counter >= BEROctetString.this.elements.length) {
                    throw new NoSuchElementException();
                }
                ASN1OctetString[] aSN1OctetStringArr = BEROctetString.this.elements;
                int i3 = this.counter;
                this.counter = i3 + 1;
                return aSN1OctetStringArr[i3];
            }
        };
    }

    public BEROctetString(byte[] bArr, int i3) {
        this(bArr, null, i3);
    }

    private BEROctetString(byte[] bArr, ASN1OctetString[] aSN1OctetStringArr, int i3) {
        super(bArr);
        this.elements = aSN1OctetStringArr;
        this.segmentLimit = i3;
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr) {
        this(aSN1OctetStringArr, DEFAULT_SEGMENT_LIMIT);
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr, int i3) {
        this(flattenOctetStrings(aSN1OctetStringArr), aSN1OctetStringArr, i3);
    }
}
