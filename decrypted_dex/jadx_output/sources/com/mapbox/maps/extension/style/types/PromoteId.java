package com.mapbox.maps.extension.style.types;

import N6.d;
import V6.a;
import Xa.h;
import a4.f;
import androidx.annotation.Keep;
import com.mapbox.bindgen.Value;
import com.stub.StubApp;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/mapbox/maps/extension/style/types/PromoteId;", "", "", "propertyName", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "LN6/d;", "expression", "(LN6/d;Ljava/lang/String;)V", "Lcom/mapbox/bindgen/Value;", "toValue$extension_style_release", "()Lcom/mapbox/bindgen/Value;", "toValue", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/types/PromoteId;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPropertyName", "getSourceId", "LN6/d;", "getExpression", "()LN6/d;", "Companion", "V6/a", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class PromoteId {
    public static final a Companion = new a();
    private final d expression;
    private final String propertyName;
    private final String sourceId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PromoteId(d expression) {
        this(expression, (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(expression, "expression");
    }

    public static /* synthetic */ PromoteId copy$default(PromoteId promoteId, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = promoteId.propertyName;
        }
        if ((i3 & 2) != 0) {
            str2 = promoteId.sourceId;
        }
        return promoteId.copy(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Value toValue$lambda$0(PromoteId this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return Value.valueOf(this$0.propertyName);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPropertyName() {
        return this.propertyName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    public final PromoteId copy(String propertyName, String sourceId) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        return new PromoteId(propertyName, sourceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoteId)) {
            return false;
        }
        PromoteId promoteId = (PromoteId) other;
        return Intrinsics.areEqual(this.propertyName, promoteId.propertyName) && Intrinsics.areEqual(this.sourceId, promoteId.sourceId);
    }

    public final d getExpression() {
        return this.expression;
    }

    public final String getPropertyName() {
        return this.propertyName;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        int hashCode = this.propertyName.hashCode() * 31;
        String str = this.sourceId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14375));
        sb2.append(this.propertyName);
        sb2.append(StubApp.getString2(3265));
        return h.s(sb2, this.sourceId, ')');
    }

    public final Value toValue$extension_style_release() {
        Value valueOrElse = Value.fromJson(this.propertyName).getValueOrElse(new C2.d(this, 23));
        Intrinsics.checkNotNullExpressionValue(valueOrElse, "fromJson(propertyName).g…e.valueOf(propertyName) }");
        Value value = valueOrElse;
        String str = this.sourceId;
        return str != null ? new Value((HashMap<String, Value>) MapsKt.hashMapOf(TuplesKt.to(str, value))) : value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PromoteId(String propertyName) {
        this(propertyName, (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
    }

    @JvmOverloads
    public PromoteId(String propertyName, String str) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        this.propertyName = propertyName;
        this.sourceId = str;
        d dVar = null;
        try {
            Value value = Value.fromJson(propertyName).getValue();
            if (value != null) {
                dVar = f.z(value);
            }
        } catch (Throwable unused) {
        }
        this.expression = dVar;
    }

    public /* synthetic */ PromoteId(String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : str2);
    }

    public /* synthetic */ PromoteId(d dVar, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i3 & 2) != 0 ? null : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PromoteId(N6.d r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "expression"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = r2.toJson()
            java.lang.String r0 = "expression.toJson()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.extension.style.types.PromoteId.<init>(N6.d, java.lang.String):void");
    }
}
