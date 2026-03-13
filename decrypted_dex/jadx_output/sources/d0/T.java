package d0;

import N.AbstractC0179z;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.EnumC0439n;
import androidx.lifecycle.InterfaceC0444t;
import com.stub.StubApp;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import m.ViewOnKeyListenerC1256C;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class T implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13213b;

    public /* synthetic */ T(Object obj, int i3) {
        this.f13212a = i3;
        this.f13213b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object obj = this.f13213b;
        switch (this.f13212a) {
            case 0:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = N.I.f4732a;
                AbstractC0179z.c(view2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                ((k7.d) obj).b(view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f13212a) {
            case 0:
                return;
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                k7.d dVar = (k7.d) this.f13213b;
                if (dVar.f15481c) {
                    dVar.f15481c = false;
                    InterfaceC0444t interfaceC0444t = dVar.f15482d;
                    if (interfaceC0444t == null) {
                        throw new IllegalStateException(StubApp.getString2(2906));
                    }
                    EnumC0439n enumC0439n = interfaceC0444t.i().f9925c;
                    EnumC0439n enumC0439n2 = EnumC0439n.f9915c;
                    if (enumC0439n.a(enumC0439n2)) {
                        dVar.f15480b.g(enumC0439n2);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                m.f fVar = (m.f) this.f13213b;
                ViewTreeObserver viewTreeObserver = fVar.f16883A;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.f16883A = view.getViewTreeObserver();
                    }
                    fVar.f16883A.removeGlobalOnLayoutListener(fVar.j);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ViewOnKeyListenerC1256C viewOnKeyListenerC1256C = (ViewOnKeyListenerC1256C) this.f13213b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1256C.f16853q;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1256C.f16853q = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1256C.f16853q.removeGlobalOnLayoutListener(viewOnKeyListenerC1256C.j);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
