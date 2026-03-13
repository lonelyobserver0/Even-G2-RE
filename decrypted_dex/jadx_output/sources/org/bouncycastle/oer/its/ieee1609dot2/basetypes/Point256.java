package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Point256 extends ASN1Object {

    /* renamed from: x, reason: collision with root package name */
    private final ASN1OctetString f19323x;

    /* renamed from: y, reason: collision with root package name */
    private final ASN1OctetString f19324y;

    public static class Builder {

        /* renamed from: x, reason: collision with root package name */
        private ASN1OctetString f19325x;

        /* renamed from: y, reason: collision with root package name */
        private ASN1OctetString f19326y;

        public Point256 createPoint256() {
            return new Point256(this.f19325x, this.f19326y);
        }

        public Builder setX(BigInteger bigInteger) {
            return setX(BigIntegers.asUnsignedByteArray(32, bigInteger));
        }

        public Builder setY(BigInteger bigInteger) {
            return setY(BigIntegers.asUnsignedByteArray(32, bigInteger));
        }

        public Builder setX(ASN1OctetString aSN1OctetString) {
            this.f19325x = aSN1OctetString;
            return this;
        }

        public Builder setY(ASN1OctetString aSN1OctetString) {
            this.f19326y = aSN1OctetString;
            return this;
        }

        public Builder setX(byte[] bArr) {
            this.f19325x = new DEROctetString(bArr);
            return this;
        }

        public Builder setY(byte[] bArr) {
            this.f19326y = new DEROctetString(bArr);
            return this;
        }
    }

    public Point256(ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        if (aSN1OctetString == null || aSN1OctetString.getOctets().length != 32) {
            throw new IllegalArgumentException(StubApp.getString2(33220));
        }
        if (aSN1OctetString2 == null || aSN1OctetString2.getOctets().length != 32) {
            throw new IllegalArgumentException(StubApp.getString2(33219));
        }
        this.f19323x = aSN1OctetString;
        this.f19324y = aSN1OctetString2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Point256 getInstance(Object obj) {
        if (obj instanceof Point256) {
            return (Point256) obj;
        }
        if (obj != null) {
            return new Point256(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getX() {
        return this.f19323x;
    }

    public ASN1OctetString getY() {
        return this.f19324y;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.f19323x, this.f19324y});
    }

    private Point256(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(StubApp.getString2(26892));
        }
        ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        this.f19323x = aSN1OctetString;
        ASN1OctetString aSN1OctetString2 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
        this.f19324y = aSN1OctetString2;
        if (aSN1OctetString.getOctets().length != 32) {
            throw new IllegalArgumentException(StubApp.getString2(33220));
        }
        if (aSN1OctetString2.getOctets().length != 32) {
            throw new IllegalArgumentException(StubApp.getString2(33219));
        }
    }
}
