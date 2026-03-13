package T1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public n f7141a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f7142b;

    /* JADX WARN: Removed duplicated region for block: B:117:0x01e2 A[EDGE_INSN: B:117:0x01e2->B:118:0x01e2 BREAK  A[LOOP:1: B:17:0x0087->B:29:0x01d9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.q.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f7142b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = r.f7145c;
        ViewGroup viewGroup2 = this.f7142b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) r.a().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((n) it.next()).w(viewGroup2);
            }
        }
        this.f7141a.i(true);
    }
}
