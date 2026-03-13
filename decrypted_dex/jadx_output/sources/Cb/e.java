package Cb;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class e implements Comparable {
    public void a() {
    }

    public abstract int b();

    public abstract Ab.h c();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b() - ((e) obj).b();
    }

    public void d() {
    }

    public abstract void e(Mb.a aVar);
}
