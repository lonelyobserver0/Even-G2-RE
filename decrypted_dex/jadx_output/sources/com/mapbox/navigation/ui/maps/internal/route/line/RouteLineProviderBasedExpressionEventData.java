package com.mapbox.navigation.ui.maps.internal.route.line;

import N6.d;
import androidx.annotation.Keep;
import com.mapbox.maps.StylePropertyValue;
import com.stub.StubApp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineProviderBasedExpressionEventData;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;", "", "property", "LN6/d;", "expression", "Lcom/mapbox/maps/StylePropertyValue;", "value", "<init>", "(Ljava/lang/String;LN6/d;Lcom/mapbox/maps/StylePropertyValue;)V", "component1", "()Ljava/lang/String;", "component2", "()LN6/d;", "component3", "()Lcom/mapbox/maps/StylePropertyValue;", "copy", "(Ljava/lang/String;LN6/d;Lcom/mapbox/maps/StylePropertyValue;)Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineProviderBasedExpressionEventData;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProperty", "LN6/d;", "getExpression", "getExpression$annotations", "()V", "Lcom/mapbox/maps/StylePropertyValue;", "getValue", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class RouteLineProviderBasedExpressionEventData extends RouteLineExpressionEventData {
    private final d expression;
    private final String property;
    private final StylePropertyValue value;

    public /* synthetic */ RouteLineProviderBasedExpressionEventData(String str, d dVar, StylePropertyValue stylePropertyValue, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : dVar, (i3 & 4) != 0 ? null : stylePropertyValue);
    }

    public static /* synthetic */ RouteLineProviderBasedExpressionEventData copy$default(RouteLineProviderBasedExpressionEventData routeLineProviderBasedExpressionEventData, String str, d dVar, StylePropertyValue stylePropertyValue, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = routeLineProviderBasedExpressionEventData.property;
        }
        if ((i3 & 2) != 0) {
            dVar = routeLineProviderBasedExpressionEventData.expression;
        }
        if ((i3 & 4) != 0) {
            stylePropertyValue = routeLineProviderBasedExpressionEventData.value;
        }
        return routeLineProviderBasedExpressionEventData.copy(str, dVar, stylePropertyValue);
    }

    @Deprecated(message = "Used for backwards compatibility")
    public static /* synthetic */ void getExpression$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getProperty() {
        return this.property;
    }

    /* renamed from: component2, reason: from getter */
    public final d getExpression() {
        return this.expression;
    }

    /* renamed from: component3, reason: from getter */
    public final StylePropertyValue getValue() {
        return this.value;
    }

    public final RouteLineProviderBasedExpressionEventData copy(String property, d expression, StylePropertyValue value) {
        Intrinsics.checkNotNullParameter(property, "property");
        return new RouteLineProviderBasedExpressionEventData(property, expression, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteLineProviderBasedExpressionEventData)) {
            return false;
        }
        RouteLineProviderBasedExpressionEventData routeLineProviderBasedExpressionEventData = (RouteLineProviderBasedExpressionEventData) other;
        return Intrinsics.areEqual(this.property, routeLineProviderBasedExpressionEventData.property) && Intrinsics.areEqual(this.expression, routeLineProviderBasedExpressionEventData.expression) && Intrinsics.areEqual(this.value, routeLineProviderBasedExpressionEventData.value);
    }

    public final d getExpression() {
        return this.expression;
    }

    public final String getProperty() {
        return this.property;
    }

    public final StylePropertyValue getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.property.hashCode() * 31;
        d dVar = this.expression;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        StylePropertyValue stylePropertyValue = this.value;
        return hashCode2 + (stylePropertyValue != null ? stylePropertyValue.hashCode() : 0);
    }

    public String toString() {
        return StubApp.getString2(14759) + this.property + StubApp.getString2(14760) + this.expression + StubApp.getString2(12722) + this.value + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineProviderBasedExpressionEventData(String property, d dVar, StylePropertyValue stylePropertyValue) {
        super(StubApp.getString2(14758));
        Intrinsics.checkNotNullParameter(property, "property");
        this.property = property;
        this.expression = dVar;
        this.value = stylePropertyValue;
    }
}
