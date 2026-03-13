package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EccP384CurvePoint extends EccCurvePoint implements ASN1Choice {
    public static final int compressedY0 = 2;
    public static final int compressedY1 = 3;
    public static final int fill = 1;
    public static final int uncompressedP384 = 4;
    public static final int xonly = 0;
    private final int choice;
    private final ASN1Encodable eccP384CurvePoint;

    public EccP384CurvePoint(int i3, ASN1Encodable aSN1Encodable) {
        this.choice = i3;
        this.eccP384CurvePoint = aSN1Encodable;
    }

    public static EccP384CurvePoint compressedY0(ASN1OctetString aSN1OctetString) {
        return new EccP384CurvePoint(2, aSN1OctetString);
    }

    public static EccP384CurvePoint compressedY1(ASN1OctetString aSN1OctetString) {
        return new EccP384CurvePoint(3, aSN1OctetString);
    }

    public static EccP384CurvePoint fill() {
        return new EccP384CurvePoint(1, DERNull.INSTANCE);
    }

    public static EccP384CurvePoint getInstance(Object obj) {
        if (obj instanceof EccP384CurvePoint) {
            return (EccP384CurvePoint) obj;
        }
        if (obj != null) {
            return new EccP384CurvePoint(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public static EccP384CurvePoint uncompressedP384(Point384 point384) {
        return new EccP384CurvePoint(4, point384);
    }

    public static EccP384CurvePoint xOnly(ASN1OctetString aSN1OctetString) {
        return new EccP384CurvePoint(0, aSN1OctetString);
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getEccP384CurvePoint() {
        return this.eccP384CurvePoint;
    }

    @Override // org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccCurvePoint
    public byte[] getEncodedPoint() {
        int i3 = this.choice;
        if (i3 == 0) {
            throw new IllegalStateException(StubApp.getString2(33199));
        }
        if (i3 == 2) {
            byte[] octets = ASN1OctetString.getInstance(this.eccP384CurvePoint).getOctets();
            byte[] bArr = new byte[octets.length + 1];
            bArr[0] = 2;
            System.arraycopy(octets, 0, bArr, 1, octets.length);
            return bArr;
        }
        if (i3 != 3) {
            if (i3 != 4) {
                throw new IllegalStateException(StubApp.getString2(33198));
            }
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(this.eccP384CurvePoint);
            return Arrays.concatenate(new byte[]{4}, a.D(aSN1Sequence, 0), a.D(aSN1Sequence, 1));
        }
        byte[] octets2 = ASN1OctetString.getInstance(this.eccP384CurvePoint).getOctets();
        byte[] bArr2 = new byte[octets2.length + 1];
        bArr2[0] = 3;
        System.arraycopy(octets2, 0, bArr2, 1, octets2.length);
        return bArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.eccP384CurvePoint);
    }

    private EccP384CurvePoint(ASN1TaggedObject aSN1TaggedObject) {
        this.choice = aSN1TaggedObject.getTagNo();
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo != 0) {
            if (tagNo == 1) {
                this.eccP384CurvePoint = ASN1Null.getInstance(aSN1TaggedObject.getObject());
                return;
            } else if (tagNo != 2 && tagNo != 3) {
                if (tagNo != 4) {
                    throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(33172))));
                }
                this.eccP384CurvePoint = ASN1Sequence.getInstance(aSN1TaggedObject.getObject());
                return;
            }
        }
        this.eccP384CurvePoint = ASN1OctetString.getInstance(aSN1TaggedObject.getObject());
    }

    public static EccP384CurvePoint compressedY0(byte[] bArr) {
        return new EccP384CurvePoint(2, new DEROctetString(Arrays.clone(bArr)));
    }

    public static EccP384CurvePoint compressedY1(byte[] bArr) {
        return new EccP384CurvePoint(3, new DEROctetString(Arrays.clone(bArr)));
    }

    public static EccP384CurvePoint xOnly(byte[] bArr) {
        return new EccP384CurvePoint(0, new DEROctetString(Arrays.clone(bArr)));
    }
}
