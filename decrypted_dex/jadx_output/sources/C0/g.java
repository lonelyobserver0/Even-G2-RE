package C0;

import o0.C1435j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f928a;

    /* renamed from: b, reason: collision with root package name */
    public final f f929b;

    /* renamed from: c, reason: collision with root package name */
    public final long f930c;

    /* renamed from: d, reason: collision with root package name */
    public final int f931d;

    /* renamed from: e, reason: collision with root package name */
    public final long f932e;

    /* renamed from: f, reason: collision with root package name */
    public final C1435j f933f;

    /* renamed from: g, reason: collision with root package name */
    public final String f934g;

    /* renamed from: h, reason: collision with root package name */
    public final String f935h;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final long f936k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f937l;

    public g(String str, f fVar, long j, int i3, long j3, C1435j c1435j, String str2, String str3, long j10, long j11, boolean z2) {
        this.f928a = str;
        this.f929b = fVar;
        this.f930c = j;
        this.f931d = i3;
        this.f932e = j3;
        this.f933f = c1435j;
        this.f934g = str2;
        this.f935h = str3;
        this.j = j10;
        this.f936k = j11;
        this.f937l = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l9 = (Long) obj;
        long longValue = l9.longValue();
        long j = this.f932e;
        if (j > longValue) {
            return 1;
        }
        return j < l9.longValue() ? -1 : 0;
    }
}
