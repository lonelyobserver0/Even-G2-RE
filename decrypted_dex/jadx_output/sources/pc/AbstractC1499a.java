package pc;

import Xa.h;
import com.stub.StubApp;
import kotlin.UByte;

/* renamed from: pc.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public abstract class AbstractC1499a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f19808a = StubApp.getString2(3365).toCharArray();

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b2 = bArr[i3];
            int i10 = i3 * 3;
            int i11 = (b2 & UByte.MAX_VALUE) >>> 4;
            char[] cArr2 = f19808a;
            cArr[i10] = cArr2[i11];
            cArr[i10 + 1] = cArr2[b2 & 15];
            if (i3 != bArr.length - 1) {
                cArr[i10 + 2] = '-';
            }
        }
        return StubApp.getString2(26138).concat(new String(cArr));
    }

    public static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return StubApp.getString2(1116);
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b2 = bArr[i3];
            int i10 = i3 * 2;
            int i11 = (b2 & UByte.MAX_VALUE) >>> 4;
            char[] cArr2 = f19808a;
            cArr[i10] = cArr2[i11];
            cArr[i10 + 1] = cArr2[b2 & 15];
        }
        return StubApp.getString2(463).concat(new String(cArr));
    }

    public static String c(int i3) {
        switch (i3) {
            case 1:
                return StubApp.getString2(26309);
            case 2:
                return StubApp.getString2(26308);
            case 3:
                return StubApp.getString2(35297);
            case 4:
                return StubApp.getString2(26307);
            case 5:
                return StubApp.getString2(35296);
            case 6:
                return StubApp.getString2(35295);
            case 7:
                return StubApp.getString2(35294);
            default:
                return h.g(i3, StubApp.getString2(3049), StubApp.getString2(74));
        }
    }

    public static String d(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? h.g(i3, StubApp.getString2(3049), StubApp.getString2(74)) : StubApp.getString2(26307) : StubApp.getString2(26308) : StubApp.getString2(26309);
    }

    public static String e(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 4 ? h.g(i3, StubApp.getString2(3049), StubApp.getString2(74)) : StubApp.getString2(35298) : StubApp.getString2(35299) : StubApp.getString2(35300);
    }
}
