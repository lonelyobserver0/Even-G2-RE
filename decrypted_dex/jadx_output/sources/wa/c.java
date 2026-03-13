package wa;

import android.util.Log;
import com.stub.StubApp;
import da.C0810A;
import da.G;
import da.I;
import da.J;
import da.z;
import java.io.File;
import java.io.IOException;
import s.C1590a;
import w3.C1860a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f22188a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22189b;

    /* renamed from: c, reason: collision with root package name */
    public final Bc.i f22190c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22191d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22192e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22193f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22194g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22195h;

    /* renamed from: i, reason: collision with root package name */
    public final C1860a f22196i;
    public final File j;

    /* renamed from: k, reason: collision with root package name */
    public final C1590a f22197k;

    public c(File file, int i3, String str, Bc.i iVar, int i10, int i11, int i12, int i13, int i14, byte[] bArr, C1590a c1590a) {
        this.j = file;
        this.f22189b = i3;
        this.f22188a = str;
        this.f22190c = iVar;
        this.f22191d = i10;
        this.f22192e = i11;
        this.f22193f = i12;
        this.f22194g = i13;
        this.f22195h = i14;
        this.f22196i = (bArr == null || bArr.length < 10) ? null : new C1860a(bArr);
        this.f22197k = c1590a;
    }

    public static C0810A b(File file, String str) {
        J j;
        String string2 = StubApp.getString2(948);
        String string22 = StubApp.getString2(23865);
        try {
            int i3 = 0;
            if (!file.getName().toLowerCase().endsWith(StubApp.getString2("17473"))) {
                return new z(false, true).f(file);
            }
            I i10 = new I(file);
            while (true) {
                try {
                    if (i3 >= i10.f13475b) {
                        j = null;
                        break;
                    }
                    j = i10.a(i3);
                    if (j.getName().equals(str)) {
                        break;
                    }
                    i3++;
                } catch (IOException e10) {
                    Log.e(string2, e10.getMessage(), e10);
                    i10.close();
                    return null;
                }
            }
            if (j != null) {
                return (C0810A) j;
            }
            i10.close();
            throw new IOException(string22 + str + StubApp.getString2("23866") + file);
        } catch (IOException e11) {
            Log.w(string2, StubApp.getString2(22969) + file, e11);
            return null;
        }
    }

    public static J c(File file, String str) {
        J j;
        int i3 = 0;
        if (!file.getName().toLowerCase().endsWith(StubApp.getString2(17473))) {
            return new G(false, true).c(file);
        }
        I i10 = new I(file);
        while (true) {
            try {
                if (i3 >= i10.f13475b) {
                    j = null;
                    break;
                }
                j = i10.a(i3);
                if (j.getName().equals(str)) {
                    break;
                }
                i3++;
            } catch (IOException e10) {
                i10.close();
                throw e10;
            }
        }
        if (j != null) {
            return j;
        }
        i10.close();
        throw new IOException(StubApp.getString2(23865) + str + StubApp.getString2(23866) + file);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:3:0x0001, B:5:0x0014, B:10:0x0020, B:16:0x002e, B:21:0x003b, B:23:0x00a1, B:32:0x005f, B:33:0x0062, B:38:0x0065, B:39:0x0070, B:40:0x0071, B:41:0x007a, B:43:0x007e, B:46:0x0084), top: B:2:0x0001, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X9.b a() {
        /*
            r7 = this;
            monitor-enter(r7)
            s.a r0 = r7.f22197k     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r0.f20575b     // Catch: java.lang.Throwable -> L63
            f4.c r0 = (f4.C0879c) r0     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r0.f13742a     // Catch: java.lang.Throwable -> L63
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L63
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch: java.lang.Throwable -> L63
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L63
            X9.b r0 = (X9.b) r0     // Catch: java.lang.Throwable -> L63
            goto L1c
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L20
            monitor-exit(r7)
            return r0
        L20:
            int r0 = r7.f22189b     // Catch: java.lang.Throwable -> L63
            int r0 = w.AbstractC1856e.c(r0)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L7a
            r2 = 1
            if (r0 == r2) goto L71
            r2 = 2
            if (r0 != r2) goto L65
            java.io.File r0 = r7.j     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = "Could not load font file: "
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            ea.d r1 = ea.C0857d.c(r3)     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L5d
        L3b:
            com.google.android.gms.internal.measurement.F1.h(r3)     // Catch: java.lang.Throwable -> L63
            goto L9f
        L3f:
            r1 = r3
            goto L5f
        L41:
            r4 = move-exception
            goto L47
        L43:
            r0 = move-exception
            goto L5f
        L45:
            r4 = move-exception
            r3 = r1
        L47:
            java.lang.String r5 = "948"
            java.lang.String r5 = com.stub.StubApp.getString2(r5)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L5d
            r6.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L5d
            android.util.Log.w(r5, r0, r4)     // Catch: java.lang.Throwable -> L5d
            goto L3b
        L5d:
            r0 = move-exception
            goto L3f
        L5f:
            com.google.android.gms.internal.measurement.F1.h(r1)     // Catch: java.lang.Throwable -> L63
            throw r0     // Catch: java.lang.Throwable -> L63
        L63:
            r0 = move-exception
            goto Lb5
        L65:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "23867"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.Throwable -> L63
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L63
            throw r0     // Catch: java.lang.Throwable -> L63
        L71:
            java.lang.String r0 = r7.f22188a     // Catch: java.lang.Throwable -> L63
            java.io.File r1 = r7.j     // Catch: java.lang.Throwable -> L63
            da.A r1 = b(r1, r0)     // Catch: java.lang.Throwable -> L63
            goto L9f
        L7a:
            java.lang.String r0 = r7.f22188a     // Catch: java.lang.Throwable -> L63
            java.io.File r2 = r7.j     // Catch: java.lang.Throwable -> L63
            da.J r1 = c(r2, r0)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L83
            goto L9f
        L83:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = "22969"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L63
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L63
            r3.append(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "948"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.Throwable -> L63
            android.util.Log.w(r3, r2, r0)     // Catch: java.lang.Throwable -> L63
        L9f:
            if (r1 == 0) goto Lb3
            s.a r0 = r7.f22197k     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r0.f20575b     // Catch: java.lang.Throwable -> L63
            f4.c r0 = (f4.C0879c) r0     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r0.f13742a     // Catch: java.lang.Throwable -> L63
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> L63
            java.lang.ref.SoftReference r2 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L63
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L63
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L63
        Lb3:
            monitor-exit(r7)
            return r1
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L63
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.c.a():X9.b");
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22188a);
        sb2.append(StubApp.getString2(1561));
        int i3 = this.f22189b;
        sb2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? StubApp.getString2(1116) : StubApp.getString2(22078) : StubApp.getString2(22077) : StubApp.getString2(22076));
        sb2.append(StubApp.getString2(23868));
        sb2.append(Integer.toHexString(this.f22195h));
        sb2.append(StubApp.getString2(23869));
        sb2.append(Integer.toHexString(this.f22192e));
        sb2.append(StubApp.getString2(23870));
        sb2.append(this.f22190c);
        sb2.append(StubApp.getString2(74));
        return sb2.toString();
    }

    public final String toString() {
        return d() + StubApp.getString2(397) + this.j;
    }
}
