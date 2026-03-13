package f4;

import com.stub.StubApp;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f4.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EnumC0873A implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0873A f13737a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0873A[] f13738b;

    static {
        EnumC0873A enumC0873A = new EnumC0873A(StubApp.getString2(3545), 0);
        f13737a = enumC0873A;
        f13738b = new EnumC0873A[]{enumC0873A};
    }

    public static EnumC0873A[] values() {
        return (EnumC0873A[]) f13738b.clone();
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
