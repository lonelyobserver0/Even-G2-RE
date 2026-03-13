package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMCEPublicKey extends ASN1Object {

    /* renamed from: T, reason: collision with root package name */
    private byte[] f19334T;

    public CMCEPublicKey(ASN1Sequence aSN1Sequence) {
        this.f19334T = a.B(aSN1Sequence, 0);
    }

    public static CMCEPublicKey getInstance(Object obj) {
        if (obj instanceof CMCEPrivateKey) {
            return (CMCEPublicKey) obj;
        }
        if (obj != null) {
            return new CMCEPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getT() {
        return Arrays.clone(this.f19334T);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.f19334T));
        return new DERSequence(aSN1EncodableVector);
    }

    public CMCEPublicKey(byte[] bArr) {
        this.f19334T = bArr;
    }
}
