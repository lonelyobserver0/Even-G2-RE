package L3;

import android.util.SparseArray;
import com.stub.StubApp;
import i2.u;
import java.util.HashMap;
import y3.d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f4176a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f4177b;

    static {
        HashMap hashMap = new HashMap();
        f4177b = hashMap;
        hashMap.put(d.f23506a, 0);
        hashMap.put(d.f23507b, 1);
        hashMap.put(d.f23508c, 2);
        for (d dVar : hashMap.keySet()) {
            f4176a.append(((Integer) f4177b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f4177b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(StubApp.getString2(3360) + dVar);
    }

    public static d b(int i3) {
        d dVar = (d) f4176a.get(i3);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(u.p(i3, StubApp.getString2(3361)));
    }
}
