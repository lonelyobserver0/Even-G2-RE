package org.bouncycastle.asn1.eac;

import com.stub.StubApp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import kotlin.UByte;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PackedDate {
    private byte[] time;

    public PackedDate(String str) {
        this.time = convert(str);
    }

    private byte[] convert(String str) {
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[6];
        for (int i3 = 0; i3 != 6; i3++) {
            bArr[i3] = (byte) (charArray[i3] - '0');
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PackedDate) {
            return Arrays.areEqual(this.time, ((PackedDate) obj).time);
        }
        return false;
    }

    public Date getDate() throws ParseException {
        return new SimpleDateFormat(StubApp.getString2(9683)).parse(StubApp.getString2(17329) + toString());
    }

    public byte[] getEncoding() {
        return Arrays.clone(this.time);
    }

    public int hashCode() {
        return Arrays.hashCode(this.time);
    }

    public String toString() {
        int length = this.time.length;
        char[] cArr = new char[length];
        for (int i3 = 0; i3 != length; i3++) {
            cArr[i3] = (char) ((this.time[i3] & UByte.MAX_VALUE) + 48);
        }
        return new String(cArr);
    }

    public PackedDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(27094));
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, StubApp.getString2(4928)));
        this.time = convert(simpleDateFormat.format(date));
    }

    public PackedDate(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(27094), locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, StubApp.getString2(4928)));
        this.time = convert(simpleDateFormat.format(date));
    }

    public PackedDate(byte[] bArr) {
        this.time = bArr;
    }
}
