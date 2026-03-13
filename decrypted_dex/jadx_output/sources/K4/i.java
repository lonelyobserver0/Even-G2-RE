package K4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends v {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3663e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f3663e = oVar;
    }

    @Override // K4.v, N.C0156b
    public final void d(View view, O.e eVar) {
        super.d(view, eVar);
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f5069a;
        accessibilityNodeInfo.setClassName(StubApp.getString2(3256));
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // N.C0156b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        o oVar = this.f3663e;
        AutoCompleteTextView c10 = o.c(oVar, oVar.f3682a.getEditText());
        if (accessibilityEvent.getEventType() == 1 && oVar.f3679l.isTouchExplorationEnabled()) {
            o.d(oVar, c10);
        }
    }
}
