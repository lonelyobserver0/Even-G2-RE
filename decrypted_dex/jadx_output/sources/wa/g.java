package wa;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public double f22199a;

    /* renamed from: b, reason: collision with root package name */
    public final c f22200b;

    public g(c cVar) {
        this.f22200b = cVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Double.compare(((g) obj).f22199a, this.f22199a);
    }
}
