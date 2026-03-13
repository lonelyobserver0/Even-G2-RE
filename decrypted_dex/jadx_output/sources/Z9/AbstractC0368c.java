package Z9;

import com.stub.StubApp;
import java.util.HashMap;

/* renamed from: Z9.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0368c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9112a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9113b = new HashMap(250);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9114c = new HashMap(250);

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f9115d = new HashMap(250);

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f9116e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f9117f = new HashMap(250);

    public AbstractC0368c(boolean z2) {
        this.f9112a = z2;
    }

    public final void a(int i3, int i10) {
        if (!this.f9112a) {
            throw new IllegalStateException(StubApp.getString2(8167));
        }
        this.f9113b.put(Integer.valueOf(i10), Integer.valueOf(i3));
        this.f9116e.put(Integer.valueOf(i3), Integer.valueOf(i10));
    }

    public final void b(int i3, int i10, String str) {
        if (this.f9112a) {
            throw new IllegalStateException(StubApp.getString2(58));
        }
        this.f9113b.put(Integer.valueOf(i10), Integer.valueOf(i3));
        this.f9114c.put(Integer.valueOf(i3), Integer.valueOf(i10));
        this.f9115d.put(str, Integer.valueOf(i10));
        this.f9117f.put(Integer.valueOf(i3), str);
    }

    public int c(int i3) {
        if (!this.f9112a) {
            throw new IllegalStateException(StubApp.getString2(8167));
        }
        Integer num = (Integer) this.f9113b.get(Integer.valueOf(i3));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int d(int i3) {
        if (this.f9112a) {
            throw new IllegalStateException(StubApp.getString2(58));
        }
        Integer num = (Integer) this.f9113b.get(Integer.valueOf(i3));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int e(int i3) {
        if (this.f9112a) {
            throw new IllegalStateException(StubApp.getString2(58));
        }
        Integer num = (Integer) this.f9114c.get(Integer.valueOf(i3));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
