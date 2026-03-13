package i;

import N.AbstractC0179z;
import N.I;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n extends Tc.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14620d;

    public /* synthetic */ n(Object obj, int i3) {
        this.f14619c = i3;
        this.f14620d = obj;
    }

    @Override // Tc.d, N.M
    public void b() {
        Object obj = this.f14620d;
        switch (this.f14619c) {
            case 0:
                ((m) obj).f14618b.f14693y.setVisibility(0);
                break;
            case 1:
                v vVar = (v) obj;
                vVar.f14693y.setVisibility(0);
                if (vVar.f14693y.getParent() instanceof View) {
                    View view = (View) vVar.f14693y.getParent();
                    WeakHashMap weakHashMap = I.f4732a;
                    AbstractC0179z.c(view);
                    break;
                }
                break;
        }
    }

    @Override // N.M
    public final void c() {
        Object obj = this.f14620d;
        switch (this.f14619c) {
            case 0:
                v vVar = ((m) obj).f14618b;
                vVar.f14693y.setAlpha(1.0f);
                vVar.f14650B.d(null);
                vVar.f14650B = null;
                break;
            case 1:
                v vVar2 = (v) obj;
                vVar2.f14693y.setAlpha(1.0f);
                vVar2.f14650B.d(null);
                vVar2.f14650B = null;
                break;
            default:
                Y.m mVar = (Y.m) obj;
                ((v) mVar.f8675c).f14693y.setVisibility(8);
                v vVar3 = (v) mVar.f8675c;
                PopupWindow popupWindow = vVar3.f14695z;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (vVar3.f14693y.getParent() instanceof View) {
                    View view = (View) vVar3.f14693y.getParent();
                    WeakHashMap weakHashMap = I.f4732a;
                    AbstractC0179z.c(view);
                }
                vVar3.f14693y.e();
                vVar3.f14650B.d(null);
                vVar3.f14650B = null;
                ViewGroup viewGroup = vVar3.f14652D;
                WeakHashMap weakHashMap2 = I.f4732a;
                AbstractC0179z.c(viewGroup);
                break;
        }
    }
}
