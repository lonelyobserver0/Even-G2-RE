package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: androidx.recyclerview.widget.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RunnableC0464q implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f10277e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final A.i f10278f = new A.i(3);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f10279a;

    /* renamed from: b, reason: collision with root package name */
    public long f10280b;

    /* renamed from: c, reason: collision with root package name */
    public long f10281c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f10282d;

    public static e0 c(RecyclerView recyclerView, int i3, long j) {
        int h2 = recyclerView.mChildHelper.h();
        for (int i10 = 0; i10 < h2; i10++) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i10));
            if (childViewHolderInt.f10142c == i3 && !childViewHolderInt.f()) {
                return null;
            }
        }
        V v2 = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            e0 j3 = v2.j(i3, j);
            if (j3 != null) {
                if (!j3.e() || j3.f()) {
                    v2.a(j3, false);
                } else {
                    v2.g(j3.f10140a);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return j3;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i3, int i10) {
        if (recyclerView.isAttachedToWindow() && this.f10280b == 0) {
            this.f10280b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0462o c0462o = recyclerView.mPrefetchRegistry;
        c0462o.f10258a = i3;
        c0462o.f10259b = i10;
    }

    public final void b(long j) {
        C0463p c0463p;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0463p c0463p2;
        ArrayList arrayList = this.f10279a;
        int size = arrayList.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i10);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i3 += recyclerView3.mPrefetchRegistry.f10261d;
            }
        }
        ArrayList arrayList2 = this.f10282d;
        arrayList2.ensureCapacity(i3);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0462o c0462o = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(c0462o.f10259b) + Math.abs(c0462o.f10258a);
                for (int i13 = 0; i13 < c0462o.f10261d * 2; i13 += 2) {
                    if (i11 >= arrayList2.size()) {
                        c0463p2 = new C0463p();
                        arrayList2.add(c0463p2);
                    } else {
                        c0463p2 = (C0463p) arrayList2.get(i11);
                    }
                    int[] iArr = c0462o.f10260c;
                    int i14 = iArr[i13 + 1];
                    c0463p2.f10268a = i14 <= abs;
                    c0463p2.f10269b = abs;
                    c0463p2.f10270c = i14;
                    c0463p2.f10271d = recyclerView4;
                    c0463p2.f10272e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList2, f10278f);
        for (int i15 = 0; i15 < arrayList2.size() && (recyclerView = (c0463p = (C0463p) arrayList2.get(i15)).f10271d) != null; i15++) {
            e0 c10 = c(recyclerView, c0463p.f10272e, c0463p.f10268a ? LongCompanionObject.MAX_VALUE : j);
            if (c10 != null && c10.f10141b != null && c10.e() && !c10.f() && (recyclerView2 = (RecyclerView) c10.f10141b.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                C0462o c0462o2 = recyclerView2.mPrefetchRegistry;
                c0462o2.b(recyclerView2, true);
                if (c0462o2.f10261d != 0) {
                    try {
                        int i16 = J.g.f3258a;
                        Trace.beginSection("RV Nested Prefetch");
                        b0 b0Var = recyclerView2.mState;
                        C c11 = recyclerView2.mAdapter;
                        b0Var.f10111d = 1;
                        b0Var.f10112e = c11.a();
                        b0Var.f10114g = false;
                        b0Var.f10115h = false;
                        b0Var.f10116i = false;
                        for (int i17 = 0; i17 < c0462o2.f10261d * 2; i17 += 2) {
                            c(recyclerView2, c0462o2.f10260c[i17], j);
                        }
                        Trace.endSection();
                        c0463p.f10268a = false;
                        c0463p.f10269b = 0;
                        c0463p.f10270c = 0;
                        c0463p.f10271d = null;
                        c0463p.f10272e = 0;
                    } catch (Throwable th) {
                        int i18 = J.g.f3258a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0463p.f10268a = false;
            c0463p.f10269b = 0;
            c0463p.f10270c = 0;
            c0463p.f10271d = null;
            c0463p.f10272e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i3 = J.g.f3258a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f10279a;
            if (arrayList.isEmpty()) {
                this.f10280b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f10280b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j) + this.f10281c);
                this.f10280b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f10280b = 0L;
            int i11 = J.g.f3258a;
            Trace.endSection();
            throw th;
        }
    }
}
