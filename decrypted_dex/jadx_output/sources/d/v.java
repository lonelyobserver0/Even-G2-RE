package d;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class v implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f13105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f13106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f13107c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f13108d;

    public v(t tVar, t tVar2, u uVar, u uVar2) {
        this.f13105a = tVar;
        this.f13106b = tVar2;
        this.f13107c = uVar;
        this.f13108d = uVar2;
    }

    public final void onBackCancelled() {
        this.f13108d.invoke();
    }

    public final void onBackInvoked() {
        this.f13107c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f13106b.invoke(new C0759a(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f13105a.invoke(new C0759a(backEvent));
    }
}
