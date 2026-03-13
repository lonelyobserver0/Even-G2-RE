package com.mapbox.common.core.module;

import C6.b;
import com.mapbox.common.module.LibraryLoader;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import com.stub.StubApp;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;", "", "<init>", "()V", "LC6/b;", "type", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "paramsProvider", "(LC6/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "Lcom/mapbox/common/module/LibraryLoader;", "loaderInstance$delegate", "Lkotlin/Lazy;", "getLoaderInstance", "()Lcom/mapbox/common/module/LibraryLoader;", "loaderInstance", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CommonSingletonModuleProvider {
    public static final CommonSingletonModuleProvider INSTANCE = new CommonSingletonModuleProvider();

    /* renamed from: loaderInstance$delegate, reason: from kotlin metadata */
    private static final Lazy loaderInstance = LazyKt.lazy(new Function0<LibraryLoader>() { // from class: com.mapbox.common.core.module.CommonSingletonModuleProvider$loaderInstance$2

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: com.mapbox.common.core.module.CommonSingletonModuleProvider$loaderInstance$2$1, reason: invalid class name */
        public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<b, ModuleProviderArgument[]> {
            public AnonymousClass1(Object obj) {
                super(1, obj, CommonSingletonModuleProvider.class, StubApp.getString2(13563), StubApp.getString2(13562), 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final ModuleProviderArgument[] invoke(b p02) {
                ModuleProviderArgument[] paramsProvider;
                Intrinsics.checkNotNullParameter(p02, "p0");
                paramsProvider = ((CommonSingletonModuleProvider) this.receiver).paramsProvider(p02);
                return paramsProvider;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final LibraryLoader invoke() {
            return (LibraryLoader) MapboxModuleProvider.INSTANCE.createModule(b.f1125d, new AnonymousClass1(CommonSingletonModuleProvider.INSTANCE));
        }
    });

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CommonSingletonModuleProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleProviderArgument[] paramsProvider(b type) {
        int i3 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i3 == 1) {
            return new ModuleProviderArgument[0];
        }
        if (i3 == 2) {
            return new ModuleProviderArgument[0];
        }
        throw new IllegalArgumentException(StubApp.getString2(13564) + type);
    }

    public final LibraryLoader getLoaderInstance() {
        return (LibraryLoader) loaderInstance.getValue();
    }
}
