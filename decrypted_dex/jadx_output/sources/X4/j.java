package X4;

import android.os.Handler;
import android.os.Looper;
import com.stub.StubApp;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final j f8405a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f8406b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f8407c;

    static {
        j jVar = new j(StubApp.getString2(3545), 0);
        f8405a = jVar;
        f8407c = new j[]{jVar};
        f8406b = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f8407c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f8406b.post(runnable);
    }
}
