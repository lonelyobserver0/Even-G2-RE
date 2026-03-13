package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.Opaque;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ServiceSpecificPermissions extends ASN1Object implements ASN1Choice {
    public static final int bitmapSsp = 1;
    public static final int opaque = 0;
    private final int choice;
    private final ASN1Encodable serviceSpecificPermissions;

    public ServiceSpecificPermissions(int i3, ASN1Encodable aSN1Encodable) {
        this.choice = i3;
        this.serviceSpecificPermissions = aSN1Encodable;
    }

    public static ServiceSpecificPermissions bitmapSsp(BitmapSsp bitmapSsp2) {
        return new ServiceSpecificPermissions(1, bitmapSsp2);
    }

    public static ServiceSpecificPermissions getInstance(Object obj) {
        if (obj instanceof ServiceSpecificPermissions) {
            return (ServiceSpecificPermissions) obj;
        }
        if (obj != null) {
            return new ServiceSpecificPermissions(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public static ServiceSpecificPermissions opaque(ASN1OctetString aSN1OctetString) {
        return new ServiceSpecificPermissions(0, aSN1OctetString);
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getServiceSpecificPermissions() {
        return this.serviceSpecificPermissions;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.serviceSpecificPermissions);
    }

    private ServiceSpecificPermissions(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo == 0) {
            this.serviceSpecificPermissions = Opaque.getInstance(aSN1TaggedObject.getObject());
        } else {
            if (tagNo != 1) {
                throw new IllegalArgumentException(u.p(tagNo, StubApp.getString2(33172)));
            }
            this.serviceSpecificPermissions = BitmapSsp.getInstance(aSN1TaggedObject.getObject());
        }
    }

    public static ServiceSpecificPermissions opaque(byte[] bArr) {
        return new ServiceSpecificPermissions(0, new DEROctetString(bArr));
    }
}
