package org.bouncycastle.oer.its.etsi102941.basetypes;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataEncrypted;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataSignedExternalPayload;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EcSignature extends ASN1Object implements ASN1Choice {
    public static final int ecSignature = 1;
    public static final int encryptedEcSignature = 0;
    private final ASN1Encodable _ecSignature;
    private final int choice;

    public EcSignature(int i3, ASN1Encodable aSN1Encodable) {
        this.choice = i3;
        this._ecSignature = aSN1Encodable;
    }

    public static EcSignature getInstance(Object obj) {
        if (obj instanceof EcSignature) {
            return (EcSignature) obj;
        }
        if (obj != null) {
            return new EcSignature(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getEcSignature() {
        return this._ecSignature;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this._ecSignature);
    }

    private EcSignature(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo == 0) {
            this._ecSignature = EtsiTs103097DataEncrypted.getInstance((Object) aSN1TaggedObject.getObject());
        } else {
            if (tagNo != 1) {
                throw new IllegalArgumentException(u.p(tagNo, StubApp.getString2(33172)));
            }
            this._ecSignature = EtsiTs103097DataSignedExternalPayload.getInstance((Object) aSN1TaggedObject.getObject());
        }
    }
}
