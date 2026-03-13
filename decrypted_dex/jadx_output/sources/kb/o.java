package kb;

import android.content.ComponentName;
import android.content.Intent;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f15559a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15560b;

    /* renamed from: c, reason: collision with root package name */
    public int f15561c;

    public o(ComponentName componentName) {
        this.f15559a = componentName;
    }

    public abstract void a(Intent intent);

    public final void b(int i3) {
        if (!this.f15560b) {
            this.f15560b = true;
            this.f15561c = i3;
        } else {
            if (this.f15561c == i3) {
                return;
            }
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(19195), StubApp.getString2(19196));
            u2.append(this.f15561c);
            throw new IllegalArgumentException(u2.toString());
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}
