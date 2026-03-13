package M;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f4427a;

    /* renamed from: b, reason: collision with root package name */
    public int f4428b;

    public b(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException(StubApp.getString2(3472));
        }
        this.f4427a = new Object[i3];
    }

    public Object a() {
        int i3 = this.f4428b;
        if (i3 <= 0) {
            return null;
        }
        int i10 = i3 - 1;
        Object[] objArr = this.f4427a;
        Object obj = objArr[i10];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f4428b--;
        return obj;
    }

    public boolean b(Object instance) {
        Object[] objArr;
        boolean z2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i3 = this.f4428b;
        int i10 = 0;
        while (true) {
            objArr = this.f4427a;
            if (i10 >= i3) {
                z2 = false;
                break;
            }
            if (objArr[i10] == instance) {
                z2 = true;
                break;
            }
            i10++;
        }
        if (z2) {
            throw new IllegalStateException(StubApp.getString2(3473));
        }
        int i11 = this.f4428b;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = instance;
        this.f4428b = i11 + 1;
        return true;
    }

    public b() {
        this.f4427a = new Object[256];
    }
}
