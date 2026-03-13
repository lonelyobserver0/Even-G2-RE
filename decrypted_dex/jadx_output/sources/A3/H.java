package A3;

import android.util.SparseArray;
import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f118a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ H[] f119b;

    /* JADX INFO: Fake field, exist only in values array */
    H EF1;

    static {
        H h2 = new H(StubApp.getString2(168), 0);
        H h4 = new H(StubApp.getString2(169), 1);
        H h5 = new H(StubApp.getString2(170), 2);
        H h9 = new H(StubApp.getString2(171), 3);
        H h10 = new H(StubApp.getString2(172), 4);
        H h11 = new H(StubApp.getString2(173), 5);
        H h12 = new H(StubApp.getString2(174), 6);
        H h13 = new H(StubApp.getString2(175), 7);
        H h14 = new H(StubApp.getString2(176), 8);
        H h15 = new H(StubApp.getString2(177), 9);
        H h16 = new H(StubApp.getString2(178), 10);
        H h17 = new H(StubApp.getString2(179), 11);
        H h18 = new H(StubApp.getString2(180), 12);
        H h19 = new H(StubApp.getString2(181), 13);
        H h20 = new H(StubApp.getString2(182), 14);
        H h21 = new H(StubApp.getString2(183), 15);
        H h22 = new H(StubApp.getString2(184), 16);
        H h23 = new H(StubApp.getString2(185), 17);
        H h24 = new H(StubApp.getString2(186), 18);
        H h25 = new H(StubApp.getString2(187), 19);
        f119b = new H[]{h2, h4, h5, h9, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20, h21, h22, h23, h24, h25, new H(StubApp.getString2(188), 20)};
        SparseArray sparseArray = new SparseArray();
        f118a = sparseArray;
        sparseArray.put(0, h2);
        sparseArray.put(1, h4);
        sparseArray.put(2, h5);
        sparseArray.put(3, h9);
        sparseArray.put(4, h10);
        sparseArray.put(5, h11);
        sparseArray.put(6, h12);
        sparseArray.put(7, h13);
        sparseArray.put(8, h14);
        sparseArray.put(9, h15);
        sparseArray.put(10, h16);
        sparseArray.put(11, h17);
        sparseArray.put(12, h18);
        sparseArray.put(13, h19);
        sparseArray.put(14, h20);
        sparseArray.put(15, h21);
        sparseArray.put(16, h22);
        sparseArray.put(17, h23);
        sparseArray.put(18, h24);
        sparseArray.put(19, h25);
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f119b.clone();
    }
}
