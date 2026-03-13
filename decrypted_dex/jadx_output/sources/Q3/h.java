package Q3;

import R3.A;
import R3.AbstractC0239h;
import R3.C0232a;
import R3.C0233b;
import R3.C0236e;
import R3.C0241j;
import R3.E;
import R3.InterfaceC0240i;
import R3.p;
import R3.z;
import S3.D;
import Z9.C;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.stub.StubApp;
import java.util.Collections;
import java.util.Set;
import l4.E0;
import q4.s;
import t.C1693f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5721a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5722b;

    /* renamed from: c, reason: collision with root package name */
    public final d f5723c;

    /* renamed from: d, reason: collision with root package name */
    public final b f5724d;

    /* renamed from: e, reason: collision with root package name */
    public final C0233b f5725e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5726f;

    /* renamed from: g, reason: collision with root package name */
    public final C0232a f5727g;

    /* renamed from: h, reason: collision with root package name */
    public final C0236e f5728h;

    public h(Context context, Activity activity, d dVar, b bVar, g gVar) {
        D.i(context, StubApp.getString2(5157));
        D.i(dVar, StubApp.getString2(5158));
        D.i(gVar, StubApp.getString2(5159));
        Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
        D.i(origApplicationContext, StubApp.getString2(5160));
        this.f5721a = origApplicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f5722b = attributionTag;
        this.f5723c = dVar;
        this.f5724d = bVar;
        C0233b c0233b = new C0233b(dVar, bVar, attributionTag);
        this.f5725e = c0233b;
        C0236e f10 = C0236e.f(origApplicationContext);
        this.f5728h = f10;
        this.f5726f = f10.f6130h.getAndIncrement();
        this.f5727g = gVar.f5720a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            InterfaceC0240i b2 = AbstractC0239h.b(activity);
            p pVar = (p) b2.b(p.class, StubApp.getString2(5161));
            pVar = pVar == null ? new p(b2, f10, GoogleApiAvailability.getInstance()) : pVar;
            pVar.f6145f.add(c0233b);
            f10.a(pVar);
        }
        c4.h hVar = f10.f6135p;
        hVar.sendMessage(hVar.obtainMessage(7, this));
    }

    public final Q2.g a() {
        Q2.g gVar = new Q2.g(20, (char) 0);
        Set set = Collections.EMPTY_SET;
        if (((C1693f) gVar.f5711b) == null) {
            gVar.f5711b = new C1693f(0);
        }
        ((C1693f) gVar.f5711b).addAll(set);
        Context context = this.f5721a;
        gVar.f5713d = context.getClass().getName();
        gVar.f5712c = context.getPackageName();
        return gVar;
    }

    public final s b(E0 e02) {
        C0241j c0241j = (C0241j) ((R3.l) ((Bc.i) e02.f16037b).f767c).f6142c;
        String string2 = StubApp.getString2(5162);
        D.i(c0241j, string2);
        D.i((C0241j) ((C) e02.f16038c).f9077b, string2);
        Bc.i iVar = (Bc.i) e02.f16037b;
        C c10 = (C) e02.f16038c;
        C0236e c0236e = this.f5728h;
        c0236e.getClass();
        q4.k kVar = new q4.k();
        c0236e.e(kVar, iVar.f766b, this);
        z zVar = new z(new R3.D(new A(iVar, c10), kVar), c0236e.j.get(), this);
        c4.h hVar = c0236e.f6135p;
        hVar.sendMessage(hVar.obtainMessage(8, zVar));
        return kVar.f20051a;
    }

    public final s c(C0241j c0241j, int i3) {
        D.i(c0241j, StubApp.getString2(5163));
        C0236e c0236e = this.f5728h;
        c0236e.getClass();
        q4.k kVar = new q4.k();
        c0236e.e(kVar, i3, this);
        z zVar = new z(new R3.D(c0241j, kVar), c0236e.j.get(), this);
        c4.h hVar = c0236e.f6135p;
        hVar.sendMessage(hVar.obtainMessage(13, zVar));
        return kVar.f20051a;
    }

    public final s d(int i3, Fb.a aVar) {
        q4.k kVar = new q4.k();
        C0236e c0236e = this.f5728h;
        c0236e.getClass();
        c0236e.e(kVar, aVar.f2346b, this);
        z zVar = new z(new E(i3, aVar, kVar, this.f5727g), c0236e.j.get(), this);
        c4.h hVar = c0236e.f6135p;
        hVar.sendMessage(hVar.obtainMessage(4, zVar));
        return kVar.f20051a;
    }

    @Override // Q3.l
    public final C0233b getApiKey() {
        return this.f5725e;
    }
}
