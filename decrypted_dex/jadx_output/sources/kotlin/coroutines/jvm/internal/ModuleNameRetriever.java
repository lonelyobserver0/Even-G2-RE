package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "<init>", "()V", "notOnJava9", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "cache", "getModuleName", "", "continuation", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "buildCache", "Cache", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class ModuleNameRetriever {
    private static Cache cache;
    public static final ModuleNameRetriever INSTANCE = new ModuleNameRetriever();
    private static final Cache notOnJava9 = new Cache(null, null, null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "getModuleMethod", "Ljava/lang/reflect/Method;", "getDescriptorMethod", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cache {

        @JvmField
        public final Method getDescriptorMethod;

        @JvmField
        public final Method getModuleMethod;

        @JvmField
        public final Method nameMethod;

        public Cache(Method method, Method method2, Method method3) {
            this.getModuleMethod = method;
            this.getDescriptorMethod = method2;
            this.nameMethod = method3;
        }
    }

    private ModuleNameRetriever() {
    }

    private final Cache buildCache(BaseContinuationImpl continuation) {
        try {
            Cache cache2 = new Cache(Class.class.getDeclaredMethod("getModule", new Class[0]), continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            cache = cache2;
            return cache2;
        } catch (Exception unused) {
            Cache cache3 = notOnJava9;
            cache = cache3;
            return cache3;
        }
    }

    public final String getModuleName(BaseContinuationImpl continuation) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Cache cache2 = cache;
        if (cache2 == null) {
            cache2 = buildCache(continuation);
        }
        if (cache2 != notOnJava9 && (method = cache2.getModuleMethod) != null && (invoke = method.invoke(continuation.getClass(), new Object[0])) != null && (method2 = cache2.getDescriptorMethod) != null && (invoke2 = method2.invoke(invoke, new Object[0])) != null) {
            Method method3 = cache2.nameMethod;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
            if (invoke3 instanceof String) {
                return (String) invoke3;
            }
        }
        return null;
    }
}
