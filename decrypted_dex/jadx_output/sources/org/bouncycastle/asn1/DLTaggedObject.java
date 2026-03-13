package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DLTaggedObject extends ASN1TaggedObject {
    public DLTaggedObject(int i3, int i10, int i11, ASN1Encodable aSN1Encodable) {
        super(i3, i10, i11, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        ASN1Primitive dLObject = this.obj.toASN1Primitive().toDLObject();
        boolean isExplicit = isExplicit();
        if (z2) {
            int i3 = this.tagClass;
            if (isExplicit || dLObject.encodeConstructed()) {
                i3 |= 32;
            }
            aSN1OutputStream.writeIdentifier(true, i3, this.tagNo);
        }
        if (isExplicit) {
            aSN1OutputStream.writeDL(dLObject.encodedLength(true));
        }
        dLObject.encode(aSN1OutputStream.getDLSubStream(), isExplicit);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return isExplicit() || this.obj.toASN1Primitive().toDLObject().encodeConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) throws IOException {
        ASN1Primitive dLObject = this.obj.toASN1Primitive().toDLObject();
        boolean isExplicit = isExplicit();
        int encodedLength = dLObject.encodedLength(isExplicit);
        if (isExplicit) {
            encodedLength += ASN1OutputStream.getLengthOfDL(encodedLength);
        }
        return encodedLength + (z2 ? ASN1OutputStream.getLengthOfIdentifier(this.tagNo) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public String getASN1Encoding() {
        return StubApp.getString2(21754);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive) {
        return new DLSequence(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1TaggedObject replaceTag(int i3, int i10) {
        return new DLTaggedObject(this.explicitness, i3, i10, this.obj);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DLTaggedObject(int i3, int i10, ASN1Encodable aSN1Encodable) {
        super(true, i3, i10, aSN1Encodable);
    }

    public DLTaggedObject(int i3, ASN1Encodable aSN1Encodable) {
        super(true, i3, aSN1Encodable);
    }

    public DLTaggedObject(boolean z2, int i3, int i10, ASN1Encodable aSN1Encodable) {
        super(z2, i3, i10, aSN1Encodable);
    }

    public DLTaggedObject(boolean z2, int i3, ASN1Encodable aSN1Encodable) {
        super(z2, i3, aSN1Encodable);
    }
}
