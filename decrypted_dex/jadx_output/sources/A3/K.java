package A3;

import android.util.SparseArray;
import com.stub.StubApp;
import org.bouncycastle.math.Primes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final K f122a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ K[] f123b;

    static {
        K k3 = new K(StubApp.getString2(208), 0);
        f122a = k3;
        K k4 = new K(StubApp.getString2(209), 1);
        K k10 = new K(StubApp.getString2(210), 2);
        K k11 = new K(StubApp.getString2(Primes.SMALL_FACTOR_LIMIT), 3);
        K k12 = new K(StubApp.getString2(212), 4);
        K k13 = new K(StubApp.getString2(213), 5);
        f123b = new K[]{k3, k4, k10, k11, k12, k13};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, k3);
        sparseArray.put(1, k4);
        sparseArray.put(2, k10);
        sparseArray.put(3, k11);
        sparseArray.put(4, k12);
        sparseArray.put(-1, k13);
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f123b.clone();
    }
}
