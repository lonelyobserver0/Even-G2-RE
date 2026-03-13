package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ASN1UTCTime extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1UTCTime.class, 23) { // from class: org.bouncycastle.asn1.ASN1UTCTime.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1UTCTime.createPrimitive(dEROctetString.getOctets());
        }
    };
    final byte[] contents;

    public ASN1UTCTime(String str) {
        this.contents = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e10) {
            throw new IllegalArgumentException(StubApp.getString2(26738) + e10.getMessage());
        }
    }

    public static ASN1UTCTime createPrimitive(byte[] bArr) {
        return new ASN1UTCTime(bArr);
    }

    public static ASN1UTCTime getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1UTCTime)) {
            return (ASN1UTCTime) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1UTCTime) {
                return (ASN1UTCTime) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return (ASN1UTCTime) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder(StubApp.getString2(26707))));
        }
    }

    private boolean isDigit(int i3) {
        byte b2;
        byte[] bArr = this.contents;
        return bArr.length > i3 && (b2 = bArr[i3]) >= 48 && b2 <= 57;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1UTCTime) {
            return Arrays.areEqual(this.contents, ((ASN1UTCTime) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        aSN1OutputStream.writeEncodingDL(z2, 23, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, this.contents.length);
    }

    public Date getAdjustedDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(26743));
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, StubApp.getString2(4928)));
        return DateUtil.epochAdjust(simpleDateFormat.parse(getAdjustedTime()));
    }

    public String getAdjustedTime() {
        String time = getTime();
        return (time.charAt(0) < '5' ? StubApp.getString2(17329) : StubApp.getString2(26824)).concat(time);
    }

    public Date getDate() throws ParseException {
        return DateUtil.epochAdjust(new SimpleDateFormat(StubApp.getString2(26825)).parse(getTime()));
    }

    public String getTime() {
        StringBuilder sb2;
        String substring;
        String fromByteArray = Strings.fromByteArray(this.contents);
        if (fromByteArray.indexOf(45) >= 0 || fromByteArray.indexOf(43) >= 0) {
            int indexOf = fromByteArray.indexOf(45);
            if (indexOf < 0) {
                indexOf = fromByteArray.indexOf(43);
            }
            if (indexOf == fromByteArray.length() - 3) {
                fromByteArray = fromByteArray.concat(StubApp.getString2(1720));
            }
            String string2 = StubApp.getString2(478);
            if (indexOf == 10) {
                sb2 = new StringBuilder();
                sb2.append(fromByteArray.substring(0, 10));
                sb2.append(StubApp.getString2(26827));
                sb2.append(fromByteArray.substring(10, 13));
                sb2.append(string2);
                substring = fromByteArray.substring(13, 15);
            } else {
                sb2 = new StringBuilder();
                sb2.append(fromByteArray.substring(0, 12));
                sb2.append(StubApp.getString2(22649));
                sb2.append(fromByteArray.substring(12, 15));
                sb2.append(string2);
                substring = fromByteArray.substring(15, 17);
            }
        } else if (fromByteArray.length() == 11) {
            sb2 = new StringBuilder();
            sb2.append(fromByteArray.substring(0, 10));
            substring = StubApp.getString2(26826);
        } else {
            sb2 = new StringBuilder();
            sb2.append(fromByteArray.substring(0, 12));
            substring = StubApp.getString2(26753);
        }
        sb2.append(substring);
        return sb2.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return Strings.fromByteArray(this.contents);
    }

    public ASN1UTCTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(26821), DateUtil.EN_Locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, StubApp.getString2(4928)));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(26821), locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, StubApp.getString2(4928)));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException(StubApp.getString2(26823));
        }
        this.contents = bArr;
        if (!isDigit(0) || !isDigit(1)) {
            throw new IllegalArgumentException(StubApp.getString2(26822));
        }
    }

    public static ASN1UTCTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1UTCTime) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }
}
