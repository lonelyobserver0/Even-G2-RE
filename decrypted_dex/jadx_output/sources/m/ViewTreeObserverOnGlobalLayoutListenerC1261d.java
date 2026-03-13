package m;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import n.C1313N;
import n.C1316Q;
import n.H0;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1261d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16879b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1261d(Object obj, int i3) {
        this.f16878a = i3;
        this.f16879b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f16878a) {
            case 0:
                f fVar = (f) this.f16879b;
                if (fVar.a()) {
                    ArrayList arrayList = fVar.f16892h;
                    if (arrayList.size() > 0 && !((e) arrayList.get(0)).f16880a.f17371A) {
                        View view = fVar.f16898q;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((e) it.next()).f16880a.show();
                            }
                            break;
                        } else {
                            fVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC1256C viewOnKeyListenerC1256C = (ViewOnKeyListenerC1256C) this.f16879b;
                if (viewOnKeyListenerC1256C.a()) {
                    H0 h0 = viewOnKeyListenerC1256C.f16847h;
                    if (!h0.f17371A) {
                        View view2 = viewOnKeyListenerC1256C.f16851n;
                        if (view2 != null && view2.isShown()) {
                            h0.show();
                            break;
                        } else {
                            viewOnKeyListenerC1256C.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C1316Q c1316q = (C1316Q) this.f16879b;
                if (!c1316q.getInternalPopup().a()) {
                    c1316q.f17454f.l(c1316q.getTextDirection(), c1316q.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c1316q.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C1313N c1313n = (C1313N) this.f16879b;
                C1316Q c1316q2 = c1313n.f17439I;
                c1313n.getClass();
                if (!c1316q2.isAttachedToWindow() || !c1316q2.getGlobalVisibleRect(c1313n.f17437G)) {
                    c1313n.dismiss();
                    break;
                } else {
                    c1313n.q();
                    c1313n.show();
                    break;
                }
                break;
        }
    }
}
