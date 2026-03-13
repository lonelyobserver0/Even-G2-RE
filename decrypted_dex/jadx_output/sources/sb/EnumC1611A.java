package sb;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import l4.C1223z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sb.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EnumC1611A {

    /* renamed from: b, reason: collision with root package name */
    public static final C1223z f20840b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1611A[] f20841c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f20842d;

    /* renamed from: a, reason: collision with root package name */
    public final int f20843a;

    static {
        EnumC1611A[] enumC1611AArr = {new EnumC1611A(StubApp.getString2(23161), 0, 0), new EnumC1611A(StubApp.getString2(23162), 1, 1), new EnumC1611A(StubApp.getString2(23163), 2, 2)};
        f20841c = enumC1611AArr;
        f20842d = EnumEntriesKt.enumEntries(enumC1611AArr);
        f20840b = new C1223z(24);
    }

    public EnumC1611A(String str, int i3, int i10) {
        this.f20843a = i10;
    }

    public static EnumC1611A valueOf(String str) {
        return (EnumC1611A) Enum.valueOf(EnumC1611A.class, str);
    }

    public static EnumC1611A[] values() {
        return (EnumC1611A[]) f20841c.clone();
    }
}
