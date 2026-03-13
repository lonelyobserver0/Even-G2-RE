package org.bouncycastle.asn1;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ASN1EncodableVector {
    private static final int DEFAULT_CAPACITY = 10;
    static final ASN1Encodable[] EMPTY_ELEMENTS = new ASN1Encodable[0];
    private boolean copyOnWrite;
    private int elementCount;
    private ASN1Encodable[] elements;

    public ASN1EncodableVector() {
        this(10);
    }

    public static ASN1Encodable[] cloneElements(ASN1Encodable[] aSN1EncodableArr) {
        return aSN1EncodableArr.length < 1 ? EMPTY_ELEMENTS : (ASN1Encodable[]) aSN1EncodableArr.clone();
    }

    private void doAddAll(ASN1Encodable[] aSN1EncodableArr, String str) {
        int length = aSN1EncodableArr.length;
        if (length < 1) {
            return;
        }
        int length2 = this.elements.length;
        int i3 = this.elementCount + length;
        int i10 = 0;
        if ((i3 > length2) | this.copyOnWrite) {
            reallocate(i3);
        }
        do {
            ASN1Encodable aSN1Encodable = aSN1EncodableArr[i10];
            if (aSN1Encodable == null) {
                throw new NullPointerException(str);
            }
            this.elements[this.elementCount + i10] = aSN1Encodable;
            i10++;
        } while (i10 < length);
        this.elementCount = i3;
    }

    private void reallocate(int i3) {
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[Math.max(this.elements.length, i3 + (i3 >> 1))];
        System.arraycopy(this.elements, 0, aSN1EncodableArr, 0, this.elementCount);
        this.elements = aSN1EncodableArr;
        this.copyOnWrite = false;
    }

    public void add(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException(StubApp.getString2(26723));
        }
        int length = this.elements.length;
        int i3 = this.elementCount + 1;
        if (this.copyOnWrite | (i3 > length)) {
            reallocate(i3);
        }
        this.elements[this.elementCount] = aSN1Encodable;
        this.elementCount = i3;
    }

    public void addAll(ASN1EncodableVector aSN1EncodableVector) {
        if (aSN1EncodableVector == null) {
            throw new NullPointerException(StubApp.getString2(26725));
        }
        doAddAll(aSN1EncodableVector.elements, StubApp.getString2(26724));
    }

    public ASN1Encodable[] copyElements() {
        int i3 = this.elementCount;
        if (i3 == 0) {
            return EMPTY_ELEMENTS;
        }
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[i3];
        System.arraycopy(this.elements, 0, aSN1EncodableArr, 0, i3);
        return aSN1EncodableArr;
    }

    public ASN1Encodable get(int i3) {
        if (i3 < this.elementCount) {
            return this.elements[i3];
        }
        throw new ArrayIndexOutOfBoundsException(i3 + StubApp.getString2(22132) + this.elementCount);
    }

    public int size() {
        return this.elementCount;
    }

    public ASN1Encodable[] takeElements() {
        int i3 = this.elementCount;
        if (i3 == 0) {
            return EMPTY_ELEMENTS;
        }
        ASN1Encodable[] aSN1EncodableArr = this.elements;
        if (aSN1EncodableArr.length == i3) {
            this.copyOnWrite = true;
            return aSN1EncodableArr;
        }
        ASN1Encodable[] aSN1EncodableArr2 = new ASN1Encodable[i3];
        System.arraycopy(aSN1EncodableArr, 0, aSN1EncodableArr2, 0, i3);
        return aSN1EncodableArr2;
    }

    public ASN1EncodableVector(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(26722));
        }
        this.elements = i3 == 0 ? EMPTY_ELEMENTS : new ASN1Encodable[i3];
        this.elementCount = 0;
        this.copyOnWrite = false;
    }

    public void addAll(ASN1Encodable[] aSN1EncodableArr) {
        if (aSN1EncodableArr == null) {
            throw new NullPointerException(StubApp.getString2(26727));
        }
        doAddAll(aSN1EncodableArr, StubApp.getString2(26726));
    }
}
