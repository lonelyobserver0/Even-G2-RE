package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.Extension;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ExtensionReq extends ASN1Object {
    private final Extension[] extensions;

    private ExtensionReq(ASN1Sequence aSN1Sequence) {
        this.extensions = new Extension[aSN1Sequence.size()];
        for (int i3 = 0; i3 != aSN1Sequence.size(); i3++) {
            this.extensions[i3] = Extension.getInstance(aSN1Sequence.getObjectAt(i3));
        }
    }

    public static ExtensionReq getInstance(Object obj) {
        if (obj instanceof ExtensionReq) {
            return (ExtensionReq) obj;
        }
        if (obj != null) {
            return new ExtensionReq(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Extension[] getExtensions() {
        return Utils.clone(this.extensions);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.extensions);
    }

    public ExtensionReq(Extension extension) {
        this.extensions = new Extension[]{extension};
    }

    public static ExtensionReq getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }

    public ExtensionReq(Extension[] extensionArr) {
        this.extensions = Utils.clone(extensionArr);
    }
}
