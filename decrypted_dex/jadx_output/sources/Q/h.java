package Q;

import N.C0160f;
import N.InterfaceC0159e;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {
    public static C0160f a(View view, C0160f c0160f) {
        CharSequence coerceToStyledText;
        String string2 = StubApp.getString2(5046);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(5047) + c0160f);
        }
        if (c0160f.f4781a.h() == 2) {
            return c0160f;
        }
        InterfaceC0159e interfaceC0159e = c0160f.f4781a;
        ClipData a3 = interfaceC0159e.a();
        int e10 = interfaceC0159e.e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i3 = 0; i3 < a3.getItemCount(); i3++) {
            ClipData.Item itemAt = a3.getItemAt(i3);
            if ((e10 & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z2) {
                    editable.insert(Selection.getSelectionEnd(editable), StubApp.getString2(3692));
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z2 = true;
                }
            }
        }
        return null;
    }
}
