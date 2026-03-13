package org.bouncycastle.asn1.cms;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.DLTaggedObject;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ContentInfo extends ASN1Object implements CMSObjectIdentifiers {
    private final ASN1Encodable content;
    private final ASN1ObjectIdentifier contentType;
    private final boolean isDefiniteLength;

    public ContentInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.contentType = aSN1ObjectIdentifier;
        this.content = aSN1Encodable;
        boolean z2 = true;
        if (aSN1Encodable == null) {
            this.isDefiniteLength = true;
            return;
        }
        ASN1Primitive aSN1Primitive = aSN1Encodable.toASN1Primitive();
        if (!(aSN1Primitive instanceof DEROctetString) && !(aSN1Primitive instanceof DLSequence) && !(aSN1Primitive instanceof DERSequence)) {
            z2 = false;
        }
        this.isDefiniteLength = z2;
    }

    public static ContentInfo getInstance(Object obj) {
        if (obj instanceof ContentInfo) {
            return (ContentInfo) obj;
        }
        if (obj != null) {
            return new ContentInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Encodable getContent() {
        return this.content;
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.contentType;
    }

    public boolean isDefiniteLength() {
        return this.isDefiniteLength;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.contentType);
        ASN1Encodable aSN1Encodable = this.content;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(this.isDefiniteLength ? new DLTaggedObject(0, aSN1Encodable) : new BERTaggedObject(0, aSN1Encodable));
        }
        return this.isDefiniteLength ? new DLSequence(aSN1EncodableVector) : new BERSequence(aSN1EncodableVector);
    }

    private ContentInfo(ASN1Sequence aSN1Sequence) {
        ASN1Primitive aSN1Primitive;
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        this.contentType = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        if (aSN1Sequence.size() > 1) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(1);
            if (!aSN1TaggedObject.isExplicit() || aSN1TaggedObject.getTagNo() != 0) {
                throw new IllegalArgumentException(StubApp.getString2(26911));
            }
            aSN1Primitive = aSN1TaggedObject.getObject();
        } else {
            aSN1Primitive = null;
        }
        this.content = aSN1Primitive;
        this.isDefiniteLength = !(aSN1Sequence instanceof BERSequence);
    }

    public static ContentInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
