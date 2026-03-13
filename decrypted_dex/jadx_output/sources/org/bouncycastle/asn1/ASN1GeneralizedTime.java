package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ASN1GeneralizedTime extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1GeneralizedTime.class, 24) { // from class: org.bouncycastle.asn1.ASN1GeneralizedTime.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1GeneralizedTime.createPrimitive(dEROctetString.getOctets());
        }
    };
    final byte[] contents;

    public ASN1GeneralizedTime(String str) {
        this.contents = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e10) {
            throw new IllegalArgumentException(StubApp.getString2(26738) + e10.getMessage());
        }
    }

    private SimpleDateFormat calculateGMTDateFormat() {
        SimpleDateFormat simpleDateFormat = hasFractionalSeconds() ? new SimpleDateFormat(StubApp.getString2(26742)) : hasSeconds() ? new SimpleDateFormat(StubApp.getString2(26743)) : hasMinutes() ? new SimpleDateFormat(StubApp.getString2(26744)) : new SimpleDateFormat(StubApp.getString2(26745));
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, StubApp.getString2(4928)));
        return simpleDateFormat;
    }

    private String calculateGMTOffset(String str) {
        String str2;
        String string2 = StubApp.getString2(478);
        String string22 = StubApp.getString2(22649);
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        Object string23 = StubApp.getString2(4966);
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str2 = StubApp.getString2(999);
        } else {
            str2 = string23;
        }
        int i3 = rawOffset / 3600000;
        int i10 = (rawOffset - (3600000 * i3)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (hasFractionalSeconds()) {
                    str = pruneFractionalSeconds(str);
                }
                if (timeZone.inDaylightTime(calculateGMTDateFormat().parse(str + string22 + str2 + convert(i3) + string2 + convert(i10)))) {
                    i3 += str2.equals(string23) ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        return string22 + str2 + convert(i3) + string2 + convert(i10);
    }

    private String convert(int i3) {
        return i3 < 10 ? u.p(i3, StubApp.getString2(824)) : Integer.toString(i3);
    }

    public static ASN1GeneralizedTime createPrimitive(byte[] bArr) {
        return new ASN1GeneralizedTime(bArr);
    }

    public static ASN1GeneralizedTime getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1GeneralizedTime)) {
            return (ASN1GeneralizedTime) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1GeneralizedTime) {
                return (ASN1GeneralizedTime) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return (ASN1GeneralizedTime) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder(StubApp.getString2(26707))));
        }
    }

    private boolean isDigit(int i3) {
        byte b2;
        byte[] bArr = this.contents;
        return bArr.length > i3 && (b2 = bArr[i3]) >= 48 && b2 <= 57;
    }

    private String pruneFractionalSeconds(String str) {
        String str2;
        StringBuilder sb2;
        char charAt;
        String substring = str.substring(14);
        int i3 = 1;
        while (i3 < substring.length() && '0' <= (charAt = substring.charAt(i3)) && charAt <= '9') {
            i3++;
        }
        int i10 = i3 - 1;
        if (i10 > 3) {
            str2 = substring.substring(0, 4) + substring.substring(i3);
            sb2 = new StringBuilder();
        } else if (i10 == 1) {
            str2 = substring.substring(0, i3) + StubApp.getString2(1720) + substring.substring(i3);
            sb2 = new StringBuilder();
        } else {
            if (i10 != 2) {
                return str;
            }
            str2 = substring.substring(0, i3) + StubApp.getString2(824) + substring.substring(i3);
            sb2 = new StringBuilder();
        }
        sb2.append(str.substring(0, 14));
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            return Arrays.areEqual(this.contents, ((ASN1GeneralizedTime) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        aSN1OutputStream.writeEncodingDL(z2, 24, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, this.contents.length);
    }

    public Date getDate() throws ParseException {
        SimpleDateFormat calculateGMTDateFormat;
        String fromByteArray = Strings.fromByteArray(this.contents);
        String string2 = StubApp.getString2(4928);
        if (fromByteArray.endsWith(string2)) {
            calculateGMTDateFormat = hasFractionalSeconds() ? new SimpleDateFormat(StubApp.getString2(26746)) : hasSeconds() ? new SimpleDateFormat(StubApp.getString2(26739)) : hasMinutes() ? new SimpleDateFormat(StubApp.getString2(26747)) : new SimpleDateFormat(StubApp.getString2(26748));
            calculateGMTDateFormat.setTimeZone(new SimpleTimeZone(0, string2));
        } else if (fromByteArray.indexOf(45) > 0 || fromByteArray.indexOf(43) > 0) {
            fromByteArray = getTime();
            calculateGMTDateFormat = calculateGMTDateFormat();
        } else {
            calculateGMTDateFormat = hasFractionalSeconds() ? new SimpleDateFormat(StubApp.getString2(26749)) : hasSeconds() ? new SimpleDateFormat(StubApp.getString2(26750)) : hasMinutes() ? new SimpleDateFormat(StubApp.getString2(26751)) : new SimpleDateFormat(StubApp.getString2(26752));
            calculateGMTDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (hasFractionalSeconds()) {
            fromByteArray = pruneFractionalSeconds(fromByteArray);
        }
        return DateUtil.epochAdjust(calculateGMTDateFormat.parse(fromByteArray));
    }

    public String getTime() {
        String fromByteArray = Strings.fromByteArray(this.contents);
        if (fromByteArray.charAt(fromByteArray.length() - 1) == 'Z') {
            return fromByteArray.substring(0, fromByteArray.length() - 1) + StubApp.getString2(26753);
        }
        int length = fromByteArray.length();
        char charAt = fromByteArray.charAt(length - 6);
        String string2 = StubApp.getString2(22649);
        if ((charAt == '-' || charAt == '+') && fromByteArray.indexOf(string2) == length - 9) {
            return fromByteArray;
        }
        int length2 = fromByteArray.length();
        int i3 = length2 - 5;
        char charAt2 = fromByteArray.charAt(i3);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fromByteArray.substring(0, i3));
            sb2.append(string2);
            int i10 = length2 - 2;
            sb2.append(fromByteArray.substring(i3, i10));
            sb2.append(StubApp.getString2(478));
            sb2.append(fromByteArray.substring(i10));
            return sb2.toString();
        }
        int length3 = fromByteArray.length() - 3;
        char charAt3 = fromByteArray.charAt(length3);
        if (charAt3 != '-' && charAt3 != '+') {
            StringBuilder b2 = AbstractC1856e.b(fromByteArray);
            b2.append(calculateGMTOffset(fromByteArray));
            return b2.toString();
        }
        return fromByteArray.substring(0, length3) + string2 + fromByteArray.substring(length3) + StubApp.getString2(26754);
    }

    public String getTimeString() {
        return Strings.fromByteArray(this.contents);
    }

    public boolean hasFractionalSeconds() {
        int i3 = 0;
        while (true) {
            byte[] bArr = this.contents;
            if (i3 == bArr.length) {
                return false;
            }
            if (bArr[i3] == 46 && i3 == 14) {
                return true;
            }
            i3++;
        }
    }

    public boolean hasMinutes() {
        return isDigit(10) && isDigit(11);
    }

    public boolean hasSeconds() {
        return isDigit(12) && isDigit(13);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERGeneralizedTime(this.contents);
    }

    public ASN1GeneralizedTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(26739), DateUtil.EN_Locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, StubApp.getString2(4928)));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1GeneralizedTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(26739), locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, StubApp.getString2(4928)));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1GeneralizedTime(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException(StubApp.getString2(26741));
        }
        this.contents = bArr;
        if (!isDigit(0) || !isDigit(1) || !isDigit(2) || !isDigit(3)) {
            throw new IllegalArgumentException(StubApp.getString2(26740));
        }
    }

    public static ASN1GeneralizedTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1GeneralizedTime) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }
}
