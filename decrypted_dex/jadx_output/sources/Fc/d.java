package Fc;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2357a = new d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int indexOf$default;
        int min;
        Intrinsics.checkNotNullParameter(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f2355a;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int intValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i3 = intValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        Throwable thrown = record.getThrown();
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = (String) c.f2356b.get(loggerName);
        if (str == null) {
            str = StringsKt.take(loggerName, 23);
        }
        if (Log.isLoggable(str, i3)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i10 = 0;
            while (i10 < length) {
                indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) message, '\n', i10, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = length;
                }
                while (true) {
                    min = Math.min(indexOf$default, i10 + 4000);
                    String substring = message.substring(i10, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i3, str, substring);
                    if (min >= indexOf$default) {
                        break;
                    } else {
                        i10 = min;
                    }
                }
                i10 = min + 1;
            }
        }
    }
}
