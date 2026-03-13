package i9;

import R8.C0250h;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import k9.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c implements k9.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f14944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14945c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f14946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14947e;

    public c(d dVar, int i3, g gVar, int i10) {
        this.f14944b = dVar;
        this.f14945c = i3;
        this.f14946d = gVar;
        this.f14947e = i10;
    }

    @Override // k9.d
    public final void a(C0250h animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        boolean z2 = this.f14943a;
        d dVar = this.f14944b;
        if (!z2) {
            dVar.f14956g = this.f14946d;
            int i3 = dVar.f14959k;
            int i10 = this.f14947e;
            if (i10 != i3) {
                dVar.f14959k = i10;
                Iterator it = dVar.j.iterator();
                if (it.hasNext()) {
                    throw com.mapbox.common.b.e(it);
                }
            }
        }
        if (dVar.f14954e == animation) {
            dVar.f14954e = null;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = dVar.f14955f;
        Iterator it2 = copyOnWriteArraySet.iterator();
        if (it2.hasNext()) {
            throw com.mapbox.common.b.e(it2);
        }
        copyOnWriteArraySet.clear();
        dVar.c(dVar.f14952c.f15409r);
    }
}
