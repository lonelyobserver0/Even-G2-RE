package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSAParameter extends ASN1Object {

    /* renamed from: g, reason: collision with root package name */
    ASN1Integer f18702g;

    /* renamed from: p, reason: collision with root package name */
    ASN1Integer f18703p;

    /* renamed from: q, reason: collision with root package name */
    ASN1Integer f18704q;

    public DSAParameter(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f18703p = new ASN1Integer(bigInteger);
        this.f18704q = new ASN1Integer(bigInteger2);
        this.f18702g = new ASN1Integer(bigInteger3);
    }

    public static DSAParameter getInstance(Object obj) {
        if (obj instanceof DSAParameter) {
            return (DSAParameter) obj;
        }
        if (obj != null) {
            return new DSAParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f18702g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f18703p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f18704q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f18703p);
        aSN1EncodableVector.add(this.f18704q);
        aSN1EncodableVector.add(this.f18702g);
        return new DERSequence(aSN1EncodableVector);
    }

    private DSAParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f18703p = ASN1Integer.getInstance(objects.nextElement());
        this.f18704q = ASN1Integer.getInstance(objects.nextElement());
        this.f18702g = ASN1Integer.getInstance(objects.nextElement());
    }

    public static DSAParameter getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
