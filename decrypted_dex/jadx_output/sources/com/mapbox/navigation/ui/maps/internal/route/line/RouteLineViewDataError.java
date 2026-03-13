package com.mapbox.navigation.ui.maps.internal.route.line;

import Xa.h;
import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewDataError;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewExpectedInput;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class RouteLineViewDataError extends RouteLineViewExpectedInput {
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewDataError(String message) {
        super(StubApp.getString2(435));
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    public static /* synthetic */ RouteLineViewDataError copy$default(RouteLineViewDataError routeLineViewDataError, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = routeLineViewDataError.message;
        }
        return routeLineViewDataError.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final RouteLineViewDataError copy(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new RouteLineViewDataError(message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RouteLineViewDataError) && Intrinsics.areEqual(this.message, ((RouteLineViewDataError) other).message);
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        return h.s(new StringBuilder(StubApp.getString2(14761)), this.message, ')');
    }
}
