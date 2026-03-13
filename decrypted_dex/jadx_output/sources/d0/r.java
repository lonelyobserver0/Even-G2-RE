package d0;

import android.view.View;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r extends AbstractC0793x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0789t f13334a;

    public r(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        this.f13334a = abstractComponentCallbacksC0789t;
    }

    @Override // d0.AbstractC0793x
    public final View g(int i3) {
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13334a;
        View view = abstractComponentCallbacksC0789t.f13354I;
        if (view != null) {
            return view.findViewById(i3);
        }
        throw new IllegalStateException(StubApp.getString2(16452) + abstractComponentCallbacksC0789t + StubApp.getString2(16750));
    }

    @Override // d0.AbstractC0793x
    public final boolean h() {
        return this.f13334a.f13354I != null;
    }
}
