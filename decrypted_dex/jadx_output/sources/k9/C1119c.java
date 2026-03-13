package k9;

import R8.C0250h;
import android.animation.Animator;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k9.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1119c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i9.c f15500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0250h f15501b;

    public C1119c(i9.c cVar, C0250h c0250h) {
        this.f15500a = cVar;
        this.f15501b = c0250h;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        i9.c cVar = this.f15500a;
        C0250h animation2 = this.f15501b;
        Intrinsics.checkNotNullParameter(animation2, "animation");
        cVar.f14943a = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f15500a.a(this.f15501b);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        i9.c cVar = this.f15500a;
        C0250h animation2 = this.f15501b;
        Intrinsics.checkNotNullParameter(animation2, "animation");
        g gVar = i9.d.f14949n;
        i9.d dVar = cVar.f14944b;
        dVar.f14956g = gVar;
        int i3 = dVar.f14959k;
        int i10 = cVar.f14945c;
        if (i10 != i3) {
            dVar.f14959k = i10;
            Iterator it = dVar.j.iterator();
            if (it.hasNext()) {
                throw com.mapbox.common.b.e(it);
            }
        }
    }
}
