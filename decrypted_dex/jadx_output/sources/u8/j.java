package u8;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f21472a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f21473b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f21474c;

    static {
        j jVar = new j(StubApp.getString2(23580), 0);
        f21472a = jVar;
        j jVar2 = new j(StubApp.getString2(23581), 1);
        f21473b = jVar2;
        f21474c = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f21474c.clone();
    }
}
