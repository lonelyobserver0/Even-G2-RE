package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Duration extends ASN1Object implements ASN1Choice {
    public static final int hours = 4;
    public static final int microseconds = 0;
    public static final int milliseconds = 1;
    public static final int minutes = 3;
    public static final int seconds = 2;
    public static final int sixtyHours = 5;
    public static final int years = 6;
    private final int choice;
    private final UINT16 duration;

    public Duration(int i3, UINT16 uint16) {
        this.choice = i3;
        this.duration = uint16;
    }

    public static Duration getInstance(Object obj) {
        if (obj instanceof Duration) {
            return (Duration) obj;
        }
        if (obj != null) {
            return new Duration(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public static Duration hours(UINT16 uint16) {
        return new Duration(4, uint16);
    }

    public static Duration microseconds(UINT16 uint16) {
        return new Duration(0, uint16);
    }

    public static Duration milliseconds(UINT16 uint16) {
        return new Duration(1, uint16);
    }

    public static Duration minutes(UINT16 uint16) {
        return new Duration(3, uint16);
    }

    public static Duration seconds(UINT16 uint16) {
        return new Duration(2, uint16);
    }

    public static Duration sixtyHours(UINT16 uint16) {
        return new Duration(5, uint16);
    }

    public static Duration years(UINT16 uint16) {
        return new Duration(6, uint16);
    }

    public int getChoice() {
        return this.choice;
    }

    public UINT16 getDuration() {
        return this.duration;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.duration);
    }

    public String toString() {
        StringBuilder sb2;
        String string2;
        switch (this.choice) {
            case 0:
                sb2 = new StringBuilder();
                sb2.append(this.duration.value);
                string2 = StubApp.getString2(33196);
                break;
            case 1:
                sb2 = new StringBuilder();
                sb2.append(this.duration.value);
                string2 = StubApp.getString2(33195);
                break;
            case 2:
                sb2 = new StringBuilder();
                sb2.append(this.duration.value);
                string2 = StubApp.getString2(33194);
                break;
            case 3:
                sb2 = new StringBuilder();
                sb2.append(this.duration.value);
                string2 = StubApp.getString2(33193);
                break;
            case 4:
                sb2 = new StringBuilder();
                sb2.append(this.duration.value);
                string2 = StubApp.getString2(33192);
                break;
            case 5:
                sb2 = new StringBuilder();
                sb2.append(this.duration.value);
                string2 = StubApp.getString2(33191);
                break;
            case 6:
                sb2 = new StringBuilder();
                sb2.append(this.duration.value);
                string2 = StubApp.getString2(33190);
                break;
            default:
                sb2 = new StringBuilder();
                sb2.append(this.duration.value);
                string2 = StubApp.getString2(33189);
                break;
        }
        sb2.append(string2);
        return sb2.toString();
    }

    private Duration(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        switch (tagNo) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                try {
                    this.duration = UINT16.getInstance(aSN1TaggedObject.getObject());
                    return;
                } catch (Exception e10) {
                    throw new IllegalStateException(e10.getMessage(), e10);
                }
            default:
                throw new IllegalArgumentException(u.p(tagNo, StubApp.getString2(33172)));
        }
    }
}
