package androidx.recyclerview.widget;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f10108a;

    /* renamed from: b, reason: collision with root package name */
    public int f10109b;

    /* renamed from: c, reason: collision with root package name */
    public int f10110c;

    /* renamed from: d, reason: collision with root package name */
    public int f10111d;

    /* renamed from: e, reason: collision with root package name */
    public int f10112e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10113f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10114g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10115h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10116i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10117k;

    /* renamed from: l, reason: collision with root package name */
    public int f10118l;

    /* renamed from: m, reason: collision with root package name */
    public long f10119m;

    /* renamed from: n, reason: collision with root package name */
    public int f10120n;

    public final void a(int i3) {
        if ((this.f10111d & i3) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i3) + " but it is " + Integer.toBinaryString(this.f10111d));
    }

    public final int b() {
        return this.f10114g ? this.f10109b - this.f10110c : this.f10112e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f10108a + ", mData=null, mItemCount=" + this.f10112e + ", mIsMeasuring=" + this.f10116i + ", mPreviousLayoutItemCount=" + this.f10109b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f10110c + ", mStructureChanged=" + this.f10113f + ", mInPreLayout=" + this.f10114g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.f10117k + '}';
    }
}
