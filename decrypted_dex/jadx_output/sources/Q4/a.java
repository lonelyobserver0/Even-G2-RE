package Q4;

import com.stub.StubApp;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5730a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f5731b;

    static {
        a aVar = new a(StubApp.getString2(3545), 0);
        f5730a = aVar;
        f5731b = new a[]{aVar};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5731b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return StubApp.getString2(5165);
    }
}
