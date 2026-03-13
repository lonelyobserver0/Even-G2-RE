package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.UByte;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Iterable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ASN1Set extends ASN1Primitive implements Iterable<ASN1Encodable> {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Set.class, 17) { // from class: org.bouncycastle.asn1.ASN1Set.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.toASN1Set();
        }
    };
    protected final ASN1Encodable[] elements;
    protected final boolean isSorted;

    public ASN1Set() {
        this.elements = ASN1EncodableVector.EMPTY_ELEMENTS;
        this.isSorted = true;
    }

    private static byte[] getDEREncoded(ASN1Encodable aSN1Encodable) {
        try {
            return aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2("26791"));
        } catch (IOException unused) {
            throw new IllegalArgumentException(StubApp.getString2(26800));
        }
    }

    public static ASN1Set getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Set)) {
            return (ASN1Set) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Set) {
                return (ASN1Set) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1Set) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(26801))));
            }
        }
        throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26703)));
    }

    private static boolean lessThanOrEqual(byte[] bArr, byte[] bArr2) {
        int i3 = bArr[0] & (-33);
        int i10 = bArr2[0] & (-33);
        if (i3 != i10) {
            return i3 < i10;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i11 = 1; i11 < min; i11++) {
            byte b2 = bArr[i11];
            byte b10 = bArr2[i11];
            if (b2 != b10) {
                return (b2 & UByte.MAX_VALUE) < (b10 & UByte.MAX_VALUE);
            }
        }
        return (bArr[min] & UByte.MAX_VALUE) <= (bArr2[min] & UByte.MAX_VALUE);
    }

    private static void sort(ASN1Encodable[] aSN1EncodableArr) {
        int i3;
        int length = aSN1EncodableArr.length;
        if (length < 2) {
            return;
        }
        ASN1Encodable aSN1Encodable = aSN1EncodableArr[0];
        ASN1Encodable aSN1Encodable2 = aSN1EncodableArr[1];
        byte[] dEREncoded = getDEREncoded(aSN1Encodable);
        byte[] dEREncoded2 = getDEREncoded(aSN1Encodable2);
        if (lessThanOrEqual(dEREncoded2, dEREncoded)) {
            aSN1Encodable2 = aSN1Encodable;
            aSN1Encodable = aSN1Encodable2;
            dEREncoded2 = dEREncoded;
            dEREncoded = dEREncoded2;
        }
        for (int i10 = 2; i10 < length; i10++) {
            ASN1Encodable aSN1Encodable3 = aSN1EncodableArr[i10];
            byte[] dEREncoded3 = getDEREncoded(aSN1Encodable3);
            if (lessThanOrEqual(dEREncoded2, dEREncoded3)) {
                aSN1EncodableArr[i10 - 2] = aSN1Encodable;
                aSN1Encodable = aSN1Encodable2;
                dEREncoded = dEREncoded2;
                aSN1Encodable2 = aSN1Encodable3;
                dEREncoded2 = dEREncoded3;
            } else if (lessThanOrEqual(dEREncoded, dEREncoded3)) {
                aSN1EncodableArr[i10 - 2] = aSN1Encodable;
                aSN1Encodable = aSN1Encodable3;
                dEREncoded = dEREncoded3;
            } else {
                int i11 = i10 - 1;
                while (true) {
                    i3 = i11 - 1;
                    if (i3 <= 0) {
                        break;
                    }
                    ASN1Encodable aSN1Encodable4 = aSN1EncodableArr[i11 - 2];
                    if (lessThanOrEqual(getDEREncoded(aSN1Encodable4), dEREncoded3)) {
                        break;
                    }
                    aSN1EncodableArr[i3] = aSN1Encodable4;
                    i11 = i3;
                }
                aSN1EncodableArr[i3] = aSN1Encodable3;
            }
        }
        aSN1EncodableArr[length - 2] = aSN1Encodable;
        aSN1EncodableArr[length - 1] = aSN1Encodable2;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1Set)) {
            return false;
        }
        ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
        int size = size();
        if (aSN1Set.size() != size) {
            return false;
        }
        DERSet dERSet = (DERSet) toDERObject();
        DERSet dERSet2 = (DERSet) aSN1Set.toDERObject();
        for (int i3 = 0; i3 < size; i3++) {
            ASN1Primitive aSN1Primitive2 = dERSet.elements[i3].toASN1Primitive();
            ASN1Primitive aSN1Primitive3 = dERSet2.elements[i3].toASN1Primitive();
            if (aSN1Primitive2 != aSN1Primitive3 && !aSN1Primitive2.asn1Equals(aSN1Primitive3)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return true;
    }

    public ASN1Encodable getObjectAt(int i3) {
        return this.elements[i3];
    }

    public Enumeration getObjects() {
        return new Enumeration() { // from class: org.bouncycastle.asn1.ASN1Set.2
            private int pos = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.pos < ASN1Set.this.elements.length;
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                int i3 = this.pos;
                ASN1Encodable[] aSN1EncodableArr = ASN1Set.this.elements;
                if (i3 >= aSN1EncodableArr.length) {
                    throw new NoSuchElementException();
                }
                this.pos = i3 + 1;
                return aSN1EncodableArr[i3];
            }
        };
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        int length = this.elements.length;
        int i3 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i3;
            }
            i3 += this.elements[length].toASN1Primitive().hashCode();
        }
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator<ASN1Encodable> iterator() {
        return new Arrays.Iterator(toArray());
    }

    public ASN1SetParser parser() {
        final int size = size();
        return new ASN1SetParser() { // from class: org.bouncycastle.asn1.ASN1Set.3
            private int pos = 0;

            @Override // org.bouncycastle.asn1.InMemoryRepresentable
            public ASN1Primitive getLoadedObject() {
                return ASN1Set.this;
            }

            @Override // org.bouncycastle.asn1.ASN1SetParser
            public ASN1Encodable readObject() throws IOException {
                int i3 = size;
                int i10 = this.pos;
                if (i3 == i10) {
                    return null;
                }
                ASN1Encodable[] aSN1EncodableArr = ASN1Set.this.elements;
                this.pos = i10 + 1;
                ASN1Encodable aSN1Encodable = aSN1EncodableArr[i10];
                return aSN1Encodable instanceof ASN1Sequence ? ((ASN1Sequence) aSN1Encodable).parser() : aSN1Encodable instanceof ASN1Set ? ((ASN1Set) aSN1Encodable).parser() : aSN1Encodable;
            }

            @Override // org.bouncycastle.asn1.ASN1Encodable
            public ASN1Primitive toASN1Primitive() {
                return ASN1Set.this;
            }
        };
    }

    public int size() {
        return this.elements.length;
    }

    public ASN1Encodable[] toArray() {
        return ASN1EncodableVector.cloneElements(this.elements);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        ASN1Encodable[] aSN1EncodableArr;
        if (this.isSorted) {
            aSN1EncodableArr = this.elements;
        } else {
            aSN1EncodableArr = (ASN1Encodable[]) this.elements.clone();
            sort(aSN1EncodableArr);
        }
        return new DERSet(true, aSN1EncodableArr);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLSet(this.isSorted, this.elements);
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return StubApp.getString2(11096);
        }
        StringBuffer stringBuffer = new StringBuffer(StubApp.getString2(1557));
        int i3 = 0;
        while (true) {
            stringBuffer.append(this.elements[i3]);
            i3++;
            if (i3 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(StubApp.getString2(81));
        }
    }

    public ASN1Set(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException(StubApp.getString2(26723));
        }
        this.elements = new ASN1Encodable[]{aSN1Encodable};
        this.isSorted = true;
    }

    public ASN1Set(ASN1EncodableVector aSN1EncodableVector, boolean z2) {
        ASN1Encodable[] takeElements;
        if (aSN1EncodableVector == null) {
            throw new NullPointerException(StubApp.getString2(26797));
        }
        if (!z2 || aSN1EncodableVector.size() < 2) {
            takeElements = aSN1EncodableVector.takeElements();
        } else {
            takeElements = aSN1EncodableVector.copyElements();
            sort(takeElements);
        }
        this.elements = takeElements;
        this.isSorted = z2 || takeElements.length < 2;
    }

    public ASN1Set(boolean z2, ASN1Encodable[] aSN1EncodableArr) {
        this.elements = aSN1EncodableArr;
        this.isSorted = z2 || aSN1EncodableArr.length < 2;
    }

    public ASN1Set(ASN1Encodable[] aSN1EncodableArr, boolean z2) {
        if (Arrays.isNullOrContainsNull(aSN1EncodableArr)) {
            throw new NullPointerException(StubApp.getString2(26798));
        }
        ASN1Encodable[] cloneElements = ASN1EncodableVector.cloneElements(aSN1EncodableArr);
        if (z2 && cloneElements.length >= 2) {
            sort(cloneElements);
        }
        this.elements = cloneElements;
        this.isSorted = z2 || cloneElements.length < 2;
    }

    public static ASN1Set getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1Set) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }
}
