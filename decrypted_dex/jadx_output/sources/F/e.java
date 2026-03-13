package F;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import com.stub.StubApp;
import f5.u0;
import t.C1696i;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a4.f f2170a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1696i f2171b;

    static {
        Trace.beginSection(u0.A(StubApp.getString2(1986)));
        if (Build.VERSION.SDK_INT >= 29) {
            f2170a = new g();
        } else {
            f2170a = new f();
        }
        f2171b = new C1696i(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r8.equals(r11) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r16, E.d r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, E.b r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F.e.a(android.content.Context, E.d, android.content.res.Resources, int, java.lang.String, int, int, E.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i3, String str, int i10, int i11) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i10 + '-' + i3 + '-' + i11;
    }
}
