package m;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import l.InterfaceC1131b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p extends FrameLayout implements InterfaceC1131b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f16979a;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.f16979a = (CollapsibleActionView) view;
        addView(view);
    }
}
