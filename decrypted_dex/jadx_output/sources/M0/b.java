package M0;

import java.util.NoSuchElementException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final long f4436a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4437b;

    /* renamed from: c, reason: collision with root package name */
    public long f4438c;

    public b(long j, long j3) {
        this.f4436a = j;
        this.f4437b = j3;
        this.f4438c = j - 1;
    }

    public final void a() {
        long j = this.f4438c;
        if (j < this.f4436a || j > this.f4437b) {
            throw new NoSuchElementException();
        }
    }

    @Override // M0.m
    public final boolean next() {
        long j = this.f4438c + 1;
        this.f4438c = j;
        return !(j > this.f4437b);
    }
}
