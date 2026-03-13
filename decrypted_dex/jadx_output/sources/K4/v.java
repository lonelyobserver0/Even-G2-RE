package K4;

import N.C0156b;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class v extends C0156b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f3715d;

    public v(TextInputLayout textInputLayout) {
        this.f3715d = textInputLayout;
    }

    @Override // N.C0156b
    public void d(View view, O.e eVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4768a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f5069a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f3715d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = false;
        boolean z10 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        if (!isEmpty) {
            accessibilityNodeInfo.setText(text);
        } else if (!isEmpty2) {
            accessibilityNodeInfo.setText(hint);
        }
        if (!isEmpty2) {
            accessibilityNodeInfo.setHintText(hint);
            if (isEmpty && !isEmpty2) {
                z2 = true;
            }
            accessibilityNodeInfo.setShowingHintText(z2);
        }
        if (z10) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
            accessibilityNodeInfo.setContentInvalid(true);
        }
    }
}
