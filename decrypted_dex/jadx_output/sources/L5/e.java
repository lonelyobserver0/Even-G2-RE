package L5;

import H5.C0069b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import x5.InterfaceC1913d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements o {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f4212a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1913d f4213b;

    /* renamed from: c, reason: collision with root package name */
    public final C0069b f4214c;

    /* renamed from: d, reason: collision with root package name */
    public final g f4215d;

    /* renamed from: e, reason: collision with root package name */
    public final J5.a f4216e;

    /* renamed from: f, reason: collision with root package name */
    public final Zb.e f4217f;

    public e(CoroutineContext backgroundDispatcher, InterfaceC1913d firebaseInstallationsApi, C0069b appInfo, g configsFetcher, J5.a lazySettingsCache) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(lazySettingsCache, "lazySettingsCache");
        this.f4212a = backgroundDispatcher;
        this.f4213b = firebaseInstallationsApi;
        this.f4214c = appInfo;
        this.f4215d = configsFetcher;
        this.f4216e = lazySettingsCache;
        this.f4217f = Zb.f.a();
    }

    @Override // L5.o
    public final Boolean a() {
        h hVar = e().f4252b;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            hVar = null;
        }
        return hVar.f4225a;
    }

    @Override // L5.o
    public final Duration b() {
        h hVar = e().f4252b;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            hVar = null;
        }
        Integer num = hVar.f4227c;
        if (num == null) {
            return null;
        }
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m1366boximpl(DurationKt.toDuration(num.intValue(), DurationUnit.SECONDS));
    }

    @Override // L5.o
    public final Double c() {
        h hVar = e().f4252b;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            hVar = null;
        }
        return hVar.f4226b;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:26:0x0061, B:27:0x00c8, B:29:0x00d2, B:32:0x00de, B:38:0x01a1, B:40:0x009b, B:42:0x00a5, B:43:0x00b6), top: B:7:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:26:0x0061, B:27:0x00c8, B:29:0x00d2, B:32:0x00de, B:38:0x01a1, B:40:0x009b, B:42:0x00a5, B:43:0x00b6), top: B:7:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:26:0x0061, B:27:0x00c8, B:29:0x00d2, B:32:0x00de, B:38:0x01a1, B:40:0x009b, B:42:0x00a5, B:43:0x00b6), top: B:7:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6 A[Catch: all -> 0x0065, TRY_ENTER, TryCatch #0 {all -> 0x0065, blocks: (B:26:0x0061, B:27:0x00c8, B:29:0x00d2, B:32:0x00de, B:38:0x01a1, B:40:0x009b, B:42:0x00a5, B:43:0x00b6), top: B:7:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    @Override // L5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.e.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final n e() {
        Object obj = this.f4216e.get();
        Intrinsics.checkNotNullExpressionValue(obj, "lazySettingsCache.get()");
        return (n) obj;
    }
}
