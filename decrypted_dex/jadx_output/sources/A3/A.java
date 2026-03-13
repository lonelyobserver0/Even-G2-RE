package A3;

import android.util.SparseArray;
import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f116a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ A[] f117b;

    /* JADX INFO: Fake field, exist only in values array */
    A EF0;

    static {
        A a3 = new A(StubApp.getString2(166), 0);
        A a9 = new A(StubApp.getString2(167), 1);
        f116a = a9;
        f117b = new A[]{a3, a9};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, a3);
        sparseArray.put(5, a9);
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f117b.clone();
    }
}
