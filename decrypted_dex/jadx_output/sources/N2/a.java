package N2;

import Qb.I;
import android.service.notification.StatusBarNotification;
import com.even.even_core.services.nls.EvNLService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4838a;

    /* renamed from: b, reason: collision with root package name */
    public List f4839b;

    /* renamed from: c, reason: collision with root package name */
    public int f4840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StatusBarNotification f4841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EvNLService f4842e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(StatusBarNotification statusBarNotification, EvNLService evNLService, Continuation continuation) {
        super(2, continuation);
        this.f4841d = statusBarNotification;
        this.f4842e = evNLService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f4841d, this.f4842e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (r12 == null) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
