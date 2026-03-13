package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GeographicRegion extends ASN1Object implements ASN1Choice {
    public static final int circularRegion = 0;
    public static final int identifiedRegion = 3;
    public static final int polygonalRegion = 2;
    public static final int rectangularRegion = 1;
    private final int choice;
    private final ASN1Encodable geographicRegion;

    public GeographicRegion(int i3, ASN1Encodable aSN1Encodable) {
        this.choice = i3;
        this.geographicRegion = aSN1Encodable;
    }

    public static GeographicRegion circularRegion(CircularRegion circularRegion2) {
        return new GeographicRegion(0, circularRegion2);
    }

    public static GeographicRegion getInstance(Object obj) {
        if (obj instanceof GeographicRegion) {
            return (GeographicRegion) obj;
        }
        if (obj != null) {
            return new GeographicRegion(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public static GeographicRegion identifiedRegion(SequenceOfIdentifiedRegion sequenceOfIdentifiedRegion) {
        return new GeographicRegion(3, sequenceOfIdentifiedRegion);
    }

    public static GeographicRegion polygonalRegion(PolygonalRegion polygonalRegion2) {
        return new GeographicRegion(2, polygonalRegion2);
    }

    public static GeographicRegion rectangularRegion(SequenceOfRectangularRegion sequenceOfRectangularRegion) {
        return new GeographicRegion(1, sequenceOfRectangularRegion);
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getGeographicRegion() {
        return this.geographicRegion;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.geographicRegion);
    }

    private GeographicRegion(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo == 0) {
            this.geographicRegion = CircularRegion.getInstance(aSN1TaggedObject.getObject());
            return;
        }
        if (tagNo == 1) {
            this.geographicRegion = SequenceOfRectangularRegion.getInstance(aSN1TaggedObject.getObject());
        } else if (tagNo == 2) {
            this.geographicRegion = PolygonalRegion.getInstance(aSN1TaggedObject.getObject());
        } else {
            if (tagNo != 3) {
                throw new IllegalArgumentException(u.p(tagNo, StubApp.getString2(33172)));
            }
            this.geographicRegion = SequenceOfIdentifiedRegion.getInstance(aSN1TaggedObject.getObject());
        }
    }
}
