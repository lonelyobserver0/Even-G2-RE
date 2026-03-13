package N;

import Z9.C0366a;
import android.animation.ValueAnimator;
import android.view.View;
import com.mapbox.maps.threading.AnimationThreadController;
import com.stub.StubApp;
import e7.InterfaceC0850a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class K implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4739b;

    public /* synthetic */ K(C0366a c0366a, View view) {
        this.f4738a = 0;
        this.f4739b = c0366a;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        switch (this.f4738a) {
            case 0:
                ((View) ((i.H) ((C0366a) this.f4739b).f9105b).f14530e.getParent()).invalidate();
                break;
            case 1:
                Y6.g updateInternalFun = (Y6.g) this.f4739b;
                Intrinsics.checkNotNullParameter(updateInternalFun, "$updateInternalFun");
                Intrinsics.checkNotNullParameter(it, "it");
                AnimationThreadController.INSTANCE.postOnMainThread(updateInternalFun);
                break;
            case 2:
                String string2 = StubApp.getString2(392);
                e7.e eVar = (e7.e) this.f4739b;
                Intrinsics.checkNotNullParameter(eVar, string2);
                Intrinsics.checkNotNullParameter(it, "it");
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                if (floatValue < eVar.f13663h.f14175g) {
                    InterfaceC0850a interfaceC0850a = eVar.f13658c;
                    if (interfaceC0850a == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("compassView");
                        interfaceC0850a = null;
                    }
                    ((e7.c) interfaceC0850a).setCompassAlpha(floatValue);
                    break;
                }
                break;
            default:
                m7.e this$0 = (m7.e) this.f4739b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                AnimationThreadController.INSTANCE.postOnMainThread(new A9.m(10, it, this$0));
                break;
        }
    }

    public /* synthetic */ K(Object obj, int i3) {
        this.f4738a = i3;
        this.f4739b = obj;
    }
}
