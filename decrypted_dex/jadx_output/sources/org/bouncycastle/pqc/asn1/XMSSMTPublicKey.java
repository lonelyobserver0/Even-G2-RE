package org.bouncycastle.pqc.asn1;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSSMTPublicKey extends ASN1Object {
    private final byte[] publicSeed;
    private final byte[] root;

    private XMSSMTPublicKey(ASN1Sequence aSN1Sequence) {
        if (!ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).hasValue(0)) {
            throw new IllegalArgumentException(StubApp.getString2(33950));
        }
        this.publicSeed = a.B(aSN1Sequence, 1);
        this.root = a.B(aSN1Sequence, 2);
    }

    public static XMSSMTPublicKey getInstance(Object obj) {
        if (obj instanceof XMSSMTPublicKey) {
            return (XMSSMTPublicKey) obj;
        }
        if (obj != null) {
            return new XMSSMTPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.publicSeed);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.root);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(0L));
        aSN1EncodableVector.add(new DEROctetString(this.publicSeed));
        aSN1EncodableVector.add(new DEROctetString(this.root));
        return new DERSequence(aSN1EncodableVector);
    }

    public XMSSMTPublicKey(byte[] bArr, byte[] bArr2) {
        this.publicSeed = Arrays.clone(bArr);
        this.root = Arrays.clone(bArr2);
    }
}
