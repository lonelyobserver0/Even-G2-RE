package d0;

import android.animation.AnimatorSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d0.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0780j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0780j f13314a = new C0780j();

    public final void a(AnimatorSet animatorSet) {
        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j) {
        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j);
    }
}
