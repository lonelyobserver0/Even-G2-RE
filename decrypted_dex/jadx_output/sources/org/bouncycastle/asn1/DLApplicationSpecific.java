package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DLApplicationSpecific extends ASN1ApplicationSpecific {
    public DLApplicationSpecific(int i3, ASN1Encodable aSN1Encodable) throws IOException {
        this(true, i3, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecific, org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DLApplicationSpecific(int i3, ASN1EncodableVector aSN1EncodableVector) {
        super(new DLTaggedObject(false, 64, i3, (ASN1Encodable) DLFactory.createSequence(aSN1EncodableVector)));
    }

    public DLApplicationSpecific(int i3, byte[] bArr) {
        super(new DLTaggedObject(false, 64, i3, (ASN1Encodable) new DEROctetString(Arrays.clone(bArr))));
    }

    public DLApplicationSpecific(ASN1TaggedObject aSN1TaggedObject) {
        super(aSN1TaggedObject);
    }

    public DLApplicationSpecific(boolean z2, int i3, ASN1Encodable aSN1Encodable) throws IOException {
        super(new DLTaggedObject(z2, 64, i3, aSN1Encodable));
    }
}
