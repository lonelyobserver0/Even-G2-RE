package L5;

import android.content.Context;
import android.os.Bundle;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f4200a;

    public a(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f4200a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // L5.o
    public final Boolean a() {
        Bundle bundle = this.f4200a;
        String string2 = StubApp.getString2(3373);
        if (bundle.containsKey(string2)) {
            return Boolean.valueOf(bundle.getBoolean(string2));
        }
        return null;
    }

    @Override // L5.o
    public final Duration b() {
        Bundle bundle = this.f4200a;
        String string2 = StubApp.getString2(3374);
        if (bundle.containsKey(string2)) {
            return Duration.m1366boximpl(DurationKt.toDuration(bundle.getInt(string2), DurationUnit.SECONDS));
        }
        return null;
    }

    @Override // L5.o
    public final Double c() {
        Bundle bundle = this.f4200a;
        String string2 = StubApp.getString2(3375);
        if (bundle.containsKey(string2)) {
            return Double.valueOf(bundle.getDouble(string2));
        }
        return null;
    }

    @Override // L5.o
    public final Object d(Continuation continuation) {
        return Unit.INSTANCE;
    }
}
