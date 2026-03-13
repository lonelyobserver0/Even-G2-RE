package q1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f19890a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19891b;

    public g(long j, byte[] bArr) {
        this.f19890a = j;
        this.f19891b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f19890a, ((g) obj).f19890a);
    }
}
