package com.mapbox.common.logger;

import I6.a;
import J6.b;
import android.util.Log;
import androidx.annotation.Keep;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0016\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0018J\u001d\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u001aJ+\u0010\u0016\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001aJ+\u0010\u001c\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001aJ+\u0010\u001d\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001aJ+\u0010\u001e\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u0017J\u001d\u0010\u001f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u0018J\u001d\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u001aJ+\u0010\u001f\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R(\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010\u0003\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*¨\u0006+"}, d2 = {"Lcom/mapbox/common/logger/MapboxLogger;", "LI6/a;", "<init>", "()V", "", "requiredLogLevel", "", "tag", "msg", "", "tr", "Lkotlin/Function0;", "", "logBlock", "log", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "Lcom/mapbox/common/logger/LoggerObserver;", "observer", "setObserver", "(Lcom/mapbox/common/logger/LoggerObserver;)V", "removeObserver", "LJ6/a;", "v", "(LJ6/a;)V", "(LJ6/a;Ljava/lang/Throwable;)V", "LJ6/b;", "(LJ6/b;LJ6/a;)V", "(LJ6/b;LJ6/a;Ljava/lang/Throwable;)V", "d", "i", "w", "e", "DEFAULT_TAG", "Ljava/lang/String;", "logLevel", "I", "getLogLevel", "()I", "setLogLevel", "(I)V", "getLogLevel$annotations", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "liblogger_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxLogger implements a {
    private static final String DEFAULT_TAG = StubApp.getString2(13741);
    public static final MapboxLogger INSTANCE = new MapboxLogger();
    private static volatile int logLevel = 2;
    private static final AtomicReference<LoggerObserver> observer = new AtomicReference<>();

    private MapboxLogger() {
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    private final void log(int requiredLogLevel, String tag, String msg, Throwable tr, Function0<Unit> logBlock) {
        if (logLevel <= requiredLogLevel) {
            logBlock.invoke();
            LoggerObserver loggerObserver = observer.get();
            if (loggerObserver != null) {
                loggerObserver.log(requiredLogLevel, new LogEntry(tag, msg, tr));
            }
        }
    }

    public final void d(J6.a msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        d(null, msg, null);
    }

    public final void e(J6.a msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        e(null, msg, null);
    }

    public final int getLogLevel() {
        return logLevel;
    }

    public final void i(J6.a msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        i(null, msg, null);
    }

    public final void removeObserver() {
        observer.set(null);
    }

    public final void setLogLevel(int i3) {
        logLevel = i3;
    }

    public final void setObserver(LoggerObserver observer2) {
        Intrinsics.checkNotNullParameter(observer2, "observer");
        observer.set(observer2);
    }

    public final void v(J6.a msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        v(null, msg, null);
    }

    public final void w(J6.a msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        w(null, msg, null);
    }

    public final void d(J6.a msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr, "tr");
        d(null, msg, tr);
    }

    public final void e(J6.a msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr, "tr");
        e(null, msg, tr);
    }

    public final void i(J6.a msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr, "tr");
        i(null, msg, tr);
    }

    public final void v(J6.a msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr, "tr");
        v(null, msg, tr);
    }

    public final void w(J6.a msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr, "tr");
        w(null, msg, tr);
    }

    public final void d(b tag, J6.a msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        d(tag, msg, null);
    }

    public final void e(b tag, J6.a msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        e(tag, msg, null);
    }

    public final void i(b tag, J6.a msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        i(tag, msg, null);
    }

    public final void v(b tag, J6.a msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        v(tag, msg, null);
    }

    public final void w(b tag, J6.a msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        w(tag, msg, null);
    }

    @Override // I6.a
    public void d(final b tag, final J6.a msg, final Throwable tr) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        log(3, tag != null ? tag.f3412a : null, msg.f3411a, tr, new Function0<Unit>() { // from class: com.mapbox.common.logger.MapboxLogger$d$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String string2;
                b bVar = b.this;
                if (bVar == null || (string2 = bVar.f3412a) == null) {
                    string2 = StubApp.getString2(13741);
                }
                Log.d(string2, msg.f3411a, tr);
            }
        });
    }

    @Override // I6.a
    public void e(final b tag, final J6.a msg, final Throwable tr) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        log(6, tag != null ? tag.f3412a : null, msg.f3411a, tr, new Function0<Unit>() { // from class: com.mapbox.common.logger.MapboxLogger$e$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String string2;
                b bVar = b.this;
                if (bVar == null || (string2 = bVar.f3412a) == null) {
                    string2 = StubApp.getString2(13741);
                }
                Log.e(string2, msg.f3411a, tr);
            }
        });
    }

    @Override // I6.a
    public void i(final b tag, final J6.a msg, final Throwable tr) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        log(4, tag != null ? tag.f3412a : null, msg.f3411a, tr, new Function0<Unit>() { // from class: com.mapbox.common.logger.MapboxLogger$i$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String string2;
                b bVar = b.this;
                if (bVar == null || (string2 = bVar.f3412a) == null) {
                    string2 = StubApp.getString2(13741);
                }
                Log.i(string2, msg.f3411a, tr);
            }
        });
    }

    public void v(final b tag, final J6.a msg, final Throwable tr) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        log(2, tag != null ? tag.f3412a : null, msg.f3411a, tr, new Function0<Unit>() { // from class: com.mapbox.common.logger.MapboxLogger$v$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String string2;
                b bVar = b.this;
                if (bVar == null || (string2 = bVar.f3412a) == null) {
                    string2 = StubApp.getString2(13741);
                }
                Log.v(string2, msg.f3411a, tr);
            }
        });
    }

    @Override // I6.a
    public void w(final b tag, final J6.a msg, final Throwable tr) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        log(5, tag != null ? tag.f3412a : null, msg.f3411a, tr, new Function0<Unit>() { // from class: com.mapbox.common.logger.MapboxLogger$w$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String string2;
                b bVar = b.this;
                if (bVar == null || (string2 = bVar.f3412a) == null) {
                    string2 = StubApp.getString2(13741);
                }
                Log.w(string2, msg.f3411a, tr);
            }
        });
    }
}
