package N;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* renamed from: N.p, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0170p implements InterfaceC0171q {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f4799a;

    public C0170p(NestedScrollView nestedScrollView) {
        this.f4799a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // N.InterfaceC0171q
    public final void a(int i3, int i10, int i11, boolean z2) {
        this.f4799a.onScrollLimit(i3, i10, i11, z2);
    }

    @Override // N.InterfaceC0171q
    public final void k(int i3, int i10, int i11, int i12) {
        this.f4799a.onScrollProgress(i3, i10, i11, i12);
    }
}
