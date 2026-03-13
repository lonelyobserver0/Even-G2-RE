package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ASN1Absent extends ASN1Primitive {
    public static final ASN1Absent INSTANCE = new ASN1Absent();

    private ASN1Absent() {
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return aSN1Primitive == this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) throws IOException {
        return 0;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return 0;
    }
}
