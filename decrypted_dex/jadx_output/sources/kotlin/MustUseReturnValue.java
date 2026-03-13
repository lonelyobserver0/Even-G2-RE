package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.TYPE})
@SinceKotlin(version = "2.2")
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lkotlin/MustUseReturnValue;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FILE, AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public @interface MustUseReturnValue {
}
