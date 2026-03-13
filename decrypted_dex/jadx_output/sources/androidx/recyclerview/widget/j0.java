package androidx.recyclerview.widget;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public int f10198a;

    /* renamed from: b, reason: collision with root package name */
    public int f10199b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10200c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10201d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10202e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f10203f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f10204g;

    public j0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f10204g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f10198a = -1;
        this.f10199b = Integer.MIN_VALUE;
        this.f10200c = false;
        this.f10201d = false;
        this.f10202e = false;
        int[] iArr = this.f10203f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
