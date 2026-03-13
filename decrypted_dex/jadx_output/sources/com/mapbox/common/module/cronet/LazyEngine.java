package com.mapbox.common.module.cronet;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import com.mapbox.bindgen.Value;
import com.mapbox.common.FeatureTelemetryCounter;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.SettingsServiceFactory;
import com.mapbox.common.SettingsServiceStorageType;
import com.stub.StubApp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import q4.j;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/mapbox/common/module/cronet/LazyEngine;", "", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "context", "Landroid/content/Context;", "cronetProvider", "Lorg/chromium/net/CronetProvider;", "<set-?>", "Lorg/chromium/net/CronetEngine;", "engine", "getEngine", "()Lorg/chromium/net/CronetEngine;", "configureEngine", "handleCronetLogging", "", "initializeProvider", "tryInstallFromGooglePlay", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LazyEngine {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context context;
    private CronetProvider cronetProvider;
    private volatile CronetEngine engine;
    private final Executor executor;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/mapbox/common/module/cronet/LazyEngine$Companion;", "", "<init>", "()V", "", "onCronetNotAvailable", "Lorg/chromium/net/CronetProvider;", "provider", "onCronetAvailable", "(Lorg/chromium/net/CronetProvider;)V", "Landroid/content/Context;", "context", "Lq4/j;", "Ljava/lang/Void;", "installCronetFromPlayServices", "(Landroid/content/Context;)Lq4/j;", "", "canInstallFromGooglePlay", "()Z", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean canInstallFromGooglePlay() {
            AtomicBoolean atomicBoolean;
            atomicBoolean = LazyEngineKt.canInstallFromGooglePlay;
            return atomicBoolean.getAndSet(false);
        }

        public final j installCronetFromPlayServices(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            j installProvider = CronetProviderInstaller.installProvider(context);
            Intrinsics.checkNotNullExpressionValue(installProvider, "installProvider(context)");
            return installProvider;
        }

        public final void onCronetAvailable(CronetProvider provider) {
            boolean z2;
            String string2;
            Intrinsics.checkNotNullParameter(provider, "provider");
            String name = provider.getName();
            if (Intrinsics.areEqual(name, "App-Packaged-Cronet-Provider")) {
                string2 = StubApp.getString2(13757);
            } else {
                z2 = LazyEngineKt.isPlayServicesCronetProviderInstallerAvailable;
                string2 = (z2 && Intrinsics.areEqual(name, "Google-Play-Services-Cronet-Provider")) ? StubApp.getString2(13758) : StubApp.getString2(13759);
            }
            FeatureTelemetryCounter.create(StubApp.getString2(13760) + string2 + StubApp.getString2(13761)).increment();
        }

        public final void onCronetNotAvailable() {
            FeatureTelemetryCounter.create(StubApp.getString2(13762)).increment();
            MapboxCommonLogger.INSTANCE.logW$common_release(StubApp.getString2(13763), StubApp.getString2(13764));
        }

        private Companion() {
        }
    }

    public LazyEngine(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.context = MapboxSDKCommon.INSTANCE.getContext();
        initializeProvider();
    }

    @SuppressLint({"SimpleDateFormat"})
    private final CronetEngine configureEngine() {
        try {
            CronetProvider cronetProvider = this.cronetProvider;
            Intrinsics.checkNotNull(cronetProvider);
            CronetEngine build = cronetProvider.createBuilder().enableBrotli(true).enableQuic(true).enableHttp2(true).addQuicHint(StubApp.getString2("13765"), 443, 443).addQuicHint(StubApp.getString2("13766"), 443, 443).addQuicHint(StubApp.getString2("13767"), 443, 443).enableHttpCache(0, 0L).build();
            build.addRequestFinishedListener(new CronetRequestFinishedListener(this.executor));
            handleCronetLogging(build);
            Companion companion = INSTANCE;
            CronetProvider cronetProvider2 = this.cronetProvider;
            Intrinsics.checkNotNull(cronetProvider2);
            companion.onCronetAvailable(cronetProvider2);
            return build;
        } catch (Throwable unused) {
            CopyOnWriteArraySet<String> disabledProviders = LazyEngineKt.getDisabledProviders();
            CronetProvider cronetProvider3 = this.cronetProvider;
            Intrinsics.checkNotNull(cronetProvider3);
            disabledProviders.add(cronetProvider3.getName());
            initializeProvider();
            if (this.cronetProvider != null) {
                return configureEngine();
            }
            return null;
        }
    }

    private final void handleCronetLogging(CronetEngine engine) {
        if (!Intrinsics.areEqual(SettingsServiceFactory.getInstance(SettingsServiceStorageType.NON_PERSISTENT).get(StubApp.getString2(13768), new Value(false)).getValue(), new Value(true))) {
            if (engine != null) {
                engine.stopNetLog();
                return;
            }
            return;
        }
        String str = MapboxSDKCommon.INSTANCE.getContext().getFilesDir().getAbsolutePath() + StubApp.getString2(13770) + new SimpleDateFormat(StubApp.getString2(13769)).format(new Date()) + StubApp.getString2(13771);
        if (engine != null) {
            engine.startNetLogToFile(str, false);
        }
        MapboxCommonLogger.INSTANCE.logW$common_release(StubApp.getString2(13763), StubApp.getString2(13772) + str);
    }

    private final void initializeProvider() {
        CronetProvider findCronetProvider = LazyEngineKt.findCronetProvider(this.context);
        this.cronetProvider = findCronetProvider;
        if (findCronetProvider == null) {
            tryInstallFromGooglePlay();
        }
    }

    private final void tryInstallFromGooglePlay() {
        Companion companion = INSTANCE;
        if (!companion.canInstallFromGooglePlay()) {
            companion.onCronetNotAvailable();
        } else {
            companion.installCronetFromPlayServices(this.context).addOnSuccessListener(new com.mapbox.common.location.a(4, new Function1<Void, Unit>() { // from class: com.mapbox.common.module.cronet.LazyEngine$tryInstallFromGooglePlay$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Void r12) {
                    invoke2(r12);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Void r22) {
                    Context context;
                    LazyEngine lazyEngine = LazyEngine.this;
                    context = lazyEngine.context;
                    lazyEngine.cronetProvider = LazyEngineKt.findCronetProvider(context);
                }
            })).addOnFailureListener(new a(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryInstallFromGooglePlay$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryInstallFromGooglePlay$lambda$2(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        INSTANCE.onCronetNotAvailable();
    }

    public final CronetEngine getEngine() {
        if (this.cronetProvider == null) {
            return null;
        }
        if (this.engine == null) {
            synchronized (this) {
                try {
                    if (this.engine == null) {
                        this.engine = configureEngine();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.engine;
    }
}
