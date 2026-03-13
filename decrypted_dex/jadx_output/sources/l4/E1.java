package l4;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class E1 {

    /* renamed from: a, reason: collision with root package name */
    public final F1 f16039a;

    /* renamed from: b, reason: collision with root package name */
    public int f16040b = 1;

    /* renamed from: c, reason: collision with root package name */
    public long f16041c = a();

    public E1(F1 f12) {
        this.f16039a = f12;
    }

    public final long a() {
        F1 f12 = this.f16039a;
        S3.D.h(f12);
        long longValue = ((Long) AbstractC1148D.f16022v.a(null)).longValue();
        long longValue2 = ((Long) AbstractC1148D.f16024w.a(null)).longValue();
        for (int i3 = 1; i3 < this.f16040b; i3++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        f12.f().getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
