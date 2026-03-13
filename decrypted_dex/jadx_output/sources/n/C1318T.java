package n;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: n.T, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1318T extends E.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17463h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17464i;
    public final /* synthetic */ WeakReference j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1322X f17465k;

    public C1318T(C1322X c1322x, int i3, int i10, WeakReference weakReference) {
        this.f17465k = c1322x;
        this.f17463h = i3;
        this.f17464i = i10;
        this.j = weakReference;
    }

    @Override // E.b
    public final void e(int i3) {
    }

    @Override // E.b
    public final void f(Typeface typeface) {
        int i3 = this.f17463h;
        if (i3 != -1) {
            typeface = AbstractC1321W.a(typeface, i3, (this.f17464i & 2) != 0);
        }
        C1322X c1322x = this.f17465k;
        if (c1322x.f17482m) {
            c1322x.f17481l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new l2.g(c1322x.j, 1, textView, typeface));
                } else {
                    textView.setTypeface(typeface, c1322x.j);
                }
            }
        }
    }
}
