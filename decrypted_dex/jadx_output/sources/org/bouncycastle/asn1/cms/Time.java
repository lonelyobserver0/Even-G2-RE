package org.bouncycastle.asn1.cms;

import E1.a;
import com.stub.StubApp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERUTCTime;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Time extends ASN1Object implements ASN1Choice {
    ASN1Primitive time;

    public Time(Date date) {
        String string2 = StubApp.getString2(4928);
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, string2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(26750));
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + string2;
        int parseInt = Integer.parseInt(str.substring(0, 4));
        this.time = (parseInt < 1950 || parseInt > 2049) ? new DERGeneralizedTime(str) : new DERUTCTime(str.substring(2));
    }

    public static Time getInstance(Object obj) {
        if (obj == null || (obj instanceof Time)) {
            return (Time) obj;
        }
        if (obj instanceof ASN1UTCTime) {
            return new Time((ASN1UTCTime) obj);
        }
        if (obj instanceof ASN1GeneralizedTime) {
            return new Time((ASN1GeneralizedTime) obj);
        }
        throw new IllegalArgumentException(a.h(obj, StubApp.getString2(26925)));
    }

    public Date getDate() {
        try {
            ASN1Primitive aSN1Primitive = this.time;
            return aSN1Primitive instanceof ASN1UTCTime ? ((ASN1UTCTime) aSN1Primitive).getAdjustedDate() : ((ASN1GeneralizedTime) aSN1Primitive).getDate();
        } catch (ParseException e10) {
            throw new IllegalStateException(StubApp.getString2(26738) + e10.getMessage());
        }
    }

    public String getTime() {
        ASN1Primitive aSN1Primitive = this.time;
        return aSN1Primitive instanceof ASN1UTCTime ? ((ASN1UTCTime) aSN1Primitive).getAdjustedTime() : ((ASN1GeneralizedTime) aSN1Primitive).getTime();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.time;
    }

    public Time(Date date, Locale locale) {
        String string2 = StubApp.getString2(4928);
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, string2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(26750), locale);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + string2;
        int parseInt = Integer.parseInt(str.substring(0, 4));
        this.time = (parseInt < 1950 || parseInt > 2049) ? new DERGeneralizedTime(str) : new DERUTCTime(str.substring(2));
    }

    private Time(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1UTCTime) && !(aSN1Primitive instanceof ASN1GeneralizedTime)) {
            throw new IllegalArgumentException(StubApp.getString2(26934));
        }
        this.time = aSN1Primitive;
    }

    public static Time getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(aSN1TaggedObject.getObject());
    }
}
