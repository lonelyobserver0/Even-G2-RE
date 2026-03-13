package o0;

import java.util.Objects;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f18256a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f18257b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f18258c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f18259d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f18260e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f18261f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f18262g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f18263h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f18264i;
    public Integer j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f18265k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f18266l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f18267m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f18268n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f18269o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f18270p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f18271q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f18272r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f18273s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f18274t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f18275u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f18276v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f18277w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f18278x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f18279y;

    /* renamed from: z, reason: collision with root package name */
    public M4.I f18280z;

    public final void a(int i3, byte[] bArr) {
        if (this.f18261f != null) {
            Integer valueOf = Integer.valueOf(i3);
            int i10 = AbstractC1560u.f20190a;
            if (!valueOf.equals(3) && Objects.equals(this.f18262g, 3)) {
                return;
            }
        }
        this.f18261f = (byte[]) bArr.clone();
        this.f18262g = Integer.valueOf(i3);
    }
}
