package t2;

import com.stub.StubApp;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final i f21162a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f21163b;

    static {
        i iVar = new i(StubApp.getString2(3545), 0);
        f21162a = iVar;
        f21163b = new i[]{iVar};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f21163b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return StubApp.getString2(23453);
    }
}
