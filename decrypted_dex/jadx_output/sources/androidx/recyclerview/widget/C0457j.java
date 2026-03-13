package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0457j extends I {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f10186s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10187g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f10188h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f10189i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f10190k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f10191l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f10192m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f10193n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f10194o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f10195p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f10196q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f10197r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((e0) arrayList.get(size)).f10140a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.I
    public final boolean a(e0 e0Var, e0 e0Var2, H h2, H h4) {
        int i3;
        int i10;
        int i11 = h2.f10009a;
        int i12 = h2.f10010b;
        if (e0Var2.o()) {
            int i13 = h2.f10009a;
            i10 = h2.f10010b;
            i3 = i13;
        } else {
            i3 = h4.f10009a;
            i10 = h4.f10010b;
        }
        if (e0Var == e0Var2) {
            return g(e0Var, i11, i12, i3, i10);
        }
        View view = e0Var.f10140a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(e0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(e0Var2);
        float f10 = -((int) ((i3 - i11) - translationX));
        View view2 = e0Var2.f10140a;
        view2.setTranslationX(f10);
        view2.setTranslationY(-((int) ((i10 - i12) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f10190k;
        C0455h c0455h = new C0455h();
        c0455h.f10172a = e0Var;
        c0455h.f10173b = e0Var2;
        c0455h.f10174c = i11;
        c0455h.f10175d = i12;
        c0455h.f10176e = i3;
        c0455h.f10177f = i10;
        arrayList.add(c0455h);
        return true;
    }

    @Override // androidx.recyclerview.widget.I
    public final void d(e0 e0Var) {
        View view = e0Var.f10140a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0456i) arrayList.get(size)).f10180a == e0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(e0Var);
                arrayList.remove(size);
            }
        }
        j(this.f10190k, e0Var);
        if (this.f10188h.remove(e0Var)) {
            view.setAlpha(1.0f);
            c(e0Var);
        }
        if (this.f10189i.remove(e0Var)) {
            view.setAlpha(1.0f);
            c(e0Var);
        }
        ArrayList arrayList2 = this.f10193n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, e0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f10192m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0456i) arrayList5.get(size4)).f10180a == e0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(e0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f10191l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(e0Var)) {
                view.setAlpha(1.0f);
                c(e0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f10196q.remove(e0Var);
        this.f10194o.remove(e0Var);
        this.f10197r.remove(e0Var);
        this.f10195p.remove(e0Var);
        i();
    }

    @Override // androidx.recyclerview.widget.I
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0456i c0456i = (C0456i) arrayList.get(size);
            View view = c0456i.f10180a.f10140a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0456i.f10180a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f10188h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((e0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f10189i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            e0 e0Var = (e0) arrayList3.get(size3);
            e0Var.f10140a.setAlpha(1.0f);
            c(e0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f10190k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0455h c0455h = (C0455h) arrayList4.get(size4);
            e0 e0Var2 = c0455h.f10172a;
            if (e0Var2 != null) {
                k(c0455h, e0Var2);
            }
            e0 e0Var3 = c0455h.f10173b;
            if (e0Var3 != null) {
                k(c0455h, e0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f10192m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0456i c0456i2 = (C0456i) arrayList6.get(size6);
                    View view2 = c0456i2.f10180a.f10140a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0456i2.f10180a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f10191l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    e0 e0Var4 = (e0) arrayList8.get(size8);
                    e0Var4.f10140a.setAlpha(1.0f);
                    c(e0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f10193n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0455h c0455h2 = (C0455h) arrayList10.get(size10);
                    e0 e0Var5 = c0455h2.f10172a;
                    if (e0Var5 != null) {
                        k(c0455h2, e0Var5);
                    }
                    e0 e0Var6 = c0455h2.f10173b;
                    if (e0Var6 != null) {
                        k(c0455h2, e0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f10196q);
            h(this.f10195p);
            h(this.f10194o);
            h(this.f10197r);
            ArrayList arrayList11 = this.f10012b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.I
    public final boolean f() {
        return (this.f10189i.isEmpty() && this.f10190k.isEmpty() && this.j.isEmpty() && this.f10188h.isEmpty() && this.f10195p.isEmpty() && this.f10196q.isEmpty() && this.f10194o.isEmpty() && this.f10197r.isEmpty() && this.f10192m.isEmpty() && this.f10191l.isEmpty() && this.f10193n.isEmpty()) ? false : true;
    }

    public final boolean g(e0 e0Var, int i3, int i10, int i11, int i12) {
        View view = e0Var.f10140a;
        int translationX = i3 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) view.getTranslationY());
        l(e0Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            c(e0Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        ArrayList arrayList = this.j;
        C0456i c0456i = new C0456i();
        c0456i.f10180a = e0Var;
        c0456i.f10181b = translationX;
        c0456i.f10182c = translationY;
        c0456i.f10183d = i11;
        c0456i.f10184e = i12;
        arrayList.add(c0456i);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f10012b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, e0 e0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0455h c0455h = (C0455h) arrayList.get(size);
            if (k(c0455h, e0Var) && c0455h.f10172a == null && c0455h.f10173b == null) {
                arrayList.remove(c0455h);
            }
        }
    }

    public final boolean k(C0455h c0455h, e0 e0Var) {
        if (c0455h.f10173b == e0Var) {
            c0455h.f10173b = null;
        } else {
            if (c0455h.f10172a != e0Var) {
                return false;
            }
            c0455h.f10172a = null;
        }
        e0Var.f10140a.setAlpha(1.0f);
        View view = e0Var.f10140a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(e0Var);
        return true;
    }

    public final void l(e0 e0Var) {
        if (f10186s == null) {
            f10186s = new ValueAnimator().getInterpolator();
        }
        e0Var.f10140a.animate().setInterpolator(f10186s);
        d(e0Var);
    }
}
