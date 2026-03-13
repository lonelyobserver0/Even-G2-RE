package V2;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f7722a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7723b;

    public a() {
        Intrinsics.checkNotNullParameter("语音识别配置或音频配置为空", StubApp.getString2(6492));
        this.f7722a = "语音识别配置或音频配置为空";
        this.f7723b = StubApp.getString2(6493);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f7722a, ((a) obj).f7722a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f7723b;
    }

    public final int hashCode() {
        return this.f7722a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(6494)), this.f7722a, StubApp.getString2(74));
    }
}
