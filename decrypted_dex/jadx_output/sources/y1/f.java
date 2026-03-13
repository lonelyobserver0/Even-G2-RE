package y1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f23472a;

    /* renamed from: b, reason: collision with root package name */
    public final b f23473b;

    public f(int i3, b bVar) {
        this.f23472a = i3;
        this.f23473b = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f23472a, ((f) obj).f23472a);
    }
}
