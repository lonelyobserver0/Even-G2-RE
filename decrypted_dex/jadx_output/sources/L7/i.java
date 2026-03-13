package L7;

import android.content.Context;
import com.mapbox.navigation.base.route.n;
import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4277a;

    /* renamed from: b, reason: collision with root package name */
    public final y7.b f4278b;

    /* renamed from: c, reason: collision with root package name */
    public final l f4279c;

    /* renamed from: d, reason: collision with root package name */
    public final c f4280d;

    /* renamed from: e, reason: collision with root package name */
    public final d f4281e;

    /* renamed from: f, reason: collision with root package name */
    public final n f4282f;

    /* renamed from: g, reason: collision with root package name */
    public final j f4283g;

    /* renamed from: h, reason: collision with root package name */
    public final com.mapbox.navigation.base.route.l f4284h;

    /* renamed from: i, reason: collision with root package name */
    public final f f4285i;
    public final e j;

    /* renamed from: k, reason: collision with root package name */
    public final b f4286k;

    /* renamed from: l, reason: collision with root package name */
    public final g f4287l;

    /* renamed from: m, reason: collision with root package name */
    public final m f4288m;

    /* renamed from: n, reason: collision with root package name */
    public final k f4289n;

    public i(Context context, y7.b bVar, l lVar, c cVar, d dVar, n nVar, j jVar, com.mapbox.navigation.base.route.l lVar2, f fVar, e eVar, b bVar2, g gVar, m mVar, k kVar) {
        this.f4277a = context;
        this.f4278b = bVar;
        this.f4279c = lVar;
        this.f4280d = cVar;
        this.f4281e = dVar;
        this.f4282f = nVar;
        this.f4283g = jVar;
        this.f4284h = lVar2;
        this.f4285i = fVar;
        this.j = eVar;
        this.f4286k = bVar2;
        this.f4287l = gVar;
        this.f4288m = mVar;
        this.f4289n = kVar;
    }

    public final Context a() {
        return this.f4277a;
    }

    public final j b() {
        return this.f4283g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.options.NavigationOptions");
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f4277a, iVar.f4277a) && Intrinsics.areEqual(this.f4287l, iVar.f4287l) && Intrinsics.areEqual(this.f4278b, iVar.f4278b) && Intrinsics.areEqual(this.f4279c, iVar.f4279c) && Intrinsics.areEqual(this.f4280d, iVar.f4280d) && Intrinsics.areEqual(this.f4281e, iVar.f4281e) && Intrinsics.areEqual(this.f4282f, iVar.f4282f) && Intrinsics.areEqual(this.f4283g, iVar.f4283g) && Intrinsics.areEqual(this.f4284h, iVar.f4284h) && Intrinsics.areEqual(this.f4285i, iVar.f4285i) && Intrinsics.areEqual(this.j, iVar.j) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f4286k, iVar.f4286k) && Intrinsics.areEqual(this.f4288m, iVar.f4288m) && Intrinsics.areEqual(this.f4289n, iVar.f4289n);
    }

    public final int hashCode() {
        return AbstractC1856e.c(2) + ((this.f4288m.hashCode() + ((this.f4286k.hashCode() + u.e(u.e((this.f4284h.hashCode() + ((this.f4283g.hashCode() + com.mapbox.common.b.b((this.f4281e.hashCode() + ((AbstractC1856e.c(1) + u.e((this.f4279c.hashCode() + ((this.f4278b.hashCode() + com.mapbox.common.b.b((((this.f4287l.hashCode() + (this.f4277a.hashCode() * 31)) * 31) - 1) * 31, 31, 1000L)) * 31)) * 31, 31, false)) * 31)) * 31, 31, this.f4282f.f12514a)) * 31)) * 961, 961, false), 31, true)) * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(3434) + this.f4277a + StubApp.getString2(3435) + this.f4287l + StubApp.getString2(3436) + this.f4278b + StubApp.getString2(3437) + this.f4279c + StubApp.getString2(3438) + this.f4280d + StubApp.getString2(3439) + this.f4281e + StubApp.getString2(3440) + this.f4282f + StubApp.getString2(3441) + this.f4283g + StubApp.getString2(3442) + this.f4284h + StubApp.getString2(3443) + this.f4285i + StubApp.getString2(3444) + this.j + StubApp.getString2(3445) + this.f4286k + StubApp.getString2(3446) + this.f4288m + StubApp.getString2(3447) + this.f4289n + ')';
    }
}
