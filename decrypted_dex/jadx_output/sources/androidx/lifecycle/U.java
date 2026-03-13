package androidx.lifecycle;

import i0.C1031d;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface U {
    default S b(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default S f(Class modelClass, C1031d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return b(modelClass);
    }

    default S n(KClass modelClass, C1031d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return f(JvmClassMappingKt.getJavaClass(modelClass), extras);
    }
}
