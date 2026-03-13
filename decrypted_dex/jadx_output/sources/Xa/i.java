package Xa;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f8545a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f8546b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f8547c;

    static {
        i iVar = new i(StubApp.getString2(5287), 0);
        f8545a = iVar;
        i iVar2 = new i(StubApp.getString2(7416), 1);
        f8546b = iVar2;
        f8547c = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f8547c.clone();
    }
}
