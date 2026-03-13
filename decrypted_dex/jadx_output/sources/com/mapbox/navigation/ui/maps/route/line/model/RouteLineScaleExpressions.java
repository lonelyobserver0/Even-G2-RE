package com.mapbox.navigation.ui.maps.route.line.model;

import N6.d;
import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/mapbox/navigation/ui/maps/route/line/model/RouteLineScaleExpressions;", "", "LN6/d;", "routeLineScaleExpression", "routeCasingLineScaleExpression", "routeTrafficLineScaleExpression", "alternativeRouteLineScaleExpression", "alternativeRouteCasingLineScaleExpression", "alternativeRouteTrafficLineScaleExpression", "routeBlurScaleExpression", "<init>", "(LN6/d;LN6/d;LN6/d;LN6/d;LN6/d;LN6/d;LN6/d;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "LN6/d;", "getRouteLineScaleExpression", "()LN6/d;", "getRouteCasingLineScaleExpression", "getRouteTrafficLineScaleExpression", "getAlternativeRouteLineScaleExpression", "getAlternativeRouteCasingLineScaleExpression", "getAlternativeRouteTrafficLineScaleExpression", "getRouteBlurScaleExpression", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RouteLineScaleExpressions {
    private final d alternativeRouteCasingLineScaleExpression;
    private final d alternativeRouteLineScaleExpression;
    private final d alternativeRouteTrafficLineScaleExpression;
    private final d routeBlurScaleExpression;
    private final d routeCasingLineScaleExpression;
    private final d routeLineScaleExpression;
    private final d routeTrafficLineScaleExpression;

    public /* synthetic */ RouteLineScaleExpressions(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(RouteLineScaleExpressions.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.line.model.RouteLineScaleExpressions");
        RouteLineScaleExpressions routeLineScaleExpressions = (RouteLineScaleExpressions) other;
        return Intrinsics.areEqual(this.routeLineScaleExpression, routeLineScaleExpressions.routeLineScaleExpression) && Intrinsics.areEqual(this.routeCasingLineScaleExpression, routeLineScaleExpressions.routeCasingLineScaleExpression) && Intrinsics.areEqual(this.routeTrafficLineScaleExpression, routeLineScaleExpressions.routeTrafficLineScaleExpression) && Intrinsics.areEqual(this.alternativeRouteLineScaleExpression, routeLineScaleExpressions.alternativeRouteLineScaleExpression) && Intrinsics.areEqual(this.alternativeRouteCasingLineScaleExpression, routeLineScaleExpressions.alternativeRouteCasingLineScaleExpression) && Intrinsics.areEqual(this.alternativeRouteTrafficLineScaleExpression, routeLineScaleExpressions.alternativeRouteTrafficLineScaleExpression) && Intrinsics.areEqual(this.routeBlurScaleExpression, routeLineScaleExpressions.routeBlurScaleExpression);
    }

    public final d getAlternativeRouteCasingLineScaleExpression() {
        return this.alternativeRouteCasingLineScaleExpression;
    }

    public final d getAlternativeRouteLineScaleExpression() {
        return this.alternativeRouteLineScaleExpression;
    }

    public final d getAlternativeRouteTrafficLineScaleExpression() {
        return this.alternativeRouteTrafficLineScaleExpression;
    }

    public final d getRouteBlurScaleExpression() {
        return this.routeBlurScaleExpression;
    }

    public final d getRouteCasingLineScaleExpression() {
        return this.routeCasingLineScaleExpression;
    }

    public final d getRouteLineScaleExpression() {
        return this.routeLineScaleExpression;
    }

    public final d getRouteTrafficLineScaleExpression() {
        return this.routeTrafficLineScaleExpression;
    }

    public int hashCode() {
        return this.routeBlurScaleExpression.hashCode() + ((this.alternativeRouteTrafficLineScaleExpression.hashCode() + ((this.alternativeRouteCasingLineScaleExpression.hashCode() + ((this.alternativeRouteLineScaleExpression.hashCode() + ((this.routeTrafficLineScaleExpression.hashCode() + ((this.routeCasingLineScaleExpression.hashCode() + (this.routeLineScaleExpression.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return StubApp.getString2(14859) + this.routeLineScaleExpression + StubApp.getString2(14860) + this.routeCasingLineScaleExpression + StubApp.getString2(14861) + this.routeTrafficLineScaleExpression + StubApp.getString2(14862) + this.alternativeRouteLineScaleExpression + StubApp.getString2(14863) + this.alternativeRouteCasingLineScaleExpression + StubApp.getString2(14864) + this.alternativeRouteTrafficLineScaleExpression + StubApp.getString2(14865) + this.routeBlurScaleExpression + ')';
    }

    private RouteLineScaleExpressions(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7) {
        this.routeLineScaleExpression = dVar;
        this.routeCasingLineScaleExpression = dVar2;
        this.routeTrafficLineScaleExpression = dVar3;
        this.alternativeRouteLineScaleExpression = dVar4;
        this.alternativeRouteCasingLineScaleExpression = dVar5;
        this.alternativeRouteTrafficLineScaleExpression = dVar6;
        this.routeBlurScaleExpression = dVar7;
    }
}
