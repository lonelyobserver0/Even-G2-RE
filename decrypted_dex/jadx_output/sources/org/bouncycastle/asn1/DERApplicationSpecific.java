package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DERApplicationSpecific extends ASN1ApplicationSpecific {
    public DERApplicationSpecific(int i3, ASN1Encodable aSN1Encodable) throws IOException {
        this(true, i3, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecific, org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecific, org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DERApplicationSpecific(int i3, ASN1EncodableVector aSN1EncodableVector) {
        super(new DERTaggedObject(false, 64, i3, (ASN1Encodable) DERFactory.createSequence(aSN1EncodableVector)));
    }

    public DERApplicationSpecific(int i3, byte[] bArr) {
        super(new DERTaggedObject(false, 64, i3, (ASN1Encodable) new DEROctetString(bArr)));
    }

    public DERApplicationSpecific(ASN1TaggedObject aSN1TaggedObject) {
        super(aSN1TaggedObject);
    }

    public DERApplicationSpecific(boolean z2, int i3, ASN1Encodable aSN1Encodable) throws IOException {
        super(new DERTaggedObject(z2, 64, i3, aSN1Encodable));
    }
}
