package D4;

import N.C0156b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends C0156b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1276e;

    public /* synthetic */ a(Object obj, int i3) {
        this.f1275d = i3;
        this.f1276e = obj;
    }

    @Override // N.C0156b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1275d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1276e).f11958d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // N.C0156b
    public final void d(View view, O.e eVar) {
        switch (this.f1275d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f4768a;
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f5069a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) this.f1276e;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f11959e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f11958d);
                break;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f4768a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f5069a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) this.f1276e).f11962A);
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate3 = this.f4768a;
                AccessibilityNodeInfo accessibilityNodeInfo3 = eVar.f5069a;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                com.google.android.material.datepicker.i iVar = (com.google.android.material.datepicker.i) this.f1276e;
                accessibilityNodeInfo3.setHintText(iVar.f11921x0.getVisibility() == 0 ? iVar.I().getResources().getString(2131755215) : iVar.I().getResources().getString(2131755213));
                break;
        }
    }
}
