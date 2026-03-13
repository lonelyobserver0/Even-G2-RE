package kotlin.io;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001aH\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0003\"\u0004\b\u0001\u0010\u0001*\u0002H\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0006\u001a\u0018\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"use", "R", "T", "Ljava/io/Closeable;", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "closeFinally", "", "cause", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName(name = "CloseableKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class CloseableKt {
    @SinceKotlin(version = "1.1")
    @PublishedApi
    public static final void closeFinally(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                kotlin.ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }

    @InlineOnly
    private static final <T extends Closeable, R> R use(T t3, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R invoke = block.invoke(t3);
            InlineMarker.finallyStart(1);
            closeFinally(t3, null);
            InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }
}
