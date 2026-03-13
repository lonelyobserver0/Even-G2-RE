package oa;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class q extends AbstractC1469b {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f18639b = Boolean.getBoolean(StubApp.getString2(22057));

    /* renamed from: a, reason: collision with root package name */
    public byte[] f18640a;

    public q(String str) {
        for (char c10 : str.toCharArray()) {
            if (!r.f18642b.containsKey(Character.valueOf(c10))) {
                byte[] bytes = str.getBytes(Ia.a.f3239b);
                byte[] bArr = new byte[bytes.length + 2];
                this.f18640a = bArr;
                bArr[0] = -2;
                bArr[1] = -1;
                System.arraycopy(bytes, 0, bArr, 2, bytes.length);
                return;
            }
        }
        int[] iArr = r.f18641a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (char c11 : str.toCharArray()) {
            Integer num = (Integer) r.f18642b.get(Character.valueOf(c11));
            if (num == null) {
                byteArrayOutputStream.write(0);
            } else {
                byteArrayOutputStream.write(num.intValue());
            }
        }
        this.f18640a = byteArrayOutputStream.toByteArray();
    }

    public final String a() {
        byte[] bArr = this.f18640a;
        if (bArr.length >= 2) {
            byte b2 = bArr[0];
            if ((b2 & UByte.MAX_VALUE) == 254 && (bArr[1] & UByte.MAX_VALUE) == 255) {
                return new String(bArr, 2, bArr.length - 2, Ia.a.f3239b);
            }
            if ((b2 & UByte.MAX_VALUE) == 255 && (bArr[1] & UByte.MAX_VALUE) == 254) {
                return new String(bArr, 2, bArr.length - 2, Ia.a.f3240c);
            }
        }
        int[] iArr = r.f18641a;
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            int i3 = b10 & UByte.MAX_VALUE;
            if (i3 >= 256) {
                sb2.append('?');
            } else {
                sb2.append((char) r.f18641a[i3]);
            }
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && a().equals(((q) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18640a);
    }

    public final String toString() {
        return StubApp.getString2(22058) + a() + StubApp.getString2(265);
    }

    public q(byte[] bArr) {
        this.f18640a = (byte[]) bArr.clone();
    }
}
