package P0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f5416a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5417b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5418c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5419d;

    public i(int i3, int i10, int i11, int i12) {
        this.f5416a = i3;
        this.f5417b = i10;
        this.f5418c = i11;
        this.f5419d = i12;
    }

    public final boolean a(int i3) {
        if (i3 == 1) {
            if (this.f5416a - this.f5417b <= 1) {
                return false;
            }
        } else if (this.f5418c - this.f5419d <= 1) {
            return false;
        }
        return true;
    }
}
