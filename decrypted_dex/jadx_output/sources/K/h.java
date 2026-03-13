package K;

import com.stub.StubApp;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t.C1696i;
import t.C1697j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final C1696i f3558a = new C1696i(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f3559b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3560c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1697j f3561d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new l());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3559b = threadPoolExecutor;
        f3560c = new Object();
        f3561d = new C1697j(0);
    }

    public static String a(int i3, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((d) list.get(i10)).f3548e);
            sb2.append(StubApp.getString2(999));
            sb2.append(i3);
            if (i10 < list.size() - 1) {
                sb2.append(StubApp.getString2(1262));
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #2 {all -> 0x00cd, all -> 0x0084, NameNotFoundException -> 0x00c3, all -> 0x00be, blocks: (B:3:0x0011, B:5:0x0019, B:10:0x0022, B:11:0x0026, B:17:0x0056, B:20:0x005f, B:22:0x0065, B:24:0x006b, B:27:0x0080, B:29:0x00a9, B:32:0x00b5, B:37:0x0085, B:38:0x0088, B:39:0x0089, B:42:0x00a4, B:45:0x00bf, B:46:0x00c2, B:48:0x0034, B:50:0x003c, B:53:0x0040, B:55:0x0044, B:57:0x004f, B:66:0x00c3, B:26:0x007a, B:41:0x009e), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[Catch: all -> 0x00cd, TRY_ENTER, TryCatch #2 {all -> 0x00cd, all -> 0x0084, NameNotFoundException -> 0x00c3, all -> 0x00be, blocks: (B:3:0x0011, B:5:0x0019, B:10:0x0022, B:11:0x0026, B:17:0x0056, B:20:0x005f, B:22:0x0065, B:24:0x006b, B:27:0x0080, B:29:0x00a9, B:32:0x00b5, B:37:0x0085, B:38:0x0088, B:39:0x0089, B:42:0x00a4, B:45:0x00bf, B:46:0x00c2, B:48:0x0034, B:50:0x003c, B:53:0x0040, B:55:0x0044, B:57:0x004f, B:66:0x00c3, B:26:0x007a, B:41:0x009e), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #2 {all -> 0x00cd, all -> 0x0084, NameNotFoundException -> 0x00c3, all -> 0x00be, blocks: (B:3:0x0011, B:5:0x0019, B:10:0x0022, B:11:0x0026, B:17:0x0056, B:20:0x005f, B:22:0x0065, B:24:0x006b, B:27:0x0080, B:29:0x00a9, B:32:0x00b5, B:37:0x0085, B:38:0x0088, B:39:0x0089, B:42:0x00a4, B:45:0x00bf, B:46:0x00c2, B:48:0x0034, B:50:0x003c, B:53:0x0040, B:55:0x0044, B:57:0x004f, B:66:0x00c3, B:26:0x007a, B:41:0x009e), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[Catch: all -> 0x00cd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00cd, all -> 0x0084, NameNotFoundException -> 0x00c3, all -> 0x00be, blocks: (B:3:0x0011, B:5:0x0019, B:10:0x0022, B:11:0x0026, B:17:0x0056, B:20:0x005f, B:22:0x0065, B:24:0x006b, B:27:0x0080, B:29:0x00a9, B:32:0x00b5, B:37:0x0085, B:38:0x0088, B:39:0x0089, B:42:0x00a4, B:45:0x00bf, B:46:0x00c2, B:48:0x0034, B:50:0x003c, B:53:0x0040, B:55:0x0044, B:57:0x004f, B:66:0x00c3, B:26:0x007a, B:41:0x009e), top: B:2:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static K.g b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            r0 = 1
            r1 = 3122(0xc32, float:4.375E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r1 = f5.u0.A(r1)
            android.os.Trace.beginSection(r1)
            t.i r1 = K.h.f3558a
            java.lang.Object r2 = r1.b(r8)     // Catch: java.lang.Throwable -> Lcd
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto L22
            K.g r8 = new K.g     // Catch: java.lang.Throwable -> Lcd
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lcd
            android.os.Trace.endSection()
            return r8
        L22:
            K.i r10 = K.c.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc3 java.lang.Throwable -> Lcd
            int r2 = r10.f3562a     // Catch: java.lang.Throwable -> Lcd
            r3 = 0
            java.util.List r10 = r10.f3563b
            r4 = -3
            if (r2 == 0) goto L34
            if (r2 == r0) goto L32
        L30:
            r2 = r4
            goto L54
        L32:
            r2 = -2
            goto L54
        L34:
            java.lang.Object r2 = r10.get(r3)     // Catch: java.lang.Throwable -> Lcd
            K.j[] r2 = (K.j[]) r2     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto L53
            int r5 = r2.length     // Catch: java.lang.Throwable -> Lcd
            if (r5 != 0) goto L40
            goto L53
        L40:
            int r5 = r2.length     // Catch: java.lang.Throwable -> Lcd
            r6 = r3
        L42:
            if (r6 >= r5) goto L51
            r7 = r2[r6]     // Catch: java.lang.Throwable -> Lcd
            int r7 = r7.f3568e     // Catch: java.lang.Throwable -> Lcd
            if (r7 == 0) goto L4f
            if (r7 >= 0) goto L4d
            goto L30
        L4d:
            r2 = r7
            goto L54
        L4f:
            int r6 = r6 + r0
            goto L42
        L51:
            r2 = r3
            goto L54
        L53:
            r2 = r0
        L54:
            if (r2 == 0) goto L5f
            K.g r8 = new K.g     // Catch: java.lang.Throwable -> Lcd
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lcd
            android.os.Trace.endSection()
            return r8
        L5f:
            int r2 = r10.size()     // Catch: java.lang.Throwable -> Lcd
            if (r2 <= r0) goto L89
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lcd
            r2 = 29
            if (r0 < r2) goto L89
            a4.f r0 = F.e.f2170a     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "3123"
            java.lang.String r0 = com.stub.StubApp.getString2(r0)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = f5.u0.A(r0)     // Catch: java.lang.Throwable -> Lcd
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> Lcd
            a4.f r0 = F.e.f2170a     // Catch: java.lang.Throwable -> L84
            android.graphics.Typeface r9 = r0.i(r9, r10, r11)     // Catch: java.lang.Throwable -> L84
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lcd
            goto La7
        L84:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lcd
            throw r8     // Catch: java.lang.Throwable -> Lcd
        L89:
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> Lcd
            K.j[] r10 = (K.j[]) r10     // Catch: java.lang.Throwable -> Lcd
            a4.f r0 = F.e.f2170a     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "485"
            java.lang.String r0 = com.stub.StubApp.getString2(r0)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = f5.u0.A(r0)     // Catch: java.lang.Throwable -> Lcd
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> Lcd
            a4.f r0 = F.e.f2170a     // Catch: java.lang.Throwable -> Lbe
            android.graphics.Typeface r9 = r0.h(r9, r10, r11)     // Catch: java.lang.Throwable -> Lbe
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lcd
        La7:
            if (r9 == 0) goto Lb5
            r1.c(r8, r9)     // Catch: java.lang.Throwable -> Lcd
            K.g r8 = new K.g     // Catch: java.lang.Throwable -> Lcd
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lcd
            android.os.Trace.endSection()
            return r8
        Lb5:
            K.g r8 = new K.g     // Catch: java.lang.Throwable -> Lcd
            r8.<init>(r4)     // Catch: java.lang.Throwable -> Lcd
            android.os.Trace.endSection()
            return r8
        Lbe:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lcd
            throw r8     // Catch: java.lang.Throwable -> Lcd
        Lc3:
            K.g r8 = new K.g     // Catch: java.lang.Throwable -> Lcd
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lcd
            android.os.Trace.endSection()
            return r8
        Lcd:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K.h.b(java.lang.String, android.content.Context, java.util.List, int):K.g");
    }
}
