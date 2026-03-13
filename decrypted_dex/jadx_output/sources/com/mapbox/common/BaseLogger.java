package com.mapbox.common;

import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\tR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/mapbox/common/BaseLogger;", "", "<init>", "()V", "", "tag", "message", "", "debug", "(Ljava/lang/String;Ljava/lang/String;)V", "info", "warning", "error", "LI6/a;", "loggerInstance$delegate", "Lkotlin/Lazy;", "getLoggerInstance", "()LI6/a;", "loggerInstance", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BaseLogger {
    public static final BaseLogger INSTANCE = new BaseLogger();

    /* renamed from: loggerInstance$delegate, reason: from kotlin metadata */
    private static final Lazy loggerInstance = LazyKt.lazy(new Function0<I6.a>() { // from class: com.mapbox.common.BaseLogger$loggerInstance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final I6.a invoke() {
            return (I6.a) MapboxModuleProvider.INSTANCE.createModule(C6.b.f1126e, new Function1<C6.b, ModuleProviderArgument[]>() { // from class: com.mapbox.common.BaseLogger$loggerInstance$2.1
                @Override // kotlin.jvm.functions.Function1
                public final ModuleProviderArgument[] invoke(C6.b it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new ModuleProviderArgument[0];
                }
            });
        }
    });

    private BaseLogger() {
    }

    @JvmStatic
    public static final void debug(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        INSTANCE.getLoggerInstance().d(new J6.b(tag), new J6.a(message), null);
    }

    @JvmStatic
    public static final void error(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        INSTANCE.getLoggerInstance().e(new J6.b(tag), new J6.a(message), null);
    }

    private final I6.a getLoggerInstance() {
        return (I6.a) loggerInstance.getValue();
    }

    @JvmStatic
    public static final void info(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        INSTANCE.getLoggerInstance().i(new J6.b(tag), new J6.a(message), null);
    }

    @JvmStatic
    public static final void warning(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        INSTANCE.getLoggerInstance().w(new J6.b(tag), new J6.a(message), null);
    }
}
