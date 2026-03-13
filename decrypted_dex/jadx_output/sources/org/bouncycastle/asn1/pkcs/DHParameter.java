package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHParameter extends ASN1Object {

    /* renamed from: g, reason: collision with root package name */
    ASN1Integer f18683g;

    /* renamed from: l, reason: collision with root package name */
    ASN1Integer f18684l;

    /* renamed from: p, reason: collision with root package name */
    ASN1Integer f18685p;

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i3) {
        this.f18685p = new ASN1Integer(bigInteger);
        this.f18683g = new ASN1Integer(bigInteger2);
        this.f18684l = i3 != 0 ? new ASN1Integer(i3) : null;
    }

    public static DHParameter getInstance(Object obj) {
        if (obj instanceof DHParameter) {
            return (DHParameter) obj;
        }
        if (obj != null) {
            return new DHParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f18683g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f18684l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f18685p.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f18685p);
        aSN1EncodableVector.add(this.f18683g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f18684l);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f18685p = ASN1Integer.getInstance(objects.nextElement());
        this.f18683g = ASN1Integer.getInstance(objects.nextElement());
        this.f18684l = objects.hasMoreElements() ? (ASN1Integer) objects.nextElement() : null;
    }
}
