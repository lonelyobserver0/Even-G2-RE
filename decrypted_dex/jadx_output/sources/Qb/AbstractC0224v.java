package Qb;

import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: Qb.v, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0224v {
    public static final Object a(Object obj) {
        if (!(obj instanceof C0220t)) {
            return Result.m40constructorimpl(obj);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m40constructorimpl(ResultKt.createFailure(((C0220t) obj).f5894a));
    }
}
