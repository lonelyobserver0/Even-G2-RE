package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9997b;

    public /* synthetic */ A(RecyclerView recyclerView, int i3) {
        this.f9996a = i3;
        this.f9997b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f9997b;
        switch (this.f9996a) {
            case 0:
                if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.mIsAttached) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.mLayoutSuppressed) {
                        recyclerView.consumePendingUpdateOperations();
                        break;
                    } else {
                        recyclerView.mLayoutWasDefered = true;
                        break;
                    }
                }
                break;
            default:
                I i3 = recyclerView.mItemAnimator;
                if (i3 != null) {
                    C0457j c0457j = (C0457j) i3;
                    ArrayList arrayList = c0457j.f10188h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0457j.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0457j.f10190k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0457j.f10189i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j = c0457j.f10014d;
                            if (hasNext) {
                                e0 e0Var = (e0) it.next();
                                View view = e0Var.f10140a;
                                ViewPropertyAnimator animate = view.animate();
                                c0457j.f10196q.add(e0Var);
                                animate.setDuration(j).alpha(0.0f).setListener(new C0452e(c0457j, e0Var, animate, view)).start();
                                arrayList = arrayList;
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0457j.f10192m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0451d runnableC0451d = new RunnableC0451d(c0457j, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0451d.run();
                                    } else {
                                        e0 e0Var2 = ((C0456i) arrayList5.get(0)).f10180a;
                                        WeakHashMap weakHashMap = N.I.f4732a;
                                        e0Var2.f10140a.postOnAnimationDelayed(runnableC0451d, j);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0457j.f10193n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0451d runnableC0451d2 = new RunnableC0451d(c0457j, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0451d2.run();
                                    } else {
                                        View view2 = ((C0455h) arrayList6.get(0)).f10172a.f10140a;
                                        WeakHashMap weakHashMap2 = N.I.f4732a;
                                        view2.postOnAnimationDelayed(runnableC0451d2, j);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0457j.f10191l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0451d runnableC0451d3 = new RunnableC0451d(c0457j, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0451d3.run();
                                    } else {
                                        if (isEmpty) {
                                            j = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0457j.f10015e : 0L, isEmpty3 ? 0L : c0457j.f10016f) + j;
                                        View view3 = ((e0) arrayList7.get(0)).f10140a;
                                        WeakHashMap weakHashMap3 = N.I.f4732a;
                                        view3.postOnAnimationDelayed(runnableC0451d3, max);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.mPostedAnimatorRunner = false;
                break;
        }
    }
}
