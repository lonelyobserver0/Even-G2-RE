package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0450c {

    /* renamed from: a, reason: collision with root package name */
    public final B f10121a;

    /* renamed from: b, reason: collision with root package name */
    public final Cc.a f10122b = new Cc.a(2);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10123c = new ArrayList();

    public C0450c(B b2) {
        this.f10121a = b2;
    }

    public final void a(int i3, View view, boolean z2) {
        RecyclerView recyclerView = this.f10121a.f9998a;
        int childCount = i3 < 0 ? recyclerView.getChildCount() : f(i3);
        this.f10122b.J(childCount, z2);
        if (z2) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = this.f10121a.f9998a;
        int childCount = i3 < 0 ? recyclerView.getChildCount() : f(i3);
        this.f10122b.J(childCount, z2);
        if (z2) {
            i(view);
        }
        e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.j() && !childViewHolderInt.o()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(Xa.h.j(recyclerView, sb2));
            }
            childViewHolderInt.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i3) {
        e0 childViewHolderInt;
        int f10 = f(i3);
        this.f10122b.L(f10);
        RecyclerView recyclerView = this.f10121a.f9998a;
        View childAt = recyclerView.getChildAt(f10);
        if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
            if (childViewHolderInt.j() && !childViewHolderInt.o()) {
                StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(Xa.h.j(recyclerView, sb2));
            }
            childViewHolderInt.a(256);
        }
        recyclerView.detachViewFromParent(f10);
    }

    public final View d(int i3) {
        return this.f10121a.f9998a.getChildAt(f(i3));
    }

    public final int e() {
        return this.f10121a.f9998a.getChildCount() - this.f10123c.size();
    }

    public final int f(int i3) {
        if (i3 < 0) {
            return -1;
        }
        int childCount = this.f10121a.f9998a.getChildCount();
        int i10 = i3;
        while (i10 < childCount) {
            Cc.a aVar = this.f10122b;
            int G4 = i3 - (i10 - aVar.G(i10));
            if (G4 == 0) {
                while (aVar.I(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += G4;
        }
        return -1;
    }

    public final View g(int i3) {
        return this.f10121a.f9998a.getChildAt(i3);
    }

    public final int h() {
        return this.f10121a.f9998a.getChildCount();
    }

    public final void i(View view) {
        this.f10123c.add(view);
        B b2 = this.f10121a;
        e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            int i3 = childViewHolderInt.f10155q;
            if (i3 != -1) {
                childViewHolderInt.f10154p = i3;
            } else {
                WeakHashMap weakHashMap = N.I.f4732a;
                childViewHolderInt.f10154p = childViewHolderInt.f10140a.getImportantForAccessibility();
            }
            b2.f9998a.setChildImportantForAccessibilityInternal(childViewHolderInt, 4);
        }
    }

    public final void j(View view) {
        if (this.f10123c.remove(view)) {
            B b2 = this.f10121a;
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                b2.f9998a.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.f10154p);
                childViewHolderInt.f10154p = 0;
            }
        }
    }

    public final String toString() {
        return this.f10122b.toString() + ", hidden list:" + this.f10123c.size();
    }
}
