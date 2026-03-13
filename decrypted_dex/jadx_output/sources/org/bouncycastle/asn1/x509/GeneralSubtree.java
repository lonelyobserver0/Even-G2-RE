package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GeneralSubtree extends ASN1Object {
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private GeneralName base;
    private ASN1Integer maximum;
    private ASN1Integer minimum;

    private GeneralSubtree(ASN1Sequence aSN1Sequence) {
        this.base = GeneralName.getInstance(aSN1Sequence.getObjectAt(0));
        int size = aSN1Sequence.size();
        if (size != 1) {
            if (size == 2) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.minimum = ASN1Integer.getInstance(aSN1TaggedObject, false);
                    return;
                } else {
                    if (tagNo != 1) {
                        throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(27122))));
                    }
                    this.maximum = ASN1Integer.getInstance(aSN1TaggedObject, false);
                    return;
                }
            }
            if (size != 3) {
                throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
            }
            ASN1TaggedObject aSN1TaggedObject2 = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
            if (aSN1TaggedObject2.getTagNo() != 0) {
                throw new IllegalArgumentException(a.l(aSN1TaggedObject2, new StringBuilder(StubApp.getString2(27791))));
            }
            this.minimum = ASN1Integer.getInstance(aSN1TaggedObject2, false);
            ASN1TaggedObject aSN1TaggedObject3 = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2));
            if (aSN1TaggedObject3.getTagNo() != 1) {
                throw new IllegalArgumentException(a.l(aSN1TaggedObject3, new StringBuilder(StubApp.getString2(27790))));
            }
            this.maximum = ASN1Integer.getInstance(aSN1TaggedObject3, false);
        }
    }

    public static GeneralSubtree getInstance(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof GeneralSubtree ? (GeneralSubtree) obj : new GeneralSubtree(ASN1Sequence.getInstance(obj));
    }

    public GeneralName getBase() {
        return this.base;
    }

    public BigInteger getMaximum() {
        ASN1Integer aSN1Integer = this.maximum;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getValue();
    }

    public BigInteger getMinimum() {
        ASN1Integer aSN1Integer = this.minimum;
        return aSN1Integer == null ? ZERO : aSN1Integer.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.base);
        ASN1Integer aSN1Integer = this.minimum;
        if (aSN1Integer != null && !aSN1Integer.hasValue(0)) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) this.minimum));
        }
        ASN1Integer aSN1Integer2 = this.maximum;
        if (aSN1Integer2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) aSN1Integer2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static GeneralSubtree getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return new GeneralSubtree(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }

    public GeneralSubtree(GeneralName generalName) {
        this(generalName, null, null);
    }

    public GeneralSubtree(GeneralName generalName, BigInteger bigInteger, BigInteger bigInteger2) {
        this.base = generalName;
        if (bigInteger2 != null) {
            this.maximum = new ASN1Integer(bigInteger2);
        }
        this.minimum = bigInteger == null ? null : new ASN1Integer(bigInteger);
    }
}
