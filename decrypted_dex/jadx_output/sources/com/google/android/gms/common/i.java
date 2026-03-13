package com.google.android.gms.common;

import S3.A;
import S3.D;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.stub.StubApp;
import e4.AbstractC0841a;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static i f11190c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f11191a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f11192b;

    public i(Context context) {
        this.f11191a = StubApp.getOrigApplicationContext(context.getApplicationContext());
    }

    public static i a(Context context) {
        D.h(context);
        synchronized (i.class) {
            if (f11190c == null) {
                p pVar = t.f11215a;
                synchronized (t.class) {
                    if (t.f11219e == null) {
                        t.f11219e = StubApp.getOrigApplicationContext(context.getApplicationContext());
                    } else {
                        Log.w(StubApp.getString2("11524"), StubApp.getString2("11525"));
                    }
                }
                f11190c = new i(context);
            }
        }
        return f11190c;
    }

    public static final q c(PackageInfo packageInfo, q... qVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w(StubApp.getString2(6880), StubApp.getString2(11526));
                return null;
            }
            r rVar = new r(packageInfo.signatures[0].toByteArray());
            for (int i3 = 0; i3 < qVarArr.length; i3++) {
                if (qVarArr[i3].equals(rVar)) {
                    return qVarArr[i3];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (com.stub.StubApp.getString2(0).equals(r4.packageName) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L31
            if (r4 == 0) goto L33
            r2 = 3519(0xdbf, float:4.931E-42)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
            java.lang.String r2 = r4.packageName
            r3 = 0
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L31
        L24:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L2a
        L28:
            r5 = r1
            goto L31
        L2a:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L28
            r5 = r0
        L31:
            r2 = r4
            goto L34
        L33:
            r2 = 0
        L34:
            if (r4 == 0) goto L52
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L52
            if (r5 == 0) goto L43
            com.google.android.gms.common.q[] r4 = com.google.android.gms.common.s.f11214a
            com.google.android.gms.common.q r4 = c(r2, r4)
            goto L4f
        L43:
            com.google.android.gms.common.q[] r4 = com.google.android.gms.common.s.f11214a
            r4 = r4[r1]
            com.google.android.gms.common.q[] r4 = new com.google.android.gms.common.q[]{r4}
            com.google.android.gms.common.q r4 = c(r2, r4)
        L4f:
            if (r4 == 0) goto L52
            return r0
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.i.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    public boolean b(int i3) {
        w wVar;
        int length;
        boolean z2;
        ApplicationInfo applicationInfo;
        w wVar2;
        u uVar;
        int i10 = 1;
        String[] packagesForUid = ((Context) this.f11191a).getPackageManager().getPackagesForUid(i3);
        Exception exc = null;
        boolean z10 = false;
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            wVar = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    D.h(wVar);
                    break;
                }
                String str = packagesForUid[i11];
                String string2 = StubApp.getString2(11527);
                String string22 = StubApp.getString2(11524);
                String string23 = StubApp.getString2(11528);
                if (str == null) {
                    wVar = new w(string23, z10, exc);
                } else if (str.equals((String) this.f11192b)) {
                    wVar = w.f11225d;
                } else {
                    p pVar = t.f11215a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            t.b();
                            z2 = ((A) t.f11217c).N();
                        } finally {
                        }
                    } catch (a4.a | RemoteException e10) {
                        Log.e(string22, string2, e10);
                        z2 = z10;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    if (z2) {
                        boolean a3 = h.a((Context) this.f11191a);
                        StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            D.h(t.f11219e);
                            try {
                                t.b();
                                Context context = (Context) Z3.b.O(Z3.b.N(new Z3.b(t.f11219e)));
                                try {
                                    A a9 = (A) t.f11217c;
                                    Parcel g10 = a9.g();
                                    int i12 = AbstractC0841a.f13595a;
                                    g10.writeInt(i10);
                                    int I10 = a4.f.I(g10, 20293);
                                    a4.f.F(g10, i10, str);
                                    a4.f.P(g10, 2, 4);
                                    g10.writeInt(a3 ? 1 : 0);
                                    a4.f.P(g10, 3, 4);
                                    g10.writeInt(0);
                                    a4.f.C(g10, 4, new Z3.b(context));
                                    a4.f.P(g10, 5, 4);
                                    g10.writeInt(0);
                                    a4.f.P(g10, 6, 4);
                                    g10.writeInt(1);
                                    a4.f.N(g10, I10);
                                    Parcel e11 = a9.e(g10, 6);
                                    uVar = (u) AbstractC0841a.a(e11, u.CREATOR);
                                    e11.recycle();
                                } catch (RemoteException e12) {
                                    Log.e(string22, string2, e12);
                                    wVar2 = new w(StubApp.getString2("11530"), false, e12);
                                }
                            } catch (a4.a e13) {
                                Log.e(string22, string2, e13);
                                wVar2 = new w(StubApp.getString2("11531").concat(String.valueOf(e13.getMessage())), false, e13);
                            }
                            if (uVar.f11220a) {
                                Tc.d.w(uVar.f11223d);
                                wVar = new w(null, true, null);
                            } else {
                                String str2 = uVar.f11221b;
                                PackageManager.NameNotFoundException nameNotFoundException = W.a.B(uVar.f11222c) == 4 ? new PackageManager.NameNotFoundException() : null;
                                String string24 = StubApp.getString2("11529");
                                if (str2 == null) {
                                    str2 = string24;
                                }
                                Tc.d.w(uVar.f11223d);
                                W.a.B(uVar.f11222c);
                                wVar2 = new w(str2, false, nameNotFoundException);
                                wVar = wVar2;
                            }
                        } finally {
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = ((Context) this.f11191a).getPackageManager().getPackageInfo(str, 64);
                            boolean a10 = h.a((Context) this.f11191a);
                            if (packageInfo == null) {
                                wVar = new w(string23, false, null);
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    wVar = new w(StubApp.getString2(11533), false, null);
                                } else {
                                    r rVar = new r(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    StrictMode.ThreadPolicy allowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                    try {
                                        w a11 = t.a(str3, rVar, a10, false);
                                        StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                        if (a11.f11226a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                            StrictMode.ThreadPolicy allowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                            try {
                                                w a12 = t.a(str3, rVar, false, true);
                                                StrictMode.setThreadPolicy(allowThreadDiskReads4);
                                                if (a12.f11226a) {
                                                    wVar = new w(StubApp.getString2(11532), false, null);
                                                }
                                            } finally {
                                            }
                                        }
                                        wVar = a11;
                                    } finally {
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e14) {
                            wVar = new w(StubApp.getString2(11534).concat(str), false, e14);
                        }
                    }
                    if (wVar.f11226a) {
                        this.f11192b = str;
                    }
                }
                if (wVar.f11226a) {
                    break;
                }
                i11++;
                i10 = 1;
                exc = null;
                z10 = false;
            }
        } else {
            wVar = new w(StubApp.getString2(11535), false, null);
        }
        if (!wVar.f11226a) {
            String string25 = StubApp.getString2(11536);
            if (Log.isLoggable(string25, 3)) {
                Exception exc2 = wVar.f11228c;
                if (exc2 != null) {
                    Log.d(string25, wVar.a(), exc2);
                } else {
                    Log.d(string25, wVar.a());
                }
            }
        }
        return wVar.f11226a;
    }

    public i() {
        this.f11191a = new CopyOnWriteArraySet();
    }
}
