package org.bouncycastle.oer.its.ieee1609dot2;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HashedData extends ASN1Object implements ASN1Choice {
    public static final int reserved = 2;
    public static final int sha256HashedData = 0;
    public static final int sha384HashedData = 1;
    private final int choice;
    private final ASN1Encodable hashedData;

    public HashedData(int i3, ASN1Encodable aSN1Encodable) {
        this.choice = i3;
        this.hashedData = aSN1Encodable;
    }

    public static HashedData getInstance(Object obj) {
        if (obj instanceof HashedData) {
            return (HashedData) obj;
        }
        if (obj != null) {
            return new HashedData(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public static HashedData reserved(ASN1OctetString aSN1OctetString) {
        return new HashedData(2, aSN1OctetString);
    }

    public static HashedData sha256HashedData(ASN1OctetString aSN1OctetString) {
        return new HashedData(0, aSN1OctetString);
    }

    public static HashedData sha384HashedData(ASN1OctetString aSN1OctetString) {
        return new HashedData(1, aSN1OctetString);
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getHashedData() {
        return this.hashedData;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.hashedData);
    }

    private HashedData(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo != 0 && tagNo != 1 && tagNo != 2) {
            throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(33172))));
        }
        this.choice = aSN1TaggedObject.getTagNo();
        this.hashedData = ASN1OctetString.getInstance(aSN1TaggedObject.getObject());
    }

    public static HashedData reserved(byte[] bArr) {
        return new HashedData(2, new DEROctetString(Arrays.clone(bArr)));
    }

    public static HashedData sha256HashedData(byte[] bArr) {
        return new HashedData(0, new DEROctetString(Arrays.clone(bArr)));
    }

    public static HashedData sha384HashedData(byte[] bArr) {
        return new HashedData(1, new DEROctetString(Arrays.clone(bArr)));
    }
}
