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
public class Point384 extends ASN1Object {

    /* renamed from: x, reason: collision with root package name */
    private final ASN1OctetString f19327x;

    /* renamed from: y, reason: collision with root package name */
    private final ASN1OctetString f19328y;

    public static class Builder {

        /* renamed from: x, reason: collision with root package name */
        private ASN1OctetString f19329x;

        /* renamed from: y, reason: collision with root package name */
        private ASN1OctetString f19330y;

        public Point384 createPoint384() {
            return new Point384(this.f19329x, this.f19330y);
        }

        public Builder setX(BigInteger bigInteger) {
            this.f19329x = new DEROctetString(BigIntegers.asUnsignedByteArray(48, bigInteger));
            return this;
        }

        public Builder setY(BigInteger bigInteger) {
            this.f19330y = new DEROctetString(BigIntegers.asUnsignedByteArray(48, bigInteger));
            return this;
        }

        public Builder setX(ASN1OctetString aSN1OctetString) {
            this.f19329x = aSN1OctetString;
            return this;
        }

        public Builder setY(ASN1OctetString aSN1OctetString) {
            this.f19330y = aSN1OctetString;
            return this;
        }

        public Builder setX(byte[] bArr) {
            this.f19329x = new DEROctetString(bArr);
            return this;
        }

        public Builder setY(byte[] bArr) {
            this.f19330y = new DEROctetString(bArr);
            return this;
        }
    }

    public Point384(ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        if (aSN1OctetString.getOctets().length != 48) {
            throw new IllegalArgumentException(StubApp.getString2(33222));
        }
        if (aSN1OctetString2.getOctets().length != 48) {
            throw new IllegalArgumentException(StubApp.getString2(33221));
        }
        this.f19327x = aSN1OctetString;
        this.f19328y = aSN1OctetString2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Point384 getInstance(Object obj) {
        if (obj instanceof Point384) {
            return (Point384) obj;
        }
        if (obj != null) {
            return new Point384(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getX() {
        return this.f19327x;
    }

    public ASN1OctetString getY() {
        return this.f19328y;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.f19327x, this.f19328y});
    }

    private Point384(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(StubApp.getString2(26892));
        }
        ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        this.f19327x = aSN1OctetString;
        ASN1OctetString aSN1OctetString2 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
        this.f19328y = aSN1OctetString2;
        if (aSN1OctetString.getOctets().length != 48) {
            throw new IllegalArgumentException(StubApp.getString2(33222));
        }
        if (aSN1OctetString2.getOctets().length != 48) {
            throw new IllegalArgumentException(StubApp.getString2(33221));
        }
    }
}
