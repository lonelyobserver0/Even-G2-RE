package m;

import android.view.ActionProvider;
import f4.C0882f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public C0882f f16976a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f16977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f16978c;

    public o(s sVar, ActionProvider actionProvider) {
        this.f16978c = sVar;
        this.f16977b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C0882f c0882f = this.f16976a;
        if (c0882f != null) {
            l lVar = ((n) c0882f.f13748b).f16963n;
            lVar.f16929h = true;
            lVar.p(true);
        }
    }
}
