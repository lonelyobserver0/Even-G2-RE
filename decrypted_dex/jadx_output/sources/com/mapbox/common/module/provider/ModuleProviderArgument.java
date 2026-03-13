package com.mapbox.common.module.provider;

import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\r\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J#\u0010\f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "", "expectedArgumentClass", "Ljava/lang/Class;", "argumentInstance", "(Ljava/lang/Class;Ljava/lang/Object;)V", "getArgumentInstance", "()Ljava/lang/Object;", "getExpectedArgumentClass", "()Ljava/lang/Class;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class ModuleProviderArgument {
    private final Object argumentInstance;
    private final Class<?> expectedArgumentClass;

    public ModuleProviderArgument(Class<?> expectedArgumentClass, Object obj) {
        Intrinsics.checkNotNullParameter(expectedArgumentClass, "expectedArgumentClass");
        this.expectedArgumentClass = expectedArgumentClass;
        this.argumentInstance = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModuleProviderArgument copy$default(ModuleProviderArgument moduleProviderArgument, Class cls, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            cls = moduleProviderArgument.expectedArgumentClass;
        }
        if ((i3 & 2) != 0) {
            obj = moduleProviderArgument.argumentInstance;
        }
        return moduleProviderArgument.copy(cls, obj);
    }

    public final Class<?> component1() {
        return this.expectedArgumentClass;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getArgumentInstance() {
        return this.argumentInstance;
    }

    public final ModuleProviderArgument copy(Class<?> expectedArgumentClass, Object argumentInstance) {
        Intrinsics.checkNotNullParameter(expectedArgumentClass, "expectedArgumentClass");
        return new ModuleProviderArgument(expectedArgumentClass, argumentInstance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleProviderArgument)) {
            return false;
        }
        ModuleProviderArgument moduleProviderArgument = (ModuleProviderArgument) other;
        return Intrinsics.areEqual(this.expectedArgumentClass, moduleProviderArgument.expectedArgumentClass) && Intrinsics.areEqual(this.argumentInstance, moduleProviderArgument.argumentInstance);
    }

    public final Object getArgumentInstance() {
        return this.argumentInstance;
    }

    public final Class<?> getExpectedArgumentClass() {
        return this.expectedArgumentClass;
    }

    public int hashCode() {
        int hashCode = this.expectedArgumentClass.hashCode() * 31;
        Object obj = this.argumentInstance;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return StubApp.getString2(13835) + this.expectedArgumentClass + StubApp.getString2(13836) + this.argumentInstance + ')';
    }
}
