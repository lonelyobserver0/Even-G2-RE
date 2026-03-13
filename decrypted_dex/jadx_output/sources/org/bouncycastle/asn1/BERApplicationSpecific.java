package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BERApplicationSpecific extends ASN1ApplicationSpecific {
    public BERApplicationSpecific(int i3, ASN1Encodable aSN1Encodable) throws IOException {
        this(true, i3, aSN1Encodable);
    }

    public BERApplicationSpecific(int i3, ASN1EncodableVector aSN1EncodableVector) {
        super(new BERTaggedObject(false, 64, i3, (ASN1Encodable) BERFactory.createSequence(aSN1EncodableVector)));
    }

    public BERApplicationSpecific(ASN1TaggedObject aSN1TaggedObject) {
        super(aSN1TaggedObject);
    }

    public BERApplicationSpecific(boolean z2, int i3, ASN1Encodable aSN1Encodable) throws IOException {
        super(new BERTaggedObject(z2, 64, i3, aSN1Encodable));
    }
}
