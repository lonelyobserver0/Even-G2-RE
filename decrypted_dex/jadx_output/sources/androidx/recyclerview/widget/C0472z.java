package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.recyclerview.widget.z, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0472z extends Y.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0472z(M m4, int i3) {
        super(m4);
        this.f10340d = i3;
    }

    @Override // Y.e
    public final int b(View view) {
        switch (this.f10340d) {
            case 0:
                N n10 = (N) view.getLayoutParams();
                ((M) this.f8656b).getClass();
                return view.getRight() + ((N) view.getLayoutParams()).f10053b.right + ((ViewGroup.MarginLayoutParams) n10).rightMargin;
            default:
                N n11 = (N) view.getLayoutParams();
                ((M) this.f8656b).getClass();
                return view.getBottom() + ((N) view.getLayoutParams()).f10053b.bottom + ((ViewGroup.MarginLayoutParams) n11).bottomMargin;
        }
    }

    @Override // Y.e
    public final int c(View view) {
        switch (this.f10340d) {
            case 0:
                N n10 = (N) view.getLayoutParams();
                ((M) this.f8656b).getClass();
                Rect rect = ((N) view.getLayoutParams()).f10053b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) n10).leftMargin + ((ViewGroup.MarginLayoutParams) n10).rightMargin;
            default:
                N n11 = (N) view.getLayoutParams();
                ((M) this.f8656b).getClass();
                Rect rect2 = ((N) view.getLayoutParams()).f10053b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) n11).topMargin + ((ViewGroup.MarginLayoutParams) n11).bottomMargin;
        }
    }

    @Override // Y.e
    public final int d(View view) {
        switch (this.f10340d) {
            case 0:
                N n10 = (N) view.getLayoutParams();
                ((M) this.f8656b).getClass();
                Rect rect = ((N) view.getLayoutParams()).f10053b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) n10).topMargin + ((ViewGroup.MarginLayoutParams) n10).bottomMargin;
            default:
                N n11 = (N) view.getLayoutParams();
                ((M) this.f8656b).getClass();
                Rect rect2 = ((N) view.getLayoutParams()).f10053b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) n11).leftMargin + ((ViewGroup.MarginLayoutParams) n11).rightMargin;
        }
    }

    @Override // Y.e
    public final int e(View view) {
        switch (this.f10340d) {
            case 0:
                N n10 = (N) view.getLayoutParams();
                ((M) this.f8656b).getClass();
                return (view.getLeft() - ((N) view.getLayoutParams()).f10053b.left) - ((ViewGroup.MarginLayoutParams) n10).leftMargin;
            default:
                N n11 = (N) view.getLayoutParams();
                ((M) this.f8656b).getClass();
                return (view.getTop() - ((N) view.getLayoutParams()).f10053b.top) - ((ViewGroup.MarginLayoutParams) n11).topMargin;
        }
    }

    @Override // Y.e
    public final int f() {
        switch (this.f10340d) {
            case 0:
                return ((M) this.f8656b).f10050n;
            default:
                return ((M) this.f8656b).f10051o;
        }
    }

    @Override // Y.e
    public final int g() {
        switch (this.f10340d) {
            case 0:
                M m4 = (M) this.f8656b;
                return m4.f10050n - m4.A();
            default:
                M m10 = (M) this.f8656b;
                return m10.f10051o - m10.y();
        }
    }

    @Override // Y.e
    public final int h() {
        switch (this.f10340d) {
            case 0:
                return ((M) this.f8656b).A();
            default:
                return ((M) this.f8656b).y();
        }
    }

    @Override // Y.e
    public final int i() {
        switch (this.f10340d) {
            case 0:
                return ((M) this.f8656b).f10048l;
            default:
                return ((M) this.f8656b).f10049m;
        }
    }

    @Override // Y.e
    public final int j() {
        switch (this.f10340d) {
            case 0:
                return ((M) this.f8656b).f10049m;
            default:
                return ((M) this.f8656b).f10048l;
        }
    }

    @Override // Y.e
    public final int k() {
        switch (this.f10340d) {
            case 0:
                return ((M) this.f8656b).z();
            default:
                return ((M) this.f8656b).B();
        }
    }

    @Override // Y.e
    public final int l() {
        switch (this.f10340d) {
            case 0:
                M m4 = (M) this.f8656b;
                return (m4.f10050n - m4.z()) - m4.A();
            default:
                M m10 = (M) this.f8656b;
                return (m10.f10051o - m10.B()) - m10.y();
        }
    }

    @Override // Y.e
    public final int m(View view) {
        switch (this.f10340d) {
            case 0:
                M m4 = (M) this.f8656b;
                Rect rect = (Rect) this.f8657c;
                m4.F(view, rect);
                return rect.right;
            default:
                M m10 = (M) this.f8656b;
                Rect rect2 = (Rect) this.f8657c;
                m10.F(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // Y.e
    public final int n(View view) {
        switch (this.f10340d) {
            case 0:
                M m4 = (M) this.f8656b;
                Rect rect = (Rect) this.f8657c;
                m4.F(view, rect);
                return rect.left;
            default:
                M m10 = (M) this.f8656b;
                Rect rect2 = (Rect) this.f8657c;
                m10.F(view, rect2);
                return rect2.top;
        }
    }

    @Override // Y.e
    public final void o(int i3) {
        switch (this.f10340d) {
            case 0:
                ((M) this.f8656b).J(i3);
                break;
            default:
                ((M) this.f8656b).K(i3);
                break;
        }
    }
}
