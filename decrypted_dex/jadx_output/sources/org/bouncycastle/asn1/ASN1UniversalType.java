package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class ASN1UniversalType extends ASN1Type {
    final ASN1Tag tag;

    public ASN1UniversalType(Class cls, int i3) {
        super(cls);
        this.tag = ASN1Tag.create(0, i3);
    }

    public final ASN1Primitive checkedCast(ASN1Primitive aSN1Primitive) {
        if (this.javaClass.isInstance(aSN1Primitive)) {
            return aSN1Primitive;
        }
        throw new IllegalStateException(StubApp.getString2(26812).concat(aSN1Primitive.getClass().getName()));
    }

    public final ASN1Primitive fromByteArray(byte[] bArr) throws IOException {
        return checkedCast(ASN1Primitive.fromByteArray(bArr));
    }

    public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
        throw new IllegalStateException(StubApp.getString2(26830));
    }

    public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
        throw new IllegalStateException(StubApp.getString2(26831));
    }

    public final ASN1Primitive getContextInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        if (128 == aSN1TaggedObject.getTagClass()) {
            return checkedCast(aSN1TaggedObject.getBaseUniversal(z2, this));
        }
        throw new IllegalStateException(StubApp.getString2(26704));
    }

    public final ASN1Tag getTag() {
        return this.tag;
    }
}
