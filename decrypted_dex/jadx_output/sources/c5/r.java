package c5;

import android.content.Context;
import android.util.Log;
import com.stub.StubApp;
import d5.C0805e;
import i5.C1059c;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10925a;

    /* renamed from: b, reason: collision with root package name */
    public final u f10926b;

    /* renamed from: c, reason: collision with root package name */
    public final V6.b f10927c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10928d;

    /* renamed from: e, reason: collision with root package name */
    public Y.m f10929e;

    /* renamed from: f, reason: collision with root package name */
    public Y.m f10930f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10931g;

    /* renamed from: h, reason: collision with root package name */
    public l f10932h;

    /* renamed from: i, reason: collision with root package name */
    public final y f10933i;
    public final C1059c j;

    /* renamed from: k, reason: collision with root package name */
    public final Y4.a f10934k;

    /* renamed from: l, reason: collision with root package name */
    public final Y4.a f10935l;

    /* renamed from: m, reason: collision with root package name */
    public final i f10936m;

    /* renamed from: n, reason: collision with root package name */
    public final Z4.a f10937n;

    /* renamed from: o, reason: collision with root package name */
    public final s2.d f10938o;

    /* renamed from: p, reason: collision with root package name */
    public final C0805e f10939p;

    public r(R4.h hVar, y yVar, Z4.a aVar, u uVar, Y4.a aVar2, Y4.a aVar3, C1059c c1059c, i iVar, s2.d dVar, C0805e c0805e) {
        this.f10926b = uVar;
        hVar.a();
        this.f10925a = hVar.f6193a;
        this.f10933i = yVar;
        this.f10937n = aVar;
        this.f10934k = aVar2;
        this.f10935l = aVar3;
        this.j = c1059c;
        this.f10936m = iVar;
        this.f10938o = dVar;
        this.f10939p = c0805e;
        this.f10928d = System.currentTimeMillis();
        this.f10927c = new V6.b(9);
    }

    public final void a(A3.s sVar) {
        C0805e.a();
        C0805e.a();
        this.f10929e.i();
        String string2 = StubApp.getString2(280);
        if (Log.isLoggable(string2, 2)) {
            Log.v(string2, StubApp.getString2(9561), null);
        }
        try {
            try {
                this.f10934k.u(new q(this));
                this.f10932h.h();
                if (!sVar.h().f15438b.f15434a) {
                    if (Log.isLoggable(string2, 3)) {
                        Log.d(string2, "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f10932h.d(sVar)) {
                    Log.w(string2, StubApp.getString2("9562"), null);
                }
                this.f10932h.j(((q4.k) ((AtomicReference) sVar.f197i).get()).f20051a);
                c();
            } catch (Exception e10) {
                Log.e(string2, "Crashlytics encountered a problem during asynchronous initialization.", e10);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(A3.s sVar) {
        Future<?> submit = this.f10939p.f13422a.f13414a.submit(new m(this, sVar, 1));
        String string2 = StubApp.getString2(280);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(9563), null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e(string2, StubApp.getString2(9566), e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            Log.e(string2, StubApp.getString2(9565), e11);
        } catch (TimeoutException e12) {
            Log.e(string2, StubApp.getString2(9564), e12);
        }
    }

    public final void c() {
        String string2 = StubApp.getString2(280);
        C0805e.a();
        try {
            Y.m mVar = this.f10929e;
            String str = (String) mVar.f8674b;
            C1059c c1059c = (C1059c) mVar.f8675c;
            c1059c.getClass();
            if (new File((File) c1059c.f14844c, str).delete()) {
                return;
            }
            Log.w(string2, StubApp.getString2("9567"), null);
        } catch (Exception e10) {
            Log.e(string2, StubApp.getString2(9568), e10);
        }
    }
}
