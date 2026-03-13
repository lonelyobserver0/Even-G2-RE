package androidx.work.impl;

import A3.s;
import J1.d;
import J1.u;
import O0.l;
import P2.a;
import V6.b;
import Y.m;
import a5.c;
import android.content.Context;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f10370v = 0;

    /* renamed from: o, reason: collision with root package name */
    public volatile s f10371o;

    /* renamed from: p, reason: collision with root package name */
    public volatile m f10372p;

    /* renamed from: q, reason: collision with root package name */
    public volatile b f10373q;

    /* renamed from: r, reason: collision with root package name */
    public volatile c f10374r;

    /* renamed from: s, reason: collision with root package name */
    public volatile m f10375s;

    /* renamed from: t, reason: collision with root package name */
    public volatile c f10376t;

    /* renamed from: u, reason: collision with root package name */
    public volatile b f10377u;

    @Override // J1.r
    public final J1.m d() {
        return new J1.m(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // J1.r
    public final O1.c e(d dVar) {
        u callback = new u(dVar, new a(this), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = dVar.f3308a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return dVar.f3310c.p(new l(context, dVar.f3309b, callback, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m p() {
        m mVar;
        if (this.f10372p != null) {
            return this.f10372p;
        }
        synchronized (this) {
            try {
                if (this.f10372p == null) {
                    this.f10372p = new m(this, 26);
                }
                mVar = this.f10372p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b q() {
        b bVar;
        if (this.f10377u != null) {
            return this.f10377u;
        }
        synchronized (this) {
            try {
                if (this.f10377u == null) {
                    this.f10377u = new b(this, 28);
                }
                bVar = this.f10377u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c r() {
        c cVar;
        if (this.f10374r != null) {
            return this.f10374r;
        }
        synchronized (this) {
            try {
                if (this.f10374r == null) {
                    this.f10374r = new c(this, 26);
                }
                cVar = this.f10374r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m s() {
        m mVar;
        if (this.f10375s != null) {
            return this.f10375s;
        }
        synchronized (this) {
            try {
                if (this.f10375s == null) {
                    this.f10375s = new m(this, 27);
                }
                mVar = this.f10375s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c t() {
        c cVar;
        if (this.f10376t != null) {
            return this.f10376t;
        }
        synchronized (this) {
            try {
                if (this.f10376t == null) {
                    this.f10376t = new c(this, 27);
                }
                cVar = this.f10376t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s u() {
        s sVar;
        if (this.f10371o != null) {
            return this.f10371o;
        }
        synchronized (this) {
            try {
                if (this.f10371o == null) {
                    this.f10371o = new s(this);
                }
                sVar = this.f10371o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b v() {
        b bVar;
        if (this.f10373q != null) {
            return this.f10373q;
        }
        synchronized (this) {
            try {
                if (this.f10373q == null) {
                    this.f10373q = new b(this, 29);
                }
                bVar = this.f10373q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
