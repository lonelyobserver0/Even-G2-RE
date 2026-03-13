package S;

import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f6419a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f6420b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6421c;

    /* renamed from: d, reason: collision with root package name */
    public final I4.e f6422d;

    public c(boolean z2, I4.e eVar) {
        this.f6421c = z2;
        this.f6422d = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f6422d.getClass();
        Rect rect = this.f6419a;
        ((O.e) obj).f(rect);
        Rect rect2 = this.f6420b;
        ((O.e) obj2).f(rect2);
        int i3 = rect.top;
        int i10 = rect2.top;
        if (i3 < i10) {
            return -1;
        }
        if (i3 > i10) {
            return 1;
        }
        int i11 = rect.left;
        int i12 = rect2.left;
        boolean z2 = this.f6421c;
        if (i11 < i12) {
            return z2 ? 1 : -1;
        }
        if (i11 > i12) {
            return z2 ? -1 : 1;
        }
        int i13 = rect.bottom;
        int i14 = rect2.bottom;
        if (i13 < i14) {
            return -1;
        }
        if (i13 > i14) {
            return 1;
        }
        int i15 = rect.right;
        int i16 = rect2.right;
        if (i15 < i16) {
            return z2 ? 1 : -1;
        }
        if (i15 > i16) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
