package H1;

import android.content.Context;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2690b;

    public /* synthetic */ f(Context context, int i3) {
        this.f2689a = i3;
        this.f2690b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f2689a
            switch(r0) {
                case 0: goto La3;
                case 1: goto L94;
                default: goto L5;
            }
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L91
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r11.f2690b
            r5 = 2519(0x9d7, float:3.53E-42)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r3.<init>(r4, r5)
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r3)
            if (r5 == r1) goto L91
            r5 = 222(0xde, float:3.11E-43)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            if (r0 < r2) goto L68
            t.f r0 = i.l.f14615g
            r0.getClass()
            t.a r2 = new t.a
            r2.<init>(r0)
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            i.l r0 = (i.l) r0
            if (r0 == 0) goto L37
            i.v r0 = (i.v) r0
            android.content.Context r0 = r0.f14669l
            if (r0 == 0) goto L37
            java.lang.Object r0 = r0.getSystemService(r5)
            goto L57
        L56:
            r0 = 0
        L57:
            if (r0 == 0) goto L6d
            android.os.LocaleList r0 = i.k.a(r0)
            J.e r2 = new J.e
            J.f r6 = new J.f
            r6.<init>(r0)
            r2.<init>(r6)
            goto L6f
        L68:
            J.e r2 = i.l.f14611c
            if (r2 == 0) goto L6d
            goto L6f
        L6d:
            J.e r2 = J.e.f3255b
        L6f:
            J.f r0 = r2.f3256a
            android.os.LocaleList r0 = r0.f3257a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8a
            java.lang.String r0 = C.AbstractC0026c.e(r4)
            java.lang.Object r2 = r4.getSystemService(r5)
            if (r2 == 0) goto L8a
            android.os.LocaleList r0 = i.j.a(r0)
            i.k.b(r2, r0)
        L8a:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L91:
            i.l.f14614f = r1
            return
        L94:
            G1.c r0 = new G1.c
            r1 = 0
            r0.<init>(r1)
            u5.d r1 = H1.d.f2678a
            r2 = 0
            android.content.Context r3 = r11.f2690b
            H1.d.t(r3, r0, r1, r2)
            return
        La3:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r6 = 1
            r7 = 0
            r5 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            H1.f r0 = new H1.f
            android.content.Context r1 = r11.f2690b
            r2 = 1
            r0.<init>(r1, r2)
            r4.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.f.run():void");
    }
}
