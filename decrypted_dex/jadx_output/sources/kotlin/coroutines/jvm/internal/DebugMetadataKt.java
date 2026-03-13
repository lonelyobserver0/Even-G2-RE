package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0001¢\u0006\u0002\b\u0003\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002H\u0002\u001a\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t*\u00020\u0002H\u0001¢\u0006\u0002\u0010\u000b\u001a\f\u0010\u000e\u001a\u00020\u0007*\u00020\u0002H\u0001\"\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"getStackTraceElementImpl", "Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getStackTraceElement", "getDebugMetadataAnnotation", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "getLabel", "", "getSpilledVariableFieldMapping", "", "", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "COROUTINES_DEBUG_METADATA_VERSION_1_3", "COROUTINES_DEBUG_METADATA_VERSION_2_2", "getNextLineNumber", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,158:1\n37#2,2:159\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:159,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class DebugMetadataKt {
    private static final int COROUTINES_DEBUG_METADATA_VERSION_1_3 = 1;
    private static final int COROUTINES_DEBUG_METADATA_VERSION_2_2 = 2;

    private static final DebugMetadata getDebugMetadataAnnotation(BaseContinuationImpl baseContinuationImpl) {
        return (DebugMetadata) baseContinuationImpl.getClass().getAnnotation(DebugMetadata.class);
    }

    private static final int getLabel(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @SinceKotlin(version = "2.2")
    @PublishedApi
    public static final int getNextLineNumber(BaseContinuationImpl baseContinuationImpl) {
        int label;
        Intrinsics.checkNotNullParameter(baseContinuationImpl, "<this>");
        DebugMetadata debugMetadataAnnotation = getDebugMetadataAnnotation(baseContinuationImpl);
        if (debugMetadataAnnotation != null && debugMetadataAnnotation.v() >= 2 && (label = getLabel(baseContinuationImpl)) >= 0 && label < debugMetadataAnnotation.nl().length) {
            return debugMetadataAnnotation.nl()[label];
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "getSpilledVariableFieldMapping")
    public static final String[] getSpilledVariableFieldMapping(BaseContinuationImpl baseContinuationImpl) {
        Intrinsics.checkNotNullParameter(baseContinuationImpl, "<this>");
        DebugMetadata debugMetadataAnnotation = getDebugMetadataAnnotation(baseContinuationImpl);
        if (debugMetadataAnnotation == null || debugMetadataAnnotation.v() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int label = getLabel(baseContinuationImpl);
        int[] i3 = debugMetadataAnnotation.i();
        int length = i3.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i3[i10] == label) {
                arrayList.add(debugMetadataAnnotation.s()[i10]);
                arrayList.add(debugMetadataAnnotation.n()[i10]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "getStackTraceElement")
    public static final StackTraceElement getStackTraceElement(BaseContinuationImpl baseContinuationImpl) {
        String str;
        Intrinsics.checkNotNullParameter(baseContinuationImpl, "<this>");
        DebugMetadata debugMetadataAnnotation = getDebugMetadataAnnotation(baseContinuationImpl);
        if (debugMetadataAnnotation == null || debugMetadataAnnotation.v() < 1) {
            return null;
        }
        int label = getLabel(baseContinuationImpl);
        int i3 = label < 0 ? -1 : debugMetadataAnnotation.l()[label];
        String moduleName = ModuleNameRetriever.INSTANCE.getModuleName(baseContinuationImpl);
        if (moduleName == null) {
            str = debugMetadataAnnotation.c();
        } else {
            str = moduleName + '/' + debugMetadataAnnotation.c();
        }
        return new StackTraceElement(str, debugMetadataAnnotation.m(), debugMetadataAnnotation.f(), i3);
    }
}
