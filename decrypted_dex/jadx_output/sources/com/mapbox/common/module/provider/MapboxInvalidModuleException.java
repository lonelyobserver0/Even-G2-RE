package com.mapbox.common.module.provider;

import C6.b;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LC6/b;", "type", "<init>", "(LC6/b;)V", "component1", "()LC6/b;", "copy", "(LC6/b;)Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LC6/b;", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class MapboxInvalidModuleException extends RuntimeException {
    private final b type;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MapboxInvalidModuleException(C6.b r4) {
        /*
            r3 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 13819(0x35fb, float:1.9365E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            java.lang.String r1 = r4.name()
            r0.append(r1)
            r1 = 13820(0x35fc, float:1.9366E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.append(r1)
            java.lang.String r1 = r4.f1131b
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r2 = r4.f1132c
            r0.append(r2)
            r2 = 13821(0x35fd, float:1.9367E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r0.append(r2)
            java.lang.Class<C6.a> r2 = C6.a.class
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            r2 = 40
            r0.append(r2)
            java.lang.Class<C6.b> r2 = C6.b.class
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r4.name()
            r0.append(r1)
            r1 = 13822(0x35fe, float:1.9369E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.append(r1)
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.String r1 = r4.f1130a
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            r2 = 13823(0x35ff, float:1.937E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.append(r1)
            r1 = 13824(0x3600, float:1.9372E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.append(r1)
            java.lang.String r1 = kotlin.text.StringsKt.m()
            r0.append(r1)
            r1 = 13825(0x3601, float:1.9373E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = kotlin.text.StringsKt.trimIndent(r0)
            r3.<init>(r0)
            r3.type = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.common.module.provider.MapboxInvalidModuleException.<init>(C6.b):void");
    }

    /* renamed from: component1, reason: from getter */
    private final b getType() {
        return this.type;
    }

    public static /* synthetic */ MapboxInvalidModuleException copy$default(MapboxInvalidModuleException mapboxInvalidModuleException, b bVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bVar = mapboxInvalidModuleException.type;
        }
        return mapboxInvalidModuleException.copy(bVar);
    }

    public final MapboxInvalidModuleException copy(b type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new MapboxInvalidModuleException(type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MapboxInvalidModuleException) && this.type == ((MapboxInvalidModuleException) other).type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return StubApp.getString2(13826) + this.type + ')';
    }
}
