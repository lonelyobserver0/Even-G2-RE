package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0410j {

    /* renamed from: a, reason: collision with root package name */
    public int f9807a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9808b;

    public abstract void a(int i3);

    public abstract int b(int i3, int i10);

    public abstract int c();

    public abstract boolean d();

    public abstract void e(int i3);

    public abstract int f(int i3);

    public abstract boolean g();

    public abstract C0407g h();

    public abstract double i();

    public abstract int j();

    public abstract int k();

    public abstract long l();

    public abstract float m();

    public abstract int n();

    public abstract long o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract String t();

    public abstract String u();

    public abstract int v();

    public abstract int w();

    public abstract long x();

    public abstract boolean y(int i3);

    public void z() {
        int v2;
        do {
            v2 = v();
            if (v2 == 0) {
                return;
            }
            int i3 = this.f9807a;
            if (i3 >= 100) {
                throw new C0424y("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f9807a = i3 + 1;
            this.f9807a--;
        } while (y(v2));
    }
}
