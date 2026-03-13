package N;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* renamed from: N.y, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0178y {

    /* renamed from: a, reason: collision with root package name */
    public int f4809a;

    /* renamed from: b, reason: collision with root package name */
    public int f4810b;

    /* renamed from: c, reason: collision with root package name */
    public int f4811c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4812d;

    public AbstractC0178y() {
        if (I4.e.f3133c == null) {
            I4.e.f3133c = new I4.e(24);
        }
    }

    public int a(int i3) {
        if (i3 < this.f4811c) {
            return ((ByteBuffer) this.f4812d).getShort(this.f4810b + i3);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f4810b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f4810b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f4809a);
            if (!((Class) this.f4812d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate c10 = I.c(view);
            C0156b c0156b = c10 == null ? null : c10 instanceof C0155a ? ((C0155a) c10).f4766a : new C0156b(c10);
            if (c0156b == null) {
                c0156b = new C0156b();
            }
            I.i(view, c0156b);
            view.setTag(this.f4809a, obj);
            I.e(view, this.f4811c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
