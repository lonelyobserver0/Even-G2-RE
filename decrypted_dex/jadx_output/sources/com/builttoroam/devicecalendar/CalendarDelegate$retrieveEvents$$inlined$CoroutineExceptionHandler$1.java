package com.builttoroam.devicecalendar;

import Qb.D;
import Qb.E;
import android.os.Handler;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/builttoroam/devicecalendar/CalendarDelegate$retrieveEvents$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "LQb/E;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CalendarDelegate.kt\ncom/builttoroam/devicecalendar/CalendarDelegate\n*L\n1#1,110:1\n344#2,4:111\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CalendarDelegate$retrieveEvents$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements E {
    final /* synthetic */ MethodChannel.Result $pendingChannelResult$inlined;
    final /* synthetic */ CalendarDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarDelegate$retrieveEvents$$inlined$CoroutineExceptionHandler$1(D d8, CalendarDelegate calendarDelegate, MethodChannel.Result result) {
        super(d8);
        this.this$0 = calendarDelegate;
        this.$pendingChannelResult$inlined = result;
    }

    @Override // Qb.E
    public void handleException(CoroutineContext context, final Throwable exception) {
        Handler handler;
        handler = this.this$0.uiThreadHandler;
        final CalendarDelegate calendarDelegate = this.this$0;
        final MethodChannel.Result result = this.$pendingChannelResult$inlined;
        handler.post(new Runnable() { // from class: com.builttoroam.devicecalendar.CalendarDelegate$retrieveEvents$exceptionHandler$1$1
            @Override // java.lang.Runnable
            public final void run() {
                CalendarDelegate.this.finishWithError(StubApp.getString2(9669), exception.getMessage(), result);
            }
        });
    }
}
