package r0;

import android.media.MediaFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.stub.StubApp;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p0.AbstractC1482f;

/* renamed from: r0.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1550k {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f20165a = new Object();

    public static String a(String str, Throwable th) {
        String replace;
        if (th != null) {
            synchronized (f20165a) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace(StubApp.getString2("4946"), StubApp.getString2("6147"));
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = StubApp.getString2("22532");
                        } else {
                            th2 = th2.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder n10 = AbstractC1482f.n(str, StubApp.getString2(22533));
        n10.append(replace.replace(StubApp.getString2(3692), StubApp.getString2(22533)));
        n10.append('\n');
        return n10.toString();
    }

    public static void b(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void c(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(String str, boolean z2) {
        if (!z2) {
            throw new C1544e(str);
        }
    }

    public static void e(int i3, int i10) {
        if (i3 < 0 || i3 >= i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void f(String str, boolean z2) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void g(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static void j(String str, String str2) {
        synchronized (f20165a) {
            Log.d(str, a(str2, null));
        }
    }

    public static void k(String str, String str2) {
        synchronized (f20165a) {
            Log.e(str, a(str2, null));
        }
    }

    public static void l(String str, String str2, Throwable th) {
        synchronized (f20165a) {
            Log.e(str, a(str2, th));
        }
    }

    public static String m(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i3 = 0; i3 < attributeCount; i3++) {
            if (xmlPullParser.getAttributeName(i3).equals(str)) {
                return xmlPullParser.getAttributeValue(i3);
            }
        }
        return null;
    }

    public static int[] n(String str) {
        int i3;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i10 = indexOf4 + 2;
        if (i10 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i10) == '/') {
            i3 = str.indexOf(47, indexOf4 + 3);
            if (i3 == -1 || i3 > indexOf2) {
                i3 = indexOf2;
            }
        } else {
            i3 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i3;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void o(String str, String str2) {
        synchronized (f20165a) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean p(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean q(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void r(MediaFormat mediaFormat, String str, int i3) {
        if (i3 != -1) {
            mediaFormat.setInteger(str, i3);
        }
    }

    public static String s(StringBuilder sb2, int i3, int i10) {
        int i11;
        int i12;
        if (i3 >= i10) {
            return sb2.toString();
        }
        if (sb2.charAt(i3) == '/') {
            i3++;
        }
        int i13 = i3;
        int i14 = i13;
        while (i13 <= i10) {
            if (i13 == i10) {
                i11 = i13;
            } else if (sb2.charAt(i13) == '/') {
                i11 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb2.charAt(i14) == '.') {
                sb2.delete(i14, i11);
                i10 -= i11 - i14;
            } else {
                if (i13 == i14 + 2 && sb2.charAt(i14) == '.' && sb2.charAt(i15) == '.') {
                    i12 = sb2.lastIndexOf(StubApp.getString2(601), i14 - 2) + 1;
                    int i16 = i12 > i3 ? i12 : i3;
                    sb2.delete(i16, i11);
                    i10 -= i11 - i16;
                } else {
                    i12 = i13 + 1;
                }
                i14 = i12;
            }
            i13 = i14;
        }
        return sb2.toString();
    }

    public static String t(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] n10 = n(str2);
        if (n10[0] != -1) {
            sb2.append(str2);
            s(sb2, n10[1], n10[2]);
            return sb2.toString();
        }
        int[] n11 = n(str);
        if (n10[3] == 0) {
            sb2.append((CharSequence) str, 0, n11[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (n10[2] == 0) {
            sb2.append((CharSequence) str, 0, n11[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i3 = n10[1];
        if (i3 != 0) {
            int i10 = n11[0] + 1;
            sb2.append((CharSequence) str, 0, i10);
            sb2.append(str2);
            return s(sb2, n10[1] + i10, i10 + n10[2]);
        }
        if (str2.charAt(i3) == '/') {
            sb2.append((CharSequence) str, 0, n11[1]);
            sb2.append(str2);
            int i11 = n11[1];
            return s(sb2, i11, n10[2] + i11);
        }
        int i12 = n11[0] + 2;
        int i13 = n11[1];
        if (i12 >= i13 || i13 != n11[2]) {
            int lastIndexOf = str.lastIndexOf(47, n11[2] - 1);
            int i14 = lastIndexOf == -1 ? n11[1] : lastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i14);
            sb2.append(str2);
            return s(sb2, n11[1], i14 + n10[2]);
        }
        sb2.append((CharSequence) str, 0, i13);
        sb2.append('/');
        sb2.append(str2);
        int i15 = n11[1];
        return s(sb2, i15, n10[2] + i15 + 1);
    }

    public static Uri u(String str, String str2) {
        return Uri.parse(t(str, str2));
    }

    public static void v(MediaFormat mediaFormat, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mediaFormat.setByteBuffer(i2.u.p(i3, StubApp.getString2(22534)), ByteBuffer.wrap((byte[]) list.get(i3)));
        }
    }

    public static void w(String str, String str2) {
        synchronized (f20165a) {
            Log.w(str, a(str2, null));
        }
    }

    public static void x(String str, String str2, Throwable th) {
        synchronized (f20165a) {
            Log.w(str, a(str2, th));
        }
    }
}
