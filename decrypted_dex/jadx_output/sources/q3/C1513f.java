package q3;

import B3.s;
import Z9.q;
import android.os.AsyncTask;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import s3.C1596a;
import s3.InterfaceC1597b;
import w3.InterfaceC1861b;
import x3.EnumC1907a;

/* renamed from: q3.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1513f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1861b f19953a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19954b = true;

    /* renamed from: c, reason: collision with root package name */
    public q f19955c;

    /* renamed from: d, reason: collision with root package name */
    public s2.d f19956d;

    /* renamed from: e, reason: collision with root package name */
    public F5.c f19957e;

    /* renamed from: f, reason: collision with root package name */
    public A0.c f19958f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1597b f19959g;

    /* renamed from: h, reason: collision with root package name */
    public int f19960h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19961i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public String f19962k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19963l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19964m;

    /* renamed from: n, reason: collision with root package name */
    public EnumC1907a f19965n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f19966o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19967p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19968q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1514g f19969r;

    public C1513f(C1514g c1514g, InterfaceC1861b interfaceC1861b) {
        this.f19969r = c1514g;
        C1596a c1596a = new C1596a();
        c1596a.f20745a = c1514g;
        this.f19959g = c1596a;
        this.f19960h = 0;
        this.f19961i = false;
        this.j = false;
        this.f19962k = null;
        this.f19963l = true;
        this.f19964m = false;
        this.f19965n = EnumC1907a.f22838a;
        this.f19966o = false;
        this.f19967p = false;
        this.f19968q = false;
        this.f19953a = interfaceC1861b;
    }

    public final void a() {
        C1514g c1514g = this.f19969r;
        if (!c1514g.f19983R) {
            c1514g.f19984T = this;
            return;
        }
        c1514g.p();
        c1514g.f20000s.getClass();
        s sVar = c1514g.f20000s;
        sVar.f651c = this.f19955c;
        sVar.getClass();
        s sVar2 = c1514g.f20000s;
        sVar2.f653e = this.f19956d;
        sVar2.f652d = this.f19957e;
        sVar2.getClass();
        s sVar3 = c1514g.f20000s;
        sVar3.f650b = this.f19958f;
        sVar3.f654f = this.f19959g;
        c1514g.setSwipeEnabled(this.f19954b);
        c1514g.setNightMode(this.f19968q);
        c1514g.f19970A = true;
        c1514g.setDefaultPage(this.f19960h);
        c1514g.setSwipeVertical(true ^ this.f19961i);
        c1514g.f19975F = this.j;
        c1514g.setScrollHandle(null);
        c1514g.f19977H = this.f19963l;
        c1514g.setSpacing(0);
        c1514g.setAutoSpacing(this.f19964m);
        c1514g.setPageFitPolicy(this.f19965n);
        c1514g.setFitEachPage(false);
        c1514g.setPageSnap(this.f19967p);
        c1514g.setPageFling(this.f19966o);
        String str = this.f19962k;
        if (!c1514g.f19995m) {
            throw new IllegalStateException(StubApp.getString2(22207));
        }
        c1514g.f19995m = false;
        AsyncTaskC1511d asyncTaskC1511d = new AsyncTaskC1511d();
        asyncTaskC1511d.f19944e = this.f19953a;
        asyncTaskC1511d.f19940a = false;
        asyncTaskC1511d.f19941b = new WeakReference(c1514g);
        asyncTaskC1511d.f19943d = str;
        asyncTaskC1511d.f19942c = c1514g.f19973D;
        c1514g.f19996n = asyncTaskC1511d;
        asyncTaskC1511d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
