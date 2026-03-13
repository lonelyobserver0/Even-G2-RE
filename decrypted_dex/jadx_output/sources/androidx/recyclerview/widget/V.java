package androidx.recyclerview.widget;

import N.C0156b;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10084a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f10085b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10086c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10087d;

    /* renamed from: e, reason: collision with root package name */
    public int f10088e;

    /* renamed from: f, reason: collision with root package name */
    public int f10089f;

    /* renamed from: g, reason: collision with root package name */
    public U f10090g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f10091h;

    public V(RecyclerView recyclerView) {
        this.f10091h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f10084a = arrayList;
        this.f10085b = null;
        this.f10086c = new ArrayList();
        this.f10087d = Collections.unmodifiableList(arrayList);
        this.f10088e = 2;
        this.f10089f = 2;
    }

    public static void d(ViewGroup viewGroup, boolean z2) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                d((ViewGroup) childAt, true);
            }
        }
        if (z2) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    public final void a(e0 e0Var, boolean z2) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(e0Var);
        View view = e0Var.f10140a;
        RecyclerView recyclerView = this.f10091h;
        g0 g0Var = recyclerView.mAccessibilityDelegate;
        if (g0Var != null) {
            f0 f0Var = g0Var.f10171e;
            N.I.i(view, f0Var != null ? (C0156b) f0Var.f10164e.remove(view) : null);
        }
        if (z2 && recyclerView.mState != null) {
            recyclerView.mViewInfoStore.d(e0Var);
        }
        e0Var.f10156r = null;
        U c10 = c();
        c10.getClass();
        int i3 = e0Var.f10145f;
        ArrayList arrayList = c10.a(i3).f10078a;
        if (((T) c10.f10082a.get(i3)).f10079b <= arrayList.size()) {
            return;
        }
        e0Var.m();
        arrayList.add(e0Var);
    }

    public final int b(int i3) {
        RecyclerView recyclerView = this.f10091h;
        if (i3 >= 0 && i3 < recyclerView.mState.b()) {
            return !recyclerView.mState.f10114g ? i3 : recyclerView.mAdapterHelper.e(i3, 0);
        }
        StringBuilder u2 = Xa.h.u(i3, "invalid position ", ". State item count is ");
        u2.append(recyclerView.mState.b());
        u2.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(u2.toString());
    }

    public final U c() {
        if (this.f10090g == null) {
            U u2 = new U();
            u2.f10082a = new SparseArray();
            u2.f10083b = 0;
            this.f10090g = u2;
        }
        return this.f10090g;
    }

    public final void e() {
        ArrayList arrayList = this.f10086c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            C0462o c0462o = this.f10091h.mPrefetchRegistry;
            int[] iArr = c0462o.f10260c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0462o.f10261d = 0;
        }
    }

    public final void f(int i3) {
        ArrayList arrayList = this.f10086c;
        a((e0) arrayList.get(i3), true);
        arrayList.remove(i3);
    }

    public final void g(View view) {
        e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean j = childViewHolderInt.j();
        RecyclerView recyclerView = this.f10091h;
        if (j) {
            recyclerView.removeDetachedView(view, false);
        }
        if (childViewHolderInt.i()) {
            childViewHolderInt.f10152n.k(childViewHolderInt);
        } else if (childViewHolderInt.p()) {
            childViewHolderInt.j &= -33;
        }
        h(childViewHolderInt);
        if (recyclerView.mItemAnimator == null || childViewHolderInt.g()) {
            return;
        }
        recyclerView.mItemAnimator.d(childViewHolderInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(androidx.recyclerview.widget.e0 r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.V.h(androidx.recyclerview.widget.e0):void");
    }

    public final void i(View view) {
        e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean z2 = (childViewHolderInt.j & 12) != 0;
        RecyclerView recyclerView = this.f10091h;
        if (!z2 && childViewHolderInt.k() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.f10085b == null) {
                this.f10085b = new ArrayList();
            }
            childViewHolderInt.f10152n = this;
            childViewHolderInt.f10153o = true;
            this.f10085b.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.f() && !childViewHolderInt.h() && !recyclerView.mAdapter.f10000b) {
            throw new IllegalArgumentException(Xa.h.j(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        childViewHolderInt.f10152n = this;
        childViewHolderInt.f10153o = false;
        this.f10084a.add(childViewHolderInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0422, code lost:
    
        if (r10.f() == false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x044b, code lost:
    
        if ((r8 + r11) >= r28) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c9, code lost:
    
        if (r10.f10145f != 0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x051b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.e0 j(int r27, long r28) {
        /*
            Method dump skipped, instructions count: 1351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.V.j(int, long):androidx.recyclerview.widget.e0");
    }

    public final void k(e0 e0Var) {
        if (e0Var.f10153o) {
            this.f10085b.remove(e0Var);
        } else {
            this.f10084a.remove(e0Var);
        }
        e0Var.f10152n = null;
        e0Var.f10153o = false;
        e0Var.j &= -33;
    }

    public final void l() {
        M m4 = this.f10091h.mLayout;
        this.f10089f = this.f10088e + (m4 != null ? m4.j : 0);
        ArrayList arrayList = this.f10086c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f10089f; size--) {
            f(size);
        }
    }
}
