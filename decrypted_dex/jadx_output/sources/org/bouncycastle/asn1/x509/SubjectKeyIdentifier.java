package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SubjectKeyIdentifier extends ASN1Object {
    private byte[] keyidentifier;

    public SubjectKeyIdentifier(ASN1OctetString aSN1OctetString) {
        this(aSN1OctetString.getOctets());
    }

    public static SubjectKeyIdentifier fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.subjectKeyIdentifier));
    }

    public static SubjectKeyIdentifier getInstance(Object obj) {
        if (obj instanceof SubjectKeyIdentifier) {
            return (SubjectKeyIdentifier) obj;
        }
        if (obj != null) {
            return new SubjectKeyIdentifier(ASN1OctetString.getInstance(obj));
        }
        return null;
    }

    public byte[] getKeyIdentifier() {
        return Arrays.clone(this.keyidentifier);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DEROctetString(getKeyIdentifier());
    }

    public SubjectKeyIdentifier(byte[] bArr) {
        this.keyidentifier = Arrays.clone(bArr);
    }

    public static SubjectKeyIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1OctetString.getInstance(aSN1TaggedObject, z2));
    }
}
