package org.bouncycastle.asn1.cryptopro;

import E1.a;
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

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* renamed from: a, reason: collision with root package name */
    ASN1Integer f18662a;

    /* renamed from: b, reason: collision with root package name */
    ASN1Integer f18663b;

    /* renamed from: p, reason: collision with root package name */
    ASN1Integer f18664p;

    /* renamed from: q, reason: collision with root package name */
    ASN1Integer f18665q;

    /* renamed from: x, reason: collision with root package name */
    ASN1Integer f18666x;

    /* renamed from: y, reason: collision with root package name */
    ASN1Integer f18667y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i3, BigInteger bigInteger5) {
        this.f18662a = new ASN1Integer(bigInteger);
        this.f18663b = new ASN1Integer(bigInteger2);
        this.f18664p = new ASN1Integer(bigInteger3);
        this.f18665q = new ASN1Integer(bigInteger4);
        this.f18666x = new ASN1Integer(i3);
        this.f18667y = new ASN1Integer(bigInteger5);
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(a.h(obj, StubApp.getString2(26992)));
    }

    public BigInteger getA() {
        return this.f18662a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f18664p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f18665q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f18662a);
        aSN1EncodableVector.add(this.f18663b);
        aSN1EncodableVector.add(this.f18664p);
        aSN1EncodableVector.add(this.f18665q);
        aSN1EncodableVector.add(this.f18666x);
        aSN1EncodableVector.add(this.f18667y);
        return new DERSequence(aSN1EncodableVector);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f18662a = (ASN1Integer) objects.nextElement();
        this.f18663b = (ASN1Integer) objects.nextElement();
        this.f18664p = (ASN1Integer) objects.nextElement();
        this.f18665q = (ASN1Integer) objects.nextElement();
        this.f18666x = (ASN1Integer) objects.nextElement();
        this.f18667y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
