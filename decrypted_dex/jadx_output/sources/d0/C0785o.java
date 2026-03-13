package d0;

import android.app.Dialog;
import android.view.View;

/* renamed from: d0.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0785o extends AbstractC0793x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f13317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0786p f13318b;

    public C0785o(DialogInterfaceOnCancelListenerC0786p dialogInterfaceOnCancelListenerC0786p, r rVar) {
        this.f13318b = dialogInterfaceOnCancelListenerC0786p;
        this.f13317a = rVar;
    }

    @Override // d0.AbstractC0793x
    public final View g(int i3) {
        r rVar = this.f13317a;
        if (rVar.h()) {
            return rVar.g(i3);
        }
        Dialog dialog = this.f13318b.f13330x0;
        if (dialog != null) {
            return dialog.findViewById(i3);
        }
        return null;
    }

    @Override // d0.AbstractC0793x
    public final boolean h() {
        return this.f13317a.h() || this.f13318b.f13320B0;
    }
}
