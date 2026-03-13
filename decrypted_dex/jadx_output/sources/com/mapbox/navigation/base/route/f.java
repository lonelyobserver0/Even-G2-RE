package com.mapbox.navigation.base.route;

import Qb.I;
import com.mapbox.bindgen.DataRef;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f12491a;

    /* renamed from: b, reason: collision with root package name */
    public int f12492b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12493c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f12494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DataRef f12495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f12496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f12497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j, DataRef dataRef, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f12494d = j;
        this.f12495e = dataRef;
        this.f12496f = str;
        this.f12497g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = new f(this.f12494d, this.f12495e, this.f12496f, this.f12497g, continuation);
        fVar.f12493c = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.base.route.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
