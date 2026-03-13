package n;

import N.C0158d;
import N.InterfaceC0157c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: n.E, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1302E {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0157c interfaceC0157c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0157c = new Z9.q(clipData, 3);
            } else {
                C0158d c0158d = new C0158d();
                c0158d.f4773b = clipData;
                c0158d.f4774c = 3;
                interfaceC0157c = c0158d;
            }
            N.I.f(textView, interfaceC0157c.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0157c interfaceC0157c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0157c = new Z9.q(clipData, 3);
        } else {
            C0158d c0158d = new C0158d();
            c0158d.f4773b = clipData;
            c0158d.f4774c = 3;
            interfaceC0157c = c0158d;
        }
        N.I.f(view, interfaceC0157c.build());
        return true;
    }
}
