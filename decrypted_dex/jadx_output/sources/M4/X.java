package M4;

import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class X extends Y implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final X f4575b = new X(0);

    /* renamed from: c, reason: collision with root package name */
    public static final X f4576c = new X(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4577a;

    public /* synthetic */ X(int i3) {
        this.f4577a = i3;
    }

    @Override // M4.Y
    public final Y a() {
        switch (this.f4577a) {
            case 0:
                return f4576c;
            default:
                return f4575b;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4577a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f4577a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
