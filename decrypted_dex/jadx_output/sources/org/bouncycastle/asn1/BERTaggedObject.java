package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BERTaggedObject extends ASN1TaggedObject {
    public BERTaggedObject(int i3) {
        super(false, i3, new BERSequence());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
        boolean isExplicit = isExplicit();
        if (z2) {
            int i3 = this.tagClass;
            if (isExplicit || aSN1Primitive.encodeConstructed()) {
                i3 |= 32;
            }
            aSN1OutputStream.writeIdentifier(true, i3, this.tagNo);
        }
        if (!isExplicit) {
            aSN1Primitive.encode(aSN1OutputStream, false);
            return;
        }
        aSN1OutputStream.write(128);
        aSN1Primitive.encode(aSN1OutputStream, true);
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return isExplicit() || this.obj.toASN1Primitive().encodeConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) throws IOException {
        ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
        boolean isExplicit = isExplicit();
        int encodedLength = aSN1Primitive.encodedLength(isExplicit);
        if (isExplicit) {
            encodedLength += 3;
        }
        return encodedLength + (z2 ? ASN1OutputStream.getLengthOfIdentifier(this.tagNo) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public String getASN1Encoding() {
        return StubApp.getString2(26840);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive) {
        return new BERSequence(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1TaggedObject replaceTag(int i3, int i10) {
        return new BERTaggedObject(this.explicitness, i3, i10, this.obj);
    }

    public BERTaggedObject(int i3, int i10, int i11, ASN1Encodable aSN1Encodable) {
        super(i3, i10, i11, aSN1Encodable);
    }

    public BERTaggedObject(int i3, int i10, ASN1Encodable aSN1Encodable) {
        super(true, i3, i10, aSN1Encodable);
    }

    public BERTaggedObject(int i3, ASN1Encodable aSN1Encodable) {
        super(true, i3, aSN1Encodable);
    }

    public BERTaggedObject(boolean z2, int i3, int i10, ASN1Encodable aSN1Encodable) {
        super(z2, i3, i10, aSN1Encodable);
    }

    public BERTaggedObject(boolean z2, int i3, ASN1Encodable aSN1Encodable) {
        super(z2, i3, aSN1Encodable);
    }
}
