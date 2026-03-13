package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: androidx.recyclerview.widget.v, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0468v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10306a;

    /* renamed from: b, reason: collision with root package name */
    public int f10307b;

    /* renamed from: c, reason: collision with root package name */
    public int f10308c;

    /* renamed from: d, reason: collision with root package name */
    public int f10309d;

    /* renamed from: e, reason: collision with root package name */
    public int f10310e;

    /* renamed from: f, reason: collision with root package name */
    public int f10311f;

    /* renamed from: g, reason: collision with root package name */
    public int f10312g;

    /* renamed from: h, reason: collision with root package name */
    public int f10313h;

    /* renamed from: i, reason: collision with root package name */
    public int f10314i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public List f10315k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10316l;

    public final void a(View view) {
        int b2;
        int size = this.f10315k.size();
        View view2 = null;
        int i3 = IntCompanionObject.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((e0) this.f10315k.get(i10)).f10140a;
            N n10 = (N) view3.getLayoutParams();
            if (view3 != view && !n10.f10052a.h() && (b2 = (n10.f10052a.b() - this.f10309d) * this.f10310e) >= 0 && b2 < i3) {
                view2 = view3;
                if (b2 == 0) {
                    break;
                } else {
                    i3 = b2;
                }
            }
        }
        if (view2 == null) {
            this.f10309d = -1;
        } else {
            this.f10309d = ((N) view2.getLayoutParams()).f10052a.b();
        }
    }

    public final View b(V v2) {
        List list = this.f10315k;
        if (list == null) {
            View view = v2.j(this.f10309d, LongCompanionObject.MAX_VALUE).f10140a;
            this.f10309d += this.f10310e;
            return view;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = ((e0) this.f10315k.get(i3)).f10140a;
            N n10 = (N) view2.getLayoutParams();
            if (!n10.f10052a.h() && this.f10309d == n10.f10052a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
