package org.bouncycastle.asn1.x9;

import E1.a;
import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHDomainParameters extends ASN1Object {

    /* renamed from: g, reason: collision with root package name */
    private ASN1Integer f18710g;
    private ASN1Integer j;

    /* renamed from: p, reason: collision with root package name */
    private ASN1Integer f18711p;

    /* renamed from: q, reason: collision with root package name */
    private ASN1Integer f18712q;
    private DHValidationParms validationParms;

    public DHDomainParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParms dHValidationParms) {
        if (bigInteger == null) {
            throw new IllegalArgumentException(StubApp.getString2(27868));
        }
        if (bigInteger2 == null) {
            throw new IllegalArgumentException(StubApp.getString2(27867));
        }
        if (bigInteger3 == null) {
            throw new IllegalArgumentException(StubApp.getString2(27866));
        }
        this.f18711p = new ASN1Integer(bigInteger);
        this.f18710g = new ASN1Integer(bigInteger2);
        this.f18712q = new ASN1Integer(bigInteger3);
        this.j = new ASN1Integer(bigInteger4);
        this.validationParms = dHValidationParms;
    }

    public static DHDomainParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof DHDomainParameters)) {
            return (DHDomainParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new DHDomainParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(a.h(obj, StubApp.getString2(27869)));
    }

    private static ASN1Encodable getNext(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (ASN1Encodable) enumeration.nextElement();
        }
        return null;
    }

    public ASN1Integer getG() {
        return this.f18710g;
    }

    public ASN1Integer getJ() {
        return this.j;
    }

    public ASN1Integer getP() {
        return this.f18711p;
    }

    public ASN1Integer getQ() {
        return this.f18712q;
    }

    public DHValidationParms getValidationParms() {
        return this.validationParms;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.f18711p);
        aSN1EncodableVector.add(this.f18710g);
        aSN1EncodableVector.add(this.f18712q);
        ASN1Integer aSN1Integer = this.j;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        DHValidationParms dHValidationParms = this.validationParms;
        if (dHValidationParms != null) {
            aSN1EncodableVector.add(dHValidationParms);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DHDomainParameters(ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2, ASN1Integer aSN1Integer3, ASN1Integer aSN1Integer4, DHValidationParms dHValidationParms) {
        if (aSN1Integer == null) {
            throw new IllegalArgumentException(StubApp.getString2(27868));
        }
        if (aSN1Integer2 == null) {
            throw new IllegalArgumentException(StubApp.getString2(27867));
        }
        if (aSN1Integer3 == null) {
            throw new IllegalArgumentException(StubApp.getString2(27866));
        }
        this.f18711p = aSN1Integer;
        this.f18710g = aSN1Integer2;
        this.f18712q = aSN1Integer3;
        this.j = aSN1Integer4;
        this.validationParms = dHValidationParms;
    }

    private DHDomainParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 5) {
            throw new IllegalArgumentException(org.bouncycastle.asn1.a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f18711p = ASN1Integer.getInstance(objects.nextElement());
        this.f18710g = ASN1Integer.getInstance(objects.nextElement());
        this.f18712q = ASN1Integer.getInstance(objects.nextElement());
        ASN1Encodable next = getNext(objects);
        if (next != null && (next instanceof ASN1Integer)) {
            this.j = ASN1Integer.getInstance(next);
            next = getNext(objects);
        }
        if (next != null) {
            this.validationParms = DHValidationParms.getInstance(next.toASN1Primitive());
        }
    }

    public static DHDomainParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
