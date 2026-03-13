package androidx.recyclerview.widget;

import java.util.Arrays;

/* renamed from: androidx.recyclerview.widget.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0462o {

    /* renamed from: a, reason: collision with root package name */
    public int f10258a;

    /* renamed from: b, reason: collision with root package name */
    public int f10259b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f10260c;

    /* renamed from: d, reason: collision with root package name */
    public int f10261d;

    public final void a(int i3, int i10) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i11 = this.f10261d;
        int i12 = i11 * 2;
        int[] iArr = this.f10260c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f10260c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i12 >= iArr.length) {
            int[] iArr3 = new int[i11 * 4];
            this.f10260c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f10260c;
        iArr4[i12] = i3;
        iArr4[i12 + 1] = i10;
        this.f10261d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.f10261d = 0;
        int[] iArr = this.f10260c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        M m4 = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || m4 == null || !m4.f10046i) {
            return;
        }
        if (z2) {
            if (!recyclerView.mAdapterHelper.f()) {
                m4.i(recyclerView.mAdapter.a(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            m4.h(this.f10258a, this.f10259b, recyclerView.mState, this);
        }
        int i3 = this.f10261d;
        if (i3 > m4.j) {
            m4.j = i3;
            m4.f10047k = z2;
            recyclerView.mRecycler.l();
        }
    }
}
