package androidx.datastore.preferences.protobuf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0420u f9740a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9741b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f9742c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9743d;

    public T(AbstractC0420u abstractC0420u, String str, Object[] objArr) {
        this.f9740a = abstractC0420u;
        this.f9741b = str;
        this.f9742c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f9743d = charAt;
            return;
        }
        int i3 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.f9743d = i3 | (charAt2 << i11);
                return;
            } else {
                i3 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final int a() {
        int i3 = this.f9743d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }
}
