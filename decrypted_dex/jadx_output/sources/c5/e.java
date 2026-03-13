package c5;

import com.stub.StubApp;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f10871a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f10872b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f10873c;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    static {
        e eVar = new e(StubApp.getString2(9447), 0);
        e eVar2 = new e(StubApp.getString2(9448), 1);
        e eVar3 = new e(StubApp.getString2(9449), 2);
        e eVar4 = new e(StubApp.getString2(9450), 3);
        e eVar5 = new e(StubApp.getString2(9451), 4);
        e eVar6 = new e(StubApp.getString2(9452), 5);
        e eVar7 = new e(StubApp.getString2(9453), 6);
        e eVar8 = new e(StubApp.getString2(343), 7);
        f10871a = eVar8;
        e eVar9 = new e(StubApp.getString2(9454), 8);
        e eVar10 = new e(StubApp.getString2(9455), 9);
        f10873c = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10};
        HashMap hashMap = new HashMap(4);
        f10872b = hashMap;
        hashMap.put(StubApp.getString2(9456), eVar7);
        hashMap.put(StubApp.getString2(9457), eVar6);
        hashMap.put(StubApp.getString2(9458), eVar10);
        hashMap.put(StubApp.getString2(9459), eVar);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f10873c.clone();
    }
}
