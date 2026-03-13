package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Iterable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ASN1Sequence extends ASN1Primitive implements Iterable<ASN1Encodable> {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Sequence.class, 16) { // from class: org.bouncycastle.asn1.ASN1Sequence.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence;
        }
    };
    ASN1Encodable[] elements;

    public ASN1Sequence() {
        this.elements = ASN1EncodableVector.EMPTY_ELEMENTS;
    }

    public static ASN1Sequence getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Sequence)) {
            return (ASN1Sequence) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Sequence) {
                return (ASN1Sequence) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1Sequence) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(26799))));
            }
        }
        throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26703)));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1Sequence)) {
            return false;
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
        int size = size();
        if (aSN1Sequence.size() != size) {
            return false;
        }
        for (int i3 = 0; i3 < size; i3++) {
            ASN1Primitive aSN1Primitive2 = this.elements[i3].toASN1Primitive();
            ASN1Primitive aSN1Primitive3 = aSN1Sequence.elements[i3].toASN1Primitive();
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

    public ASN1BitString[] getConstructedBitStrings() {
        int size = size();
        ASN1BitString[] aSN1BitStringArr = new ASN1BitString[size];
        for (int i3 = 0; i3 < size; i3++) {
            aSN1BitStringArr[i3] = ASN1BitString.getInstance(this.elements[i3]);
        }
        return aSN1BitStringArr;
    }

    public ASN1OctetString[] getConstructedOctetStrings() {
        int size = size();
        ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
        for (int i3 = 0; i3 < size; i3++) {
            aSN1OctetStringArr[i3] = ASN1OctetString.getInstance(this.elements[i3]);
        }
        return aSN1OctetStringArr;
    }

    public ASN1Encodable getObjectAt(int i3) {
        return this.elements[i3];
    }

    public Enumeration getObjects() {
        return new Enumeration() { // from class: org.bouncycastle.asn1.ASN1Sequence.2
            private int pos = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.pos < ASN1Sequence.this.elements.length;
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                int i3 = this.pos;
                ASN1Encodable[] aSN1EncodableArr = ASN1Sequence.this.elements;
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
            i3 = (i3 * 257) ^ this.elements[length].toASN1Primitive().hashCode();
        }
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator<ASN1Encodable> iterator() {
        return new Arrays.Iterator(this.elements);
    }

    public ASN1SequenceParser parser() {
        final int size = size();
        return new ASN1SequenceParser() { // from class: org.bouncycastle.asn1.ASN1Sequence.3
            private int pos = 0;

            @Override // org.bouncycastle.asn1.InMemoryRepresentable
            public ASN1Primitive getLoadedObject() {
                return ASN1Sequence.this;
            }

            @Override // org.bouncycastle.asn1.ASN1SequenceParser
            public ASN1Encodable readObject() throws IOException {
                int i3 = size;
                int i10 = this.pos;
                if (i3 == i10) {
                    return null;
                }
                ASN1Encodable[] aSN1EncodableArr = ASN1Sequence.this.elements;
                this.pos = i10 + 1;
                ASN1Encodable aSN1Encodable = aSN1EncodableArr[i10];
                return aSN1Encodable instanceof ASN1Sequence ? ((ASN1Sequence) aSN1Encodable).parser() : aSN1Encodable instanceof ASN1Set ? ((ASN1Set) aSN1Encodable).parser() : aSN1Encodable;
            }

            @Override // org.bouncycastle.asn1.ASN1Encodable
            public ASN1Primitive toASN1Primitive() {
                return ASN1Sequence.this;
            }
        };
    }

    public int size() {
        return this.elements.length;
    }

    public abstract ASN1BitString toASN1BitString();

    public abstract ASN1External toASN1External();

    public abstract ASN1OctetString toASN1OctetString();

    public abstract ASN1Set toASN1Set();

    public ASN1Encodable[] toArray() {
        return ASN1EncodableVector.cloneElements(this.elements);
    }

    public ASN1Encodable[] toArrayInternal() {
        return this.elements;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERSequence(this.elements, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLSequence(this.elements, false);
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

    public ASN1Sequence(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException(StubApp.getString2(26723));
        }
        this.elements = new ASN1Encodable[]{aSN1Encodable};
    }

    public ASN1Sequence(ASN1EncodableVector aSN1EncodableVector) {
        if (aSN1EncodableVector == null) {
            throw new NullPointerException(StubApp.getString2(26797));
        }
        this.elements = aSN1EncodableVector.takeElements();
    }

    public ASN1Sequence(ASN1Encodable[] aSN1EncodableArr) {
        if (Arrays.isNullOrContainsNull(aSN1EncodableArr)) {
            throw new NullPointerException(StubApp.getString2(26798));
        }
        this.elements = ASN1EncodableVector.cloneElements(aSN1EncodableArr);
    }

    public ASN1Sequence(ASN1Encodable[] aSN1EncodableArr, boolean z2) {
        this.elements = z2 ? ASN1EncodableVector.cloneElements(aSN1EncodableArr) : aSN1EncodableArr;
    }

    public static ASN1Sequence getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1Sequence) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }
}
