package D0;

import H0.A;
import H0.B;
import M4.I;
import com.google.protobuf.C0750u;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import o0.C1406C;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f1244a;

    /* renamed from: b, reason: collision with root package name */
    public long f1245b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1246c;

    public g(C0750u c0750u) {
        c0750u.getClass();
    }

    public static byte[] b(byte b2, DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b2, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte readByte = dataInputStream.readByte();
            bArr[1] = readByte;
            byteArrayOutputStream.write(readByte);
        }
    }

    public I a(byte[] bArr) {
        long j;
        AbstractC1550k.c(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
        String str = new String(bArr, 0, bArr.length - 2, A.f2463g);
        ArrayList arrayList = (ArrayList) this.f1246c;
        arrayList.add(str);
        int i3 = this.f1244a;
        if (i3 == 1) {
            if (!B.f2470a.matcher(str).matches() && !B.f2471b.matcher(str).matches()) {
                return null;
            }
            this.f1244a = 2;
            return null;
        }
        if (i3 != 2) {
            throw new IllegalStateException();
        }
        try {
            Matcher matcher = B.f2472c.matcher(str);
            if (matcher.find()) {
                String group = matcher.group(1);
                group.getClass();
                j = Long.parseLong(group);
            } else {
                j = -1;
            }
            if (j != -1) {
                this.f1245b = j;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f1245b > 0) {
                this.f1244a = 3;
                return null;
            }
            I m4 = I.m(arrayList);
            arrayList.clear();
            this.f1244a = 1;
            this.f1245b = 0L;
            return m4;
        } catch (NumberFormatException e10) {
            throw C1406C.b(str, e10);
        }
    }

    public g(int i3, URL url, long j) {
        this.f1244a = i3;
        this.f1246c = url;
        this.f1245b = j;
    }
}
