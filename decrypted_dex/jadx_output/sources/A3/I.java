package A3;

import android.util.SparseArray;
import com.stub.StubApp;
import org.bouncycastle.asn1.x509.DisplayText;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f120a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ I[] f121b;

    /* JADX INFO: Fake field, exist only in values array */
    I EF1;

    static {
        I i3 = new I(StubApp.getString2(189), 0);
        I i10 = new I(StubApp.getString2(190), 1);
        I i11 = new I(StubApp.getString2(191), 2);
        I i12 = new I(StubApp.getString2(192), 3);
        I i13 = new I(StubApp.getString2(193), 4);
        I i14 = new I(StubApp.getString2(194), 5);
        I i15 = new I(StubApp.getString2(195), 6);
        I i16 = new I(StubApp.getString2(196), 7);
        I i17 = new I(StubApp.getString2(197), 8);
        I i18 = new I(StubApp.getString2(198), 9);
        I i19 = new I(StubApp.getString2(199), 10);
        I i20 = new I(StubApp.getString2(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE), 11);
        I i21 = new I(StubApp.getString2(201), 12);
        I i22 = new I(StubApp.getString2(202), 13);
        I i23 = new I(StubApp.getString2(203), 14);
        I i24 = new I(StubApp.getString2(204), 15);
        I i25 = new I(StubApp.getString2(205), 16);
        I i26 = new I(StubApp.getString2(206), 17);
        I i27 = new I(StubApp.getString2(207), 18);
        f121b = new I[]{i3, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27};
        SparseArray sparseArray = new SparseArray();
        f120a = sparseArray;
        sparseArray.put(0, i3);
        sparseArray.put(1, i10);
        sparseArray.put(2, i11);
        sparseArray.put(3, i12);
        sparseArray.put(4, i13);
        sparseArray.put(5, i14);
        sparseArray.put(6, i15);
        sparseArray.put(7, i16);
        sparseArray.put(8, i17);
        sparseArray.put(9, i18);
        sparseArray.put(10, i19);
        sparseArray.put(11, i20);
        sparseArray.put(12, i21);
        sparseArray.put(13, i22);
        sparseArray.put(14, i23);
        sparseArray.put(15, i24);
        sparseArray.put(16, i25);
        sparseArray.put(17, i26);
        sparseArray.put(-1, i27);
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f121b.clone();
    }
}
