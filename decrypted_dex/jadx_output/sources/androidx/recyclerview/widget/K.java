package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10017a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10018b;

    public /* synthetic */ K(Object obj, int i3) {
        this.f10017a = i3;
        this.f10018b = obj;
    }

    public int a(View view) {
        switch (this.f10017a) {
            case 0:
                N n10 = (N) view.getLayoutParams();
                ((M) this.f10018b).getClass();
                return view.getRight() + ((N) view.getLayoutParams()).f10053b.right + ((ViewGroup.MarginLayoutParams) n10).rightMargin;
            default:
                N n11 = (N) view.getLayoutParams();
                ((M) this.f10018b).getClass();
                return view.getBottom() + ((N) view.getLayoutParams()).f10053b.bottom + ((ViewGroup.MarginLayoutParams) n11).bottomMargin;
        }
    }

    public int b(View view) {
        switch (this.f10017a) {
            case 0:
                N n10 = (N) view.getLayoutParams();
                ((M) this.f10018b).getClass();
                return (view.getLeft() - ((N) view.getLayoutParams()).f10053b.left) - ((ViewGroup.MarginLayoutParams) n10).leftMargin;
            default:
                N n11 = (N) view.getLayoutParams();
                ((M) this.f10018b).getClass();
                return (view.getTop() - ((N) view.getLayoutParams()).f10053b.top) - ((ViewGroup.MarginLayoutParams) n11).topMargin;
        }
    }

    public int c() {
        switch (this.f10017a) {
            case 0:
                M m4 = (M) this.f10018b;
                return m4.f10050n - m4.A();
            default:
                M m10 = (M) this.f10018b;
                return m10.f10051o - m10.y();
        }
    }

    public int d() {
        switch (this.f10017a) {
            case 0:
                return ((M) this.f10018b).z();
            default:
                return ((M) this.f10018b).B();
        }
    }
}
