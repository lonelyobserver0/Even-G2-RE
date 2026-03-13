package com.google.android.gms.common;

import S3.A;
import S3.B;
import S3.C;
import S3.D;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.stub.StubApp;
import e4.AbstractC0841a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final p f11215a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f11216b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile C f11217c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f11218d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f11219e;

    static {
        new p(q.N(StubApp.getString2(11549)), 0);
        new p(q.N(StubApp.getString2(11550)), 1);
        f11215a = new p(q.N(StubApp.getString2(11551)), 2);
        f11216b = new p(q.N(StubApp.getString2(11552)), 3);
        f11218d = new Object();
    }

    public static w a(String str, r rVar, boolean z2, boolean z10) {
        String string2 = StubApp.getString2(11527);
        String string22 = StubApp.getString2(11524);
        try {
            b();
            D.h(f11219e);
            try {
                C c10 = f11217c;
                Z3.b bVar = new Z3.b(f11219e.getPackageManager());
                A a3 = (A) c10;
                Parcel g10 = a3.g();
                int i3 = AbstractC0841a.f13595a;
                boolean z11 = true;
                g10.writeInt(1);
                int I10 = a4.f.I(g10, 20293);
                a4.f.F(g10, 1, str);
                a4.f.C(g10, 2, rVar);
                a4.f.P(g10, 3, 4);
                g10.writeInt(z2 ? 1 : 0);
                a4.f.P(g10, 4, 4);
                g10.writeInt(z10 ? 1 : 0);
                a4.f.N(g10, I10);
                AbstractC0841a.c(g10, bVar);
                Parcel e10 = a3.e(g10, 5);
                if (e10.readInt() == 0) {
                    z11 = false;
                }
                e10.recycle();
                return z11 ? w.f11225d : new v(new o(z2, str, rVar));
            } catch (RemoteException e11) {
                Log.e(string22, string2, e11);
                return new w(StubApp.getString2(11530), false, e11);
            }
        } catch (a4.a e12) {
            Log.e(string22, string2, e12);
            return new w(StubApp.getString2(11531).concat(String.valueOf(e12.getMessage())), false, e12);
        }
    }

    public static void b() {
        C a3;
        if (f11217c != null) {
            return;
        }
        D.h(f11219e);
        synchronized (f11218d) {
            try {
                if (f11217c == null) {
                    IBinder b2 = a4.d.c(f11219e, a4.d.f9261e, StubApp.getString2("11553")).b(StubApp.getString2("11554"));
                    int i3 = B.f6450f;
                    if (b2 == null) {
                        a3 = null;
                    } else {
                        String string2 = StubApp.getString2("11555");
                        IInterface queryLocalInterface = b2.queryLocalInterface(string2);
                        a3 = queryLocalInterface instanceof C ? (C) queryLocalInterface : new A(b2, string2, 2);
                    }
                    f11217c = a3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
